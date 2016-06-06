package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.dialog.MultiSelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.dialog.SelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuLianXCOrShiJuanList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWoDeCuoTiBenModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StuWDBJAddCuoTKActivity extends CommonActivity implements SelectDialog.ItemClickInterface,MultiSelectDialog.multiselectCallBack
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.select_lianxece_tv)
    TextView selectLianxeceTv;
    @Bind(R.id.select_yema_tv)
    TextView selectYemaTv;
    @Bind(R.id.select_tihao_tv)
    TextView selectTihaoTv;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;

    private StuWoDeCuoTiBenModel mModel;

    private List<RtnStuLianXCOrShiJuanList.BjDataEntity> mBanJLXCList;//班级练习册
    private ArrayList<HashMap<String,String>> mBanJLXCMap;

    private List<RtnStuLianXCOrShiJuanList.StuDataEntity> mWDSJList;//我的书架
    private ArrayList<HashMap<String,String>> mWDSJMap;
    private String stuId = "";//学生id
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wdctb);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("新增错题");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        if(mModel == null)
        {
            mModel = new StuWoDeCuoTiBenModel(this);
        }
        mModel.addResponseListener(this);

        /////=================
        mBanJLXCList = new ArrayList<>();
        mWDSJList = new ArrayList<>();

        mBanJLXCMap = new ArrayList<>();
        mWDSJMap = new ArrayList<>();

        //题号初始化
        mTiHaoList = new ArrayList<>();
        mTiHaoMap = new ArrayList<>();

        //页码集合初始化
        strYeMa = new StringBuilder();
        yemaList = new ArrayList<>();

        searchYeMaList = new ArrayList<>();

        //选中的题号map
        selectTiHaoMap = new HashMap<>();
    }

    private SelectDialog sdWDSJ;
    private SelectDialog sdBJLXC;

    private String[] yema;
    private List<String> yemaList;
    private List<String> searchYeMaList;

    private List<RtnTiHaoList.DataEntity> mTiHaoList;
    private ArrayList<HashMap<String,String>> mTiHaoMap;
    private StringBuilder strYeMa;  //选择的页码


    private SelectDialog sdTihao;


    private MultiSelectDialog multiSD;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {

        if(var1.equals(getResources().getString(R.string.stu_add_wodecuotiben_submit_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(),"保存成功");
            finish();
        }
        if(var1.equals(getResources().getString(R.string.stu_add_wodecuotiben_gettihao_trancode)))//获取题号
        {
            mTiHaoList = mModel.getRtnTiHaoList().getData();
            //显示我的题号选择列表
            multiSD = new MultiSelectDialog(StuWDBJAddCuoTKActivity.this,mTiHaoList,this);
            multiSD.show();
        }

        if(var1.equals(getResources().getString(R.string.stu_add_wodecuotiben_getyema_trancode)))//获取页码
        {
            yema = new String[]{};
            yema = mModel.getStrYeMa();

            for (int i = 0; i < yema.length; i++)
            {
                yemaList.add(yema[i]);
            }
            DialogUtil.getMultiChoiceDialog(StuWDBJAddCuoTKActivity.this, "页码选择", 0, null, yemaList, new MaterialDialog.ListCallbackMultiChoice()
            {
                @Override
                public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text)
                {

                    for (int i = 0; i < which.length; i++) {
                        strYeMa.append(text[i]);
                        strYeMa.append(",");
                    }

                    for (int i = 0; i < which.length; i++)
                    {
                        searchYeMaList.add(text[i].toString());
                    }

                    selectYemaTv.setText(strYeMa.toString());
                    return true;
                }
            }, new MaterialDialog.SingleButtonCallback()
            {
                @Override
                public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
                {
                    dialog.dismiss();
                }
            }).show();
        }

        if(var1.equals(getResources().getString(R.string.stu_add_wodecuotiben_trancode)))
        {
            mBanJLXCList = mModel.getRtnStuLianXCOrShiJuanList().getBjData();
            mWDSJList = mModel.getRtnStuLianXCOrShiJuanList().getStuData();

            for (int i = 0; i < mBanJLXCList.size(); i++)
            {
                HashMap<String,String> mMap1 = new HashMap<>();
                mMap1.put(mBanJLXCList.get(i).getId(),mBanJLXCList.get(i).getRcsValue());
                mBanJLXCMap.add(mMap1);
            }
            for (int i = 0; i < mWDSJList.size(); i++)
            {
                HashMap<String,String> mMap2 = new HashMap<>();
                mMap2.put(mWDSJList.get(i).getId(),mWDSJList.get(i).getExamRcsValue());
                mWDSJMap.add(mMap2);
            }
            List<String> mOneList = new ArrayList<>();
            mOneList.add("我的书架");
            mOneList.add("班级练习册");
            DialogUtil.getListDialog(StuWDBJAddCuoTKActivity.this, "请选择联系册或者试卷", 0, mOneList, new MaterialDialog.ListCallback()
            {
                @Override
                public void onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text)
                {
                    if (which == 0)
                    {
                        sdWDSJ = new SelectDialog(StuWDBJAddCuoTKActivity.this,mWDSJMap,StuWDBJAddCuoTKActivity.this);
                        sdWDSJ.show();
                    }
                    if(which == 1)
                    {
                        sdBJLXC = new SelectDialog(StuWDBJAddCuoTKActivity.this,mBanJLXCMap,StuWDBJAddCuoTKActivity.this);
                        sdBJLXC.show();
                    }
                }
            }).show();
        }
    }

    @OnClick({R.id.select_lianxece_tv, R.id.select_yema_tv, R.id.select_tihao_tv, R.id.submit_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.select_lianxece_tv:

                mWDSJMap.clear();
                mBanJLXCMap.clear();
                mModel.addStuCuoTiBen(getResources().getString(R.string.stu_add_wodecuotiben_trancode));
                break;
            case R.id.select_yema_tv:
                if(selectId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else
                {
                    mModel.getYeMa(getResources().getString(R.string.stu_add_wodecuotiben_getyema_trancode),selectId);
                }

                break;
            case R.id.select_tihao_tv:

                if(selectYemaTv.getText().toString().equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }
                else
                {
                    mModel.getTihao(getResources().getString(R.string.stu_add_wodecuotiben_gettihao_trancode),selectId,searchYeMaList);
                }

                break;
            case R.id.submit_btn:

                if(selectId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else if(selectYemaTv.getText().toString().equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }
                else if(selectTihaoTv.getText().toString().equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择题号");
                }
                else
                {
                    mModel.submitAddCuoTiBen(getResources().getString(R.string.stu_add_wodecuotiben_submit_trancode),stuId,selectId,searchYeMaList,selectTiHaoMap);
                }
                break;
        }
    }

    @Override
    public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        if(sdWDSJ!=null)
        {
            if(sdWDSJ.isShowing())
            {
                sdWDSJ.dismiss();
            }
        }

        if(sdBJLXC!=null)
        {
            if(sdBJLXC.isShowing())
            {
                sdBJLXC.dismiss();
            }
        }

        if(sdTihao!=null)
        {
            if(sdTihao.isShowing())
            {
                sdTihao.dismiss();
            }
        }
    }


    private String selectName = "";
    private String selectId = "";
    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {
        selectName = selectItemValue;
        selectId = selectItemKey;
        selectLianxeceTv.setText(selectName);

    }

    private HashMap<String,String> selectTiHaoMap;
    @Override
    public void SelectClick(HashMap<String, String> mMap)
    {
        selectTiHaoMap = mMap;

        StringBuilder mBuilder = new StringBuilder();

        //遍历map
        // Map map = new HashMap();
        Iterator iter = selectTiHaoMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();

            mBuilder.append(val+",");
        }

        selectTihaoTv.setText(mBuilder.toString());
        System.out.println("======");
    }
}

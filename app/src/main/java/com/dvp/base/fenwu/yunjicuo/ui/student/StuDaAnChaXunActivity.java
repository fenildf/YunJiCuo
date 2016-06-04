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
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSJList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.dvp.base.fenwu.yunjicuo.domain.student.SerMap;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuDaanChaXunModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 答案查询界面
 */
public class StuDaAnChaXunActivity extends CommonActivity implements SelectDialog.ItemClickInterface, MultiSelectDialog.multiselectCallBack
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

    private String stuId = "";

    private StuDaanChaXunModel mModel;

    private List<RtnSJList.DataEntity> mLianXCList;

    private ArrayList<HashMap<String,String>> mLianXCMap;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_da_an_cha_xun);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("答案查询");
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
            mModel = new StuDaanChaXunModel(this);
        }
        mModel.addResponseListener(this);
        mLianXCList = new ArrayList<>();
        mLianXCMap = new ArrayList<>();
        yemaList = new ArrayList<>();
        mTiHaoList = new ArrayList<>();
        selectTiHaoMap = new HashMap<>();
    }


    private SelectDialog mLianXCSD;
    private String[] yema;
    private List<String> yemaList;
    private String mSelectYama = "";


    private List<RtnTiHaoList.DataEntity> mTiHaoList;
    private MultiSelectDialog multiSD;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.stu_daanchaxun_huoqulianxice_trancode)))
        {
            mLianXCList = mModel.getRtnSJList().getData();
            for(int i=0;i< mLianXCList.size();i++)
            {
                HashMap<String,String> mschool = new HashMap<>();
                mschool.put(mLianXCList.get(i).getId(),mLianXCList.get(i).getRcsValue());
                mLianXCMap.add(mschool);
            }
            mLianXCSD = new SelectDialog(StuDaAnChaXunActivity.this,mLianXCMap,this);
            mLianXCSD.show();
        }

        if(var1.equals(getResources().getString(R.string.stu_daanchaxun_getyema_trancode)))  //返回页码
        {
            yema = new String[]{};
            yema = mModel.getStrYeMa();

            for (int i = 0; i < yema.length; i++)
            {
                yemaList.add(yema[i]);
            }

            DialogUtil.getSinggleChoiceDialog(StuDaAnChaXunActivity.this, "页码选择", 0, 0, yemaList, new MaterialDialog.ListCallbackSingleChoice()
            {
                @Override
                public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text)
                {
                    mSelectYama = text.toString();
                    selectYemaTv.setText(mSelectYama.toString());
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

        if (var1.equals(getResources().getString(R.string.stu_daanchaxun_gettihao_trancode)))  //获取题号返回结果
        {
            mTiHaoList = mModel.getRtnTiHaoList().getData();
            //显示我的题号选择列表
            multiSD = new MultiSelectDialog(StuDaAnChaXunActivity.this,mTiHaoList,this);
            multiSD.show();
        }
    }

    @Override
    public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        if(mLianXCSD!=null)
        {
            if(mLianXCSD.isShowing())
            {
                mLianXCSD.dismiss();
            }
        }
    }

    private String mSelectLianXCId = "";
    private String mSelectLianXCName = "";
    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {
        mSelectLianXCId = selectItemKey;
        mSelectLianXCName = selectItemValue;
        selectLianxeceTv.setText(mSelectLianXCName.toString());

    }


    private HashMap<String,String> selectTiHaoMap;

    private SerMap serMap;
    @Override
    public void SelectClick(HashMap<String, String> mMap)
    {
        selectTiHaoMap = mMap;

        StringBuilder mBuilder = new StringBuilder();

        //遍历map
        Iterator iter = selectTiHaoMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();

            mBuilder.append(val+",");
        }

        selectTihaoTv.setText(mBuilder.toString());

        serMap = new SerMap();
        serMap.setmMap(selectTiHaoMap);
        System.out.println("======");
    }

    @OnClick({R.id.select_lianxece_tv, R.id.select_yema_tv, R.id.select_tihao_tv, R.id.submit_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.select_lianxece_tv://选择练习册
                mLianXCList.clear();
                mLianXCMap.clear();
                mModel.getWDLXCList(getResources().getString(R.string.stu_daanchaxun_huoqulianxice_trancode));
                break;
            case R.id.select_yema_tv://页码选择
                yemaList.clear();
                if(mSelectLianXCName.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else
                {
                    mModel.getYeMa(getResources().getString(R.string.stu_daanchaxun_getyema_trancode),mSelectLianXCId);
                }
                break;
            case R.id.select_tihao_tv:  //题号选择
                if(mSelectYama.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }
                else
                {
                    mModel.getTihao(getResources().getString(R.string.stu_daanchaxun_gettihao_trancode),mSelectLianXCId,mSelectYama);
                }
                break;
            case R.id.submit_btn:

                if(mSelectLianXCName.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else if(mSelectYama.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }
                else if(selectTiHaoMap.size()==0)
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择题号");
                }
                else
                {
                    Bundle bundle =  new Bundle();
                    bundle.putSerializable("xitiidsmap",(Serializable)serMap);
                    bundle.putString("lianxiceid",mSelectLianXCId);
                    bundle.putString("lianxicename",mSelectLianXCName);
                    bundle.putString("yema",mSelectYama);
                    startActivity(StuDaAnDisplayActivity.class,bundle);
                }

                break;
        }
    }
}

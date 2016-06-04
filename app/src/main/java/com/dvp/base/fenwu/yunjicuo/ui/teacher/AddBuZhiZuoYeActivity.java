package com.dvp.base.fenwu.yunjicuo.ui.teacher;

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
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerYearMonthDayHourMinuteListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.utils.ShowTimePickerUtils;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetBanJList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetKeMList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetLianXCList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.BuZhiZuoYeModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

/**
 * 进行布置作业界面
 */
public class AddBuZhiZuoYeActivity extends CommonActivity implements SelectDialog.ItemClickInterface,MultiSelectDialog.multiselectCallBack,MyTimePickerYearMonthDayHourMinuteListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    /* @Bind(R.id.faburen_tv)
     TextView faburenTv;*/
    @Bind(R.id.select_bj_tv)
    TextView selectBjTv;
    @Bind(R.id.select_lianxice_tv)
    TextView selectLianxiceTv;
    @Bind(R.id.select_yema_tv)
    TextView selectYemaTv;
    @Bind(R.id.select_tihao_tv)
    TextView selectTihaoTv;
    @Bind(R.id.select_begintime_tv)
    TextView selectBegintimeTv;
    @Bind(R.id.select_endtime_tv)
    TextView selectEndtimeTv;
    @Bind(R.id.beizhu_edittext)
    MaterialEditText beizhuEdittext;
    @Bind(R.id.banji_layout)
    MaterialTextInputLayout banjiLayout;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;
    @Bind(R.id.kem_tv)
    TextView kemTv;

    private BuZhiZuoYeModel mModel;

    private String staffId = "";

    private List<RtnGetKeMList.DataEntity> mKeMuList;
    private ArrayList<HashMap<String,String>> mKeMuMap;


    private List<RtnGetBanJList.DataEntity> mBanJList;
    private ArrayList<HashMap<String,String>> mBanJMap;


    private  List<RtnGetLianXCList.DataEntity> mLianXCList;
    private ArrayList<HashMap<String,String>> mLianXCMap;


    private String[] yema;
    private List<String> yemaList;


    private StringBuilder strYeMa;  //选择的页码
    private List<String> searchYeMaList;


    //题号选择
    private List<RtnTiHaoList.DataEntity> mTiHaoList;
    private ArrayList<HashMap<String,String>> mTiHaoMap;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bu_zhi_zuo_ye);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        ShowTimePickerUtils.setMyTimePickerYearMonthDayHourMinuteListener(this);
        staffId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("作业");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        if (mModel == null)
        {
            mModel = new BuZhiZuoYeModel(this);
        }
        mModel.addResponseListener(this);

        mKeMuList = new ArrayList<>();
        mKeMuMap = new ArrayList<>();

        mBanJList = new ArrayList<>();
        mBanJMap = new ArrayList<>();

        mLianXCList = new ArrayList<>();
        mLianXCMap  = new ArrayList<>();

        yemaList = new ArrayList<>();
        searchYeMaList = new ArrayList<>();
        strYeMa = new StringBuilder();

        mTiHaoList = new ArrayList<>();
        mTiHaoMap = new ArrayList<>();

        //选中的题号map
        selectTiHaoMap = new HashMap<>();
    }


    private int iskemuorother = 1;
    private SelectDialog kemuSD;
    private SelectDialog banjSD;
    private SelectDialog lianxcSD;
    private MultiSelectDialog multiSD;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_getkemu_trancode)))
        {
            mKeMuList = mModel.getRtnGetKeMList().getData();
            for (int i = 0; i < mKeMuList.size(); i++)
            {
                HashMap<String,String> mMap = new HashMap<>();
                mMap.put(mKeMuList.get(i).getId(),mKeMuList.get(i).getName());
                mKeMuMap.add(mMap);
            }

            kemuSD = new SelectDialog(AddBuZhiZuoYeActivity.this,mKeMuMap,this);
            kemuSD.show();
        }

        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_getbanji_trancode)))
        {
            mBanJList = mModel.getRtnGetBanJList().getData();
            for (int i = 0; i < mBanJList.size(); i++)
            {
                HashMap<String,String> mMap = new HashMap<>();
                mMap.put(mBanJList.get(i).getBanJ().getId(),mBanJList.get(i).getBanJ().getName());
                mBanJMap.add(mMap);
            }
            banjSD = new SelectDialog(AddBuZhiZuoYeActivity.this,mBanJMap,this);
            banjSD.show();
        }

        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_getlianxice_trancode)))
        {
            mLianXCList = mModel.getRtnGetLianXCList().getData();
            //paperid
            if(mLianXCList.size()==0)
            {
                DialogUtil.showToast(getApplicationContext(),"该班级暂无练习册");
            }
            else
            {
                for (int i = 0; i < mLianXCList.size(); i++)
                {
                    HashMap<String,String> mMap = new HashMap<>();
                    mMap.put(mLianXCList.get(i).getPaper().getId(),mLianXCList.get(i).getPaper().getRcsValue());
                    mLianXCMap.add(mMap);
                }
                lianxcSD = new SelectDialog(AddBuZhiZuoYeActivity.this,mLianXCMap,this);
                lianxcSD.show();
            }

        }

        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_getyema)))
        {
            yema = new String[]{};
            yema = mModel.getStrYeMa();

            for (int i = 0; i < yema.length; i++)
            {
                yemaList.add(yema[i]);
            }

            DialogUtil.getMultiChoiceDialog(AddBuZhiZuoYeActivity.this, "页码选择", 0, null, yemaList, new MaterialDialog.ListCallbackMultiChoice()
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

        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_gettihao)))  //题号返回结果
        {
            mTiHaoList = mModel.getRtnTiHaoList().getData();
            //显示我的题号选择列表
            multiSD = new MultiSelectDialog(AddBuZhiZuoYeActivity.this,mTiHaoList,this);
            multiSD.show();
        }

        if(var1.equals(getResources().getString(R.string.teacher_buzhizuoye_submit_trancode)))  //保存作业成功
        {
            DialogUtil.showToast(getApplicationContext(),"保存成功");
        }
    }

    @OnClick({R.id.select_bj_tv, R.id.select_lianxice_tv, R.id.select_yema_tv, R.id.select_tihao_tv, R.id.select_begintime_tv, R.id.select_endtime_tv, R.id.submit_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.select_bj_tv:
                if(mSelectKeMId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择科目");
                }
                else {
                    iskemuorother = 2;

                    mBanJMap.clear();
                    mModel.getBanJList(getResources().getString(R.string.teacher_buzhizuoye_getbanji_trancode),staffId,mSelectKeMId);
                }
                break;
            case R.id.select_lianxice_tv:
                if(mSelectBanJBH.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择班级");
                }
                else
                {
                    iskemuorother = 3;
                    mLianXCMap.clear();
                    mModel.getLianXC(getResources().getString(R.string.teacher_buzhizuoye_getlianxice_trancode),mSelectBanJBH);
                }
                break;
            case R.id.select_yema_tv:
                if(mSelectLianXCId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else
                {

                    yemaList.clear();
                    mModel.getYeMa(getResources().getString(R.string.teacher_buzhizuoye_getyema),mSelectLianXCId);
                }
                break;
            case R.id.select_tihao_tv:
                if(mSelectLianXCId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else if(searchYeMaList.size()==0)
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }else {

                    mModel.getTihao(getResources().getString(R.string.teacher_buzhizuoye_gettihao),mSelectLianXCId,searchYeMaList);
                }
                break;
            case R.id.select_begintime_tv:
                iskemuorother = 4;
                ShowTimePickerUtils shotTime = new ShowTimePickerUtils(this);
                shotTime.showTimePickerYearMonthDayHourMinute();
                break;
            case R.id.select_endtime_tv:
                iskemuorother = 5;
                ShowTimePickerUtils shotTime1 = new ShowTimePickerUtils(this);
                shotTime1.showTimePickerYearMonthDayHourMinute();
                break;
            case R.id.submit_btn:
                if(mSelectKeMId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择科目");
                }
                else if(mSelectBanJBH.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择班级");
                }
                else if(mSelectLianXCId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else if(searchYeMaList.size()==0)
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择页码");
                }
                else if(mSelectQIDs.size()==0)
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择题号");
                }
                else{
                    mModel.submitBZZY(getResources().getString(R.string.teacher_buzhizuoye_submit_trancode),staffId,mSelectKeMId,mSelectBeginTime,mSelectEndTime,beizhuEdittext.getText().toString(),mSelectBanJBH,mSelectQIDs,searchYeMaList);

                }
             break;
        }
    }

    @OnClick(R.id.kem_tv)
    public void onClick()
    {
        iskemuorother = 1;
        mKeMuMap.clear();
        mModel.getKeMuList(getResources().getString(R.string.teacher_buzhizuoye_getkemu_trancode),staffId);
    }

    @Override
    public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        if(kemuSD!=null)
        {
            if(kemuSD.isShowing())
            {
                kemuSD.dismiss();
            }
        }

        if(banjSD!=null)
        {
            if(banjSD.isShowing())
            {
                banjSD.dismiss();
            }
        }

        if(lianxcSD!=null)
        {
            if(lianxcSD.isShowing())
            {
                lianxcSD.dismiss();
            }
        }

    }

    private String mSelectKeMId = "";
    private String mSelectKeMName = "";

    private String mSelectBanJBH = "";
    private String mSelectBanJName = "";

    private String mSelectLianXCId = "";
    private String mSelectLianXCName = "";
    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {
        if(iskemuorother == 1)
        {
            mSelectKeMId = selectItemKey;
            mSelectKeMName = selectItemValue;

            kemTv.setText(mSelectKeMName.toString());
        }
        if(iskemuorother == 2)
        {
            mSelectBanJBH = selectItemKey;
            mSelectBanJName = selectItemValue;
            selectBjTv.setText(mSelectBanJName.toString());
        }

        if(iskemuorother == 3)
        {
            mSelectLianXCId = selectItemKey;
            mSelectLianXCName = selectItemValue;
            selectLianxiceTv.setText(mSelectLianXCName.toString());
        }

    }

    private HashMap<String,String> selectTiHaoMap;
    private List<String> mSelectQIDs;
    @Override
    public void SelectClick(HashMap<String, String> mMap)
    {
        selectTiHaoMap = mMap;

        StringBuilder mBuilder = new StringBuilder();

        mSelectQIDs = new ArrayList<>();
        //遍历map
        Iterator iter = selectTiHaoMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();

            mBuilder.append(val+",");
            mSelectQIDs.add(key.toString());
        }

        selectTihaoTv.setText(mBuilder.toString());
        System.out.println("======");
    }

    private String mSelectBeginTime = "";
    private String mSelectEndTime = "";
    @Override
    public void doYearMouthDayHourMinute(String year, String month, String day, String hour, String minute)
    {
        if(iskemuorother == 4)
        {
            selectBegintimeTv.setText(year+"-"+month+"-"+day+" "+hour+":"+minute);
            mSelectBeginTime = year+"-"+month+"-"+day+" "+hour+":"+minute;
        }
        if(iskemuorother == 5)
        {
            selectEndtimeTv.setText(year+"-"+month+"-"+day+" "+hour+":"+minute);
            mSelectEndTime = year+"-"+month+"-"+day+" "+hour+":"+minute;
        }

    }
}

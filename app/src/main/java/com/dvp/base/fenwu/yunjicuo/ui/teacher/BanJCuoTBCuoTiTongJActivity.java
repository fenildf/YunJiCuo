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
import com.dvp.base.fenwu.yunjicuo.common.dialog.SelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerYearMonthDayHourMinuteListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.utils.ShowTimePickerUtils;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTTJLXCList;
import com.dvp.base.fenwu.yunjicuo.model.CuoTiKuModel;
import com.dvp.base.fenwu.yunjicuo.model.GuanLBJCuoTiBenModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 班级错题本错题统计界面
 */
public class BanJCuoTBCuoTiTongJActivity extends CommonActivity implements MyTimePickerYearMonthDayHourMinuteListener,SelectDialog.ItemClickInterface
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.begingtime_tv)
    TextView begingtimeTv;
    @Bind(R.id.endtime_tv)
    TextView endtimeTv;
    @Bind(R.id.select_lianxece_tv)
    TextView selectLianxeceTv;
    @Bind(R.id.select_yema_tv)
    TextView selectYemaTv;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;

    private GuanLBJCuoTiBenModel mModel;
    private String banJBH = "";

    private List<RtnCuoTTJLXCList.DataEntity>  mLianXCList;
    private ArrayList<HashMap<String,String>> mLianXCMap;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_jcuo_tbcuo_ti_tong_j);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        banJBH = getIntent().getStringExtra("bianhao");
        ShowTimePickerUtils.setMyTimePickerYearMonthDayHourMinuteListener(this);
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("错题统计");
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
            mModel = new GuanLBJCuoTiBenModel(this);
        }
        mModel.addResponseListener(this);
        //初始化数组
        mLianXCList = new ArrayList<>();
        mLianXCMap = new ArrayList<>();

        yemaList = new ArrayList<>();
        searchYeMaList = new ArrayList<>();
        strYeMa = new StringBuilder();

    }

    private SelectDialog lianxcSD;

    private String[] yema;
    private List<String> yemaList;

    private StringBuilder strYeMa;  //选择的页码
    private List<String> searchYeMaList;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.teacher_banjicuotiben_cuotitongji_getlianxice_trancode)))
        {

            mLianXCList = mModel.getRtnCuoTTJLXCList().getData();
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
                lianxcSD = new SelectDialog(BanJCuoTBCuoTiTongJActivity.this,mLianXCMap,this);
                lianxcSD.show();
            }
        }

        if(var1.equals(getResources().getString(R.string.tea_cuotitongji_getyema_trancode)))   //获取页码结果
        {
            yema = new String[]{};
            yema = mModel.getStrYeMa();

            for (int i = 0; i < yema.length; i++)
            {
                yemaList.add(yema[i]);
            }

            DialogUtil.getMultiChoiceDialog(BanJCuoTBCuoTiTongJActivity.this, "页码选择", 0, null, yemaList, new MaterialDialog.ListCallbackMultiChoice()
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
    }


    private int index = 0;
    @OnClick({R.id.begingtime_tv, R.id.endtime_tv, R.id.select_lianxece_tv, R.id.select_yema_tv, R.id.submit_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.begingtime_tv:
                index = 1;
                ShowTimePickerUtils shotTime1 = new ShowTimePickerUtils(this);
                shotTime1.showTimePickerYearMonthDayHourMinute();
                break;
            case R.id.endtime_tv:
                index = 2;
                ShowTimePickerUtils shotTime2 = new ShowTimePickerUtils(this);
                shotTime2.showTimePickerYearMonthDayHourMinute();
                break;
            case R.id.select_lianxece_tv:
                mLianXCList.clear();
                mLianXCMap.clear();
                mModel.getCuoTTJLianXCList(getResources().getString(R.string.teacher_banjicuotiben_cuotitongji_getlianxice_trancode),banJBH);
                break;
            case R.id.select_yema_tv:
                if(mSelectLianXCId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择练习册");
                }
                else {
                    yemaList.clear();
                    mModel.getYeMa(getResources().getString(R.string.tea_cuotitongji_getyema_trancode),mSelectLianXCId);
                }
                break;
            case R.id.submit_btn:
                break;
        }
    }

    private String beginTime = "";
    private String endTime = "";
    @Override
    public void doYearMouthDayHourMinute(String year, String month, String day, String hour, String minute)
    {
        if(index == 1 )
        {
            begingtimeTv.setText(year+"-"+month+"-"+day+" "+hour+":"+minute);
            beginTime = year+"-"+month+"-"+day+" "+hour+":"+minute;
        }

        if(index == 2)
        {
            endtimeTv.setText(year+"-"+month+"-"+day+" "+hour+":"+minute);
            endTime = year+"-"+month+"-"+day+" "+hour+":"+minute;
        }
    }

    @Override
    public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        if(lianxcSD!=null)
        {
            if(lianxcSD.isShowing())
            {
                lianxcSD.dismiss();
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
        selectLianxeceTv.setText(mSelectLianXCName);
    }
}

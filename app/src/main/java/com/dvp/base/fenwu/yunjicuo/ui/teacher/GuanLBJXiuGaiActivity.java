package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.dialog.SelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnSchoolList;
import com.dvp.base.fenwu.yunjicuo.model.GuanLBJModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

/**
 * 班级管理修改界面
 */
public class GuanLBJXiuGaiActivity extends CommonActivity implements SelectDialog.ItemClickInterface
{


    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.select_school_tv)
    TextView selectSchoolTv;
    @Bind(R.id.banji_edittext)
    MaterialEditText banjiEdittext;
    @Bind(R.id.banji_layout)
    MaterialTextInputLayout banjiLayout;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;


    private GuanLBJModel mModel;
    private List<RtnSchoolList.DataEntity> mSchoolDatas;
    private ArrayList<HashMap<String,String>> mSchoolMapList;

    private String id = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_lbjxiu_gai);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        id = getIntent().getStringExtra("id");
        mSchoolDatas = new ArrayList<>();
        mSchoolMapList =  new ArrayList<HashMap<String,String>>();


        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("修改班级");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        toolbar.setNavigationIcon(R.mipmap.back_btn);
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
            mModel = new GuanLBJModel(this);
        }
        mModel.addResponseListener(this);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

        if (var1.equals(getResources().getString(R.string.xiugai_banji_tranCode)))  //保存
        {
            DialogUtil.showToast(getApplicationContext(),"修改成功");
            finish();
        }

        if(var1.equals(getResources().getString(R.string.getschoolListTrancode)))//学校列表的返回
        {

            mSchoolDatas = mModel.getRtnSchoolList().getData();
            for(int i=0;i< mSchoolDatas.size();i++)
            {
                HashMap<String,String> mschool = new HashMap<>();
                mschool.put(mSchoolDatas.get(i).getId(),mSchoolDatas.get(i).getName());
                mSchoolMapList.add(mschool);
            }
            mSchoolSd = new SelectDialog(GuanLBJXiuGaiActivity.this,mSchoolMapList,this);
            mSchoolSd.show();
        }
    }

    @OnClick({R.id.select_school_tv, R.id.submit_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.select_school_tv:
                mSchoolMapList.clear();
                mModel.getShoolList(getResources().getString(R.string.getschoolListTrancode));
                break;
            case R.id.submit_btn:
                mModel.submitModifyClass(getResources().getString(R.string.xiugai_banji_tranCode),id,mSchoolId,banjiEdittext.getText().toString());
                break;
        }
    }

    private SelectDialog mSchoolSd;
    @Override
    public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        if(mSchoolSd!=null)
        {
            if(mSchoolSd.isShowing())
            {
                mSchoolSd.dismiss();
            }
        }
    }

    private String mSchoolId = "";//学校id
    private String mSchoolName = ""; //学校名称
    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {
        mSchoolId = selectItemKey;
        mSchoolName = selectItemValue;
        selectSchoolTv.setText(mSchoolName);
    }
}

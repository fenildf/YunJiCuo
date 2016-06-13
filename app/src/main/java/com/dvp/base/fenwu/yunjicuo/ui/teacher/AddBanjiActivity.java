package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.dialog.SelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnKeMList;
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
 * 新增班级界面
 */
public class AddBanjiActivity extends CommonActivity implements SelectDialog.ItemClickInterface
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.banji_edittext)
    MaterialEditText banjiEdittext;
    @Bind(R.id.banji_layout)
    MaterialTextInputLayout banjiLayout;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;
    @Bind(R.id.select_school_tv)
    TextView selectSchoolTv;
    @Bind(R.id.select_kem_tv)
    TextView selectKemTv;

    private GuanLBJModel mModel;

    private List<RtnSchoolList.DataEntity> mSchoolDatas;
    private ArrayList<HashMap<String,String>> mSchoolMapList;

    private List<RtnKeMList.DataEntity> mKeMuDatas;
    private ArrayList<HashMap<String,String>> mKeMuMapList;

    private int mXuexiao = 0;
    private int mKemu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_banji);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        mSchoolDatas = new ArrayList<>();
        mKeMuDatas = new ArrayList<>();
        mSchoolMapList =  new ArrayList<HashMap<String,String>>();
        mKeMuMapList = new ArrayList<HashMap<String,String>>();

        if (mModel == null)
        {
            mModel = new GuanLBJModel(this);
        }
        mModel.addResponseListener(this);

        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("新增班级");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }

    private SelectDialog mSchoolSd;
    private SelectDialog mKeMSd;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.getschoolListTrancode)))//学校列表的返回
        {

            mXuexiao = 1;
            mSchoolDatas = mModel.getRtnSchoolList().getData();
            for(int i=0;i< mSchoolDatas.size();i++)
            {
                HashMap<String,String> mschool = new HashMap<>();
                mschool.put(mSchoolDatas.get(i).getId(),mSchoolDatas.get(i).getName());
                mSchoolMapList.add(mschool);
            }
            mSchoolSd = new SelectDialog(AddBanjiActivity.this,mSchoolMapList,this);
            mSchoolSd.show();
        }



        if(var1.equals(getResources().getString(R.string.getkemuListTranCode)))   //科目返回列表
        {
            mKemu = 1;
            mKeMuDatas = mModel.getRtnKeMList().getData();
            for (int i = 0; i < mKeMuDatas.size(); i++)
            {
                HashMap<String,String> mKemu = new HashMap<>();
                mKemu.put(mKeMuDatas.get(i).getId(),mKeMuDatas.get(i).getName());
                mKeMuMapList.add(mKemu);
            }
            mKeMSd = new SelectDialog(AddBanjiActivity.this,mKeMuMapList,this);
            mKeMSd.show();
        }

        if(var1.equals(getResources().getString(R.string.addclass_submit_trancode)))  //提交成功返回
        {

            Toast.makeText(AddBanjiActivity.this, "提交成功", Toast.LENGTH_SHORT).show();
            finish();

        }
    }

    @OnClick({R.id.toolbar, R.id.banji_edittext, R.id.banji_layout, R.id.submit_btn,R.id.select_school_tv, R.id.select_kem_tv})
    public void onClick(View view)
    {
        switch (view.getId())
        {

            case R.id.select_school_tv://学校选择
                mKemu = 0;
                mSchoolMapList.clear();
                mModel.getShoolList(getResources().getString(R.string.getschoolListTrancode));
                break;
            case R.id.select_kem_tv:  //科目选择
                mXuexiao = 0;
                mKeMuMapList.clear();
                mModel.getKemuList(getResources().getString(R.string.getkemuListTranCode));
                break;
            case R.id.toolbar:
                break;
            case R.id.banji_edittext:
                break;
            case R.id.banji_layout:
                break;
            case R.id.submit_btn:
                if(mSchoolId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择学校");
                    return;
                }
                else if(mKemuId.equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请选择科目");
                    return;
                }
                else if(banjiEdittext.getText().toString().equals(""))
                {
                    DialogUtil.showToast(getApplicationContext(),"请填写班级");
                    return;
                }
                else
                {
                    mModel.postAddClass(getResources().getString(R.string.addclass_submit_trancode),mSchoolId,mKemuId,banjiEdittext.getText().toString());
                }

                break;
        }
    }

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

        if(mKeMSd!=null)
        {
            if(mKeMSd.isShowing())
            {
                mKeMSd.dismiss();
            }
        }
    }

    private String mSchoolId = "";//学校id
    private String mSchoolName = ""; //学校名称

    private String mKemuId = "";//科目id
    private String mKemuName = "";//科目名称
    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {

        if(mXuexiao==1)
        {
            mSchoolId = selectItemKey;
            mSchoolName = selectItemValue;
            selectSchoolTv.setText(mSchoolName);
        }

        if(mKemu == 1)
        {
            mKemuId = selectItemKey;
            mKemuName = selectItemValue;
            selectKemTv.setText(mKemuName);
        }
    }
}

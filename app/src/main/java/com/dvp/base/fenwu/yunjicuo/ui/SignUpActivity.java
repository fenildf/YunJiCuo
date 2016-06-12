package com.dvp.base.fenwu.yunjicuo.ui;

import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.dialog.SelectDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnSchoolList;
import com.dvp.base.fenwu.yunjicuo.model.ZhuCeModel;
import com.dvp.base.util.Countdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

/**
 * 注册界面
 */
public class SignUpActivity extends CommonActivity implements SelectDialog.ItemClickInterface,Countdown.TextViewGetListener,Countdown.CountdownListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.username)
    MaterialEditText username;
    @Bind(R.id.username_layout)
    MaterialTextInputLayout usernameLayout;
    @Bind(R.id.password)
    MaterialEditText password;
    @Bind(R.id.password_layout)
    MaterialTextInputLayout passwordLayout;
    @Bind(R.id.queren_password)
    MaterialEditText querenPassword;
    @Bind(R.id.queren_password_layout)
    MaterialTextInputLayout querenPasswordLayout;
    @Bind(R.id.select_xuexiao_edittext)
    MaterialEditText selectXuexiaoEdittext;
    @Bind(R.id.selectxuexiao_layout)
    MaterialTextInputLayout selectxuexiaoLayout;
    @Bind(R.id.shoujihao_edittext)
    AppCompatEditText shoujihaoEdittext;
    @Bind(R.id.fasongyanzhengma_md)
    TextView fasongyanzhengmaMd;
    @Bind(R.id.tianxieyanzhengma_edittext)
    MaterialEditText tianxieyanzhengmaEdittext;
    @Bind(R.id.tianxieyanzhengma_layout)
    MaterialTextInputLayout tianxieyanzhengmaLayout;
    @Bind(R.id.zhuce_btn)
    Button zhuceBtn;
    @Bind(R.id.form)
    LinearLayout form;

    private ZhuCeModel mModel;

    private List<RtnSchoolList.DataEntity> mSchoolDatas;
    private ArrayList<HashMap<String,String>> mSchoolMapList;


    private Countdown countdown;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        mSchoolDatas = new ArrayList<>();
        mSchoolMapList =  new ArrayList<HashMap<String,String>>();


        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("用户注册");
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
            mModel = new ZhuCeModel(this);
        }
        mModel.addResponseListener(this);
    }

    private SelectDialog mSchoolSd;
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.zhuce_getschool_trancode)))
        {
            mSchoolDatas = mModel.getRtnSchoolList().getData();
            for(int i=0;i< mSchoolDatas.size();i++)
            {
                HashMap<String,String> mschool = new HashMap<>();
                mschool.put(mSchoolDatas.get(i).getId(),mSchoolDatas.get(i).getName());
                mSchoolMapList.add(mschool);
            }
            mSchoolSd = new SelectDialog(SignUpActivity.this,mSchoolMapList,this);
            mSchoolSd.show();
        }

        if(var1.equals(getResources().getString(R.string.zhuce_getyanzhengma_trancode)))
        {
            if(var2.equals("0"))  //成功
            {
               // DialogUtil.showToast(getApplicationContext(),"发送手机号成功");
                //countdown = new Countdown(this,"%s秒后将会将会消失",10);
                countdown = new Countdown(fasongyanzhengmaMd,"%s秒后可再次发送");
                countdown.setCountdownListener(this);
                countdown.start();
            }
            if(var2.equals("1"))  //失败
            {

            }
        }

        //验证码是否正确
        if(var1.equals(getResources().getString(R.string.zhuce_yzyanzhengma_trancode)))
        {
            if(mModel.getIsTrueYanzhengma().equals("no"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码不正确");
                return;
            }
            else if(mModel.getIsTrueYanzhengma().equals("timeout"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码超时，请重新发送");
                return;
            }
            else if(mModel.getIsTrueYanzhengma().equals("invalid"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码无效");
                return;
            }
            else
            {
                mModel.postSignUp(getResources().getString(R.string.zhuce_submit),username.getText().toString(),password.getText().toString(),querenPassword.getText().toString(),mSchoolId,shoujihaoEdittext.getText().toString(),tianxieyanzhengmaEdittext.getText().toString());
            }
        }

        if(var1.equals(getResources().getString(R.string.zhuce_submit)))
        {
            DialogUtil.showToast(getApplicationContext(),"注册成功");
            finish();
        }
    }

    private boolean isValida()
    {
        if(username.getText().toString().equals(""))
        {
            usernameLayout.setError("真实姓名不能为空");
            return false;
        }
        else if(password.getText().toString().equals(""))
        {
            passwordLayout.setError("密码不能为空");
            return false;
        }
        else if(querenPassword.getText().toString().equals(""))
        {
            querenPasswordLayout.setError("确认密码不能为空");
            return false;
        }
        else if(selectXuexiaoEdittext.getText().toString().equals(""))
        {
            selectxuexiaoLayout.setError("请选择学校");
            return false;
        }
        else if(shoujihaoEdittext.getText().toString().equals(""))
        {
            shoujihaoEdittext.setError("请输入手机号");
            return false;
        }
        else if(tianxieyanzhengmaEdittext.getText().toString().equals(""))
        {
            tianxieyanzhengmaLayout.setError("请输入收到的验证码");
            return false;
        }
        return true;
    }
    @OnClick({R.id.select_xuexiao_edittext, R.id.selectxuexiao_layout, R.id.fasongyanzhengma_md, R.id.zhuce_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.select_xuexiao_edittext:
                mModel.getShoolList(getResources().getString(R.string.zhuce_getschool_trancode));
                break;
            case R.id.selectxuexiao_layout:

                break;
            case R.id.fasongyanzhengma_md:
                shoujihaoEdittext.setError(null);
                if(shoujihaoEdittext.getText().toString().equals(""))
                {
                    shoujihaoEdittext.setError("请输入手机号");
                }
                else if(!isMobileNO(shoujihaoEdittext.getText().toString()))
                {
                    shoujihaoEdittext.setError("手机号格式错误");
                }
                else
                {
                    mModel.getYanZhengMa(getResources().getString(R.string.zhuce_getyanzhengma_trancode),shoujihaoEdittext.getText().toString());
                }

                break;
            case R.id.zhuce_btn:

                usernameLayout.setError(null);

                passwordLayout.setError(null);

                querenPasswordLayout.setError(null);

                selectxuexiaoLayout.setError(null);

                shoujihaoEdittext.setError(null);

                tianxieyanzhengmaLayout.setError(null);

                if(isValida())
                {
                    mModel.validataVCode(getResources().getString(R.string.zhuce_yzyanzhengma_trancode),tianxieyanzhengmaEdittext.getText().toString());
                }
                break;
        }
    }


    /**
     * 判断手机号
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles)
    {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

        Matcher m = p.matcher(mobiles);

        System.out.println(m.matches() + "---");

        return m.matches();

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

    }


    private String mSchoolId = "";//学校id
    private String mSchoolName = ""; //学校名称


    @Override
    public void SelectClick(String selectItemKey, String selectItemValue)
    {
        mSchoolId = selectItemKey;
        mSchoolName = selectItemValue;
        selectXuexiaoEdittext.setText(mSchoolName.toString());
    }

    @Override
    public void onCountdownStart()
    {

    }

    @Override
    public void onCountdownFinish()
    {

    }

    @Override
    public void onCountdownUpdate(int i)
    {

    }

    @Override
    public TextView OnGetShowTextView()
    {
        return null;
    }
}

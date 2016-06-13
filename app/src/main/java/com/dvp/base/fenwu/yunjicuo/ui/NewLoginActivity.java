package com.dvp.base.fenwu.yunjicuo.ui;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.LoginModel;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewLoginActivity extends CommonActivity
{

    @Bind(R.id.login_title_ll)
    LinearLayout loginTitleLl;
    @Bind(R.id.username)
    EditText username;
    @Bind(R.id.username_ll)
    LinearLayout usernameLl;
    @Bind(R.id.password)
    EditText password;
    @Bind(R.id.img_mmqh)
    ImageView imgMmqh;
    @Bind(R.id.password_ll)
    LinearLayout passwordLl;
    @Bind(R.id.login)
    Button login;
    @Bind(R.id.relativeLayout1)
    RelativeLayout relativeLayout1;
    @Bind(R.id.forget_psw_btn)
    Button forgetPswBtn;
    @Bind(R.id.register)
    Button register;

    private LoginModel mModel;
    //密码是否显示明文
    private Boolean passwordBoolean = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_login_layout);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        if (getAPP().getAppConfig().getConfig(User.class) != null)
        {
            username.setText(getAPP().getAppConfig().getConfig(User.class).getLoginName());
            password.setText(getAPP().getAppConfig().getConfig(User.class).getPassword());
        }

        if (mModel == null)
        {
            mModel = new LoginModel(this);
        }
        mModel.addResponseListener(this);
    }


    private boolean isValida()
    {
        if ((username.getText().toString().equals("")) && (!password.getText().toString().equals("")))
        {
            DialogUtil.showToast(getApplicationContext(), "用户名不能为空！");
            return false;
        } else if (!username.getText().toString().equals("") && password.getText().toString().equals(""))
        {
            DialogUtil.showToast(getApplicationContext(), "密码不能为空！");
            return false;
        } else if (username.getText().toString().equals("") && password.getText().toString().equals(""))
        {
            DialogUtil.showToast(getApplicationContext(), "用户名和密码不能为空！");
            return false;
        }
        return true;
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.loginTrancode)))
        {
            //Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();

            //登陆成功  保存用户id
            User user = new User();
            user.setLoginName(username.getText().toString());
            user.setPassword(password.getText().toString());
            user.setStaffId(mModel.getStaffId());
            getAPP().getAppConfig().setConfig(user);
            startActivity(MainActivity.class);
        }
    }

    @OnClick({R.id.img_mmqh, R.id.login, R.id.forget_psw_btn, R.id.register})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.img_mmqh:
                if (passwordBoolean == true) {
                    // 明文
                    password
                            .setTransformationMethod(PasswordTransformationMethod
                                    .getInstance());

                    imgMmqh.setImageResource(R.mipmap.ic_mm_bxs);
                } else {
                    // 暗文
                    password
                            .setTransformationMethod(HideReturnsTransformationMethod
                                    .getInstance());
                    imgMmqh.setImageResource(R.mipmap.ic_mm_xs);
                }
                passwordBoolean = (passwordBoolean == true ? false : true);
                break;
            case R.id.login:
                if (isValida())
                {
                    mModel.getLogin(getResources().getString(R.string.loginTrancode).toString(), username.getText().toString(), password.getText().toString());
                }
                break;
            case R.id.forget_psw_btn:
                startActivity(ForgetPswActivity.class);
                break;
            case R.id.register:
                startActivity(SignUpActivity.class);
                break;
        }
    }
}

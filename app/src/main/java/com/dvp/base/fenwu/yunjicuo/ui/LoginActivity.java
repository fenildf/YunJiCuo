package com.dvp.base.fenwu.yunjicuo.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.util.DimenTool;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.LoginModel;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public class LoginActivity extends CommonActivity
{

    @Bind(R.id.username)
    MaterialEditText username;
    @Bind(R.id.username_layout)
    MaterialTextInputLayout usernameLayout;
    @Bind(R.id.password)
    MaterialEditText password;
    @Bind(R.id.password_layout)
    MaterialTextInputLayout passwordLayout;
    @Bind(R.id.login)
    Button login;
    @Bind(R.id.register)
    Button register;
    @Bind(R.id.form)
    LinearLayout form;
    @Bind(R.id.progress)
    MaterialProgressBar progress;
    @Bind(R.id.forget_psw_btn)
    Button forgetPswBtn;


    private String mUsername;
    private String mPassword;

    private LoginModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
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
        //自动生成不同分辨率下的dimens文件
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                DimenTool.gen();
            }
        }).start();

    }

    private boolean isValida()
    {
        if ((username.getText().toString().equals("")) && (!password.getText().toString().equals("")))
        {
            usernameLayout.setError("用户名不能为空！");
            return false;
        } else if (!username.getText().toString().equals("") && password.getText().toString().equals(""))
        {
            passwordLayout.setError("密码不能为空！");
            return false;
        } else if (username.getText().toString().equals("") && password.getText().toString().equals(""))
        {
            usernameLayout.setError("用户名不能为空！");
            passwordLayout.setError("密码不能为空！");
            return false;
        }
        return true;
    }

    @OnClick(R.id.login)
    public void onClick()
    {
        usernameLayout.setError(null);
        passwordLayout.setError(null);
        if (isValida())
        {
            //DialogUtil.getLoadingDialog(LoginActivity.this,false,"登录中...");
            // Intent intent = new Intent(this, MainActivity.class);
            //startActivity(intent);
            mModel.getLogin(getResources().getString(R.string.loginTrancode).toString(), username.getText().toString(), password.getText().toString());
        }
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

    @OnClick(R.id.forget_psw_btn)
    public void onForgotClick()
    {
       startActivity(ForgetPswActivity.class);
    }

    @OnClick(R.id.register)
    public void onRegisterClick()
    {
       // DialogUtil.showToast(getApplicationContext(), "注册点击");
        startActivity(SignUpActivity.class);
    }
}

package com.dvp.base.fenwu.yunjicuo.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

public class ResetPswActivity extends CommonActivity
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
    @Bind(R.id.zhuce_btn)
    Button zhuceBtn;
    @Bind(R.id.form)
    LinearLayout form;

    private String usernameStr = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_psw);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        usernameStr = getIntent().getStringExtra("username");
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("重置密码");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        username.setText(usernameStr);
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }

    private  boolean isVadata()
    {
        if(!password.getText().toString().equals(querenPassword.getText().toString()))
        {
            DialogUtil.showToast(getApplicationContext(),"两次输入的密码不一致");
            return false;
        }
        else if(password.getText().length()<6 )
        {
            DialogUtil.showToast(getApplicationContext(),"密码长度需大于6位");
            return false;
        }
        else
        {
            return true;
        }
    }
    @OnClick(R.id.zhuce_btn)
    public void onClick()
    {
        usernameLayout.setError(null);

        passwordLayout.setError(null);

        querenPasswordLayout.setError(null);

        if(isVadata())
        {

        }
    }
}

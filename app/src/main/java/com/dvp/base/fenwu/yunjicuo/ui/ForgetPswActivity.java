package com.dvp.base.fenwu.yunjicuo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;

/**
 * 忘记密码界面
 */
public class ForgetPswActivity extends CommonActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_psw);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }
}

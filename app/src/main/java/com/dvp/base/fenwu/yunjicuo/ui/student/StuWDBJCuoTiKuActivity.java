package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;

/**
 * 我的班级  错题库
 */
public class StuWDBJCuoTiKuActivity extends CommonActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_wdbjcuo_ti_ku);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }
}

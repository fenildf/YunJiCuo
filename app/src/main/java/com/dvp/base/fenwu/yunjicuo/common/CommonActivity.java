package com.dvp.base.fenwu.yunjicuo.common;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.activity.BaseActivity;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.HttpResponse;

/**
 * 作者：Administrator on 2016/5/23 10:13
 * <p/>
 * 功能描述:YunJiCuo
 */
public abstract class CommonActivity extends BaseActivity implements HttpResponse
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 功能描述: 弹出对话框提示是否退出程序(不在后台运行)
     */
    public void exitAppWithTips(){

        MaterialDialog md = DialogUtil.getBasicDialog(CommonActivity.this,null, getString(R.string.tips_str),getString(R.string.exit_prompt_str),0, new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                exitApp();
            }
        });
        md.show();
    }

    /**
     * 功能描述:弹出对话框提示是否退出程序(在后台运行)
     */
    public void exitAppBackgroundWithTips(){
        MaterialDialog md = DialogUtil.getBasicDialog(CommonActivity.this,null, getString(R.string.tips_str),getString(R.string.exit_prompt_str),0, new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                exitApp(true);
            }
        });
        md.show();
    }
}



package com.dvp.base.fenwu.yunjicuo.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.model.ForgetPswModel;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

/**
 * 忘记密码界面
 */
public class ForgetPswActivity extends CommonActivity
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.shoujihao_edittext)
    AppCompatEditText shoujihaoEdittext;
    @Bind(R.id.fasongyanzhengma_md)
    TextView fasongyanzhengmaMd;
    @Bind(R.id.tianxieyanzhengma_edittext)
    MaterialEditText tianxieyanzhengmaEdittext;
    @Bind(R.id.tianxieyanzhengma_layout)
    MaterialTextInputLayout tianxieyanzhengmaLayout;
    @Bind(R.id.queding_btn)
    Button quedingBtn;
    @Bind(R.id.form)
    LinearLayout form;
    @Bind(R.id.picyanzhengma_webview)
    SimpleDraweeView picyanzhengmaWebview;
    @Bind(R.id.pictuxingyanzhengma_edittext)
    MaterialEditText pictuxingyanzhengmaEdittext;
    @Bind(R.id.pictuxingyanzhengma_layout)
    MaterialTextInputLayout pictuxingyanzhengmaLayout;

    private ForgetPswModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_psw);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
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

        if (mModel == null)
        {
            mModel = new ForgetPswModel(this);
        }
        mModel.addResponseListener(this);
        mModel.createTuXingYanZhengMa(getResources().getString(R.string.forget_psw_getpicviladata_trancode));

        picyanzhengmaWebview.setImageURI(Uri.parse("http://yunjicuo.com/system/createvalicode"));
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.forget_psw_getpicviladata_trancode)))
        {

        }
    }

    @OnClick(R.id.queding_btn)
    public void onClick()
    {
    }
}

package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.view.ProgressWebView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TongJDisplayActivity extends CommonActivity
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.webview)
    ProgressWebView webview;

    private String url = "";
    private MaterialDialog md;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tong_jdisplay);
        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        webview.clearCache(true);
    }

    private void init()
    {
        url = getIntent().getStringExtra("url");
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("统计");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        //webview.getSettings().setDefaultTextEncodingName("UTF-8");
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
       // webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        //加载需要显示的网页
        webview.loadUrl(url);
        //设置Web视图
       // webview.setWebViewClient(new HelloWebViewClient());

    }

    private class HelloWebViewClient extends WebViewClient{
        /**
         * @param view
         * @param url
         * @param favicon
         */
        @Override
        public void onPageStarted(WebView view, String url,Bitmap favicon) {//网页页面开始加载的时候
            if(md == null)
            {
                md =   DialogUtil.getLoadingDialog(TongJDisplayActivity.this,"正在努力统计...");
                md.show();
                webview.setEnabled(false);// 当加载网页的时候将网页进行隐藏
            }
            super.onPageStarted(view, url,favicon);
        }
        @Override
        public void onPageFinished(WebView view, String url) {//网页加载结束的时候
            //super.onPageFinished(view, url);
            if (md != null && md.isShowing()) {
                md.dismiss();
                md = null;
                webview.setEnabled(true);
            }
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view ,String url){ //网页加载时的连接的网址
            view.loadUrl(url);
            return false;
        }
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }
}

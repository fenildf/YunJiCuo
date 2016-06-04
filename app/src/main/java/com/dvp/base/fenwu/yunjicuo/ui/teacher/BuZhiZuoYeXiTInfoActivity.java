package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.model.BuZhiZuoYeModel;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 习题列表点击后进入的详情页面
 */
public class BuZhiZuoYeXiTInfoActivity extends CommonActivity
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.lianxice_tv)
    TextView lianxiceTv;
    @Bind(R.id.danyuan_tv)
    TextView danyuanTv;
    @Bind(R.id.zhangjie_tv)
    TextView zhangjieTv;
    @Bind(R.id.zhishidian_tv)
    TextView zhishidianTv;
    @Bind(R.id.leixing_tv)
    TextView leixingTv;
    @Bind(R.id.yema_tv)
    TextView yemaTv;
    @Bind(R.id.timubianhao_tv)
    TextView timubianhaoTv;
    @Bind(R.id.timu_webview)
    WebView timuWebview;
    @Bind(R.id.daan_webview)
    WebView daanWebview;
    @Bind(R.id.fenxi_webview)
    WebView fenxiWebview;

    private BuZhiZuoYeModel mModel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bu_zhi_zuo_ye_xi_tinfo);
        ButterKnife.bind(this);

        init();
    }

    private String lianxiceid = "";
    /**
     * 初始化
     */
    private void init()
    {
        timuWebview.getSettings().setDefaultTextEncodingName("UTF-8");
        daanWebview.getSettings().setDefaultTextEncodingName("UTF-8");
        fenxiWebview.getSettings().setDefaultTextEncodingName("UTF-8");

        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("习题详情");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        lianxiceid  = getIntent().getStringExtra("lianxiceid");
        if(mModel == null)
        {
            mModel = new BuZhiZuoYeModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getCuoTInfo(getResources().getString(R.string.cuotilist_info_trancode), lianxiceid);
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.cuotilist_info_trancode)))
        {

            lianxiceTv.setText(mModel.getRtnCuoTiInfo().getPaper().getRcsValue());
            String str1 = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getZhangJ().getDanY().getName():"  ";
            danyuanTv.setText(str1);
            String str2 = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getZhangJ().getName():"  ";

            zhangjieTv.setText(str2);
            String str3 = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getName():"  ";

            zhishidianTv.setText(str2);
            leixingTv.setText(mModel.getRtnCuoTiInfo().getLeiX().getRcsValue());
            yemaTv.setText(mModel.getRtnCuoTiInfo().getPage() + "");
            timubianhaoTv.setText(mModel.getRtnCuoTiInfo().getNum() + "");

            //处理题目
            //用webview显示题目
            String timu = "<html><head></head><body>" + mModel.getRtnCuoTiInfo().getTiM() + "</body></html>";
            timuWebview.loadData(timu, "text/html; charset=UTF-8", null);
            //处理答案
            String daan =  "<html><head></head><body>" + mModel.getRtnCuoTiInfo().getDaA() + "</body></html>";
            daanWebview.loadData(daan, "text/html; charset=UTF-8", null);
            //处理分析
            String fenxi = "<html><head></head><body>" +mModel.getRtnCuoTiInfo().getFenX()+ "</body></html>";
            fenxiWebview.loadData(fenxi, "text/html; charset=UTF-8", null);
        }
    }
}

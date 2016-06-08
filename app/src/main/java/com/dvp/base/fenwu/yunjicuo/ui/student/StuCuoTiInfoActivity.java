package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.model.BuZhiZuoYeModel;
import com.dvp.base.fenwu.yunjicuo.model.StuWoDeCuoTiBenModel;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StuCuoTiInfoActivity extends CommonActivity
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
    @Bind(R.id.delete_btn)
    MDButton deleteBtn;


    private StuWoDeCuoTiBenModel mModel;
    private String lianxiceid = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_cuo_ti_info);
        ButterKnife.bind(this);

        init();
    }

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
            mModel = new StuWoDeCuoTiBenModel(this);
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

            String danyuantv = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getZhangJ().getDanY().getName():"  ";
            danyuanTv.setText(danyuantv);
            String zhangjiestr = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getZhangJ().getName():"  ";

            zhangjieTv.setText(zhangjiestr);
            String zhishidian = mModel.getRtnCuoTiInfo().getZhiShiDian()!=null?mModel.getRtnCuoTiInfo().getZhiShiDian().getName():"  ";
            zhishidianTv.setText(zhishidian);
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

    @OnClick(R.id.delete_btn)
    public void onClick()
    {
    }
}

package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.CommonFragment;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuDaanChaXunModel;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class StuDaAnInfoFragment extends CommonFragment
{
    @Bind(R.id.jiarucuotiku_btn)
    MDButton jiarucuotikuBtn;
    @Bind(R.id.timu_webview)
    WebView timuWebview;
    @Bind(R.id.daan_webview)
    WebView daanWebview;
    @Bind(R.id.fenxi_webview)
    WebView fenxiWebview;

    private String mXiTiId = "";
    private String mLianXCId = "";

    private StuDaanChaXunModel mModel;

    private String stuId = "";//学生id
    private String paperId = "";//习题册id
    private String yema = "";//页码

    public StuDaAnInfoFragment()
    {
        // Required empty public constructor
    }

    public static StuDaAnInfoFragment getInstance(String lianxiceId,String mXiTiId,String yema)
    {
        StuDaAnInfoFragment sf = new StuDaAnInfoFragment();
        sf.mLianXCId = lianxiceId;
        sf.mXiTiId = mXiTiId;
        sf.yema = yema;
        return sf;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stu_da_an_info, container, false);
        ButterKnife.bind(this, view);

        init();
        return view;
    }

    private void init()
    {
        stuId = CommonApp.getInstance().getAppConfig().getConfig(User.class).getStaffId();



        timuWebview.getSettings().setDefaultTextEncodingName("UTF-8");
        daanWebview.getSettings().setDefaultTextEncodingName("UTF-8");
        fenxiWebview.getSettings().setDefaultTextEncodingName("UTF-8");


        if (mModel == null)
        {
            mModel = new StuDaanChaXunModel(getActivity());
        }
        mModel.addResponseListener(this);
        mModel.getDaAnInfo(getActivity().getResources().getString(R.string.stu_daanchaxun_byxitiid_trancode), mXiTiId);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getActivity().getResources().getString(R.string.stu_daanchaxun_byxitiid_trancode)))
        {
            //封装成html在webview中调用本地网页
            String timu = "<html><head></head><body>" + mModel.getRtnDaAnInfo().getTiM().toString() + "</body></html>";
            timuWebview.loadData(timu, "text/html; charset=UTF-8", null);

            //封装成html在webview中调用本地网页
            String daan = "<html><head></head><body>" + mModel.getRtnDaAnInfo().getDaA().toString() + "</body></html>";
            daanWebview.loadData(daan, "text/html; charset=UTF-8", null);

            //封装成html在webview中调用本地网页
            String fenxi = "<html><head></head><body>" + mModel.getRtnDaAnInfo().getFenX().toString() + "</body></html>";
            fenxiWebview.loadData(fenxi, "text/html; charset=UTF-8", null);
        }

        if (var1.equals(getActivity().getResources().getString(R.string.stu_daanchaxun_jiarucuotiku_trancode)))  //加入错题返回结果
        {
            DialogUtil.showToast(getActivity(),"保存成功");
        }

    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.jiarucuotiku_btn)
    public void onClick()
    {
        DialogUtil.getBasicDialog(getActivity(), null, "加入错题库", "确定加入错题库么？", 0, new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                mModel.submitJiaRuCuoTK(getActivity().getResources().getString(R.string.stu_daanchaxun_jiarucuotiku_trancode),stuId,mLianXCId,mXiTiId,yema);
            }
        }).show();
        }
}

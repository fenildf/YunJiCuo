package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiKuList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnGuanLLianXC;
import com.dvp.base.fenwu.yunjicuo.model.CuoTiKuModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 错题库列表界面  从班级错题本界面按钮点进来的
 */
public class CuoTiKuActivity extends CommonActivity implements XRecyclerView.LoadingListener,RecyclerAdapter.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private CuoTiKuModel mModel;
    private String id = "";

    private List<RtnCuoTiKuList.DataEntity> mDatas;

    RecyclerAdapter<RtnCuoTiKuList.DataEntity> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuo_ti_ku);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        mDatas = new ArrayList<>();
        id = getIntent().getStringExtra("bianhao");
        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("错题库");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        toolbar.setNavigationIcon(R.mipmap.back_btn);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });


        xListview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));//实现ListView
        xListview.setRefreshProgressStyle(ProgressStyle.BallBeat);//下拉刷新样式
        xListview.setLaodingMoreProgressStyle(ProgressStyle.BallRotate);//加载更多样式
        xListview.setArrowImageView(com.dvp.base.R.mipmap.iconfont_downgrey);//下拉的箭头
        // xListview.addItemDecoration(new SpacesItemDecoration(8));
        //listview.addItemDecoration(new DividerItemDecoration(getActivity(),0));
        // xRecyclerview.addItemDecoration(new DividerItemDecoration(this, 1));
        xListview.setLoadingListener(this);
        xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(false);
        xListview.setLoadingMoreEnabled(false);

        if (mModel == null)
        {
            mModel = new CuoTiKuModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getCuoTKuList(getResources().getString(R.string.cuotiku_list_trancode), id);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.cuotiku_list_trancode)))
        {
            mDatas.addAll(mModel.getRtnCuoTiKuList().getData());

            adapter = new RecyclerAdapter<RtnCuoTiKuList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_cuotiku_layout)
            {
                @Override
                public void convert(RecyclerHolder recycleHolder, RtnCuoTiKuList.DataEntity classManageItem, int i)
                {
                    recycleHolder.setText(R.id.lianxecename_tv, classManageItem.getPaper().getName());
                    String str1 = (classManageItem.getPaper().getFenCe() != null) ? classManageItem.getPaper().getFenCe().getName() : "  ";
                    recycleHolder.setText(R.id.fence_tv, str1);
                    recycleHolder.setText(R.id.cuotishu_tv,classManageItem.getCount()+"");
                    recycleHolder.setText(R.id.nianji_tv, classManageItem.getPaper().getNianJ().getName());
                    recycleHolder.setText(R.id.kemu_tv, classManageItem.getPaper().getKeM().getName());
                    String str2 = (classManageItem.getPaper().getBanBen() != null) ? classManageItem.getPaper().getBanBen().getName() : "  ";
                    recycleHolder.setText(R.id.banben_tv, str2);
                }
            };
            xListview.setAdapter(adapter);
            adapter.setOnItemClickListener(this);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onRefresh()
    {

    }

    @Override
    public void onLoadMore()
    {

    }

    @Override
    public void onItemClick(View view, int i)
    {
        RtnCuoTiKuList.DataEntity info = mDatas.get(i-1);
        info.getPaper().getId();
        Bundle bundle = new Bundle();
        bundle.putString("fencename",info.getPaper().getName());
        String str1 = (info.getPaper().getFenCe() != null) ? info.getPaper().getFenCe().getName() : "  ";
        bundle.putString("fence",str1);
        bundle.putString("kemu",info.getPaper().getKeM().getName());
        bundle.putString("nianji",info.getPaper().getNianJ().getName());
        String str2 = (info.getPaper().getBanBen() != null) ? info.getPaper().getBanBen().getName() : "  ";
        bundle.putString("banben",str2);
        bundle.putString("paperid",info.getPaper().getId());
        bundle.putString("id",id);
        startActivity(FenCeCuoTiListActivity.class,bundle);
    }

    @Override
    public void OnItemLongClickListener(View view, int i)
    {

    }
}

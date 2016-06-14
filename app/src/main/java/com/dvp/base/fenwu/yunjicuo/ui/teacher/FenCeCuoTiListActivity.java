package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.dvp.base.adapter.recyviewadapter.adapter.DividerItemDecoration;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnFenCeCuoTList;
import com.dvp.base.fenwu.yunjicuo.model.CuoTiKuModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 错题列表 从错题库点击item项进入
 */
public class FenCeCuoTiListActivity extends CommonActivity implements XRecyclerView.LoadingListener,RecyclerAdapter.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fence_tv)
    TextView fenceTv;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private CuoTiKuModel mModel;
    private String banJBH = "";
    private String paperId = "";
    private int page = 1;
    private int pageSize = 20;

    private List<RtnFenCeCuoTList.DataEntity> mDatas;
    RecyclerAdapter<RtnFenCeCuoTList.DataEntity> adapter;

    private String fencename = "";
    private String fence = "";
    private String kemu = "";
    private String nianji = "";
    private String banben = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fen_ce_cuo_ti_list);
        ButterKnife.bind(this);

        init();
    }


    /**
     * 初始化
     */
    private void init()
    {
        mDatas = new ArrayList<>();
        banJBH = getIntent().getStringExtra("id");
        paperId = getIntent().getStringExtra("paperid");
        //获取到分册信息
        fencename = getIntent().getStringExtra("fencename");
        fence = getIntent().getStringExtra("fence");
        kemu = getIntent().getStringExtra("kemu");
        nianji = getIntent().getStringExtra("nianji");
        banben = getIntent().getStringExtra("banben");

        fenceTv.setText(fencename+fence+kemu+nianji+banben);
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("错题列表");

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
        xListview.addItemDecoration(new DividerItemDecoration(this, 1));
        xListview.setLoadingListener(this);
        xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(true);
        xListview.setLoadingMoreEnabled(true);

        if (mModel==null)
        {
            mModel = new CuoTiKuModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getFenCeCuoTiList(getResources().getString(R.string.fence_cuoti_list_trancode),banJBH,paperId,page++,pageSize);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.fence_cuoti_list_trancode)))
        {

            if (page - 1==1)
            {
                mDatas = mModel.getRtnFenCeCuoTList().getData();
                adapter = new RecyclerAdapter<RtnFenCeCuoTList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_fence_cuoti_list_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, RtnFenCeCuoTList.DataEntity classManageItem, int i)
                    {
                        String str1 = classManageItem.getCwl()+"% / "+classManageItem.getStuCount();
                        TextView cuowlTv =   recycleHolder.findView(R.id.cuowulv_tv);
                        if(classManageItem.getCwl()<=30)
                        {

                            cuowlTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar3));

                            recycleHolder.setText(R.id.cuowulv_tv,str1);
                        }
                        else if(classManageItem.getCwl()>30 && classManageItem.getCwl()< 50)
                        {
                            cuowlTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            recycleHolder.setText(R.id.cuowulv_tv,str1);
                        }
                        else
                        {
                            cuowlTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar2));
                            recycleHolder.setText(R.id.cuowulv_tv,str1);
                        }

                        recycleHolder.setText(R.id.yema_tv,"页码："+classManageItem.getQPage()+"");
                        recycleHolder.setText(R.id.tihao_tv,"题号："+classManageItem.getQNum());

                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                adapter.setOnItemClickListener(this);
                xListview.refreshComplete();
            }
            else
            {
                mDatas.addAll(mModel.getRtnFenCeCuoTList().getData());
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getmFenCeTotalPages())
            {
                xListview.noMoreLoading();
                xListview.setLoadingMoreEnabled(false);
            }
            else
            {
                xListview.setLoadingMoreEnabled(true);
            }
        }
    }

    @Override
    public void onRefresh()
    {
        page = 1;
        mModel.getFenCeCuoTiList(getResources().getString(R.string.fence_cuoti_list_trancode),banJBH,paperId,page++,pageSize);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getFenCeCuoTiList(getResources().getString(R.string.fence_cuoti_list_trancode),banJBH,paperId,page++,pageSize);
    }

    @Override
    public void onItemClick(View view, int i)
    {
        RtnFenCeCuoTList.DataEntity info = mDatas.get(i-1);
        Bundle bundle = new Bundle();
        bundle.putString("lianxiceid",info.getQId());
        startActivity(CuoTiLieBiaoInfoActivity.class,bundle);
    }

    @Override
    public void OnItemLongClickListener(View view, int i)
    {

    }
}

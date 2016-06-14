package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnWDSjList;
import com.dvp.base.fenwu.yunjicuo.model.MyShuJiaModel;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.AddBanjiActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 我的书架界面
 */
public class WoDShuJActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private MyShuJiaModel mModel;

    private int page = 1;
    private int pageSize = 5;

    private List<RtnWDSjList.DataEntity> mDatas;

    RecyclerAdapter<RtnWDSjList.DataEntity> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo_dshu_j);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        mDatas = new ArrayList<>();
        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("我的书架");
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
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener()
        {
            @Override
            public boolean onMenuItemClick(MenuItem item)
            {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.add)
                {
                    startActivity(AddWDSJActivity.class);
                }
                return true;
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
        xListview.setPullRefreshEnabled(true);
        xListview.setLoadingMoreEnabled(true);

        if(mModel == null)
        {
            mModel = new MyShuJiaModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getWoDeSJ(getResources().getString(R.string.wodeshujia_trancode),page++,pageSize);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.addmenu, menu);//加载自定义的menu文件
        return true;
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.wodeshujia_trancode)))
        {

            if (page - 1==1)
            {
                mDatas =mModel.getRtnWDSjList().getData();
                adapter = new RecyclerAdapter<RtnWDSjList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_wodeshujia_list_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder,final RtnWDSjList.DataEntity classManageItem, int i)
                    {
                        recycleHolder.setText(R.id.lianxecename_tv,classManageItem.getPaper().getName());
                        recycleHolder.setText(R.id.fence_tv,"  ");
                        recycleHolder.setText(R.id.nianji_tv,classManageItem.getPaper().getNianJ().getName());
                        recycleHolder.setText(R.id.kemu_tv, classManageItem.getPaper().getKeM().getName());
                        //String str2  = (classManageItem.getPaper().getBanBen()!=null)?classManageItem.getPaper().getBanBen().getName():"  ";
                        recycleHolder.setText(R.id.banben_tv, "  ");

                        //删除
                        MDButton deleteBtn = (MDButton) recycleHolder.findView(R.id.delete_btn);
                        deleteBtn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                mModel.stuDeleteLXC(getResources().getString(R.string.stu_delete_lianxice_trancode),classManageItem.getId()+"");
                            }
                        });
                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                xListview.refreshComplete();
            }
            else
            {
                mDatas.addAll(mModel.getRtnWDSjList().getData());
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getmShujiaTotalPages())
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
        mModel.getWoDeSJ(getResources().getString(R.string.wodeshujia_trancode),page++,pageSize);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getWoDeSJ(getResources().getString(R.string.wodeshujia_trancode),page++,pageSize);
    }
}

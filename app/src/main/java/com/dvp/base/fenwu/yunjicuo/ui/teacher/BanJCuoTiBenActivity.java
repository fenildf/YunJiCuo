package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnBanList;
import com.dvp.base.fenwu.yunjicuo.model.GuanLBJCuoTiBenModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

//import com.dvp.base.adapter.recyviewadapter.adapter.RecycleHolder;
/*import com.dvp.base.adapter.recyviewadapter.adapter.RecycleHolder;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;*/

/**
 * 班级错题本列表
 */
public class BanJCuoTiBenActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private GuanLBJCuoTiBenModel mModel;

    private int page = 1;
    private int pageSize = 5;
    RecyclerAdapter<RtnBanList.DataEntity> adapter;
    private List<RtnBanList.DataEntity> mDatas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_jcuo_ti_ben);
        ButterKnife.bind(this);

        initUi();
    }

    private void initUi()
    {
        if (mModel == null)
        {
            mModel = new GuanLBJCuoTiBenModel(this);
        }
        mModel.addResponseListener(this);

        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("班级错题本");
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

       /* toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener()
        {
            @Override
            public boolean onMenuItemClick(MenuItem item)
            {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.add)
                {
                    //Toast.makeText(GuanLiBanJActivity.this, "点击了添加班级按钮", Toast.LENGTH_SHORT).show();
                    startActivity(AddBanjiActivity.class);
                }
                return true;
            }
        });*/

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

        mModel.getBanJCTBList(getResources().getString(R.string.getbanjicuotibenListTrancode), pageSize, page++, "");

    }


   /* public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.addmenu, menu);//加载自定义的menu文件
        return true;
    }*/

    @Override
    public void onRefresh()
    {
        page = 1;
        mModel.getBanJCTBList(getResources().getString(R.string.getbanjicuotibenListTrancode), pageSize, page++, "");
    }

    @Override
    public void onLoadMore()
    {
        mModel.getBanJCTBList(getResources().getString(R.string.getbanjicuotibenListTrancode), pageSize, page++, "");
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.getbanjicuotibenListTrancode)))
        {

            if (page - 1==1)
            {
                mDatas = mModel.getRtnBanList().getData();
                adapter = new RecyclerAdapter<RtnBanList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_banjicuotiben_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnBanList.DataEntity classManageItem, int i)
                    {
                        String str = (classManageItem.getBanJ().getKeM()!=null)?classManageItem.getBanJ().getKeM().getName():"  ";
                        recycleHolder.setText(R.id.banji_tv, classManageItem.getBanJ().getName() + "/" + str + "（学生数：" + classManageItem.getYiShengUserNum().toString() + ")");
                        recycleHolder.setText(R.id.chuangJR_tv, classManageItem.getUser().getName());
                        recycleHolder.setText(R.id.bh_tv, classManageItem.getBanJ().getId());
                        recycleHolder.setText(R.id.school_tv, classManageItem.getBanJ().getSchool().getName());


                        //错题库
                        MDButton xglBtn = (MDButton) recycleHolder.findView(R.id.cuotiku_btn);
                        xglBtn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                 Bundle bundle = new Bundle();
                                bundle.putString("bianhao",classManageItem.getBanJ().getId());
                                startActivity(CuoTiKuActivity.class,bundle);
                            }
                        });

                        //错题统计
                        MDButton deleteBtn = (MDButton) recycleHolder.findView(R.id.cuotitongji_btn);
                        deleteBtn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Bundle bundle = new Bundle();
                                bundle.putString("bianhao",classManageItem.getBanJ().getId());
                                startActivity(BanJCuoTBCuoTiTongJActivity.class,bundle);
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
                mDatas.addAll(mModel.getRtnBanList().getData());
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getTotalPages())
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
}

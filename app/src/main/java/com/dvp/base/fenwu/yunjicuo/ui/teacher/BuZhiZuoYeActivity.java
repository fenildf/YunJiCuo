package com.dvp.base.fenwu.yunjicuo.ui.teacher;

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
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnBuZhiZuoYeList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.BuZhiZuoYeModel;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuPanJuanListActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.TongJDisplayActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 布置作业列表界面
 */
public class BuZhiZuoYeActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private BuZhiZuoYeModel mModel;

    private String id;//用户id

    private int page = 1;
    private int pageSize = 3;

    RecyclerAdapter<RtnBuZhiZuoYeList.DataEntity> adapter;

    private List<RtnBuZhiZuoYeList.DataEntity> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bu_zhi_zuo_ye);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        id = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        mDatas = new ArrayList<>();
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("布置作业");
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
                    startActivity(AddBuZhiZuoYeActivity.class);
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
        if (mModel == null)
        {
            mModel = new BuZhiZuoYeModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getBuZhiZuoYeList(getResources().getString(R.string.buzhizuoye_getList_trancode), id, pageSize, page++);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.buzhizuoye_getList_trancode)))
        {

            if (page - 1 == 1)
            {
                mDatas = mModel.getRtnBuZhiZuoYeList().getData();
                adapter = new RecyclerAdapter<RtnBuZhiZuoYeList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_buzhizuoye_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnBuZhiZuoYeList.DataEntity classManageItem, int i)
                    {

                        recycleHolder.setText(R.id.banji_tv, classManageItem.getBanJ().getName() + "/" + classManageItem.getBanJ().getKeM().getName());
                        recycleHolder.setText(R.id.begintime_tv, classManageItem.getHomework().getKaiShShJ());
                        recycleHolder.setText(R.id.endtime_tv, classManageItem.getHomework().getJieShShJ());
                        recycleHolder.setText(R.id.beizhu_tv, classManageItem.getHomework().getRemark());

                        MDButton xitixq = (MDButton) recycleHolder.findView(R.id.xttj_btn);
                        xitixq.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Bundle bundle = new Bundle();
                                bundle.putString("homeworkid", classManageItem.getHomework().getId() + "");
                                startActivity(XiTiXiangQingActivity.class, bundle);
                            }
                        });


                        MDButton xqtj_btn = (MDButton) recycleHolder.findView(R.id.xqtj_btn);
                        xqtj_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                //DialogUtil.showToast(getApplicationContext(),"学情统计");

                                String url = getResources().getString(R.string.http_request_url) +
                                        "/weixweb/jsp/teacher/hw/tongjjg.jsp?" +
                                        "hwID=" +
                                        classManageItem.getHomework().getId().toString() +
                                        "&bjID=" +
                                        classManageItem.getBanJ().getId().toString();

                                Bundle bundle = new Bundle();
                                bundle.putString("url", url);
                                startActivity(TongJDisplayActivity.class, bundle);
                            }
                        });

                        MDButton delete_btn = (MDButton) recycleHolder.findView(R.id.delete_btn);
                        delete_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                DialogUtil.showToast(getApplicationContext(), "删除");
                            }
                        });
                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                xListview.refreshComplete();
            } else
            {
                mDatas.addAll(mModel.getRtnBuZhiZuoYeList().getData());
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if (page > mModel.getTotalPages())
            {
                xListview.noMoreLoading();
                xListview.setLoadingMoreEnabled(false);
            } else
            {
                xListview.setLoadingMoreEnabled(true);
            }
        }
    }


    // 为了让ToolBar的menu起作用，这个方法不能删掉
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.addmenu, menu);//加载自定义的menu文件
        return true;
    }

    @Override
    public void onRefresh()
    {
        page = 1;
        mModel.getBuZhiZuoYeList(getResources().getString(R.string.buzhizuoye_getList_trancode), id, pageSize, page++);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getBuZhiZuoYeList(getResources().getString(R.string.buzhizuoye_getList_trancode), id, pageSize, page++);
    }
}

package com.dvp.base.fenwu.yunjicuo.ui.student;

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
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnPanJStatusList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnWDZYList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWDZYModel;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.XiTiXiangQingActivity;
import com.facebook.imagepipeline.producers.BaseNetworkFetcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StuWDZYListActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;


    private int page = 1;
    private int pageSize = 3;

    private String id;//用户id

    private StuWDZYModel mModel;
    private List<RtnWDZYList.DataEntity> mDatas;
    private RecyclerAdapter<RtnWDZYList.DataEntity> adapter;

    private HashMap<String, String> mPanJStatusMap;
    private List<RtnPanJStatusList> mPanJStatusList;

    private List<String> homeWorkIdList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_wdzylist);
        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }


    /**
     * 初始化
     */
    private void init()
    {
        id = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        mDatas = new ArrayList<>();
        mPanJStatusList = new ArrayList<>();
        mPanJStatusMap = new HashMap<>();
        homeWorkIdList = new ArrayList<>();
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("我的作业");
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
        xListview.setPullRefreshEnabled(true);
        xListview.setLoadingMoreEnabled(true);

        if (mModel == null)
        {
            mModel = new StuWDZYModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getWDZYList(getResources().getString(R.string.stu_wdzy_list_trancode), id, pageSize, page++);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {


        if (var1.equals(getResources().getString(R.string.stu_wdzy_list_trancode)))
        {

            for (int i = 0; i < mModel.getRtnWDZYList().getData().size(); i++)
            {
                homeWorkIdList.add(mModel.getRtnWDZYList().getData().get(i).getHomework().getId());
            }
            mModel.getPanJStatus(getResources().getString(R.string.stu_wdzy_list_panjuan_status_trancode), id, homeWorkIdList);

        }

        if (var1.equals(getResources().getString(R.string.stu_wdzy_list_panjuan_status_trancode)))
        {

            //获取到状态后匹配
            if (var2.equals("0"))  //未判卷
            {
                mDatas.addAll(mModel.getRtnWDZYList().getData());
                for (int i = 0; i < mDatas.size(); i++)
                {
                    for (int j = 0; j < mModel.getRtnPanJStatusList().getData().size(); j++)
                    {
                        if (mDatas.get(i).getHomework().getId().equals(mModel.getRtnPanJStatusList().getData().get(j).getHomework().getId()))
                        {
                            mDatas.get(i).setYiPanJuan("1");
                        }
                    }
                }
                System.out.println("=====");
                if (page - 1 == 1)
                {
                    adapter = new RecyclerAdapter<RtnWDZYList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_stu_wdzy_layout)
                    {
                        @Override
                        public void convert(RecyclerHolder recycleHolder, final RtnWDZYList.DataEntity classManageItem, int i)
                        {

                            TextView statusTv = recycleHolder.findView(R.id.zhuangtai_tv);
                            if(classManageItem.getYiPanJuan().equals("0"))
                            {
                                recycleHolder.setText(R.id.zhuangtai_tv,"未判卷");
                                statusTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            }
                            if(classManageItem.getYiPanJuan().equals("1"))
                            {
                                recycleHolder.setText(R.id.zhuangtai_tv,"已判卷");
                                statusTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                            }
                            statusTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            recycleHolder.setText(R.id.banji_tv, classManageItem.getBanJ().getName() + "/" + classManageItem.getBanJ().getKeM().getName());
                            recycleHolder.setText(R.id.begintime_tv, classManageItem.getHomework().getKaiShShJ());
                            recycleHolder.setText(R.id.endtime_tv, classManageItem.getHomework().getJieShShJ());
                            recycleHolder.setText(R.id.beizhu_tv, classManageItem.getHomework().getRemark());


                            MDButton pj_btn = recycleHolder.findView(R.id.pj_btn);
                            pj_btn.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    DialogUtil.showToast(getApplicationContext(),"判卷点击");
                                }
                            });

                            MDButton xqtj_btn = recycleHolder.findView(R.id.xqtj_btn);
                            xqtj_btn.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    DialogUtil.showToast(getApplicationContext(),"学情统计点击");
                                }
                            });
                        }
                    };
                    xListview.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    xListview.refreshComplete();
                } else
                {
                    xListview.loadMoreComplete();
                    
                    
                    adapter.notifyDataSetChanged();
                }

                if (page > mModel.getmTotalPages())
                {
                    xListview.noMoreLoading();
                    xListview.setLoadingMoreEnabled(false);
                } else
                {
                    xListview.setLoadingMoreEnabled(true);
                }


            }
            if (var2.equals("1"))  //已判卷
            {
                mDatas.addAll(mModel.getRtnWDZYList().getData());
                for (int i = 0; i < mDatas.size(); i++)
                {
                    for (int j = 0; j < mModel.getRtnPanJStatusList().getData().size(); j++)
                    {
                        if (mDatas.get(i).getHomework().getId().equals(mModel.getRtnPanJStatusList().getData().get(j).getHomework().getId()))
                        {
                            mDatas.get(i).setYiPanJuan("1");
                        }
                    }
                }
                
                System.out.println("=====");
                if (page - 1 == 1)
                {
                    adapter = new RecyclerAdapter<RtnWDZYList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_stu_wdzy_layout)
                    {
                        @Override
                        public void convert(RecyclerHolder recycleHolder, final RtnWDZYList.DataEntity classManageItem, int i)
                        {

                            TextView statusTv = recycleHolder.findView(R.id.zhuangtai_tv);
                            if(classManageItem.getYiPanJuan().equals("0"))
                            {
                                recycleHolder.setText(R.id.zhuangtai_tv,"未判卷");
                                statusTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            }
                            if(classManageItem.getYiPanJuan().equals("1"))
                            {
                                recycleHolder.setText(R.id.zhuangtai_tv,"已判卷");
                                statusTv.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                            }
                            recycleHolder.setText(R.id.banji_tv, classManageItem.getBanJ().getName() + "/" + classManageItem.getBanJ().getKeM().getName());
                            recycleHolder.setText(R.id.begintime_tv, classManageItem.getHomework().getKaiShShJ());
                            recycleHolder.setText(R.id.endtime_tv, classManageItem.getHomework().getJieShShJ());
                            recycleHolder.setText(R.id.beizhu_tv, classManageItem.getHomework().getRemark());



                            MDButton pj_btn = recycleHolder.findView(R.id.pj_btn);
                            pj_btn.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    //DialogUtil.showToast(getApplicationContext(),"判卷点击");

                                    Bundle bundle = new Bundle();
                                    bundle.putString("banjbh",classManageItem.getBanJ().getId().toString());
                                    bundle.putString("homeworkid",classManageItem.getHomework().getId());
                                    startActivity(StuPanJuanListActivity.class, bundle);
                                    finish();
                                }
                            });

                            MDButton xqtj_btn = recycleHolder.findView(R.id.xqtj_btn);
                            xqtj_btn.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    DialogUtil.showToast(getApplicationContext(),"学情统计点击");
                                }
                            });
                        }
                    };
                    xListview.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    xListview.refreshComplete();
                } else
                {

                    xListview.loadMoreComplete();
                    adapter.notifyDataSetChanged();
                }

                if (page > mModel.getmTotalPages())
                {
                    xListview.noMoreLoading();
                    xListview.setLoadingMoreEnabled(false);
                } else
                {
                    xListview.setLoadingMoreEnabled(true);
                }

            }

            //mDatas.addAll(mModel.getRtnWDZYList().getData());

        }
    }

    @Override
    public void onRefresh()
    {
        homeWorkIdList.clear();
        mDatas.clear();
        page = 1;
        mModel.getWDZYList(getResources().getString(R.string.stu_wdzy_list_trancode), id, pageSize, page++);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getWDZYList(getResources().getString(R.string.stu_wdzy_list_trancode), id, pageSize, page++);
    }
}

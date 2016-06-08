package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnChouTList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnChouTStatusList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnWDZYList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWDZYModel;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.AddBanjiActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 判卷列表界面
 */
public class StuPanJuanListActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private StuWDZYModel mModel;
    private String homeworkId = "";

    private RecyclerAdapter<RtnChouTList.DataEntity> adapter;
    private List<RtnChouTList.DataEntity> mDatas;

    private List<RtnChouTStatusList.DataEntity> statusList;
    private String stuId = "";
    private String banJBH = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_pan_juan_list);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        mDatas = new ArrayList<>();
        statusList = new ArrayList<>();
        homeworkId =  getIntent().getStringExtra("homeworkid");
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        banJBH =  getIntent().getStringExtra("banjbh");
        setSupportActionBar(toolbar);
        setTitle("");

        toolbar.setOnMenuItemClickListener(onMenuItemClick);
        middleTitleTv.setText("判卷");
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
        xListview.setLaodingMoreProgressStyle(ProgressStyle.BallPulseSync);//加载更多样式
        xListview.setArrowImageView(com.dvp.base.R.mipmap.iconfont_downgrey);//下拉的箭头
        // xListview.addItemDecoration(new SpacesItemDecoration(8));
        //listview.addItemDecoration(new DividerItemDecoration(getActivity(),0));
        // xRecyclerview.addItemDecoration(new DividerItemDecoration(this, 1));
        xListview.setLoadingListener(this);
        xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(false);
        xListview.setLoadingMoreEnabled(false);

        if(mModel == null)
        {
            mModel = new StuWDZYModel(this);
        }
        mModel.addResponseListener(this);

        mModel.getPanJuanList(getResources().getString(R.string.stu_getpanjuanlist_trancode),homeworkId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.panjuanwancheng, menu);//加载自定义的menu文件
        return true;
    }

    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener()
    {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem)
        {
            switch (menuItem.getItemId())
            {
                case R.id.pj_complete:
                    mModel.panJAllEnd(getResources().getString(R.string.stu_panjuan_wancheng),homeworkId,banJBH,stuId);
                    break;
            }
            return true;
        }
    };

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.stu_panjuan_wancheng)))
        {
            if(mModel.getRtnPanJWanC().getYiPJ()==1)
            {
                DialogUtil.showToast(getApplicationContext(),"判卷完成");
                startActivity(StuWDZYListActivity.class);
                finish();
            }
        }

        if(var1.equals(getResources().getString(R.string.stu_getpanjuanlist_status_trancode)))
        {
            if(var2.equals("0"))  //全部是正确的
            {
                for (int i = 0; i < mDatas.size(); i++)
                {
                   /* for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                    {
                        if (mDatas.get(i).getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                        {*/
                            mDatas.get(i).setDuiC(true);
                   /*     }
                    }*/
                }
                adapter = new RecyclerAdapter<RtnChouTList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_chouti_list_item_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnChouTList.DataEntity classManageItem, final int i)
                    {
                        recycleHolder.setText(R.id.shijuan_tv,classManageItem.getQuestion().getPaper().getRcsValue());
                        recycleHolder.setText(R.id.yema_tv,classManageItem.getQuestion().getPage()+"");
                        recycleHolder.setText(R.id.tihao_tv,classManageItem.getQuestion().getNum()+"");
                        WebView webView = recycleHolder.findView(R.id.daan_webview);
                        webView.getSettings().setDefaultTextEncodingName("UTF-8");
                        String timu = "<html><head></head><body>" + classManageItem.getQuestion().getDaA().toString() + "</body></html>";
                        webView.loadData(timu, "text/html; charset=UTF-8", null);

                        final Button btn = (Button)recycleHolder.findView(R.id.submit_btn);
                        final Button paizhao_btn = (Button) recycleHolder.findView(R.id.paizhao_btn);
                        if(!classManageItem.isDuiC())
                        {
                            btn.setText("错误");
                            btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            paizhao_btn.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            btn.setText("正确");
                            btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                            paizhao_btn.setVisibility(View.GONE);
                        }

                        //拍照
                        paizhao_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                if( mModel.getRtnChouTStatusList().getData().size()>0)
                                {
                                    for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                                    {
                                        if(classManageItem.getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                                        {
                                            homeworkScoreId = mModel.getRtnChouTStatusList().getData().get(j).getId().toString();
                                        }
                                    }
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("homeworkscoreid",homeworkScoreId);
                                startActivity(StuCuoTPaiZhaoActivity.class,bundle);
                            }
                        });

                        btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                if(classManageItem.isDuiC())  //如果是正确的，置为错误
                                {

                                    mModel.panJError(getResources().getString(R.string.stu_panjuan_set_false_trancode),classManageItem.getId(),classManageItem.getHomework().getBanJID(),stuId);
                                    btn.setText("错误");
                                    btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                                    paizhao_btn.setVisibility(View.VISIBLE);
                                    mDatas.get(i).setDuiC(false);
                                    //notifyItemChanged(i);
                                }
                                else
                                {
                                    if( mModel.getRtnChouTStatusList().getData().size()>0)
                                    {
                                        for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                                        {
                                            if(classManageItem.getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                                            {
                                                homeworkScoreId = mModel.getRtnChouTStatusList().getData().get(j).getId().toString();
                                            }
                                        }
                                    }

                                    mModel.panJTrue(getResources().getString(R.string.stu_panjuan_set_true_trancode),homeworkScoreId);
                                    btn.setText("正确");
                                    btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                                    paizhao_btn.setVisibility(View.GONE);
                                    mDatas.get(i).setDuiC(true);
                                   // notifyItemChanged(i);
                                }
                            }
                        });
                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
            if(var2.equals("1"))  //有错误的
            {

                for (int i = 0; i < mDatas.size(); i++)
                {
                    for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                    {
                        if (mDatas.get(i).getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                        {
                            mDatas.get(i).setDuiC(false);
                        }
                    }
                }

                adapter = new RecyclerAdapter<RtnChouTList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_chouti_list_item_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnChouTList.DataEntity classManageItem, final int i)
                    {
                        recycleHolder.setText(R.id.shijuan_tv,classManageItem.getQuestion().getPaper().getRcsValue());
                        recycleHolder.setText(R.id.yema_tv,classManageItem.getQuestion().getPage()+"");
                        recycleHolder.setText(R.id.tihao_tv,classManageItem.getQuestion().getNum()+"");
                        WebView webView = recycleHolder.findView(R.id.daan_webview);
                        webView.getSettings().setDefaultTextEncodingName("UTF-8");
                        String timu = "<html><head></head><body>" + classManageItem.getQuestion().getDaA().toString() + "</body></html>";
                        webView.loadData(timu, "text/html; charset=UTF-8", null);


                        final Button btn = (Button)recycleHolder.findView(R.id.submit_btn);
                        final Button paizhao_btn = (Button) recycleHolder.findView(R.id.paizhao_btn);
                        if(!classManageItem.isDuiC())
                        {

                            btn.setText("错误");
                            btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                            paizhao_btn.setVisibility(View.VISIBLE);
                        }
                        else
                        {
                            btn.setText("正确");
                            btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                            paizhao_btn.setVisibility(View.GONE);
                        }


                        paizhao_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                if( mModel.getRtnChouTStatusList().getData().size()>0)
                                {
                                    for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                                    {
                                        if(classManageItem.getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                                        {
                                            homeworkScoreId = mModel.getRtnChouTStatusList().getData().get(j).getId().toString();
                                        }
                                    }
                                }
                                Bundle bundle = new Bundle();
                                bundle.putString("homeworkscoreid",homeworkScoreId);
                                startActivity(StuCuoTPaiZhaoActivity.class,bundle);
                            }
                        });
                        btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                if(classManageItem.isDuiC())  //如果是正确的，置为错误
                                {

                                    mModel.panJError(getResources().getString(R.string.stu_panjuan_set_false_trancode),classManageItem.getId(),classManageItem.getHomework().getBanJID(),stuId);
                                    btn.setText("错误");
                                    btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar1));
                                    paizhao_btn.setVisibility(View.VISIBLE);
                                    mDatas.get(i).setDuiC(false);
                                   // notifyItemChanged(i);
                                }
                                else
                                {

                                    if( mModel.getRtnChouTStatusList().getData().size()>0)
                                    {
                                        for (int j = 0; j < mModel.getRtnChouTStatusList().getData().size(); j++)
                                        {
                                            if(classManageItem.getId().equals(mModel.getRtnChouTStatusList().getData().get(j).getHomeworkQuestion().getId()))
                                            {
                                                homeworkScoreId = mModel.getRtnChouTStatusList().getData().get(j).getId().toString();
                                            }
                                        }
                                    }
                                    mModel.panJTrue(getResources().getString(R.string.stu_panjuan_set_true_trancode),homeworkScoreId);
                                    btn.setText("正确");
                                    btn.setBackground(getResources().getDrawable(R.drawable.side_nav_bar));
                                    paizhao_btn.setVisibility(View.GONE);
                                    mDatas.get(i).setDuiC(true);
                                   //notifyItemChanged(i);
                                }
                            }
                        });

                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }




        }

        if(var1.equals(getResources().getString(R.string.stu_getpanjuanlist_trancode))) //返回抽题结果
        {
            mDatas = mModel.getRtnChouTList().getData();

            mModel.getChouTStatus(getResources().getString(R.string.stu_getpanjuanlist_status_trancode),homeworkId,stuId,banJBH);


        }

        if(var1.equals(getResources().getString(R.string.stu_panjuan_set_false_trancode)))  //判错返回结果
        {
            homeworkScoreId = mModel.getRtnSetFalse().getId();


        }
    }

    //判为正确的时候传的id
    private String homeworkScoreId = "";
    @Override
    public void onRefresh()
    {

    }

    @Override
    public void onLoadMore()
    {

    }
}

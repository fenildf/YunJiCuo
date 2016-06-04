package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.graphics.Color;
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
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuCuoTiLieBiaoList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWoDeCuoTiBenModel;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.BuZhiZuoYeXiTInfoActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 错题列表界面
 */
public class StuCuoTiLieBiaoActivity extends CommonActivity implements XRecyclerView.LoadingListener, RecyclerAdapter.OnItemClickListener
{


    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.fence_tv)
    TextView fenceTv;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;
    private StuWoDeCuoTiBenModel mModel;

    private int page = 1;
    private int pageSize = 20;

    private String stuId = "";
    private String paperid = "";

    private String fencename = "";
    private String fence = "";
    private String kemu = "";
    private String nianji = "";
    private String banben = "";

    private List<RtnStuCuoTiLieBiaoList.DataEntity> mDatas;
    RecyclerAdapter<RtnStuCuoTiLieBiaoList.DataEntity> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_cuo_ti_lie_biao);
        ButterKnife.bind(this);
        init();
    }

    /**
     *
     */
    private void init()
    {
        mDatas = new ArrayList<>();
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        paperid = getIntent().getStringExtra("paperid");

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
        xListview.addItemDecoration(new DividerItemDecoration(this, 1));
        xListview.setLoadingListener(this);
        //xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(false);
        xListview.setLoadingMoreEnabled(false);

        if (mModel == null)
        {
            mModel = new StuWoDeCuoTiBenModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getStuCTLieBiaoList(getResources().getString(R.string.stu_wodecuotiben_cuotiliebiao_trancode), stuId, paperid, page++, pageSize);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.stu_wodecuotiben_cuotiliebiao_trancode)))
        {
            mDatas.addAll(mModel.getRtnStuCuoTiLieBiaoList().getData());
            if (page - 1==1)
            {
                adapter = new RecyclerAdapter<RtnStuCuoTiLieBiaoList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_stu_wodecuotiben_cuotilist_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, RtnStuCuoTiLieBiaoList.DataEntity classManageItem, int i)
                    {
                        recycleHolder.setText(R.id.yema_tv,"页码："+classManageItem.getQuestion().getPage());
                        recycleHolder.setText(R.id.tihao_tv,"题号："+classManageItem.getQuestion().getNum());

                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                adapter.setOnItemClickListener(this);
                xListview.refreshComplete();
            }
            else
            {
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getmCuoTTotalPages())
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
        mDatas.clear();
        page = 1;
        mModel.getStuCTLieBiaoList(getResources().getString(R.string.stu_wodecuotiben_cuotiliebiao_trancode), stuId, paperid, page++, pageSize);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getStuCTLieBiaoList(getResources().getString(R.string.stu_wodecuotiben_cuotiliebiao_trancode), stuId, paperid, page++, pageSize);
    }

    @Override
    public void onItemClick(View view, int i)
    {
        RtnStuCuoTiLieBiaoList.DataEntity info = mDatas.get(i - 1);
        Bundle bundle = new Bundle();
        bundle.putString("lianxiceid",info.getQuestion().getId());
        startActivity(StuCuoTiInfoActivity.class,bundle);

    }

    @Override
    public void OnItemLongClickListener(View view, int i)
    {

    }
}

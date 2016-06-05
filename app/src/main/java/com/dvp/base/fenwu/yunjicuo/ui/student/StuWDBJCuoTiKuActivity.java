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

import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiKuList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuWDBJCTKList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWDBJModel;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.AddBanjiActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 我的班级  错题库
 */
public class StuWDBJCuoTiKuActivity extends CommonActivity implements XRecyclerView.LoadingListener,RecyclerAdapter.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private String banJBH = "";

    private StuWDBJModel mModel;
    private String stuId = "";

    private List<RtnStuWDBJCTKList.DataEntity> mDatas;

    private RecyclerAdapter<RtnStuWDBJCTKList.DataEntity> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_wdbjcuo_ti_ku);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        banJBH = getIntent().getStringExtra("banjbh");
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

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener()
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
        });
        mDatas =  new ArrayList<>();

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

        if(mModel == null)
        {
            mModel = new StuWDBJModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getStuBanJCuoTK(getResources().getString(R.string.stu_wdbj_wdctk_trancode),banJBH,stuId);
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
        if(var1.equals(getResources().getString(R.string.stu_wdbj_wdctk_trancode)))
        {
            mDatas.addAll(mModel.getRtnStuWDBJCTKList().getData());

            adapter = new RecyclerAdapter<RtnStuWDBJCTKList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_cuotiku_layout)
            {
                @Override
                public void convert(RecyclerHolder recycleHolder, RtnStuWDBJCTKList.DataEntity classManageItem, int i)
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

    }

    @Override
    public void OnItemLongClickListener(View view, int i)
    {

    }
}

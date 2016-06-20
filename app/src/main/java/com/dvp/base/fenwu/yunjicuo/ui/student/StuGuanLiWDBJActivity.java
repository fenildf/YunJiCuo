package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuWDBJList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWDBJModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 学生我的班级界面 需要修改
 */
public class StuGuanLiWDBJActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    private StuWDBJModel mModel;

    private int page = 1;
    private int pageSize = 3;

    private String stuId = "";

    private List<RtnStuWDBJList.DataEntity> mDatas;
    RecyclerAdapter<RtnStuWDBJList.DataEntity> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_guan_li_wdbj);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        mDatas = new ArrayList<>();
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();

        if(mModel==null)
        {
            mModel = new StuWDBJModel(this);
        }
        mModel.addResponseListener(this);

        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("我的班级");
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
                    startActivity(SouSuoBanjActivity.class);
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


        mModel.getWDBJList(getResources().getString(R.string.stu_wdbj_list_trancode),stuId,pageSize,page++);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.youshangmenu, menu);//加载自定义的menu文件
        return true;
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.exit_banj_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(),"删除成功");
        }
        if(var1.equals(getResources().getString(R.string.stu_wdbj_list_trancode)))
        {

            if (page - 1==1)
            {
                mDatas = mModel.getRtnStuWDBJList().getData();
                adapter = new RecyclerAdapter<RtnStuWDBJList.DataEntity>(getApplicationContext(), mDatas, R.layout.item_stu_wdbj_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnStuWDBJList.DataEntity classManageItem, int i)
                    {

                        recycleHolder.setText(R.id.banji_tv,classManageItem.getBanJ().getName() + classManageItem.getBanJ().getKeM().getRcsValue());
                        recycleHolder.setText(R.id.chuangJR_tv,classManageItem.getUser().getName());
                        recycleHolder.setText(R.id.bh_tv,classManageItem.getBanJ().getId());
                        recycleHolder.setText(R.id.school_tv,classManageItem.getBanJ().getSchool().getName());
                        MDButton cuotiku_btn = (MDButton) recycleHolder.findView(R.id.cuotiku_btn);
                        cuotiku_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Bundle bundle = new Bundle();
                                bundle.putString("banjbh",classManageItem.getBanJ().getId());
                                startActivity(StuWDBJCuoTiKuActivity.class,bundle);
                            }
                        });
                        MDButton cuotitongji_btn = (MDButton) recycleHolder.findView(R.id.cuotitongji_btn);
                        cuotitongji_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Bundle bundle = new Bundle();
                                bundle.putString("bianhao",classManageItem.getBanJ().getId());
                                startActivity(StuWDBJCuoTTJActivity.class,bundle);
                            }
                        });
                        MDButton tuichubanji_btn = (MDButton) recycleHolder.findView(R.id.tuichubanji_btn);
                        tuichubanji_btn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                DialogUtil.getBasicDialog(StuGuanLiWDBJActivity.this, null, "退出班级", "确定退出班级么？", 0, new MaterialDialog.SingleButtonCallback()
                                {
                                    @Override
                                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
                                    {
                                        mModel.exitBJ(getResources().getString(R.string.exit_banj_trancode),classManageItem.getId().toString());
                                    }
                                }).show();
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
                mDatas.addAll(mModel.getRtnStuWDBJList().getData());
                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getmWDBJTotalpages())
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
        mModel.getWDBJList(getResources().getString(R.string.stu_wdbj_list_trancode),stuId,pageSize,page++);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getWDBJList(getResources().getString(R.string.stu_wdbj_list_trancode),stuId,pageSize,page++);
    }
}

package com.dvp.base.fenwu.yunjicuo.ui.teacher;

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
import android.widget.Toast;

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
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnGuanLLianXC;
import com.dvp.base.fenwu.yunjicuo.model.GuanLLianXCModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GuanLiLianXiCeActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;


    private int page = 1;
    private int pageSize = 3;

    private GuanLLianXCModel mModel;

    private List<RtnGuanLLianXC.DataEntity> mDatas;

    RecyclerAdapter<RtnGuanLLianXC.DataEntity> adapter;

    private String id;//班级编号
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_li_lian_xi_ce);
        ButterKnife.bind(this);
        init();
    }

    /**
     * 初始化
     */
    private void init()
    {

        id = getIntent().getStringExtra("id");
        mDatas = new ArrayList<>();
        if (mModel == null)
        {
            mModel = new GuanLLianXCModel(this);
        }
        mModel.addResponseListener(this);

        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("练习册管理");
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

                    Bundle bundle = new Bundle();
                    bundle.putString("id",id);
                    startActivity(AddBanJLianXiCeActivity.class,bundle);
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

        mModel.getGuanLiLianXCList(getResources().getString(R.string.getlianxice_Trancode), 3, page++, id);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.delete_lianxice_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(),"删除成功");
        }

        if(var1.equals(getResources().getString(R.string.getlianxice_Trancode)))
        {

            if (page - 1==1)
                {
                mDatas= mModel.getRtnGuanLLianXC().getData();
                adapter = new RecyclerAdapter<RtnGuanLLianXC.DataEntity>(getApplicationContext(), mDatas, R.layout.item_guanli_lianxice_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, final RtnGuanLLianXC.DataEntity classManageItem, int i)
                    {
                        recycleHolder.setText(R.id.lianxecename_tv,classManageItem.getPaper().getName());
                        String str1 = (classManageItem.getPaper().getFenCe()!=null)?classManageItem.getPaper().getFenCe().getName():"  ";
                        recycleHolder.setText(R.id.fence_tv,str1);
                        recycleHolder.setText(R.id.nianji_tv,classManageItem.getPaper().getNianJ().getName());
                        recycleHolder.setText(R.id.kemu_tv, classManageItem.getPaper().getKeM().getName());
                        String str2  = (classManageItem.getPaper().getBanBen()!=null)?classManageItem.getPaper().getBanBen().getName():"  ";
                        recycleHolder.setText(R.id.banben_tv, str2);

                        //删除
                        MDButton deleteBtn = (MDButton) recycleHolder.findView(R.id.delete_btn);
                        deleteBtn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                //Toast.makeText(GuanLiLianXiCeActivity.this, "点击删除", Toast.LENGTH_SHORT).show();

                                DialogUtil.getBasicDialog(GuanLiLianXiCeActivity.this, null, "删除练习册", "确定删除练习册么？", 0, new MaterialDialog.SingleButtonCallback()
                                {
                                    @Override
                                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
                                    {
                                        mModel.deleteLXC(getResources().getString(R.string.delete_lianxice_trancode),classManageItem.getId());
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
                mDatas.addAll(mModel.getRtnGuanLLianXC().getData());
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

    @Override
    public void onRefresh()
    {
        page = 1;
        mModel.getGuanLiLianXCList(getResources().getString(R.string.getlianxice_Trancode), 3, page++, id);
    }

    @Override
    public void onLoadMore()
    {
        mModel.getGuanLiLianXCList(getResources().getString(R.string.getlianxice_Trancode), 3, page++, id);
    }


    // 为了让ToolBar的menu起作用，这个方法不能删掉
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.addmenu, menu);//加载自定义的menu文件
        return true;
    }
}

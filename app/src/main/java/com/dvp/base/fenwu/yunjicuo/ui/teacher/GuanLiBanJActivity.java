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
import android.widget.Toast;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnBanList;
import com.dvp.base.fenwu.yunjicuo.model.GuanLBJModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class GuanLiBanJActivity extends CommonActivity implements XRecyclerView.LoadingListener
{

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;

    RecyclerAdapter<RtnBanList.DataEntity> adapter;
    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    //private List<ClassManageItem> mDatas = new ArrayList<>();


    private GuanLBJModel mModel;

    private List<RtnBanList.DataEntity> mDatas = new ArrayList<>();

    private int page = 1;
    private int pageSize = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_li_ban_j);
        ButterKnife.bind(this);
        initUi();
    }

    /**
     * 初始化界面
     */
    private void initUi()
    {
        if (mModel == null)
        {
            mModel = new GuanLBJModel(this);
        }
        mModel.addResponseListener(this);

        setSupportActionBar(toolbar);
        setTitle("");

        middleTitleTv.setText("管理班级");
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

        mModel.getClassList(getResources().getString(R.string.getBanjiListTranCode), 3, page++, "");

    }


    public class FunctionButtonListener implements View.OnClickListener
    {

        private View v;
        private String banJBianH;

        public FunctionButtonListener(View v,String banJBianH)
        {
            this.v = v;
            this.banJBianH = banJBianH;
        }

        @Override
        public void onClick(View v)
        {

            switch (v.getId())
            {
                case R.id.xsgl_btn:
                    CommonApp.getInstance().setBanJBH(banJBianH);
                    startActivity(GuanLXueShengActivity.class);
                    break;
                case R.id.lxcgl_btn:
                    Bundle bundle = new Bundle();
                    bundle.putString("id",this.banJBianH);
                    startActivity(GuanLiLianXiCeActivity.class,bundle);
                    break;
                case R.id.xg_btn:
                   // Toast.makeText(GuanLiBanJActivity.this, "修改点击", Toast.LENGTH_SHORT).show();
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("id",this.banJBianH);
                    startActivity(GuanLBJXiuGaiActivity.class,bundle1);
                    break;
                case R.id.delete_btn:
                    mModel.deleteClass(getResources().getString(R.string.delete_banji_trancode),banJBianH);
                    break;
            }
        }
    }
   /* @OnClick(R.id.toolbar)
    public void onClick()
    {

    }*/

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

        mDatas.clear();
        page = 1;
        mModel.getClassList(getResources().getString(R.string.getBanjiListTranCode), 3, page++, "");
    }

    @Override
    public void onLoadMore()
    {
        mModel.getClassList(getResources().getString(R.string.getBanjiListTranCode), 3, page++, "");
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.delete_banji_trancode))) //删除返回结果
        {
            Toast.makeText(GuanLiBanJActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
        }

        if (var1.equals(getResources().getString(R.string.getBanjiListTranCode)))
        {

            //mDatas = mModel.getRtnBanList().getData();
            mDatas.addAll(mModel.getRtnBanList().getData());
            if (page - 1==1)
            {
                adapter = new RecyclerAdapter<RtnBanList.DataEntity>(getApplicationContext(), mDatas, R.layout.fragment_list_item0_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, RtnBanList.DataEntity classManageItem, int i)
                    {
                        String str = (classManageItem.getBanJ().getKeM()!=null)?classManageItem.getBanJ().getKeM().getName():"  ";
                        recycleHolder.setText(R.id.banji_tv, classManageItem.getBanJ().getName() + "/" + str + "（学生数：" + classManageItem.getYiShengUserNum().toString() + ")");
                        recycleHolder.setText(R.id.chuangJR_tv, classManageItem.getUser().getName());
                        recycleHolder.setText(R.id.bh_tv, classManageItem.getBanJ().getId());
                        recycleHolder.setText(R.id.school_tv, classManageItem.getBanJ().getSchool().getName());

                        //学生管理
                        MDButton xsglBtn = (MDButton) recycleHolder.findView(R.id.xsgl_btn);
                        xsglBtn.setOnClickListener(new FunctionButtonListener(xsglBtn,classManageItem.getBanJ().getId()));

                        //练习册管理
                        MDButton lxcglBtn = (MDButton) recycleHolder.findView(R.id.lxcgl_btn);
                        lxcglBtn.setOnClickListener(new FunctionButtonListener(lxcglBtn,classManageItem.getBanJ().getId()));

                        //修改
                        MDButton xglBtn = (MDButton) recycleHolder.findView(R.id.xg_btn);
                        xglBtn.setOnClickListener(new FunctionButtonListener(xglBtn,classManageItem.getBanJ().getId()));

                        //删除
                        MDButton deleteBtn = (MDButton) recycleHolder.findView(R.id.delete_btn);
                        deleteBtn.setOnClickListener(new FunctionButtonListener(deleteBtn,classManageItem.getBanJ().getId()));
                    }
                };
                xListview.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                xListview.refreshComplete();
            }
            else
            {
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

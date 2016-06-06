package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.app.SearchManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.recyviewadapter.adapter.DividerItemDecoration;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.StuWDBJModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 搜索班级界面 并加入 等待审核通过
 */
public class SouSuoBanjActivity extends CommonActivity implements SearchView.OnQueryTextListener, XRecyclerView.LoadingListener
{

   /* @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;*/
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.x_listview)
    XRecyclerView xListview;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;

    private SearchView searchView;

    private StuWDBJModel mModel;
    RecyclerAdapter<String> adapter;
    private List<String> mDatas;

    private String stuId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sou_suo_banj);
        ButterKnife.bind(this);

        init();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
           finish();
        }
        return true;
    }

    /**
     *
     */
    private void init()
    {

        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        mDatas = new ArrayList<>();
        setSupportActionBar(toolbar);
        setTitle("加入班级");

       // middleTitleTv.setText("加入班级");
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

        if (mModel == null)
        {
            mModel = new StuWDBJModel(this);
        }
        mModel.addResponseListener(this);

        xListview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));//实现ListView
        xListview.setRefreshProgressStyle(ProgressStyle.BallBeat);//下拉刷新样式
        xListview.setLaodingMoreProgressStyle(ProgressStyle.BallRotate);//加载更多样式
        xListview.setArrowImageView(com.dvp.base.R.mipmap.iconfont_downgrey);//下拉的箭头
        // xListview.addItemDecoration(new SpacesItemDecoration(8));
        //listview.addItemDecoration(new DividerItemDecoration(getActivity(),0));
        xListview.addItemDecoration(new DividerItemDecoration(this, 1));
        xListview.setLoadingListener(this);
        xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(false);
        xListview.setLoadingMoreEnabled(false);
    }


    //这个方法必须复写,用来显示menu上的搜索框
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        initSearcheView(menu);
        return true;
    }



    private SearchView.SearchAutoComplete textView;

    public void initSearcheView(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();//先加载出menu文件
        inflater.inflate(R.menu.serarch_menu, menu);
        MenuItem menuSearchItem = menu.findItem(R.id.menu_search);//得到item
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menuSearchItem.getActionView();//这里的searcheView 相当于EditText，但是他没有EditTTxt的方法 下面赋值给EditTeXT
        //=================

        /*SearchView.SearchAutoComplete*/
        textView = (SearchView.SearchAutoComplete) searchView.findViewById(R.id.search_src_text);
        //textView.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//设置底部下划线
        textView.setHint("请输入班级编号···");
        textView.setBackgroundDrawable(getResources().getDrawable(R.drawable.edit_search_bg));//给EditText加个边框
        //修改ToolBar上SearView的搜索图标
        ImageView searchButton = (ImageView)searchView.findViewById(R.id.search_button);
        searchButton.setImageResource(R.mipmap.sousuo);
        //修改SearView的搜索图标
        ImageView searchGo = (ImageView)searchView.findViewById(R.id.search_go_btn);
        searchGo.setImageResource(R.mipmap.sousuo);


        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(true);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(true);
      /*  //这里为了不让显示  ···  就加了搜索两个字
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus)
            {
                if (hasFocus)
                {
                    middleTitleTv.setVisibility(View.GONE);
                } else
                {
                    middleTitleTv.setVisibility(View.VISIBLE);
                }
            }
        });

        toolbar.isTitleTruncated();*/
    }

    //返回按钮监听
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.stu_sousuobanji_trancode)))
        {
            mDatas.add("编号：" + mModel.getRtnSearchWDBJList().getId());
            mDatas.add("学校：" + mModel.getRtnSearchWDBJList().getSchool().getRcsValue());
            mDatas.add("科目：" + mModel.getRtnSearchWDBJList().getKeM().getRcsValue());
            mDatas.add("班级：" + mModel.getRtnSearchWDBJList().getName());
            mDatas.add("创建者：" + mModel.getRtnSearchWDBJList().getUser().getName());
            adapter = new RecyclerAdapter<String>(getApplicationContext(), mDatas, R.layout.item_add_lianxice_layout)
            {
                @Override
                public void convert(RecyclerHolder recyclerHolder, String s, int i)
                {
                    recyclerHolder.setText(R.id.lianxicename_tv, s.toString());
                }
            };
            xListview.setAdapter(adapter);

            mModel.getIsJiaRuProperty(getResources().getString(R.string.stu_getisjiarubanji_trancode), mModel.getRtnSearchWDBJList().getId(), stuId);
        }

        if (var1.equals(getResources().getString(R.string.stu_getisjiarubanji_trancode)))
        {
            if (mModel.getRtnIsJiaRuBanJ().getTotalCount() == 1)
            {
                if(mModel.getRtnIsJiaRuBanJ().getData().get(0).getValid() == 0)   //正在审核中
                {
                    submitBtn.setVisibility(View.VISIBLE);
                    submitBtn.setText("正在审核中......");
                    submitBtn.setClickable(false);
                    submitBtn.setEnabled(false);
                    submitBtn.setBackgroundColor(getResources().getColor(R.color.light_gray));
                }
                if(mModel.getRtnIsJiaRuBanJ().getData().get(0).getValid() == 1)   //您已加入该班级
                {
                    submitBtn.setVisibility(View.VISIBLE);
                    submitBtn.setText("您已加入");
                    submitBtn.setClickable(false);
                    submitBtn.setEnabled(false);
                    submitBtn.setBackgroundColor(getResources().getColor(R.color.light_gray));
                }

            }
            if (mModel.getRtnIsJiaRuBanJ().getTotalCount() == 0)   //未加入班级，可申请加入
            {

                submitBtn.setVisibility(View.VISIBLE);
                submitBtn.setText("申请加入");
                submitBtn.setClickable(true);
                submitBtn.setEnabled(true);
            }
        }

        if(var1.equals(getResources().getString(R.string.stu_shenqingjiaru_trancode)))  //发送加入申请返回结果
        {
            submitBtn.setVisibility(View.VISIBLE);
            submitBtn.setText("正在审核中");
            submitBtn.setClickable(false);
            submitBtn.setEnabled(false);
            submitBtn.setBackgroundColor(getResources().getColor(R.color.light_gray));
        }
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        mDatas.clear();
        mModel.searchBanJByBanJBH(getResources().getString(R.string.stu_sousuobanji_trancode), textView.getText().toString());
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {
        return false;
    }

    @Override
    public void onRefresh()
    {

    }

    @Override
    public void onLoadMore()
    {

    }

    @OnClick(R.id.submit_btn)
    public void onClick()
    {
        mModel.shenQJiaRuBanJ(getResources().getString(R.string.stu_shenqingjiaru_trancode),mModel.getRtnSearchWDBJList().getId());
    }
}

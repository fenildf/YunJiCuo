package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.GuanLXSWeiShenFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.GuanLXSYiShenFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.StudentMenuFragment;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.TeacherMenuFragment;
import com.flyco.tablayout.SegmentTabLayout;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 学生管理界面
 */
public class GuanLXueShengActivity extends CommonActivity
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.tl_1)
    SegmentTabLayout tl1;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.fl_content)
    FrameLayout flContent;


    private ArrayList<Fragment> mFragments3 = new ArrayList<>();//用户切换Fragment，不可滑动
    private String[] mTitles = {"老师", "学生"};//第一种样式tab的标题文字

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_lxue_sheng);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("学生管理");

        toolbar.setNavigationIcon(R.mipmap.back_btn);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        mFragments3.add(GuanLXSYiShenFragment.getInstance("GuanLXSYiShenFragment"));
        mFragments3.add(GuanLXSWeiShenFragment.getInstance("GuanLXSYiShenFragment"));
        tl1.setTabData(mTitles, this, R.id.fl_content, mFragments3);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
    }

}

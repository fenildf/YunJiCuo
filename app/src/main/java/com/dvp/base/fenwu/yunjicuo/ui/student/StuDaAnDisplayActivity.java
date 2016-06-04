package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.student.SerMap;
import com.dvp.base.fenwu.yunjicuo.ui.fragment.StuDaAnInfoFragment;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 答案详情动态展示界面
 */
public class StuDaAnDisplayActivity extends CommonActivity
{
    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.sliding_tl)
    SlidingTabLayout slidingTl;
    @Bind(R.id.vp)
    ViewPager vp;


    private Context mContext = this;

    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private String[] mTitles;


    private SerMap mMap;
    private String lianxiceName = "";
    private String yemaStr = "";

    private String lianxiceId = "";//练习册id
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_da_an_display);
        ButterKnife.bind(this);

        init();
    }

    private void init()
    {
        setSupportActionBar(toolbar);
        setTitle("");
        lianxiceId = getIntent().getStringExtra("lianxiceid");
        lianxiceName = getIntent().getStringExtra("lianxicename");
        yemaStr = getIntent().getStringExtra("yema");
        middleTitleTv.setText(yemaStr + "页答案");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        mMap = new SerMap();
        mMap = (SerMap) getIntent().getSerializableExtra("xitiidsmap");


        mTitles = new String[mMap.getmMap().size()];
        //遍历map
        Iterator iter = mMap.getmMap().entrySet().iterator();
        int i = 0;
        while (iter.hasNext())
        {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            mTitles[i] = val.toString();

            mFragments.add(StuDaAnInfoFragment.getInstance(lianxiceId,key.toString(),yemaStr));
            i++;
        }
       /* for (String title : mTitles) {
            mFragments.add(StuDaAnInfoFragment.getInstance(title));
        }*/
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);
        slidingTl.setViewPager(vp);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
    }

    private class MyPagerAdapter extends FragmentPagerAdapter
    {
        public MyPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public int getCount()
        {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position)
        {
            return mFragments.get(position);
        }
    }
}

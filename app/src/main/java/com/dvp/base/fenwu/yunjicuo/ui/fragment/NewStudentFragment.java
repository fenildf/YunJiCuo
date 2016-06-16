package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonFragment;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuDaAnChaXunActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuGuanLiWDBJActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWDZYListActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWoDCTBActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.WoDShuJActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewStudentFragment extends CommonFragment
{


    @Bind(R.id.imageview1)
    ImageView imageview1;
    @Bind(R.id.textView4)
    TextView textView4;
    @Bind(R.id.textView3)
    TextView textView3;
    @Bind(R.id.menu_cardview1)
    CardView menuCardview1;
    @Bind(R.id.imageview2)
    ImageView imageview2;
    @Bind(R.id.glbj_tv)
    TextView glbjTv;
    @Bind(R.id.menu_cardview2)
    CardView menuCardview2;
    @Bind(R.id.imageview6)
    ImageView imageview6;
    @Bind(R.id.dacx_tv)
    TextView dacxTv;
    @Bind(R.id.menu_cardview3)
    CardView menuCardview3;
    @Bind(R.id.imageview5)
    ImageView imageview5;
    @Bind(R.id.wdctb_tv)
    TextView wdctbTv;
    @Bind(R.id.menu_cardview4)
    CardView menuCardview4;
    @Bind(R.id.imageview4)
    ImageView imageview4;
    @Bind(R.id.bzzy_tv)
    TextView bzzyTv;
    @Bind(R.id.menu_cardview5)
    CardView menuCardview5;

    public NewStudentFragment()
    {
        // Required empty public constructor
    }

    private String mTitle = "";
    public static NewStudentFragment getInstance(String title)
    {
        NewStudentFragment sf = new NewStudentFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_student, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.menu_cardview1, R.id.menu_cardview2, R.id.menu_cardview3, R.id.menu_cardview4, R.id.menu_cardview5})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.menu_cardview1:
                startActivity(WoDShuJActivity.class);
                break;
            case R.id.menu_cardview2:
                startActivity(StuGuanLiWDBJActivity.class);
                break;
            case R.id.menu_cardview3:
                startActivity(StuWoDCTBActivity.class);
                break;
            case R.id.menu_cardview4:
                startActivity(StuWDZYListActivity.class);
                break;
            case R.id.menu_cardview5:
                startActivity(StuDaAnChaXunActivity.class);
                break;
        }
    }
}

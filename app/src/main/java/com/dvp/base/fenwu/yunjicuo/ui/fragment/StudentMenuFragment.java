package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuDaAnChaXunActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuGuanLiWDBJActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWDZYListActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWoDCTBActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.WoDShuJActivity;
import com.dvp.base.fragment.BaseFragment;
import com.facebook.drawee.backends.pipeline.Fresco;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentMenuFragment extends BaseFragment
{


    @Bind(R.id.imageButton1)
    ImageButton imageButton1;
    @Bind(R.id.menu_cardview1)
    CardView menuCardview1;
    @Bind(R.id.imageButton2)
    ImageButton imageButton2;
    @Bind(R.id.menu_cardview2)
    CardView menuCardview2;
    @Bind(R.id.imageButton3)
    ImageButton imageButton3;
    @Bind(R.id.menu_cardview3)
    CardView menuCardview3;
    @Bind(R.id.imageButton4)
    ImageButton imageButton4;
    @Bind(R.id.menu_cardview4)
    CardView menuCardview4;
    @Bind(R.id.imageButton5)
    ImageButton imageButton5;
    @Bind(R.id.menu_cardview5)
    CardView menuCardview5;
    private String mTitle = "";

    public StudentMenuFragment()
    {
        // Required empty public constructor
    }

    public static StudentMenuFragment getInstance(String title)
    {
        StudentMenuFragment sf = new StudentMenuFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getActivity());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_menu, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.imageButton1, R.id.menu_cardview1, R.id.imageButton2, R.id.menu_cardview2, R.id.imageButton3, R.id.menu_cardview3, R.id.imageButton4, R.id.menu_cardview4, R.id.imageButton5, R.id.menu_cardview5})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.imageButton1:
                break;
            case R.id.menu_cardview1:
                startActivity(WoDShuJActivity.class);
                break;
            case R.id.imageButton2:
                break;
            case R.id.menu_cardview2:
                startActivity(StuGuanLiWDBJActivity.class);
                break;
            case R.id.imageButton3:
                break;
            case R.id.menu_cardview3:
                startActivity(StuWoDCTBActivity.class);
                break;
            case R.id.imageButton4:
                break;
            case R.id.menu_cardview4:
                startActivity(StuWDZYListActivity.class);
                break;
            case R.id.imageButton5:
                break;
            case R.id.menu_cardview5:
                startActivity(StuDaAnChaXunActivity.class);
                break;
        }
    }
}

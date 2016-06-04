package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.BanJCuoTiBenActivity;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.BuZhiZuoYeActivity;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.GuanLiBanJActivity;
import com.dvp.base.fragment.BaseFragment;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherMenuFragment extends BaseFragment
{


    @Bind(R.id.imageButton1)
    ImageButton imageButton1;
    @Bind(R.id.menu_cardview1)
    CardView menuCardview1;
   /* @Bind(R.id.imageview2)
    SimpleDraweeView imageview2;*/
   /* @Bind(R.id.glbj_tv2)
    TextView glbjTv2;
    @Bind(R.id.child_tv2)
    TextView childTv2;
    @Bind(R.id.imageButton2)
    ImageButton imageButton2;
    @Bind(R.id.menu_cardview2)
    CardView menuCardview2;*/
    @Bind(R.id.imageview3)
    SimpleDraweeView imageview3;
    @Bind(R.id.glbj_tv3)
    TextView glbjTv3;
    @Bind(R.id.child_tv3)
    TextView childTv3;
    @Bind(R.id.imageButton3)
    ImageButton imageButton3;
    @Bind(R.id.menu_cardview3)
    CardView menuCardview3;
    @Bind(R.id.imageview4)
    SimpleDraweeView imageview4;
    @Bind(R.id.glbj_tv4)
    TextView glbjTv4;
    @Bind(R.id.child_tv4)
    TextView childTv4;
    @Bind(R.id.imageButton4)
    ImageButton imageButton4;
    @Bind(R.id.menu_cardview4)
    CardView menuCardview4;

    private String mTitle = "";
    public TeacherMenuFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Fresco.initialize(getActivity());
    }

    public static TeacherMenuFragment getInstance(String title)
    {
        TeacherMenuFragment sf = new TeacherMenuFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teacher_menu, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.imageButton1, R.id.menu_cardview1, /*R.id.imageButton2, R.id.menu_cardview2, */R.id.imageButton3, R.id.menu_cardview3, R.id.imageButton4, R.id.menu_cardview4})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.imageButton1:
                break;
            case R.id.menu_cardview1://管理班级
                startActivity(GuanLiBanJActivity.class);
                break;
          /*  case R.id.imageButton2:
                break;
            case R.id.menu_cardview2:

                break;*/
            case R.id.imageButton3:
                break;
            case R.id.menu_cardview3:
                startActivity(BanJCuoTiBenActivity.class);
                break;
            case R.id.imageButton4:
                break;
            case R.id.menu_cardview4:
                startActivity(BuZhiZuoYeActivity.class);
                break;
        }
    }
}

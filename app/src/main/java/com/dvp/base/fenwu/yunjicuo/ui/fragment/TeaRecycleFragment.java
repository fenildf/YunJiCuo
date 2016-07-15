package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonFragment;
import com.dvp.base.fenwu.yunjicuo.domain.FunctionEntity;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.BanJCuoTiBenActivity;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.BuZhiZuoYeActivity;
import com.dvp.base.fenwu.yunjicuo.ui.teacher.GuanLiBanJActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeaRecycleFragment extends CommonFragment
{


    @Bind(R.id.rv_grid_view)
    RecyclerView rvGridView;

    RecyclerAdapter<FunctionEntity> adapter;
    private List<FunctionEntity> mListDatas;

    public TeaRecycleFragment()
    {
        // Required empty public constructor
    }
    private String mTitle = "";
    public static TeaRecycleFragment getInstance(String title)
    {
        TeaRecycleFragment sf = new TeaRecycleFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tea_recycle, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init()
    {

        mListDatas = new ArrayList<>();
        getDatas();
        adapter = new RecyclerAdapter<FunctionEntity>(getActivity(), mListDatas, R.layout.item_home_fragment_layout)
        {
            @Override
            public void convert(RecyclerHolder recycleHolder, FunctionEntity functionEntity, int i)
            {
                recycleHolder.setImageResource(R.id.imageview1, functionEntity.getFunctionIconStr());
                recycleHolder.setText(R.id.textView3, functionEntity.getFunctionStr());
                recycleHolder.setText(R.id.textView4,functionEntity.getFunctionContent());
            }

        };
        rvGridView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        adapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(View view, int i)
            {
                switch (i)
                {
                    case 0:
                        startActivity(GuanLiBanJActivity.class);
                        break;
                    case 1:
                        startActivity(BanJCuoTiBenActivity.class);
                        break;
                    case 2:
                        startActivity(BuZhiZuoYeActivity.class);
                        break;
                }
            }

            @Override
            public void OnItemLongClickListener(View view, int i)
            {

            }
        });
    }

    /**
     * 获取数据
     */
    private void getDatas()
    {
        FunctionEntity functionEntity = new FunctionEntity();
        functionEntity.setFunctionContent("学生和练习册的相关管理");
        functionEntity.setFunctionIconStr(R.mipmap.glbj);
        functionEntity.setFunctionStr("管理班级");
        mListDatas.add(functionEntity);

        FunctionEntity functionEntity1 = new FunctionEntity();
        functionEntity1.setFunctionContent("班级错题本，错题库及错题统计");
        functionEntity1.setFunctionIconStr(R.mipmap.bjctb);
        functionEntity1.setFunctionStr("班级错题本");
        mListDatas.add(functionEntity1);

        FunctionEntity functionEntity2 = new FunctionEntity();
        functionEntity2.setFunctionContent("布置相关作业");
        functionEntity2.setFunctionIconStr(R.mipmap.bzzy);
        functionEntity2.setFunctionStr("布置作业");
        mListDatas.add(functionEntity2);

    }
    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }
}

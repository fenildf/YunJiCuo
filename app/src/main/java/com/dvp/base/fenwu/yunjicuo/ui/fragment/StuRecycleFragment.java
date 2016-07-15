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
import com.dvp.base.fenwu.yunjicuo.ui.student.StuDaAnChaXunActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuGuanLiWDBJActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWDZYListActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.StuWoDCTBActivity;
import com.dvp.base.fenwu.yunjicuo.ui.student.WoDShuJActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class StuRecycleFragment extends CommonFragment
{


    @Bind(R.id.rv_grid_view)
    RecyclerView rvGridView;

    RecyclerAdapter<FunctionEntity> adapter;
    private List<FunctionEntity> mListDatas;


    public StuRecycleFragment()
    {
        // Required empty public constructor
    }

    private String mTitle = "";
    public static StuRecycleFragment getInstance(String title)
    {
        StuRecycleFragment sf = new StuRecycleFragment();
        sf.mTitle = title;
        return sf;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stu_recycle, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    /**
     * 初始化
     */
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
                        startActivity(WoDShuJActivity.class);
                        break;
                    case 1:
                        startActivity(StuGuanLiWDBJActivity.class);
                        break;
                    case 2:
                        startActivity(StuWoDCTBActivity.class);
                        break;
                    case 3:
                        startActivity(StuWDZYListActivity.class);
                        break;
                    case 4:
                        startActivity(StuDaAnChaXunActivity.class);
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
        functionEntity.setFunctionContent("学生书架，丰富阅读");
        functionEntity.setFunctionIconStr(R.mipmap.sj);
        functionEntity.setFunctionStr("我的书架");
        mListDatas.add(functionEntity);

        FunctionEntity functionEntity1 = new FunctionEntity();
        functionEntity1.setFunctionContent("所在的班级列表");
        functionEntity1.setFunctionIconStr(R.mipmap.bj);
        functionEntity1.setFunctionStr("我的班级");
        mListDatas.add(functionEntity1);

        FunctionEntity functionEntity2 = new FunctionEntity();
        functionEntity2.setFunctionContent("拥有的错题本");
        functionEntity2.setFunctionIconStr(R.mipmap.ctb);
        functionEntity2.setFunctionStr("我的错题本");
        mListDatas.add(functionEntity2);

        FunctionEntity functionEntity3 = new FunctionEntity();
        functionEntity3.setFunctionContent("需要完成的作业");
        functionEntity3.setFunctionIconStr(R.mipmap.zy);
        functionEntity3.setFunctionStr("我的作业");
        mListDatas.add(functionEntity3);

        FunctionEntity functionEntity4 = new FunctionEntity();
        functionEntity4.setFunctionContent("查询正确答案");
        functionEntity4.setFunctionIconStr(R.mipmap.dacx);
        functionEntity4.setFunctionStr("答案查询");
        mListDatas.add(functionEntity4);

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

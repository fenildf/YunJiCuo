package com.dvp.base.fenwu.yunjicuo.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.adapter.recyviewadapter.adapter.DividerItemDecoration;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerAdapter;
import com.dvp.base.adapter.recyviewadapter.adapter.RecyclerHolder;
import com.dvp.base.adapter.recyviewadapter.view.ProgressStyle;
import com.dvp.base.adapter.recyviewadapter.view.XRecyclerView;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.CommonFragment;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlixuesheng.RtnStudentList;
import com.dvp.base.fenwu.yunjicuo.model.GuanLBJModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 学生已审fragment
 */
public class GuanLXSYiShenFragment extends CommonFragment implements XRecyclerView.LoadingListener,RecyclerAdapter.OnItemClickListener
{


    @Bind(R.id.x_listview)
    XRecyclerView xListview;


    private GuanLBJModel mModel;
    private int page = 1;
    private int pageSize = 20;

    private String mTitle = "";

    RecyclerAdapter<RtnStudentList.DataEntity> adapter;

    private List<RtnStudentList.DataEntity> mDatas;
    public GuanLXSYiShenFragment()
    {
        // Required empty public constructor
    }
    public static GuanLXSYiShenFragment getInstance(String title)
    {
        GuanLXSYiShenFragment sf = new GuanLXSYiShenFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guan_lxsyi_shen, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    /**
     * 初始化
     */
    private void init()
    {
        mDatas = new ArrayList<>();

        xListview.setLayoutManager(new LinearLayoutManager(getActivity()));//实现ListView
        xListview.setRefreshProgressStyle(ProgressStyle.BallBeat);//下拉刷新样式
        xListview.setLaodingMoreProgressStyle(ProgressStyle.BallRotate);//加载更多样式
        xListview.setArrowImageView(com.dvp.base.R.mipmap.iconfont_downgrey);//下拉的箭头
        // xListview.addItemDecoration(new SpacesItemDecoration(8));
        //listview.addItemDecoration(new DividerItemDecoration(getActivity(),0));
        xListview.addItemDecoration(new DividerItemDecoration(getActivity(), 1));
        xListview.setLoadingListener(this);
        //xListview.setItemAnimator(new DefaultItemAnimator());
        xListview.setPullRefreshEnabled(true);
        xListview.setLoadingMoreEnabled(true);

        if (mModel == null)
        {
            mModel = new GuanLBJModel(getActivity());
        }
        mModel.addResponseListener(this);
        mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getActivity().getResources().getString(R.string.delete_stu_trancode)))
        {
            mDatas.clear();
            page = 1;

            mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

        }

        if (var1.equals(getActivity().getResources().getString(R.string.setadmin_trancode)))
        {

            mDatas.clear();
            page = 1;

            mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

        }

        if(var1.equals(getActivity().getResources().getString(R.string.canceladmin_trancode)))
        {
            mDatas.clear();
            page = 1;

            mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

        }
        if (var1.equals(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode)))
        {

            if (page - 1==1)
            {
                mDatas = mModel.getRtnStudentList1().getData();
                adapter = new RecyclerAdapter<RtnStudentList.DataEntity>(getActivity(), mDatas, R.layout.item_xueshengguanli_layout)
                {
                    @Override
                    public void convert(RecyclerHolder recycleHolder, RtnStudentList.DataEntity classManageItem, int i)
                    {
                        recycleHolder.setText(R.id.name_tv,classManageItem.getUser().getName());
                        recycleHolder.setText(R.id.tel_tv,classManageItem.getUser().getMobile());
                        if(classManageItem.getType()==1)
                        {
                            recycleHolder.setImageResource(R.id.admin_imageview,R.mipmap.noadmin);
                        }
                        if(classManageItem.getType()==2)
                        {
                            recycleHolder.setImageResource(R.id.admin_imageview,R.mipmap.admin);
                        }
                    }
                };
                xListview.setAdapter(adapter);
                adapter.setOnItemClickListener(this);//设置点击事件
                adapter.notifyDataSetChanged();
               xListview.refreshComplete();
            }
            else
            {
                mDatas.addAll(mModel.getRtnStudentList1().getData());

                xListview.loadMoreComplete();
                adapter.notifyDataSetChanged();
            }

            if(page>mModel.getmXueShTotalPages1())
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
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onRefresh()
    {
        page = 1;

        mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

    }

    @Override
    public void onLoadMore()
    {
        mModel.getYiShenXueSList(getActivity().getResources().getString(R.string.xueshengguanli_yishen_trancode), CommonApp.getInstance().getBanJBH(),pageSize,page++);

    }


    /**
     * 列表单击事件
     * @param view
     * @param i
     */
    @Override
    public void onItemClick(final View view, int i)
    {
        final RtnStudentList.DataEntity info = mDatas.get(i-1);

        List<String> mList = new ArrayList<>();
        if(info.getType()==1)
        {

            mList.add("设置管理员");
            mList.add("删除");
        }
        else if(info.getType()==2)
        {
            mList.add("取消管理员");
            mList.add("删除");
        }

        DialogUtil.getListDialog(getActivity(), info.getUser().getName(), 0, mList, new MaterialDialog.ListCallback()
        {
            @Override
            public void onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text)
            {
                if(which == 0)
                {
                   /* ImageView imageView = (ImageView)view.findViewById(R.id.admin_imageview);
                    imageView.setImageResource(R.mipmap.admin);*/
                    if(text.equals("设置管理员"))
                    {
                        mModel.setAdmin(getActivity().getResources().getString(R.string.setadmin_trancode),info.getId());
                    }
                    if(text.equals("取消管理员"))
                    {
                        mModel.cancelAdmin(getActivity().getResources().getString(R.string.canceladmin_trancode),info.getId());
                    }


                    //DialogUtil.showToast(getActivity(),"点击了设置管理员");
                }
                if (which == 1)
                {
                    DialogUtil.getBasicDialog(getActivity(), null, "删除", "确定删除" + info.getUser().getName() + "该学生么？", 0, new MaterialDialog.SingleButtonCallback()
                    {
                        @Override
                        public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
                        {
                            mModel.deleteStudent(getActivity().getResources().getString(R.string.delete_stu_trancode),info.getId());
                        }
                    }).show();
                }
            }
        }).show();

    }

    /**
     * 列表长按事件
     * @param view
     * @param i
     */
    @Override
    public void OnItemLongClickListener(View view, int i)
    {

    }
}

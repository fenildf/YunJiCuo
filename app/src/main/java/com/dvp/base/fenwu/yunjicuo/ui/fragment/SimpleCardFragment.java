package com.dvp.base.fenwu.yunjicuo.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dvp.base.adapter.listviewadapter.BaseAdapterHelper;
import com.dvp.base.adapter.listviewadapter.QuickAdapter;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.domain.ClassManageItem;
import com.dvp.base.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


@SuppressLint("ValidFragment")
public class SimpleCardFragment extends BaseFragment
{
    @Bind(R.id.x_listview)
    ListView xListview;
    private String mTitle;

    private View fragmentView;

    QuickAdapter adapter;

    private List<ClassManageItem> mDatas = new ArrayList<ClassManageItem>();
    public static SimpleCardFragment getInstance(String title)
    {
        SimpleCardFragment sf = new SimpleCardFragment();
        sf.mTitle = title;
        return sf;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        fragmentView = inflater.inflate(R.layout.simplecardfragment, null);
        ButterKnife.bind(this, fragmentView);
        initUi();
        return fragmentView;
    }

    /**
     * 初始化界面
     */
    private void initUi()
    {

        getData();

        adapter = new QuickAdapter<ClassManageItem>(getActivity(),R.layout.fragment_list_item0_layout,mDatas)
        {
            @Override
            protected void convert(BaseAdapterHelper baseAdapterHelper, ClassManageItem o)
            {
                baseAdapterHelper.setText(R.id.banji_tv,o.getBanJMCh());
                baseAdapterHelper.setText(R.id.chuangJR_tv,o.getChuangJR());
                baseAdapterHelper.setText(R.id.bh_tv,o.getBianH());
                baseAdapterHelper.setText(R.id.school_tv,o.getXueX());
            }
        };
        xListview.setAdapter(adapter);
    }

    private void getData()
    {

        ClassManageItem info = new ClassManageItem();
        info.setBanJMCh("实验班/物理(学生数：20)");
        info.setChuangJR("王哈哈");
        info.setBianH("00000315");
        info.setXueX("山西省实验中学");
        mDatas.add(info);


        ClassManageItem info1 = new ClassManageItem();
        info1.setBanJMCh("实验班/物理(学生数：20)");
        info1.setChuangJR("王哈哈");
        info1.setBianH("00000315");
        info1.setXueX("山西省实验中学");
        mDatas.add(info1);


        ClassManageItem info2 = new ClassManageItem();
        info2.setBanJMCh("实验班/物理(学生数：20)");
        info2.setChuangJR("王哈哈");
        info2.setBianH("00000315");
        info2.setXueX("山西省实验中学");
        mDatas.add(info2);


        ClassManageItem info3 = new ClassManageItem();
        info3.setBanJMCh("实验班/物理(学生数：20)");
        info3.setChuangJR("王哈哈");
        info3.setBianH("00000315");
        info3.setXueX("山西省实验中学");
        mDatas.add(info3);


        ClassManageItem info4 = new ClassManageItem();
        info4.setBanJMCh("实验班/物理(学生数：20)");
        info4.setChuangJR("王哈哈");
        info4.setBianH("00000315");
        info4.setXueX("山西省实验中学");
        mDatas.add(info4);


        ClassManageItem info5 = new ClassManageItem();
        info5.setBanJMCh("实验班/物理(学生数：20)");
        info5.setChuangJR("王哈哈");
        info5.setBianH("00000315");
        info5.setXueX("山西省实验中学");
        mDatas.add(info5);


        ClassManageItem info6 = new ClassManageItem();
        info6.setBanJMCh("实验班/物理(学生数：20)");
        info6.setChuangJR("王哈哈");
        info6.setBianH("00000315");
        info6.setXueX("山西省实验中学");
        mDatas.add(info6);
    }
    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
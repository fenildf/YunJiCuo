package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.dvp.base.adapter.listviewadapter.BaseAdapterHelper;
import com.dvp.base.adapter.listviewadapter.QuickAdapter;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnBuZXiTList;
import com.dvp.base.fenwu.yunjicuo.model.BuZhiZuoYeModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 习题详情界面
 */
public class XiTiXiangQingActivity extends CommonActivity implements AdapterView.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.listview)
    ListView listview;


    private BuZhiZuoYeModel mModel;
    private String homeworkId = "";

    private List<RtnBuZXiTList.DataEntity> mLianXList;
    QuickAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xi_ti_xiang_qing);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        mLianXList = new ArrayList<>();
        homeworkId = getIntent().getStringExtra("homeworkid");
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("习题列表");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        if(mModel == null)
        {
            mModel = new BuZhiZuoYeModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getXiTiList(getResources().getString(R.string.xitixiangqing_list_trancode),homeworkId);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.xitixiangqing_list_trancode)))
        {
            mLianXList = mModel.getRtnBuZXiTList().getData() ;
            adapter = new QuickAdapter<RtnBuZXiTList.DataEntity>(getApplicationContext(),R.layout.item_xitixiangqing_layout,mLianXList)
            {
                @Override
                protected void convert(BaseAdapterHelper baseAdapterHelper, RtnBuZXiTList.DataEntity o)
                {
                    baseAdapterHelper.setText(R.id.title_tv,o.getQuestion().getPaper().getRcsValue());
                    baseAdapterHelper.setText(R.id.yema_tv,"页码："+o.getQuestion().getPage());
                    baseAdapterHelper.setText(R.id.tihao_tv,"题号："+o.getQuestion().getNum()+"");
                }
            };
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(this);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        RtnBuZXiTList.DataEntity info = (RtnBuZXiTList.DataEntity)adapter.getItem(position);
        Bundle bundle = new Bundle();
        bundle.putString("lianxiceid",info.getQuestion().getId());
        startActivity(BuZhiZuoYeXiTInfoActivity.class,bundle);
    }
}

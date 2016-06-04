package com.dvp.base.fenwu.yunjicuo.ui.teacher;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.listviewadapter.BaseAdapterHelper;
import com.dvp.base.adapter.listviewadapter.QuickAdapter;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnLianXiCeList;
import com.dvp.base.fenwu.yunjicuo.model.GuanLLianXCModel;
import com.dvp.base.view.Marquee;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddBanJLianXiCeActivity extends CommonActivity implements AdapterView.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;
    private GuanLLianXCModel mModel;
    private String id = "";

    private List<RtnLianXiCeList.MLianXListEntity> mLianXList;
    QuickAdapter adapter;

    private String selectLianXCName = "";
    private String selectLianXCId = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ban_jlian_xi_ce);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("新增练习册");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        mLianXList = new ArrayList<>();
        id = getIntent().getStringExtra("id");
        if (mModel == null)
        {
            mModel = new GuanLLianXCModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getLianxiceList(getResources().getString(R.string.get_banji_lianxice_list_trancode), id);
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if (var1.equals(getResources().getString(R.string.get_banji_lianxice_list_trancode)))
        {
            mLianXList = mModel.getRtnJuTiLianXiCeList().getMLianXList();
            adapter = new QuickAdapter<RtnLianXiCeList.MLianXListEntity>(getApplicationContext(),R.layout.item_add_lianxice_layout,mLianXList)
            {
                @Override
                protected void convert(BaseAdapterHelper baseAdapterHelper, RtnLianXiCeList.MLianXListEntity o)
                {
                   Marquee marquee =  baseAdapterHelper.getView(R.id.lianxicename_tv);
                    marquee.setText(o.getRcsValue());

                }
            };
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(this);

        }
        if(var1.equals(getResources().getString(R.string.submit_add_lianxice_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(),"保存成功");
            finish();
        }
    }

    @OnClick(R.id.submit_btn)
    public void onClick()
    {
        mModel.submitAddLianXC(getResources().getString(R.string.submit_add_lianxice_trancode),id,selectLianXCId);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        RtnLianXiCeList.MLianXListEntity info =   (RtnLianXiCeList.MLianXListEntity)adapter.getItem(position);
        selectLianXCName = info.getRcsValue();
        selectLianXCId = info.getId();
    }
}

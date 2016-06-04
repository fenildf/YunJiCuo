package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.adapter.listviewadapter.BaseAdapterHelper;
import com.dvp.base.adapter.listviewadapter.QuickAdapter;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnLianXiCeList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSJList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.dvp.base.fenwu.yunjicuo.model.MyShuJiaModel;
import com.dvp.base.view.Marquee;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 新增我的书架
 */
public class AddWDSJActivity extends CommonActivity implements AdapterView.OnItemClickListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.submit_btn)
    MDButton submitBtn;

    private MyShuJiaModel mModel;

    QuickAdapter adapter;
    private List<RtnSJList.DataEntity> mLianXList;
    private String stuId = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_wdsj);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        stuId = getAPP().getAppConfig().getConfig(User.class).getStaffId();
        mLianXList = new ArrayList<>();
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
        if(mModel == null)
        {
            mModel = new MyShuJiaModel(this);
        }
        mModel.addResponseListener(this);
        mModel.getWDLXCList(getResources().getString(R.string.add_wodeshujia_trancode));
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {
        if(var1.equals(getResources().getString(R.string.add_wodeshujia_trancode)))
        {
            mLianXList = mModel.getRtnSJList().getData();
            adapter = new QuickAdapter<RtnSJList.DataEntity>(getApplicationContext(),R.layout.item_add_lianxice_layout,mLianXList)
            {
                @Override
                protected void convert(BaseAdapterHelper baseAdapterHelper, RtnSJList.DataEntity o)
                {
                    Marquee marquee =  baseAdapterHelper.getView(R.id.lianxicename_tv);
                    marquee.setText(o.getRcsValue());

                }
            };
            listview.setAdapter(adapter);
            listview.setOnItemClickListener(this);
        }
        if(var1.equals(getResources().getString(R.string.submit_add_wode_lianxice_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(),"保存成功");
            finish();
        }
    }

    @OnClick(R.id.submit_btn)
    public void onClick()
    {
        mModel.submitAddLXC(getResources().getString(R.string.submit_add_wode_lianxice_trancode),stuId,selectLianXCId);
    }

    private String selectLianXCName = "";
    private String selectLianXCId = "";
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        RtnSJList.DataEntity info = (RtnSJList.DataEntity) adapter.getItem(position);
        selectLianXCName = info.getRcsValue();
        selectLianXCId = info.getId();
    }
}

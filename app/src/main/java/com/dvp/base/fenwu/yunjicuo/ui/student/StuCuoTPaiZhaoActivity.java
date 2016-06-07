package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.adapter.ImagePublishAdapter;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity.MultiImageSelectorActivity;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity.MultiImageZoomActivity;
import com.dvp.base.view.NestedGridView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 错题拍照界面
 */
public class StuCuoTPaiZhaoActivity extends CommonActivity
{

    private static final String TAG = "StuCuoTPaiZhaoActivity";
    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.gridview)
    NestedGridView gridview;


    private ImagePublishAdapter mAdapter;
    public static ArrayList<String> mDataList = new ArrayList<>();
    private ArrayList<String> mpicPathList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_cuo_tpai_zhao);
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
        middleTitleTv.setText("拍摄错题照片");

        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        initData(mDataList);//多选图片

    }

    private void initData(final ArrayList<String> mDataList)
    {
        mAdapter = new ImagePublishAdapter(StuCuoTPaiZhaoActivity.this, mDataList);
        gridview.setAdapter(mAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                if (position == getDataSize())
                {
                    Intent intent = new Intent(StuCuoTPaiZhaoActivity.this,
                            MultiImageSelectorActivity.class);
                    // 是否显示拍摄图片
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SHOW_CAMERA, CommonApp.SHOW_CAMERA);
                    // 最大可选择图片数量
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SELECT_COUNT, CommonApp.MAXNUM);
                    // 选择模式
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SELECT_MODE, CommonApp.SELECTEDMODE);
                    intent.putStringArrayListExtra("image_list", mDataList);
                    //类型
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_TYPE, TAG);
                    startActivityForResult(intent, 0x123);
                } else
                {
                    Intent intent = new Intent(StuCuoTPaiZhaoActivity.this,
                            MultiImageZoomActivity.class);
                    intent.putStringArrayListExtra("image_list", mDataList);
                    Log.e("集合", mDataList.get(0));
                    intent.putExtra(CommonApp.EXTRA_CURRENT_IMG_POSITION, position);
                    //类型
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_TYPE, TAG);
                    startActivity(intent);
                }
            }
        });
    }
    private int getDataSize()
    {
        return mDataList == null ? 0 : mDataList.size();
    }
    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("onActivityResult","onActivityResult");

        if (requestCode==0x123 && resultCode == 0)
        {
            mDataList = data.getStringArrayListExtra("image_list");
            getDataSize();
            initData(mDataList);
        }
    }
}

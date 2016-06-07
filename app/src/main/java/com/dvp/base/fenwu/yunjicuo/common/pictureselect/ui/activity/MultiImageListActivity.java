package com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.adapter.ImagePublishAdapter;
import com.dvp.base.fenwu.yunjicuo.ui.MainActivity;

import java.io.Serializable;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MultiImageListActivity extends CommonActivity
{

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    public static final String PATH_NAME = "myPath";

    private GridView mGridView;
    private ImagePublishAdapter mAdapter;
    public static ArrayList<String> mDataList = new ArrayList<>();
    private  ArrayList<String> mpicPathList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multimg_list_publish);
        ButterKnife.bind(this);
        initData();
        initView();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            dialog();
            return false;
        }
        return false;
    }


    //返回按钮监听
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            startActivity(MainActivity.class);
            removeTempFromPref();
            MultiImageListActivity.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onPause()
    {
        super.onPause();
        saveTempToPref();
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        saveTempToPref();
    }

    private void saveTempToPref()
    {
        if( CommonApp.PICSIZE < mDataList.size()) {
            CommonApp.PICSIZE = mDataList.size();
            mpicPathList.addAll(mDataList);
        }

    }

    private void getTempFromPref()
    {
        ArrayList<String> tempImages = new ArrayList<>();
        if (CommonApp.PICSIZE != 0) {
            tempImages.addAll(mpicPathList);
            mDataList = tempImages;
        }
    }

    private void removeTempFromPref()
    {
        if (CommonApp.PICSIZE != 0) {
            mpicPathList.clear();
        }
    }

    @SuppressWarnings("unchecked")
    private void initData()
    {
        getTempFromPref();
        ArrayList<String> incomingDataList = (ArrayList<String>) getIntent()
                .getSerializableExtra("image_list");
        if (incomingDataList != null)
        {
            Log.e("测试",incomingDataList.get(0));
            mDataList.addAll(incomingDataList);
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        notifyDataChanged(); //当在ImageZoomActivity中删除图片时，返回这里需要刷新
    }

    public void initView()
    {
        setTitle(getResources().getString(R.string.picture_list));
        //Toolbar too
        setSupportActionBar(toolbar);
        mGridView = (GridView) findViewById(R.id.gridview);
        mGridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        mAdapter = new ImagePublishAdapter(this, mDataList);
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener(new OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                if (position == getDataSize())
                {
                    Intent intent = new Intent(MultiImageListActivity.this,
                            MultiImageSelectorActivity.class);
                    // 是否显示拍摄图片
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SHOW_CAMERA, CommonApp.SHOW_CAMERA);
                    // 最大可选择图片数量
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SELECT_COUNT, CommonApp.MAXNUM);
                    // 选择模式
                    intent.putExtra(MultiImageSelectorActivity.EXTRA_SELECT_MODE, CommonApp.SELECTEDMODE);
                    intent.putStringArrayListExtra("image_list", mDataList);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(MultiImageListActivity.this,
                            MultiImageZoomActivity.class);
                    intent.putExtra("image_list", (Serializable) mDataList);
                    intent.putExtra(CommonApp.EXTRA_CURRENT_IMG_POSITION, position);
                    startActivity(intent);
                }
            }
        });
    }

    private int getDataSize()
    {
        return mDataList == null ? 0 : mDataList.size();
    }

    private int getAvailableSize()
    {
        int availSize = 9 - mDataList.size();
        if (availSize >= 0)
        {
            return availSize;
        }
        return 0;
    }

    public String getString(String s)
    {
        String path = null;
        if (s == null) return "";
        for (int i = s.length() - 1; i > 0; i++)
        {
            s.charAt(i);
        }
        return path;
    }

    protected void dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MultiImageListActivity.this);
        builder.setMessage("退出此次编辑?");
        builder.setTitle("提示");
        builder.setPositiveButton("确认",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        startActivity(MainActivity.class);
                        removeTempFromPref();
                        MultiImageListActivity.this.finish();
                    }
                });
        builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.create().show();
    }

    private static final int TAKE_PICTURE = 0x000000;
    private String path = "";

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        switch (requestCode)
        {
            case TAKE_PICTURE:
                if (mDataList.size() < 9
                        && resultCode == -1 && !TextUtils.isEmpty(path))
                {
                    mDataList.add(path);
                }
                break;
        }
    }

    private void notifyDataChanged()
    {
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void OnHttpResponse(String var1, String var2)
    {

    }
}



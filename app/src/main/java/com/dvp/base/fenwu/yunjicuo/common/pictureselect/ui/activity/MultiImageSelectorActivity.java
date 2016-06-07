package com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;


import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.fragment.MultiImageSelectorFragment;

import java.io.File;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 多图选择
 */
public class MultiImageSelectorActivity extends FragmentActivity implements MultiImageSelectorFragment.Callback
{
    /**
     * 界面类型，判断是从哪个界面跳转过来的
     */
    public static final String EXTRA_TYPE="type";

    /**
     * 最大图片选择次数，int类型，默认9
     */
    public static final String EXTRA_SELECT_COUNT = "max_select_count";
    /**
     * 图片选择模式，默认多选
     */
    public static final String EXTRA_SELECT_MODE = "select_count_mode";
    /**
     * 是否显示相机，默认显示
     */
    public static final String EXTRA_SHOW_CAMERA = "show_camera";
    /**
     * 默认选择集
     */
    public static final String EXTRA_DEFAULT_SELECTED_LIST = "default_list";

    /**
     * 单选
     */
    public static final int MODE_SINGLE = 0;
    /**
     * 多选
     */
    public static final int MODE_MULTI = 1;
    @Bind(R.id.commit)
    TextView commit;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.image_grid)
    FrameLayout imageGrid;
    /**
     * 多选结果list
     */
    private ArrayList<String> resultList = new ArrayList<>();
    private int mDefaultCount;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multimg_selector_activity_default);
        ButterKnife.bind(this);
        init();
        initdata();
    }

    private void init()
    {
        toolbar.setTitle(getResources().getString(R.string.picture));
    }

    private void initdata()
    {
        Intent intent = getIntent();
        type=intent.getStringExtra(MultiImageSelectorActivity.EXTRA_TYPE);
        mDefaultCount = intent.getIntExtra(EXTRA_SELECT_COUNT, 9);
        int mode = intent.getIntExtra(EXTRA_SELECT_MODE, MODE_MULTI);
        boolean isShow = intent.getBooleanExtra(EXTRA_SHOW_CAMERA, true);
        if (mode == MODE_MULTI && intent.hasExtra("image_list"))
        {
            resultList = intent.getStringArrayListExtra("image_list");
        }

        Bundle bundle = new Bundle();
        bundle.putInt(MultiImageSelectorFragment.EXTRA_SELECT_COUNT, mDefaultCount);
        bundle.putInt(MultiImageSelectorFragment.EXTRA_SELECT_MODE, mode);
        bundle.putBoolean(MultiImageSelectorFragment.EXTRA_SHOW_CAMERA, isShow);
        bundle.putStringArrayList(MultiImageSelectorFragment.EXTRA_DEFAULT_SELECTED_LIST, resultList);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.image_grid, Fragment.instantiate(this, MultiImageSelectorFragment.class.getName(), bundle))
                .commit();

        if (resultList == null || resultList.size() <= 0)
        {
            commit.setText(R.string.action_done);
            commit.setEnabled(false);
        } else
        {
            updateDoneText();
            commit.setEnabled(true);
        }


    }

    /*//返回按钮监听
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    @OnClick(R.id.toolbar)
    public void toolbarClick()
    {
        setResult(98);
        finish();
    }

    @OnClick(R.id.commit)
    public void onClick()
    {
        if (resultList != null && resultList.size() > 0)
        {

           if (type!=null && type.equals("StuCuoTPaiZhaoActivity")){
                Intent intent=new Intent();
               intent.putStringArrayListExtra("image_list", resultList);
               setResult(0,intent);
               finish();
           }else {
               Intent data = new Intent(MultiImageSelectorActivity.this,
                       MultiImageListActivity.class);
               data.putStringArrayListExtra("image_list", resultList);
               startActivity(data);
               finish();
           }
        }
    }

    private void updateDoneText()
    {
        commit.setText(String.format("%s(%d/%d)",
                getString(R.string.action_done), resultList.size(), mDefaultCount));
    }

    @Override
    public void onSingleImageSelected(String path)
    {
        Intent data = new Intent(MultiImageSelectorActivity.this,
                MultiImageListActivity.class);
        resultList.add(path);
        data.putStringArrayListExtra("image_list", resultList);
        startActivity(data);
        finish();
    }

    @Override
    public void onImageSelected(String path)
    {
        if (!resultList.contains(path))
        {
            resultList.add(path);
        }
        // 有图片之后，改变按钮状态
        if (resultList.size() > 0)
        {
            updateDoneText();
            if (!commit.isEnabled())
            {
                commit.setEnabled(true);
            }
        }
    }

    @Override
    public void onImageUnselected(String path)
    {
        if (resultList.contains(path))
        {
            resultList.remove(path);
        }
        updateDoneText();
        // 当为选择图片时候的状态
        if (resultList.size() == 0)
        {
            commit.setText(R.string.action_done);
            commit.setEnabled(false);
        }
    }

    @Override
    public void onCameraShot(File imageFile)
    {
        if (imageFile != null)
        {

            // notify system
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(imageFile)));

            Intent data = new Intent(MultiImageSelectorActivity.this,
                    MultiImageListActivity.class);
            resultList.add(imageFile.getAbsolutePath());
            data.putStringArrayListExtra("image_list", resultList);
            startActivity(data);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        setResult(98);
        super.onBackPressed();
    }

}

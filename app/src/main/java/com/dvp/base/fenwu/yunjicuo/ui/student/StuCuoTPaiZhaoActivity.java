package com.dvp.base.fenwu.yunjicuo.ui.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.adapter.ImagePublishAdapter;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity.MultiImageSelectorActivity;
import com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity.MultiImageZoomActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.model.StuWDZYModel;
import com.dvp.base.view.NestedGridView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.io.File;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

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
    @Bind(R.id.submit_btn)
    Button submitBtn;
  /*  @Bind(R.id.oldpic_imageview)
    ImageView oldpicImageview;*/

    private StuWDZYModel mModel;

    private ImagePublishAdapter mAdapter;
    public  ArrayList<String> mDataList = new ArrayList<>();

    private String homeworkscoreid = ""; //homeworkscoreid

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_cuo_tpai_zhao);
        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mDataList.clear();
    }

    /**
     * 初始化
     */
    private void init()
    {

        homeworkscoreid = getIntent().getStringExtra("homeworkscoreid");
        if (mModel == null)
        {
            mModel = new StuWDZYModel(this);
        }
        mModel.addResponseListener(this);
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

        //下载图片
        mModel.downloadPic(getResources().getString(R.string.down_load_pic_trancode), homeworkscoreid);



    }

    /**
     * 初始化数据
     * @param mDataList
     * @param mark
     */
    private void initData(final ArrayList<String> mDataList,final int mark)
    {
        mAdapter = new ImagePublishAdapter(StuCuoTPaiZhaoActivity.this, mDataList,mark);
        gridview.setAdapter(mAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                if (position == getDataSize())
                {
                    mDataList.clear();
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
        if (var1.equals(getResources().getString(R.string.down_load_pic_trancode)))  //下载错题照片返回结果
        {

            if(var2.equals("0"))
            {
                initData(mDataList,0);//多选图片
            }

            if(var2.equals("1"))
            {
                if (mModel.getRtnCuoTZhaoPian().getCuoTZhP().size() > 0)
                {
                    mDataList.clear();
                    String path = getResources().getString(R.string.http_request_url) + mModel.getRtnCuoTZhaoPian().getCuoTZhP().get(0).getFilePath();

                    mDataList.add(path);
                    initData(mDataList,1);//多选图片
                    // ImageLoader.getInstance().displayImage(path,oldpicImageview);

                    //ImageLoader.getInstance().getDiskCache().get(path).getPath();
                    // ImageDownloader.Scheme.FILE.wrap(path);
                }
                else
                {
                    initData(mDataList,0);//多选图片
                }
            }


        }

        if (var1.equals(getResources().getString(R.string.stu_baocuntupian_trancode)))
        {
            DialogUtil.showToast(getApplicationContext(), "保存成功");
            finish();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("onActivityResult", "onActivityResult");

        if (requestCode == 0x123 && resultCode == 0)
        {

            if(data.getStringArrayListExtra("image_list").size()==0)
            {
                return;
            }
            else
            {

                mDataList = data.getStringArrayListExtra("image_list");
                getDataSize();
                initData(mDataList,0);
            }

        }
    }

    private boolean isUploadSuccess = false;//是否上传图片完成 默认是没有完成

    public void upLoadPic(final ArrayList<String> filePaths, int i)
    {
        final MaterialDialog md = DialogUtil.getLoadingDialog(StuCuoTPaiZhaoActivity.this, "正在上传图片...");
        md.show();
        // File file = new File("/storage/sdcard1/Pictures/Screenshots/Screenshot_2016-03-21-19-12-03.png");
        // File file1 = new File("/storage/sdcard1/Pictures/Screenshots/Screenshot_2016-04-11-13-44-03.png");
        File file = new File(filePaths.get(i));

        String url = getResources().getString(R.string.http_request_url) + getResources().getString(R.string.upload_pic_url);
        System.out.println("uploadurl===" + url);
        OkHttpUtils.post()
                .addFile("mFile", "messenger_01.png", file)
                .addParams("saveType", "1")
                .addParams("folder", "/uploads")
                .addParams("plicyType", "uuid")
                .addParams("folderPolicy", "0")
                .url(url)
                .build()
                .connTimeOut(200000)
                .readTimeOut(200000)
                .writeTimeOut(200000)
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (md.isShowing())
                        {
                            md.dismiss();
                        }
                        System.out.println("图片上传失败=====");
                        isUploadSuccess = false;
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (md.isShowing())
                        {
                            md.dismiss();
                        }
                        System.out.println("图片上传成功=====");
                        isUploadSuccess = true;
                        String[] arrayName = response.split("@");
                        System.out.println("图片上传成功返回的id=====" + arrayName[0]);
                        if (isUploadSuccess)
                        {
                            //调用接口传递数据
                            mModel.uploadPicMethod(getResources().getString(R.string.stu_baocuntupian_trancode), homeworkscoreid, arrayName[0]);
                        }
                    }
                });
    }

    @OnClick(R.id.submit_btn)
    public void onClick()
    {
        upLoadPic(mDataList, 0);
    }
}

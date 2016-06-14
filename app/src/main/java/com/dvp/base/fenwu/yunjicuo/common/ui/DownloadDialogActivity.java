package com.dvp.base.fenwu.yunjicuo.common.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.Formatter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.domain.ClientVersion;
import com.dvp.base.fenwu.yunjicuo.common.view.NumberProgressBar;
import com.dvp.base.util.MobileUtil;
import com.lzy.okhttpserver.download.DownloadInfo;
import com.lzy.okhttpserver.download.DownloadManager;
import com.lzy.okhttpserver.download.DownloadService;
import com.lzy.okhttpserver.listener.DownloadListener;

import java.io.File;
import java.text.DecimalFormat;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 类：DownloadDialogActivity
 * 作者：田翔
 * 功能描述：更新下载窗口
 * 时间：2016/5/20
 * 开发环境：JDK1.8
 */
public class DownloadDialogActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.download_ll)
    LinearLayout downloadLl;
    @Bind(R.id.download_cancel_btn)
    TextView downloadCancelBtn;
    @Bind(R.id.download_wifi_indicator_iv)
    ImageView downloadWifiIndicatorIv;
    @Bind(R.id.download_completion_tv)
    TextView downloadCompletionTv;
    @Bind(R.id.download_speed_tv)
    TextView downloadSpeedTv;
    @Bind(R.id.download_progress_pb)
    NumberProgressBar downloadProgressPb;

    private ClientVersion cv;
    private boolean isForce;
    private DownloadManager downloadManager;
    private DownloadDialogListener downloadDialogListener;
    private double size;

    public DownloadDialogActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_dialog);
        ButterKnife.bind(this);
        init();
    }

    @Override
    public void onClick(View v) {
        downloadManager.removeTask(cv.getUrl());
        if(isForce){
            CommonApp.getInstance().exitApp(false);
        }else{
            finish();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && isForce) {
            CommonApp.getInstance().exitApp(false);
        }
        return super.onKeyDown(keyCode, event);
    }

    private void init(){
        cv = (ClientVersion) getIntent().getSerializableExtra("cv");
        isForce = cv.getIsMandatory().equals("0")?false:true;

        downloadCancelBtn.setOnClickListener(this);

        // 是否wifi
        if (CommonApp.getInstance().getAppConfig().getString("netType", "").equals("wifi")) {
            downloadWifiIndicatorIv.setVisibility(View.GONE);
        } else {
            downloadWifiIndicatorIv.setVisibility(View.VISIBLE);
        }

        downloadManager = DownloadService.getDownloadManager(this);

        if(downloadManager.getTaskByUrl(cv.getUrl()) != null && downloadManager.getTaskByUrl(cv.getUrl()).getState() == DownloadManager.FINISH){
            File installFile = new File(downloadManager.getTaskByUrl(cv.getUrl()).getTargetPath());
            if (!installFile.exists()){
                downloadManager.removeTask(cv.getUrl());
                downloadManager.addTask(cv.getUrl(),null);

                downloadDialogListener = new DownloadDialogListener();
                downloadDialogListener.setUserTag(DownloadDialogActivity.this);
                downloadManager.getTaskByUrl(cv.getUrl()).setListener(downloadDialogListener);
            }else{
                finish();
                MobileUtil.installAPK(DownloadDialogActivity.this, downloadManager.getTaskByUrl(cv.getUrl()).getTargetPath());
            }
        }else{
            downloadManager.addTask(cv.getUrl(),null);

            downloadDialogListener = new DownloadDialogListener();
            downloadDialogListener.setUserTag(DownloadDialogActivity.this);
            downloadManager.getTaskByUrl(cv.getUrl()).setListener(downloadDialogListener);
        }
    }

    private class DownloadDialogListener extends DownloadListener
    {

        @Override
        public void onProgress(DownloadInfo downloadInfo) {
            size = downloadInfo.getTotalLength() / 1024.00/1024.00;
            downloadCompletionTv.setText(getResources().getString(R.string.gong_str)+ new DecimalFormat(getResources().getString(R.string.two_bit_format)).format(size) +getResources().getString(R.string.download_unit_str));
            String networkSpeed = Formatter.formatFileSize(DownloadDialogActivity.this, downloadInfo.getNetworkSpeed());
            downloadSpeedTv.setText(getResources().getString(R.string.download_speed_str) + networkSpeed + getResources().getString(R.string.download_speed_unit_str));
            downloadProgressPb.setMax((int) downloadInfo.getTotalLength());
            downloadProgressPb.setProgress((int) downloadInfo.getDownloadLength());
        }

        @Override
        public void onFinish(DownloadInfo downloadInfo) {
            System.out.println("进入onFinish");
            downloadSpeedTv.setText("");
            downloadCompletionTv.setText(getResources().getString(R.string.gong_str)+ new DecimalFormat(getResources().getString(R.string.two_bit_format)).format(size) +getResources().getString(R.string.download_unit_str));
            downloadProgressPb
                    .setProgress((int) downloadInfo.getTotalLength());
            finish();
            MobileUtil.installAPK(DownloadDialogActivity.this, downloadInfo.getTargetPath());
        }

        @Override
        public void onError(DownloadInfo downloadInfo, String errorMsg, Exception e) {
            if(errorMsg != null){
                downloadSpeedTv.setText("");
                downloadCompletionTv.setText(getResources().getString(R.string.download_fail_str)+errorMsg);
                downloadProgressPb.setProgress(0);
                downloadManager.removeTask(downloadInfo.getUrl());
                downloadManager.addTask(downloadInfo.getUrl(),downloadDialogListener);
                return;
            }
        }
    }
}

package com.dvp.base.fenwu.yunjicuo.common.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.model.UpdateModel;
import com.dvp.base.fenwu.yunjicuo.common.ui.UpdateDialogActivity;
import com.dvp.base.fenwu.yunjicuo.common.update.UpdateConfig;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.HttpResponse;
import com.dvp.base.util.MobileUtil;
import com.lzy.okhttpserver.download.DownloadInfo;
import com.lzy.okhttpserver.download.DownloadManager;
import com.lzy.okhttpserver.download.DownloadService;
import com.lzy.okhttpserver.listener.DownloadListener;
import com.lzy.okhttputils.OkHttpUtils;

public class UpdateService extends Service implements HttpResponse
{

    private UpdateModel updateVersionModel;
    private DownloadManager downloadManager;
    private DownloadServiceListener downloadServiceListener;

    private String updateTranCode;

    public UpdateService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init();
        initData();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        OkHttpUtils.getInstance().cancelTag(this);
    }

    private void init() {
        updateTranCode = getResources().getString(R.string.update_apicode);
        downloadManager = DownloadService.getDownloadManager(this);
    }

    private void initData() {
        if (null == updateVersionModel) {
            updateVersionModel = new UpdateModel(this);
        }
        updateVersionModel.addResponseListener(this);
        //判断网络状态
        String netType = CommonApp.getInstance().getAppConfig().getString("netType", "");
       /* if ((UpdateConfig.isUpdateOnlyWifi() && netType.equals("wifi")) ||
                !UpdateConfig.isUpdateOnlyWifi()) {*/
            updateVersionModel.checkUpdate(updateTranCode);
        /*} else {
            stopSelf();
        }*/

    }

    @Override
    public void OnHttpResponse(String apiCode, String var2)
    {
        if (apiCode.equals(updateTranCode)) {
            //设置apk名称
            updateVersionModel.clientVersion.setApkName(getResources().getString(
                    R.string.app_name)
                    + ".apk");
            //版本号判断
            try {
                Integer version = Integer.parseInt(updateVersionModel.clientVersion.getVersion());
                if (version > 0) {
                    // 客户端版本
                    Integer clientVersion = MobileUtil.getVersion(
                            getPackageManager(),
                            getPackageName());
                    if (version > clientVersion &&
                            !CommonApp.getInstance().getAppConfig().getString("ingore", "0").equals(version + "")) {
                        //静默下载
                        if (UpdateConfig.isSilentDownload()) {
                            //下载
                            downloadManager.addTask(updateVersionModel.clientVersion.getUrl(), null);
                            downloadServiceListener = new DownloadServiceListener();
                            downloadServiceListener.setUserTag(UpdateService.this);
                            downloadManager.getTaskByUrl(updateVersionModel.clientVersion.getUrl()).setListener(downloadServiceListener);
                        } else {
                            //弹出界面提示
                            Intent intent = new Intent(UpdateService.this, UpdateDialogActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.putExtra("cv", updateVersionModel.clientVersion);
                            intent.putExtra("force", UpdateConfig.isUpdateForce());
                            startActivity(intent);
                        }
                    } else {
                        // 提示当前为最新版本
                        if (UpdateConfig.isUpdateAutoPopup() &&
                                !UpdateConfig.isUpdateAuto()) {
                            new Handler(Looper.getMainLooper()).
                                    post(new Runnable() {

                                        @Override
                                        public void run() {
                                            DialogUtil.showToast(getApplicationContext(), "当前程序为最新版本");
                                        }
                                    });
                        }
                    }
                } else {
                    //提示版本信息错误
                    new Handler(Looper.getMainLooper()).
                            post(new Runnable() {

                                @Override
                                public void run() {
                                    DialogUtil.showToast(getApplicationContext(), "版本信息错误");
                                }
                            });
                }
            } catch (Exception e) {
                e.printStackTrace();
                new Handler(Looper.getMainLooper()).
                        post(new Runnable() {

                            @Override
                            public void run() {
                                DialogUtil.showToast(UpdateService.this, "版本号返回错误");
                            }
                        });
            }

            stopSelf();
        }
    }

    private class DownloadServiceListener extends DownloadListener
    {

        @Override
        public void onProgress(DownloadInfo downloadInfo) {
        }

        @Override
        public void onFinish(DownloadInfo downloadInfo) {
            MobileUtil.installAPK(UpdateService.this, downloadInfo.getTargetPath());
        }

        @Override
        public void onError(DownloadInfo downloadInfo, String errorMsg, Exception e) {
        }
    }
}

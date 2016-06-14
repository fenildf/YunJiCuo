package com.dvp.base.fenwu.yunjicuo.common.update;

import android.content.Context;
import android.content.Intent;

import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.domain.ClientVersion;
import com.dvp.base.fenwu.yunjicuo.common.service.UpdateService;
import com.dvp.base.fenwu.yunjicuo.common.ui.DownloadDialogActivity;
import com.dvp.base.util.MobileUtil;

import java.io.File;

public class UpdateAgent {
    public static void setUpdateOnlyWifi(boolean paramBoolean) {
        UpdateConfig.setUpdateOnlyWifi(paramBoolean);
    }

    public static void setUpdateAutoPopup(boolean paramBoolean) {
        UpdateConfig.setUpdateAutoPopup(paramBoolean);
    }

    public static void setUpdateAuto(boolean paramBoolean) {
        UpdateConfig.setUpdateAuto(paramBoolean);
    }

    public static void update(Context context) {
        UpdateConfig.setUpdateForce(false);
        UpdateConfig.setSilentDownload(false);
        UpdateConfig.setUpdateAuto(false);
        startUpdate(context);
    }

    public static void autoUpdate(Context context) {
        UpdateConfig.setUpdateForce(true);
        UpdateConfig.setSilentDownload(false);
        UpdateConfig.setUpdateAuto(true);
        startUpdate(context);
    }

    public static void silentUpdate(Context context) {
        UpdateConfig.setUpdateForce(false);
        UpdateConfig.setSilentDownload(true);
        startUpdate(context);
    }

    public static void forceUpdate(Context context) {
        UpdateConfig.setUpdateForce(true);
        UpdateConfig.setSilentDownload(false);
        startUpdate(context);
    }

    private static void startUpdate(final Context context) {
        if(context == null ){
            return;
        }
        //启动service
        Intent intent = new Intent(context,UpdateService.class);
        context.startService(intent);

    }

    public static void updateResult(int updateType, Context context,
                                    ClientVersion cv, File file){
        switch (updateType) {
            case 5:
                downloadApk(context, cv, file);
                break;
            case 7:
                ingoreUpdate(cv);
                break;
        }
    }

    private static void downloadApk(Context context, ClientVersion cv,
                                    File file){
        if(file == null || !file.exists()){
            startDownload(context, cv);
        }else{
            startInstall(context, file);
        }
    }

    /**
     * 功能描述: 开始下载
     * @param context
     * @param cv
     */
    public static void startDownload(Context context,
                                     ClientVersion cv){
        Intent intent = new Intent(context,DownloadDialogActivity.class);
        intent.putExtra("cv", cv);
        context.startActivity(intent);
    }

    /**
     * 功能描述: 开始安装apk
     * @param context
     * @param file
     */
    public static void startInstall(Context context,
                                    File file){
        MobileUtil.installAPK(context, file.getAbsolutePath());
    }

    /**
     * 功能描述: 忽略当前版本
     * @param cv
     */
    public static void ingoreUpdate(ClientVersion cv){
        CommonApp.getInstance().getAppConfig().setString("ingore", cv.getVersion());
    }
}

package com.dvp.base.fenwu.yunjicuo.common.update;

/**
 * 类: UpdateConfig
 * 功能描述: 更新配置类
 * 创建人: 田翔
 * 创建日期: 2016/5/12 10:24
 * 开发环境: JDK1.8
 */
public class UpdateConfig {
    private static boolean isUpdateForce = false;
    private static boolean isSilentDownload = false;
    private static boolean isUpdateOnlyWifi = true;
    private static boolean isUpdateAutoPopup = true;
    private static boolean isUpdateAuto = false;

    public static boolean isUpdateForce() {
        return isUpdateForce;
    }

    public static void setUpdateForce(boolean isUpdateForce) {
        UpdateConfig.isUpdateForce = isUpdateForce;
    }

    public static boolean isSilentDownload() {
        return isSilentDownload;
    }

    public static void setSilentDownload(boolean isSilentDownload) {
        UpdateConfig.isSilentDownload = isSilentDownload;
    }

    public static boolean isUpdateOnlyWifi() {
        return isUpdateOnlyWifi;
    }

    public static void setUpdateOnlyWifi(boolean isUpdateOnlyWifi) {
        UpdateConfig.isUpdateOnlyWifi = isUpdateOnlyWifi;
    }

    public static boolean isUpdateAutoPopup() {
        return isUpdateAutoPopup;
    }

    public static void setUpdateAutoPopup(boolean isUpdateAutoPopup) {
        UpdateConfig.isUpdateAutoPopup = isUpdateAutoPopup;
    }

    public static boolean isUpdateAuto() {
        return isUpdateAuto;
    }

    public static void setUpdateAuto(boolean isUpdateAuto) {
        UpdateConfig.isUpdateAuto = isUpdateAuto;
    }
}

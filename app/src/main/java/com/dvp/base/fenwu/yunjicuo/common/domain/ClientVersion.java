package com.dvp.base.fenwu.yunjicuo.common.domain;

import com.dvp.base.entity.BaseEntity;

/**
 * 类: ClientVersion
 * 功能描述: 客户端版本类
 * 创建人: 田翔
 * 创建日期: 2016/5/12 10:31
 * 开发环境: JDK1.8
 */
public class ClientVersion extends BaseEntity
{
    /**
     * @Fields id : 标识列
     */
    private String id;

    /**
     * @Fields device_type : 各种设备的类型编号如下：
     * 1：浏览器设备；2：PC设备；3：Andriod设备；4：iOS设备；5：Windows Phone设备；
     */
    private int deviceType;

    /**
     * @Fields applicationCode : 同一设备类型的应用程序唯一编码
     */
    private String applicationCode;

    /**
     * @Fields version : 版本信息
     */
    private String version;

    /**
     * @Fields isMandatory : 是否强制更新；1：强制，0：不强制
     */
    private String isMandatory;

    /**
     * @Fields url : 客户端升级文件在服务器的URL地址
     */
    private String url;

    /**
     * @Fields filePath : 客户端升级文件在服务器的物理地址
     */
    private String filePath;

    private String updateTime;
    /**
     * @Fields description : 当前版本升级信息描述
     */
    private String description;

    private String apkName;

    public ClientVersion() {

    }

    public ClientVersion(int deviceType, String applicationCode) {
        this.deviceType = deviceType;
        this.applicationCode = applicationCode;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getId() {
        return id;
    }
}

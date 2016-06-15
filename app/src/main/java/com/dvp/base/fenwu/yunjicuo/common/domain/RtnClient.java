package com.dvp.base.fenwu.yunjicuo.common.domain;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/15 10:43
 * <p>
 * 功能描述:YunJiCuo
 */

public class RtnClient
{

    /**
     * xiuGR :
     * chuangJR :
     * id : e549102455519f17015551a59a830003
     * apkName : 1
     * applicationCode : 1
     * chuangJShJ : 20160615092055
     * attach : [{"id":"e549102455519f17015551a594880002","createTime":"2016-06-15 09:20:53","filePath":"/uploads/c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk","name":"app-debug.apk","physicalName":"c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk","physicalname":"c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk","type":"1","size":4934142}]
     * description : 1
     * deviceType : 1
     * isMandatory : 1
     * xiuGShJ : 20160615092055
     * url : 1
     * version : 1
     */

    private String xiuGR;
    private String chuangJR;
    private String id;
    private String apkName;
    private String applicationCode;
    private String chuangJShJ;
    private String description;
    private int deviceType;
    private String isMandatory;
    private String xiuGShJ;
    private String url;
    private String version;
    /**
     * id : e549102455519f17015551a594880002
     * createTime : 2016-06-15 09:20:53
     * filePath : /uploads/c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk
     * name : app-debug.apk
     * physicalName : c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk
     * physicalname : c38ccceb-aef1-45ec-94ec-ccb7e9871c61.apk
     * type : 1
     * size : 4934142
     */

    private List<AttachEntity> attach;

    public String getXiuGR()
    {
        return xiuGR;
    }

    public void setXiuGR(String xiuGR)
    {
        this.xiuGR = xiuGR;
    }

    public String getChuangJR()
    {
        return chuangJR;
    }

    public void setChuangJR(String chuangJR)
    {
        this.chuangJR = chuangJR;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getApkName()
    {
        return apkName;
    }

    public void setApkName(String apkName)
    {
        this.apkName = apkName;
    }

    public String getApplicationCode()
    {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode)
    {
        this.applicationCode = applicationCode;
    }

    public String getChuangJShJ()
    {
        return chuangJShJ;
    }

    public void setChuangJShJ(String chuangJShJ)
    {
        this.chuangJShJ = chuangJShJ;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getDeviceType()
    {
        return deviceType;
    }

    public void setDeviceType(int deviceType)
    {
        this.deviceType = deviceType;
    }

    public String getIsMandatory()
    {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory)
    {
        this.isMandatory = isMandatory;
    }

    public String getXiuGShJ()
    {
        return xiuGShJ;
    }

    public void setXiuGShJ(String xiuGShJ)
    {
        this.xiuGShJ = xiuGShJ;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public List<AttachEntity> getAttach()
    {
        return attach;
    }

    public void setAttach(List<AttachEntity> attach)
    {
        this.attach = attach;
    }

    public static class AttachEntity
    {
        private String id;
        private String createTime;
        private String filePath;
        private String name;
        private String physicalName;
        private String physicalname;
        private String type;
        private int size;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getCreateTime()
        {
            return createTime;
        }

        public void setCreateTime(String createTime)
        {
            this.createTime = createTime;
        }

        public String getFilePath()
        {
            return filePath;
        }

        public void setFilePath(String filePath)
        {
            this.filePath = filePath;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getPhysicalName()
        {
            return physicalName;
        }

        public void setPhysicalName(String physicalName)
        {
            this.physicalName = physicalName;
        }

        public String getPhysicalname()
        {
            return physicalname;
        }

        public void setPhysicalname(String physicalname)
        {
            this.physicalname = physicalname;
        }

        public String getType()
        {
            return type;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public int getSize()
        {
            return size;
        }

        public void setSize(int size)
        {
            this.size = size;
        }
    }
}

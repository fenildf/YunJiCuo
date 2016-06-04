package com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/2 16:07
 * <p>
 * 功能描述:布置作业时候获取的科目列表
 */
public class RtnGetKeMList
{

    /**
     * totalCount : 2
     * data : [{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"}]
     */

    private int totalCount;
    /**
     * id : 2c90813a5074c128015074cb6707000b
     * name : 数学
     * orderId : 1
     * rcsField : name
     * rcsKey : 2c90813a5074c128015074cb6707000b
     * rcsValue : 数学
     */

    private List<DataEntity> data;

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public List<DataEntity> getData()
    {
        return data;
    }

    public void setData(List<DataEntity> data)
    {
        this.data = data;
    }

    public static class DataEntity
    {
        private String id;
        private String name;
        private int orderId;
        private String rcsField;
        private String rcsKey;
        private String rcsValue;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public int getOrderId()
        {
            return orderId;
        }

        public void setOrderId(int orderId)
        {
            this.orderId = orderId;
        }

        public String getRcsField()
        {
            return rcsField;
        }

        public void setRcsField(String rcsField)
        {
            this.rcsField = rcsField;
        }

        public String getRcsKey()
        {
            return rcsKey;
        }

        public void setRcsKey(String rcsKey)
        {
            this.rcsKey = rcsKey;
        }

        public String getRcsValue()
        {
            return rcsValue;
        }

        public void setRcsValue(String rcsValue)
        {
            this.rcsValue = rcsValue;
        }
    }
}



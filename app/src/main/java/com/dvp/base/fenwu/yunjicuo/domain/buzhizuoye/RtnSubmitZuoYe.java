package com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye;

/**
 * 作者：Administrator on 2016/6/2 18:40
 * <p>
 * 功能描述:提交布置作业接口
 */
public class RtnSubmitZuoYe
{

    /**
     * kaiShShJ : 2016-06-02 18:39
     * id : e549102454f10512015510b249c20228
     * keM : {"id":"2c90813a5074c128015074cb6707000b","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b"}
     * remark : æ æ¯å®æä½ä¸
     * jieShShJ : 2016-06-03 18:39
     * user : {"id":"e54910245143f903015146aa3ab6042c","state":"正常"}
     */

    private String kaiShShJ;
    private String id;
    /**
     * id : 2c90813a5074c128015074cb6707000b
     * orderId : 0
     * rcsField : name
     * rcsKey : 2c90813a5074c128015074cb6707000b
     */

    private KeMEntity keM;
    private String remark;
    private String jieShShJ;
    /**
     * id : e54910245143f903015146aa3ab6042c
     * state : 正常
     */

    private UserEntity user;

    public String getKaiShShJ()
    {
        return kaiShShJ;
    }

    public void setKaiShShJ(String kaiShShJ)
    {
        this.kaiShShJ = kaiShShJ;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public KeMEntity getKeM()
    {
        return keM;
    }

    public void setKeM(KeMEntity keM)
    {
        this.keM = keM;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public String getJieShShJ()
    {
        return jieShShJ;
    }

    public void setJieShShJ(String jieShShJ)
    {
        this.jieShShJ = jieShShJ;
    }

    public UserEntity getUser()
    {
        return user;
    }

    public void setUser(UserEntity user)
    {
        this.user = user;
    }

    public static class KeMEntity
    {
        private String id;
        private int orderId;
        private String rcsField;
        private String rcsKey;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
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
    }

    public static class UserEntity
    {
        private String id;
        private String state;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getState()
        {
            return state;
        }

        public void setState(String state)
        {
            this.state = state;
        }
    }
}



package com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/25 14:20
 * <p/>
 * 功能描述:YunJiCuo
 */
public class RtnLianXiCeList
{

    /**
     * banBen : {"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"}
     * examRcsValue : 全效学习物理初二null
     * fenCe : {"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"}
     * fullScore : 0
     * id : e54910245340e3a201534ed72f78048a
     * keM : {"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"}
     * name : 全效学习
     * nianJ : {"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
     * orderId : 0
     * rcsField : name
     * rcsKey : e54910245340e3a201534ed72f78048a
     * rcsValue : 全效学习下册物理初二人教版
     * shiJNF : {"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"}
     * type : 0
     * xueDuan : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
     */

    private List<MLianXListEntity> mLianXList;

    public List<MLianXListEntity> getMLianXList()
    {
        return mLianXList;
    }

    public void setMLianXList(List<MLianXListEntity> mLianXList)
    {
        this.mLianXList = mLianXList;
    }

    public static class MLianXListEntity
    {
        /**
         * id : e5491024509498a501509945e8df01c4
         * name : 人教版
         * orderId : 0
         * rcsField : name
         * rcsKey : e5491024509498a501509945e8df01c4
         * rcsValue : 人教版
         */

        private BanBenEntity banBen;
        private String examRcsValue;
        /**
         * id : 402881ed50942cdc0150942dfd1d003b
         * name : 下册
         * orderId : 0
         * rcsField : name
         * rcsKey : 402881ed50942cdc0150942dfd1d003b
         * rcsValue : 下册
         */

        private FenCeEntity fenCe;
        private int fullScore;
        private String id;
        /**
         * id : e5491024509498a50150994d56d60261
         * name : 物理
         * orderId : 2
         * rcsField : name
         * rcsKey : e5491024509498a50150994d56d60261
         * rcsValue : 物理
         */

        private KeMEntity keM;
        private String name;
        /**
         * id : 402881ed50943a980150945c20920250
         * name : 初二
         * orderId : 8
         * rcsField : name
         * rcsKey : 402881ed50943a980150945c20920250
         * rcsValue : 初二
         * xueD : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
         */

        private NianJEntity nianJ;
        private int orderId;
        private String rcsField;
        private String rcsKey;
        private String rcsValue;
        /**
         * id : 2c90813a5074c128015074d6f93c007f
         * name : 2015-2016
         * orderId : 3
         * rcsField : name
         * rcsKey : 2c90813a5074c128015074d6f93c007f
         * rcsValue : 2015-2016
         */

        private ShiJNFEntity shiJNF;
        private String type;
        /**
         * id : 402881ed50943a9801509459f81d0229
         * name : 初中
         * orderId : 2
         * rcsField : name
         * rcsKey : 402881ed50943a9801509459f81d0229
         * rcsValue : 初中
         */

        private XueDuanEntity xueDuan;

        public BanBenEntity getBanBen()
        {
            return banBen;
        }

        public void setBanBen(BanBenEntity banBen)
        {
            this.banBen = banBen;
        }

        public String getExamRcsValue()
        {
            return examRcsValue;
        }

        public void setExamRcsValue(String examRcsValue)
        {
            this.examRcsValue = examRcsValue;
        }

        public FenCeEntity getFenCe()
        {
            return fenCe;
        }

        public void setFenCe(FenCeEntity fenCe)
        {
            this.fenCe = fenCe;
        }

        public int getFullScore()
        {
            return fullScore;
        }

        public void setFullScore(int fullScore)
        {
            this.fullScore = fullScore;
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

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public NianJEntity getNianJ()
        {
            return nianJ;
        }

        public void setNianJ(NianJEntity nianJ)
        {
            this.nianJ = nianJ;
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

        public ShiJNFEntity getShiJNF()
        {
            return shiJNF;
        }

        public void setShiJNF(ShiJNFEntity shiJNF)
        {
            this.shiJNF = shiJNF;
        }

        public String getType()
        {
            return type;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public XueDuanEntity getXueDuan()
        {
            return xueDuan;
        }

        public void setXueDuan(XueDuanEntity xueDuan)
        {
            this.xueDuan = xueDuan;
        }

        public static class BanBenEntity
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

        public static class FenCeEntity
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

        public static class KeMEntity
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

        public static class NianJEntity
        {
            private String id;
            private String name;
            private int orderId;
            private String rcsField;
            private String rcsKey;
            private String rcsValue;
            /**
             * id : 402881ed50943a9801509459f81d0229
             * name : 初中
             * orderId : 2
             * rcsField : name
             * rcsKey : 402881ed50943a9801509459f81d0229
             * rcsValue : 初中
             */

            private XueDEntity xueD;

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

            public XueDEntity getXueD()
            {
                return xueD;
            }

            public void setXueD(XueDEntity xueD)
            {
                this.xueD = xueD;
            }

            public static class XueDEntity
            {
                private String id;
                private String name;
                private String orderId;
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

                public String getOrderId()
                {
                    return orderId;
                }

                public void setOrderId(String orderId)
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

        public static class ShiJNFEntity
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

        public static class XueDuanEntity
        {
            private String id;
            private String name;
            private String orderId;
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

            public String getOrderId()
            {
                return orderId;
            }

            public void setOrderId(String orderId)
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
}



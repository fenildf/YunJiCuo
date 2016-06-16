package com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/28 09:42
 * <p/>
 * 功能描述:点击习题详情进去后返回的习题列表实体类
 */
public class RtnBuZXiTList
{
    private int page;
    private int totalCount;
    private int pageSize;
    private String orderCondition;
    private String searchCondition;

    private List<DataEntity> data;

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getOrderCondition()
    {
        return orderCondition;
    }

    public void setOrderCondition(String orderCondition)
    {
        this.orderCondition = orderCondition;
    }

    public String getSearchCondition()
    {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition)
    {
        this.searchCondition = searchCondition;
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


        private HomeworkEntity homework;


        private QuestionEntity question;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public HomeworkEntity getHomework()
        {
            return homework;
        }

        public void setHomework(HomeworkEntity homework)
        {
            this.homework = homework;
        }

        public QuestionEntity getQuestion()
        {
            return question;
        }

        public void setQuestion(QuestionEntity question)
        {
            this.question = question;
        }

        public static class HomeworkEntity
        {
            private String kaiShShJ;
            private String id;

            private KeMEntity keM;
            private String remark;
            private String banJName;
            private String jieShShJ;


            private UserEntity user;
            private String banJID;

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

            public String getBanJName()
            {
                return banJName;
            }

            public void setBanJName(String banJName)
            {
                this.banJName = banJName;
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

            public String getBanJID()
            {
                return banJID;
            }

            public void setBanJID(String banJID)
            {
                this.banJID = banJID;
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

            public static class UserEntity
            {
                private String id;
                private String createTime;
                private String name;
                private String state;
                private String mobile;
                private String loginName;

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

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getState()
                {
                    return state;
                }

                public void setState(String state)
                {
                    this.state = state;
                }

                public String getMobile()
                {
                    return mobile;
                }

                public void setMobile(String mobile)
                {
                    this.mobile = mobile;
                }

                public String getLoginName()
                {
                    return loginName;
                }

                public void setLoginName(String loginName)
                {
                    this.loginName = loginName;
                }
            }
        }

        public static class QuestionEntity
        {
            private String chuangJR;
            private String chuangJShJ;
            private String daA;
            private String defineTitle;
            private String fenX;
            private String fengZ;
            private String id;


            private LeiXEntity leiX;
            private String num;
            private int orderId;
            private String page;


            private PaperEntity paper;
            private String rcsField;
            private String rcsKey;
            private String rcsValue;
            private String tiM;


            private ZhiShiDianEntity zhiShiDian;
            private String zklt;

            public String getChuangJR()
            {
                return chuangJR;
            }

            public void setChuangJR(String chuangJR)
            {
                this.chuangJR = chuangJR;
            }

            public String getChuangJShJ()
            {
                return chuangJShJ;
            }

            public void setChuangJShJ(String chuangJShJ)
            {
                this.chuangJShJ = chuangJShJ;
            }

            public String getDaA()
            {
                return daA;
            }

            public void setDaA(String daA)
            {
                this.daA = daA;
            }

            public String getDefineTitle()
            {
                return defineTitle;
            }

            public void setDefineTitle(String defineTitle)
            {
                this.defineTitle = defineTitle;
            }

            public String getFenX()
            {
                return fenX;
            }

            public void setFenX(String fenX)
            {
                this.fenX = fenX;
            }

            public String getFengZ()
            {
                return fengZ;
            }

            public void setFengZ(String fengZ)
            {
                this.fengZ = fengZ;
            }

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public LeiXEntity getLeiX()
            {
                return leiX;
            }

            public void setLeiX(LeiXEntity leiX)
            {
                this.leiX = leiX;
            }

            public String getNum()
            {
                return num;
            }

            public void setNum(String num)
            {
                this.num = num;
            }

            public int getOrderId()
            {
                return orderId;
            }

            public void setOrderId(int orderId)
            {
                this.orderId = orderId;
            }

            public String getPage()
            {
                return page;
            }

            public void setPage(String page)
            {
                this.page = page;
            }

            public PaperEntity getPaper()
            {
                return paper;
            }

            public void setPaper(PaperEntity paper)
            {
                this.paper = paper;
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

            public String getTiM()
            {
                return tiM;
            }

            public void setTiM(String tiM)
            {
                this.tiM = tiM;
            }

            public ZhiShiDianEntity getZhiShiDian()
            {
                return zhiShiDian;
            }

            public void setZhiShiDian(ZhiShiDianEntity zhiShiDian)
            {
                this.zhiShiDian = zhiShiDian;
            }

            public String getZklt()
            {
                return zklt;
            }

            public void setZklt(String zklt)
            {
                this.zklt = zklt;
            }

            public static class LeiXEntity
            {
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                private int rowNum;

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

                public int getRowNum()
                {
                    return rowNum;
                }

                public void setRowNum(int rowNum)
                {
                    this.rowNum = rowNum;
                }
            }

            public static class PaperEntity
            {


                private BanBenEntity banBen;
                private String examRcsValue;

                private FenCeEntity fenCe;
                private int fullScore;
                private String id;

                private KeMEntity keM;
                private String name;
                private NianJEntity nianJ;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                private ShiJNFEntity shiJNF;
                private String type;
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

            public static class ZhiShiDianEntity
            {
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                /**
                 * danY : {"id":"e549102453838ab30153a21c5d0a3023","name":"基础过关","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"3年中考2年模拟数学初三null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e549102453838ab30153a21accd53020","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"3年中考2年模拟","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab30153a21accd53020","rcsValue":"3年中考2年模拟全一册数学初三北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e549102453838ab30153a21c5d0a3023","rcsValue":"基础过关"}
                 * id : e549102453838ab30153a21f37823027
                 * name : 函数
                 * orderId : 0
                 * rcsField : name
                 * rcsKey : e549102453838ab30153a21f37823027
                 * rcsValue : 函数
                 */

                private ZhangJEntity zhangJ;

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

                public ZhangJEntity getZhangJ()
                {
                    return zhangJ;
                }

                public void setZhangJ(ZhangJEntity zhangJ)
                {
                    this.zhangJ = zhangJ;
                }

                public static class ZhangJEntity
                {
                    private DanYEntity danY;
                    private String id;
                    private String name;
                    private int orderId;
                    private String rcsField;
                    private String rcsKey;
                    private String rcsValue;

                    public DanYEntity getDanY()
                    {
                        return danY;
                    }

                    public void setDanY(DanYEntity danY)
                    {
                        this.danY = danY;
                    }

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

                    public static class DanYEntity
                    {
                        private String id;
                        private String name;
                        private int orderId;
                        private PaperEntity paper;
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

                        public PaperEntity getPaper()
                        {
                            return paper;
                        }

                        public void setPaper(PaperEntity paper)
                        {
                            this.paper = paper;
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

                        public static class PaperEntity
                        {
                            /**
                             * id : 2c90813a5092715d015092788b9b0123
                             * name : 北师大
                             * orderId : 0
                             * rcsField : name
                             * rcsKey : 2c90813a5092715d015092788b9b0123
                             * rcsValue : 北师大
                             */

                            private BanBenEntity banBen;
                            private String examRcsValue;
                            /**
                             * id : 402881ed50942cdc0150942e12850041
                             * name : 全一册
                             * orderId : 0
                             * rcsField : name
                             * rcsKey : 402881ed50942cdc0150942e12850041
                             * rcsValue : 全一册
                             */

                            private FenCeEntity fenCe;
                            private int fullScore;
                            private String id;
                            /**
                             * id : 2c90813a5074c128015074cb6707000b
                             * name : 数学
                             * orderId : 1
                             * rcsField : name
                             * rcsKey : 2c90813a5074c128015074cb6707000b
                             * rcsValue : 数学
                             */

                            private KeMEntity keM;
                            private String name;
                            /**
                             * id : 402881ed50943a980150945c72780256
                             * name : 初三
                             * orderId : 9
                             * rcsField : name
                             * rcsKey : 402881ed50943a980150945c72780256
                             * rcsValue : 初三
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
                }
            }
        }
    }
}



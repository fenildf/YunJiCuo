package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/3 11:11
 * <p/>
 * 功能描述:YunJiCuo
 */
public class RtnChouTStatusList
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

        private HomeworkQuestionEntity homeworkQuestion;
        /**
         * id : e54910245143f90301514778082d088f
         * createTime : 2015-11-27 13:43:47
         * name : 武燕
         * state : 正常
         * mobile : 18234110525
         * loginName : 18234110525
         */

        private StudentEntity student;
        private boolean duiC;
        /**
         * id : 00000261
         * school : {"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
         * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
         * name : 51班
         * user : {"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}
         */

        private BanJEntity banJ;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public HomeworkQuestionEntity getHomeworkQuestion()
        {
            return homeworkQuestion;
        }

        public void setHomeworkQuestion(HomeworkQuestionEntity homeworkQuestion)
        {
            this.homeworkQuestion = homeworkQuestion;
        }

        public StudentEntity getStudent()
        {
            return student;
        }

        public void setStudent(StudentEntity student)
        {
            this.student = student;
        }

        public boolean isDuiC()
        {
            return duiC;
        }

        public void setDuiC(boolean duiC)
        {
            this.duiC = duiC;
        }

        public BanJEntity getBanJ()
        {
            return banJ;
        }

        public void setBanJ(BanJEntity banJ)
        {
            this.banJ = banJ;
        }

        public static class HomeworkQuestionEntity
        {
            private String id;
            /**
             * kaiShShJ : 20160601104300
             * id : e549102454f10512015509d8c1760152
             * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
             * remark : rafasdfasdf
             * banJName : 51班
             * jieShShJ : 20160602100000
             * user : {"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}
             * banJID : 00000261
             */

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
                /**
                 * id : 2c90813a5074c128015074cb6707000b
                 * name : 数学
                 * orderId : 1
                 * rcsField : name
                 * rcsKey : 2c90813a5074c128015074cb6707000b
                 * rcsValue : 数学
                 */

                private KeMEntity keM;
                private String remark;
                private String banJName;
                private String jieShShJ;
                /**
                 * id : e54910245143f903015146aa3ab6042c
                 * createTime : 2015-11-27 09:59:00
                 * name : 王军平
                 * state : 正常
                 * mobile : 13994228195
                 * loginName : 13994228195
                 */

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
                /**
                 * id : e5491024509c41c001509cdcc35c00e8
                 * name : 填空
                 * orderId : 2
                 * rcsField : name
                 * rcsKey : e5491024509c41c001509cdcc35c00e8
                 * rcsValue : 填空
                 * rowNum : 0
                 */

                private LeiXEntity leiX;
                private String num;
                private int orderId;
                private String page;
                /**
                 * examRcsValue : 2015山西省中考考前适应性训练试题数学初三模拟试卷
                 * fullScore : 120
                 * id : e549102453bab5700153bc46150100e6
                 * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
                 * name : 2015山西省中考考前适应性训练试题
                 * nianJ : {"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                 * orderId : 0
                 * rcsField : name
                 * rcsKey : e549102453bab5700153bc46150100e6
                 * rcsValue : 2015山西省中考考前适应性训练试题数学初三模拟试卷
                 * shiJLX : {"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"}
                 * shiJNF : {"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"}
                 * type : 1
                 * xueDuan : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
                 */

                private PaperEntity paper;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                private String tiM;
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
                    private String examRcsValue;
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
                     * id : 402881ed50943a9801509458d9b90210
                     * name : 模拟试卷
                     * orderId : 0
                     * rcsField : name
                     * rcsKey : 402881ed50943a9801509458d9b90210
                     * rcsValue : 模拟试卷
                     */

                    private ShiJLXEntity shiJLX;
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

                    public String getExamRcsValue()
                    {
                        return examRcsValue;
                    }

                    public void setExamRcsValue(String examRcsValue)
                    {
                        this.examRcsValue = examRcsValue;
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

                    public ShiJLXEntity getShiJLX()
                    {
                        return shiJLX;
                    }

                    public void setShiJLX(ShiJLXEntity shiJLX)
                    {
                        this.shiJLX = shiJLX;
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

                    public static class ShiJLXEntity
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

        public static class StudentEntity
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

        public static class BanJEntity
        {
            private String id;
            /**
             * clime : {"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"}
             * id : 402881ed50943a980150945ef5640297
             * name : 太原市志达中学
             * orderId : 0
             * rcsField : name
             * rcsKey : 402881ed50943a980150945ef5640297
             * rcsValue : 太原市志达中学
             */

            private SchoolEntity school;
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
             * id : e54910245143f903015146aa3ab6042c
             * createTime : 2015-11-27 09:59:00
             * name : 王军平
             * state : 正常
             * mobile : 13994228195
             * loginName : 13994228195
             */

            private UserEntity user;

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public SchoolEntity getSchool()
            {
                return school;
            }

            public void setSchool(SchoolEntity school)
            {
                this.school = school;
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

            public UserEntity getUser()
            {
                return user;
            }

            public void setUser(UserEntity user)
            {
                this.user = user;
            }

            public static class SchoolEntity
            {
                /**
                 * climeName : 太原
                 * id : 2
                 * parentClime : {"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"}
                 * rcsField : climeName
                 * rcsKey : 2
                 * rcsParentField : parentClime
                 * rcsParentKey : 1
                 * rcsValue : 太原
                 */

                private ClimeEntity clime;
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;

                public ClimeEntity getClime()
                {
                    return clime;
                }

                public void setClime(ClimeEntity clime)
                {
                    this.clime = clime;
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

                public static class ClimeEntity
                {
                    private String climeName;
                    private String id;
                    /**
                     * climeName : 忻州
                     * id : 1
                     * rcsField : climeName
                     * rcsKey : 1
                     * rcsParentField : parentClime
                     * rcsParentKey :
                     * rcsValue : 忻州
                     */

                    private ParentClimeEntity parentClime;
                    private String rcsField;
                    private String rcsKey;
                    private String rcsParentField;
                    private String rcsParentKey;
                    private String rcsValue;

                    public String getClimeName()
                    {
                        return climeName;
                    }

                    public void setClimeName(String climeName)
                    {
                        this.climeName = climeName;
                    }

                    public String getId()
                    {
                        return id;
                    }

                    public void setId(String id)
                    {
                        this.id = id;
                    }

                    public ParentClimeEntity getParentClime()
                    {
                        return parentClime;
                    }

                    public void setParentClime(ParentClimeEntity parentClime)
                    {
                        this.parentClime = parentClime;
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

                    public String getRcsParentField()
                    {
                        return rcsParentField;
                    }

                    public void setRcsParentField(String rcsParentField)
                    {
                        this.rcsParentField = rcsParentField;
                    }

                    public String getRcsParentKey()
                    {
                        return rcsParentKey;
                    }

                    public void setRcsParentKey(String rcsParentKey)
                    {
                        this.rcsParentKey = rcsParentKey;
                    }

                    public String getRcsValue()
                    {
                        return rcsValue;
                    }

                    public void setRcsValue(String rcsValue)
                    {
                        this.rcsValue = rcsValue;
                    }

                    public static class ParentClimeEntity
                    {
                        private String climeName;
                        private String id;
                        private String rcsField;
                        private String rcsKey;
                        private String rcsParentField;
                        private String rcsParentKey;
                        private String rcsValue;

                        public String getClimeName()
                        {
                            return climeName;
                        }

                        public void setClimeName(String climeName)
                        {
                            this.climeName = climeName;
                        }

                        public String getId()
                        {
                            return id;
                        }

                        public void setId(String id)
                        {
                            this.id = id;
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

                        public String getRcsParentField()
                        {
                            return rcsParentField;
                        }

                        public void setRcsParentField(String rcsParentField)
                        {
                            this.rcsParentField = rcsParentField;
                        }

                        public String getRcsParentKey()
                        {
                            return rcsParentKey;
                        }

                        public void setRcsParentKey(String rcsParentKey)
                        {
                            this.rcsParentKey = rcsParentKey;
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
    }
}



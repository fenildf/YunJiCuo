package com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/27 10:04
 * <p/>
 * 功能描述:返回分册的错题列表实体类  错题列表获取的返回实体类
 */
public class RtnFenCeCuoTList
{



    private String searchCondition;
    private int pageSize;
    private int page;
    private int totalCount;
    private String orderCondition;

    private List<DataEntity> data;

    public String getSearchCondition()
    {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition)
    {
        this.searchCondition = searchCondition;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

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

    public String getOrderCondition()
    {
        return orderCondition;
    }

    public void setOrderCondition(String orderCondition)
    {
        this.orderCondition = orderCondition;
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
        private String qNum;


        private PaperEntity paper;


        private QuestionEntity question;
        private int cwl;
        private String id;
        private String bjId;
        private String qId;
        private int qPage;
        private int stuCount;

        public String getQNum()
        {
            return qNum;
        }

        public void setQNum(String qNum)
        {
            this.qNum = qNum;
        }

        public PaperEntity getPaper()
        {
            return paper;
        }

        public void setPaper(PaperEntity paper)
        {
            this.paper = paper;
        }

        public QuestionEntity getQuestion()
        {
            return question;
        }

        public void setQuestion(QuestionEntity question)
        {
            this.question = question;
        }

        public int getCwl()
        {
            return cwl;
        }

        public void setCwl(int cwl)
        {
            this.cwl = cwl;
        }

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getBjId()
        {
            return bjId;
        }

        public void setBjId(String bjId)
        {
            this.bjId = bjId;
        }

        public String getQId()
        {
            return qId;
        }

        public void setQId(String qId)
        {
            this.qId = qId;
        }

        public int getQPage()
        {
            return qPage;
        }

        public void setQPage(int qPage)
        {
            this.qPage = qPage;
        }

        public int getStuCount()
        {
            return stuCount;
        }

        public void setStuCount(int stuCount)
        {
            this.stuCount = stuCount;
        }

        public static class PaperEntity
        {

            private BanBenEntity banBen;


            private ClimeEntity clime;
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

            private SchoolEntity school;

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

            public ClimeEntity getClime()
            {
                return clime;
            }

            public void setClime(ClimeEntity clime)
            {
                this.clime = clime;
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

            public SchoolEntity getSchool()
            {
                return school;
            }

            public void setSchool(SchoolEntity school)
            {
                this.school = school;
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

            public static class ClimeEntity
            {
                private String climeName;
                private String id;
                /**
                 * climeName : 山西
                 * id : e5491024509c41c00150a1a82dd2040f
                 * rcsField : climeName
                 * rcsKey : e5491024509c41c00150a1a82dd2040f
                 * rcsParentField : parentClime
                 * rcsParentKey :
                 * rcsValue : 山西
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

        public static class QuestionEntity
        {
            private String daA;
            private String defineTitle;
            private String fenX;
            private String fengZ;
            private String id;
            /**
             * id : 402881ed50943a980150945e4462027d
             * name : 解答
             * orderId : 3
             * rcsField : name
             * rcsKey : 402881ed50943a980150945e4462027d
             * rcsValue : 解答
             * rowNum : 2
             */

            private LeiXEntity leiX;
            private String num;
            private int orderId;
            private String page;
            /**
             * banBen : {"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"}
             * clime : {"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"}
             * examRcsValue : 黄冈100分闯关数学初三null
             * fenCe : {"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"}
             * fullScore : 0
             * id : e5491024509c41c00150a2c5e6d90541
             * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
             * name : 黄冈100分闯关
             * nianJ : {"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
             * orderId : 0
             * rcsField : name
             * rcsKey : e5491024509c41c00150a2c5e6d90541
             * rcsValue : 黄冈100分闯关上册数学初三北师大
             * school : {"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
             * shiJNF : {"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"}
             * type : 0
             * xueDuan : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
             */

            private PaperEntity paper;
            private String rcsField;
            private String rcsKey;
            private String rcsValue;
            private String tiM;
            /**
             * id : e549102450a8dfd40150a99343180267
             * name : 反比例函数的应用
             * orderId : 0
             * rcsField : name
             * rcsKey : e549102450a8dfd40150a99343180267
             * rcsValue : 反比例函数的应用
             * zhangJ : {"danY":{"id":"e5491024509c41c00150a7345dfb07af","name":"第六单元    反比例函数","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a7345dfb07af","rcsValue":"第六单元    反比例函数"},"id":"e5491024509c41c00150a73b7d660825","name":"反比例函数的应用","orderId":6,"rcsField":"name","rcsKey":"e5491024509c41c00150a73b7d660825","rcsValue":"反比例函数的应用"}
             */

            private ZhiShiDianEntity zhiShiDian;
            private String zklt;

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
                /**
                 * id : 2c90813a5092715d015092788b9b0123
                 * name : 北师大
                 * orderId : 0
                 * rcsField : name
                 * rcsKey : 2c90813a5092715d015092788b9b0123
                 * rcsValue : 北师大
                 */

                private BanBenEntity banBen;
                /**
                 * climeName : 太原
                 * id : e5491024509c41c00150a1a86ee80414
                 * parentClime : {"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"}
                 * rcsField : climeName
                 * rcsKey : e5491024509c41c00150a1a86ee80414
                 * rcsParentField : parentClime
                 * rcsParentKey : e5491024509c41c00150a1a82dd2040f
                 * rcsValue : 太原
                 */

                private ClimeEntity clime;
                private String examRcsValue;
                /**
                 * id : 402881ed50942cdc0150942de8d50035
                 * name : 上册
                 * orderId : 0
                 * rcsField : name
                 * rcsKey : 402881ed50942cdc0150942de8d50035
                 * rcsValue : 上册
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

                public ClimeEntity getClime()
                {
                    return clime;
                }

                public void setClime(ClimeEntity clime)
                {
                    this.clime = clime;
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

                public SchoolEntity getSchool()
                {
                    return school;
                }

                public void setSchool(SchoolEntity school)
                {
                    this.school = school;
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

                public static class ClimeEntity
                {
                    private String climeName;
                    private String id;
                    /**
                     * climeName : 山西
                     * id : e5491024509c41c00150a1a82dd2040f
                     * rcsField : climeName
                     * rcsKey : e5491024509c41c00150a1a82dd2040f
                     * rcsParentField : parentClime
                     * rcsParentKey :
                     * rcsValue : 山西
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
                 * danY : {"id":"e5491024509c41c00150a7345dfb07af","name":"第六单元    反比例函数","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a7345dfb07af","rcsValue":"第六单元    反比例函数"}
                 * id : e5491024509c41c00150a73b7d660825
                 * name : 反比例函数的应用
                 * orderId : 6
                 * rcsField : name
                 * rcsKey : e5491024509c41c00150a73b7d660825
                 * rcsValue : 反比例函数的应用
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
                    /**
                     * id : e5491024509c41c00150a7345dfb07af
                     * name : 第六单元    反比例函数
                     * orderId : 0
                     * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                     * rcsField : name
                     * rcsKey : e5491024509c41c00150a7345dfb07af
                     * rcsValue : 第六单元    反比例函数
                     */

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
                        /**
                         * banBen : {"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"}
                         * clime : {"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"}
                         * examRcsValue : 黄冈100分闯关数学初三null
                         * fenCe : {"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"}
                         * fullScore : 0
                         * id : e5491024509c41c00150a2c5e6d90541
                         * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
                         * name : 黄冈100分闯关
                         * nianJ : {"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                         * orderId : 0
                         * rcsField : name
                         * rcsKey : e5491024509c41c00150a2c5e6d90541
                         * rcsValue : 黄冈100分闯关上册数学初三北师大
                         * school : {"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
                         * shiJNF : {"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"}
                         * type : 0
                         * xueDuan : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
                         */

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
                            /**
                             * climeName : 太原
                             * id : e5491024509c41c00150a1a86ee80414
                             * parentClime : {"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"}
                             * rcsField : climeName
                             * rcsKey : e5491024509c41c00150a1a86ee80414
                             * rcsParentField : parentClime
                             * rcsParentKey : e5491024509c41c00150a1a82dd2040f
                             * rcsValue : 太原
                             */

                            private ClimeEntity clime;
                            private String examRcsValue;
                            /**
                             * id : 402881ed50942cdc0150942de8d50035
                             * name : 上册
                             * orderId : 0
                             * rcsField : name
                             * rcsKey : 402881ed50942cdc0150942de8d50035
                             * rcsValue : 上册
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

                            public ClimeEntity getClime()
                            {
                                return clime;
                            }

                            public void setClime(ClimeEntity clime)
                            {
                                this.clime = clime;
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

                            public SchoolEntity getSchool()
                            {
                                return school;
                            }

                            public void setSchool(SchoolEntity school)
                            {
                                this.school = school;
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

                            public static class ClimeEntity
                            {
                                private String climeName;
                                private String id;
                                /**
                                 * climeName : 山西
                                 * id : e5491024509c41c00150a1a82dd2040f
                                 * rcsField : climeName
                                 * rcsKey : e5491024509c41c00150a1a82dd2040f
                                 * rcsParentField : parentClime
                                 * rcsParentKey :
                                 * rcsValue : 山西
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



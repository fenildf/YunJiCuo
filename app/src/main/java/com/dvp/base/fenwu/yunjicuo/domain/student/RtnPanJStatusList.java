package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/1 13:35
 * <p/>
 * 功能描述:返回的判卷状态列表
 */
public class RtnPanJStatusList
{

    /**
     * id : e549102454f1051201550a0d99b80176
     * student : {"id":"e54910245143f90301514778082d088f","createTime":"2015-11-27 13:43:47","name":"武燕","state":"正常","mobile":"18234110525","loginName":"18234110525"}
     * yiPJ : 1
     * homework : {"kaiShShJ":"20160601104300","id":"e549102454f10512015509d8c1760152","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"remark":"rafasdfasdf","banJName":"51班","jieShShJ":"20160602100000","user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"banJID":"00000261"}
     * yiShJ : 0
     * banJ : {"id":"00000261","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"51班","user":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}}
     */

    private List<DataEntity> data;

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
        /**
         * id : e54910245143f90301514778082d088f
         * createTime : 2015-11-27 13:43:47
         * name : 武燕
         * state : 正常
         * mobile : 18234110525
         * loginName : 18234110525
         */

        private StudentEntity student;
        private int yiPJ;
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
        private int yiShJ;
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

        public StudentEntity getStudent()
        {
            return student;
        }

        public void setStudent(StudentEntity student)
        {
            this.student = student;
        }

        public int getYiPJ()
        {
            return yiPJ;
        }

        public void setYiPJ(int yiPJ)
        {
            this.yiPJ = yiPJ;
        }

        public HomeworkEntity getHomework()
        {
            return homework;
        }

        public void setHomework(HomeworkEntity homework)
        {
            this.homework = homework;
        }

        public int getYiShJ()
        {
            return yiShJ;
        }

        public void setYiShJ(int yiShJ)
        {
            this.yiShJ = yiShJ;
        }

        public BanJEntity getBanJ()
        {
            return banJ;
        }

        public void setBanJ(BanJEntity banJ)
        {
            this.banJ = banJ;
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



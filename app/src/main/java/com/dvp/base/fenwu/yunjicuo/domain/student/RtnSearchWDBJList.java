package com.dvp.base.fenwu.yunjicuo.domain.student;

/**
 * 作者：Administrator on 2016/5/31 22:12
 * <p/>
 * 功能描述:加入班级时候的搜索班级
 */
public class RtnSearchWDBJList
{
    private String id;

    private SchoolEntity school;

    private KeMEntity keM;
    private String name;

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



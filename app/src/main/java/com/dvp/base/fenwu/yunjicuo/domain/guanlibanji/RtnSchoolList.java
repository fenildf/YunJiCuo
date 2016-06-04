package com.dvp.base.fenwu.yunjicuo.domain.guanlibanji;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/23 18:09
 * <p/>
 * 功能描述:返回的学校列表数据
 */
public class RtnSchoolList
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


        private AgentEntity agent;


        private ClimeEntity clime;
        private String id;
        private String name;
        private int orderId;
        private String rcsField;
        private String rcsKey;
        private String rcsValue;

        public AgentEntity getAgent()
        {
            return agent;
        }

        public void setAgent(AgentEntity agent)
        {
            this.agent = agent;
        }

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

        public static class AgentEntity
        {
            private int age;
            private String createTime;


            private DeptEntity dept;
            private String deptID;
            private boolean detailRecord;


            private DictbooleanEntity dictboolean;
            private String entityDes;
            private String entityId;
            private String entityIdDes;
            private String id;
            private int isDelete;
            private String isDeleteState;
            private boolean isModifyPassword;
            private boolean isParent;
            private String loginName;
            private String name;
            private String nodeIcon;
            private String nodeId;
            private String nodeName;
            private String nodeType;
            private boolean open;
            private int orderCode;
            private boolean parentNode;
            private String password;
            private String rcsField;
            private String rcsKey;
            private String rcsValue;
            private String rtxSexCode;
            private String shortName;
            private int type;
            private String updateTime;

            public int getAge()
            {
                return age;
            }

            public void setAge(int age)
            {
                this.age = age;
            }

            public String getCreateTime()
            {
                return createTime;
            }

            public void setCreateTime(String createTime)
            {
                this.createTime = createTime;
            }

            public DeptEntity getDept()
            {
                return dept;
            }

            public void setDept(DeptEntity dept)
            {
                this.dept = dept;
            }

            public String getDeptID()
            {
                return deptID;
            }

            public void setDeptID(String deptID)
            {
                this.deptID = deptID;
            }

            public boolean isDetailRecord()
            {
                return detailRecord;
            }

            public void setDetailRecord(boolean detailRecord)
            {
                this.detailRecord = detailRecord;
            }

            public DictbooleanEntity getDictboolean()
            {
                return dictboolean;
            }

            public void setDictboolean(DictbooleanEntity dictboolean)
            {
                this.dictboolean = dictboolean;
            }

            public String getEntityDes()
            {
                return entityDes;
            }

            public void setEntityDes(String entityDes)
            {
                this.entityDes = entityDes;
            }

            public String getEntityId()
            {
                return entityId;
            }

            public void setEntityId(String entityId)
            {
                this.entityId = entityId;
            }

            public String getEntityIdDes()
            {
                return entityIdDes;
            }

            public void setEntityIdDes(String entityIdDes)
            {
                this.entityIdDes = entityIdDes;
            }

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public int getIsDelete()
            {
                return isDelete;
            }

            public void setIsDelete(int isDelete)
            {
                this.isDelete = isDelete;
            }

            public String getIsDeleteState()
            {
                return isDeleteState;
            }

            public void setIsDeleteState(String isDeleteState)
            {
                this.isDeleteState = isDeleteState;
            }

            public boolean isIsModifyPassword()
            {
                return isModifyPassword;
            }

            public void setIsModifyPassword(boolean isModifyPassword)
            {
                this.isModifyPassword = isModifyPassword;
            }

            public boolean isIsParent()
            {
                return isParent;
            }

            public void setIsParent(boolean isParent)
            {
                this.isParent = isParent;
            }

            public String getLoginName()
            {
                return loginName;
            }

            public void setLoginName(String loginName)
            {
                this.loginName = loginName;
            }

            public String getName()
            {
                return name;
            }

            public void setName(String name)
            {
                this.name = name;
            }

            public String getNodeIcon()
            {
                return nodeIcon;
            }

            public void setNodeIcon(String nodeIcon)
            {
                this.nodeIcon = nodeIcon;
            }

            public String getNodeId()
            {
                return nodeId;
            }

            public void setNodeId(String nodeId)
            {
                this.nodeId = nodeId;
            }

            public String getNodeName()
            {
                return nodeName;
            }

            public void setNodeName(String nodeName)
            {
                this.nodeName = nodeName;
            }

            public String getNodeType()
            {
                return nodeType;
            }

            public void setNodeType(String nodeType)
            {
                this.nodeType = nodeType;
            }

            public boolean isOpen()
            {
                return open;
            }

            public void setOpen(boolean open)
            {
                this.open = open;
            }

            public int getOrderCode()
            {
                return orderCode;
            }

            public void setOrderCode(int orderCode)
            {
                this.orderCode = orderCode;
            }

            public boolean isParentNode()
            {
                return parentNode;
            }

            public void setParentNode(boolean parentNode)
            {
                this.parentNode = parentNode;
            }

            public String getPassword()
            {
                return password;
            }

            public void setPassword(String password)
            {
                this.password = password;
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

            public String getRtxSexCode()
            {
                return rtxSexCode;
            }

            public void setRtxSexCode(String rtxSexCode)
            {
                this.rtxSexCode = rtxSexCode;
            }

            public String getShortName()
            {
                return shortName;
            }

            public void setShortName(String shortName)
            {
                this.shortName = shortName;
            }

            public int getType()
            {
                return type;
            }

            public void setType(int type)
            {
                this.type = type;
            }

            public String getUpdateTime()
            {
                return updateTime;
            }

            public void setUpdateTime(String updateTime)
            {
                this.updateTime = updateTime;
            }

            public static class DeptEntity
            {
                private int childDeptNum;
                private int childRoleNum;
                private int childUserNum;
                /**
                 * childDeptNum : 1
                 * childRoleNum : 1
                 * childUserNum : 2552
                 * id : 402881e836e72cd70136e72d96f50001
                 */

                private DeptStateEntity deptState;
                /**
                 * id : 0
                 * name : 机构
                 * rcsField : id
                 * rcsKey : 0
                 * rcsValue : 机构
                 */

                private DeptTypeEntity deptType;
                private String description;
                private boolean detailRecord;
                private String entityDes;
                private String entityId;
                private String entityIdDes;
                private String id;
                private int isDelete;
                private int levelByIds;
                private int levelCode;
                private String name;
                private String nodeId;
                private String nodeName;
                private String nodeType;
                private boolean open;
                private int orderCode;
                private boolean parentNode;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                private String type;

                public int getChildDeptNum()
                {
                    return childDeptNum;
                }

                public void setChildDeptNum(int childDeptNum)
                {
                    this.childDeptNum = childDeptNum;
                }

                public int getChildRoleNum()
                {
                    return childRoleNum;
                }

                public void setChildRoleNum(int childRoleNum)
                {
                    this.childRoleNum = childRoleNum;
                }

                public int getChildUserNum()
                {
                    return childUserNum;
                }

                public void setChildUserNum(int childUserNum)
                {
                    this.childUserNum = childUserNum;
                }

                public DeptStateEntity getDeptState()
                {
                    return deptState;
                }

                public void setDeptState(DeptStateEntity deptState)
                {
                    this.deptState = deptState;
                }

                public DeptTypeEntity getDeptType()
                {
                    return deptType;
                }

                public void setDeptType(DeptTypeEntity deptType)
                {
                    this.deptType = deptType;
                }

                public String getDescription()
                {
                    return description;
                }

                public void setDescription(String description)
                {
                    this.description = description;
                }

                public boolean isDetailRecord()
                {
                    return detailRecord;
                }

                public void setDetailRecord(boolean detailRecord)
                {
                    this.detailRecord = detailRecord;
                }

                public String getEntityDes()
                {
                    return entityDes;
                }

                public void setEntityDes(String entityDes)
                {
                    this.entityDes = entityDes;
                }

                public String getEntityId()
                {
                    return entityId;
                }

                public void setEntityId(String entityId)
                {
                    this.entityId = entityId;
                }

                public String getEntityIdDes()
                {
                    return entityIdDes;
                }

                public void setEntityIdDes(String entityIdDes)
                {
                    this.entityIdDes = entityIdDes;
                }

                public String getId()
                {
                    return id;
                }

                public void setId(String id)
                {
                    this.id = id;
                }

                public int getIsDelete()
                {
                    return isDelete;
                }

                public void setIsDelete(int isDelete)
                {
                    this.isDelete = isDelete;
                }

                public int getLevelByIds()
                {
                    return levelByIds;
                }

                public void setLevelByIds(int levelByIds)
                {
                    this.levelByIds = levelByIds;
                }

                public int getLevelCode()
                {
                    return levelCode;
                }

                public void setLevelCode(int levelCode)
                {
                    this.levelCode = levelCode;
                }

                public String getName()
                {
                    return name;
                }

                public void setName(String name)
                {
                    this.name = name;
                }

                public String getNodeId()
                {
                    return nodeId;
                }

                public void setNodeId(String nodeId)
                {
                    this.nodeId = nodeId;
                }

                public String getNodeName()
                {
                    return nodeName;
                }

                public void setNodeName(String nodeName)
                {
                    this.nodeName = nodeName;
                }

                public String getNodeType()
                {
                    return nodeType;
                }

                public void setNodeType(String nodeType)
                {
                    this.nodeType = nodeType;
                }

                public boolean isOpen()
                {
                    return open;
                }

                public void setOpen(boolean open)
                {
                    this.open = open;
                }

                public int getOrderCode()
                {
                    return orderCode;
                }

                public void setOrderCode(int orderCode)
                {
                    this.orderCode = orderCode;
                }

                public boolean isParentNode()
                {
                    return parentNode;
                }

                public void setParentNode(boolean parentNode)
                {
                    this.parentNode = parentNode;
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

                public String getType()
                {
                    return type;
                }

                public void setType(String type)
                {
                    this.type = type;
                }

                public static class DeptStateEntity
                {
                    private int childDeptNum;
                    private int childRoleNum;
                    private int childUserNum;
                    private String id;

                    public int getChildDeptNum()
                    {
                        return childDeptNum;
                    }

                    public void setChildDeptNum(int childDeptNum)
                    {
                        this.childDeptNum = childDeptNum;
                    }

                    public int getChildRoleNum()
                    {
                        return childRoleNum;
                    }

                    public void setChildRoleNum(int childRoleNum)
                    {
                        this.childRoleNum = childRoleNum;
                    }

                    public int getChildUserNum()
                    {
                        return childUserNum;
                    }

                    public void setChildUserNum(int childUserNum)
                    {
                        this.childUserNum = childUserNum;
                    }

                    public String getId()
                    {
                        return id;
                    }

                    public void setId(String id)
                    {
                        this.id = id;
                    }
                }

                public static class DeptTypeEntity
                {
                    private String id;
                    private String name;
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

            public static class DictbooleanEntity
            {
                private String id;
                private String name;
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
}



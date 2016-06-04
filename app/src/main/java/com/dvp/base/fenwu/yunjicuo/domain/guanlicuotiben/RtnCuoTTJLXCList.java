package com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/4 11:54
 * <p/>
 * 功能描述:错题统计练习册列表
 */
public class RtnCuoTTJLXCList
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
        private PaperEntity paper;

        private BanJEntity banJ;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public PaperEntity getPaper()
        {
            return paper;
        }

        public void setPaper(PaperEntity paper)
        {
            this.paper = paper;
        }

        public BanJEntity getBanJ()
        {
            return banJ;
        }

        public void setBanJ(BanJEntity banJ)
        {
            this.banJ = banJ;
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


            private SchoolEntity school;


            private ShiJLXEntity shiJLX;
            private String type;


            private UserEntity user;
            private String ziLiaoId;

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

            public SchoolEntity getSchool()
            {
                return school;
            }

            public void setSchool(SchoolEntity school)
            {
                this.school = school;
            }

            public ShiJLXEntity getShiJLX()
            {
                return shiJLX;
            }

            public void setShiJLX(ShiJLXEntity shiJLX)
            {
                this.shiJLX = shiJLX;
            }

            public String getType()
            {
                return type;
            }

            public void setType(String type)
            {
                this.type = type;
            }

            public UserEntity getUser()
            {
                return user;
            }

            public void setUser(UserEntity user)
            {
                this.user = user;
            }

            public String getZiLiaoId()
            {
                return ziLiaoId;
            }

            public void setZiLiaoId(String ziLiaoId)
            {
                this.ziLiaoId = ziLiaoId;
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

            public static class UserEntity
            {
                private int age;
                private String createTime;
                /**
                 * childDeptNum : 1
                 * childRoleNum : 0
                 * childUserNum : 2409
                 * deptState : {"childDeptNum":1,"childRoleNum":0,"childUserNum":2409,"id":"402881e836e72cd70136e72d96f50001"}
                 * deptType : {"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"}
                 * description : 根部门
                 * detailRecord : true
                 * entityDes : 部门
                 * entityId : 402881e836e72cd70136e72d96f50001
                 * entityIdDes : id
                 * id : 402881e836e72cd70136e72d96f50001
                 * isDelete : 0
                 * levelByIds : 0
                 * levelCode : 0
                 * name : 组织机构
                 * nodeId : 402881e836e72cd70136e72d96f50001
                 * nodeName : 组织机构
                 * nodeType : dept
                 * open : true
                 * orderCode : -2147483648
                 * parentNode : false
                 * rcsField : name
                 * rcsKey : 402881e836e72cd70136e72d96f50001
                 * rcsValue : 组织机构
                 * type : 0
                 */

                private DeptEntity dept;
                private String deptID;
                private boolean detailRecord;
                /**
                 * id : 0
                 * name : 有效
                 * rcsField : name
                 * rcsKey : 0
                 * rcsValue : 有效
                 */

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
                private String mobile;
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

                public String getMobile()
                {
                    return mobile;
                }

                public void setMobile(String mobile)
                {
                    this.mobile = mobile;
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
                     * childRoleNum : 0
                     * childUserNum : 2409
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



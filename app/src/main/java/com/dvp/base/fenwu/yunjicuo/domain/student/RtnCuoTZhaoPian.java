package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/6/7 16:29
 * <p>
 * 功能描述:错题照片返回结果
 */
public class RtnCuoTZhaoPian
{


    /**
     * cuoTZhP : [{"id":"e5491024551573af0155157ae90d000b","createTime":"2016-06-03 16:57:04","filePath":"/uploads/f8be6829-3447-48f6-8b8a-40cdc097a4a0.jpg","name":"wx上传","type":"1","size":0}]
     * id : e5491024551573af0155157aa9d2000a
     * homeworkQuestion : {"id":"e5491024551573af01551579bb1c0005","homework":{"kaiShShJ":"20160603165500","id":"e5491024551573af01551579bade0000","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"remark":"","banJName":"测试群","jieShShJ":"20160604000000","user":{"id":"e5491024512807630151280a0b530000","createTime":"2015-11-21 11:15:25","name":"测试测试","state":"正常","mobile":"13453102883","loginName":"13453102883"},"banJID":"00000001"},"question":{"daA":"<p>C<\/p>","danYuan":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"defineTitle":"","fenX":"","fengZ":"","id":"e5491024509c41c00150a33bc1fa05ea","leiX":{"id":"2c90813a5074c128015074c7f33a0005","name":"单选","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074c7f33a0005","rcsValue":"单选","rowNum":0},"num":"12","orderId":0,"page":"2","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e5491024509c41c00150a33bc1fa05ea","rcsValue":"e5491024509c41c00150a33bc1fa05ea","tiM":"<p>如图，在菱形ABCD中，∠BAD＝2∠B，E，F分别为BC，CD的中点，连接AE，AC，AF，则图中与△ABE全等的三角形(△ABE除外)有(&nbsp;&nbsp;&nbsp; &nbsp;)<\/p><p>A．1个&nbsp;&nbsp;B．2个&nbsp;&nbsp;C．3个&nbsp;&nbsp;D．4个<\/p><p><\/p>","zhangJie":{"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"},"zhiShiDian":{"id":"402881ed50943a9801509451e9c101b2","name":"菱形的性质","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509451e9c101b2","rcsValue":"菱形的性质","zhangJ":{"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"}},"zklt":""}}
     * student : {"id":"e54910245139d9a3015139ea33900026","createTime":"2015-11-24 22:33:48","name":"测试用户1","state":"正常","mobile":"15513640866","loginName":"15513640866"}
     * duiC : false
     * banJ : {"id":"00000001","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:56","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a3950035","entityIdDes":"id","id":"ff80808154329908015432a5a3950035","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_1","name":"代理_1","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a3950035","nodeName":"代理_1","nodeType":"user","open":false,"orderCode":2485,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a3950035","rcsValue":"代理_1","rtxSexCode":"0","shortName":"daili_1","type":2,"updateTime":"2016-04-20 15:49:56"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"2c90813a509266490150926bd86e00a3","name":"山西大学附属中学","orderId":0,"rcsField":"name","rcsKey":"2c90813a509266490150926bd86e00a3","rcsValue":"山西大学附属中学"},"keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"测试群","user":{"id":"e5491024512807630151280a0b530000","createTime":"2015-11-21 11:15:25","name":"测试测试","state":"正常","mobile":"13453102883","loginName":"13453102883"}}
     */

    private String id;
    /**
     * id : e5491024551573af01551579bb1c0005
     * homework : {"kaiShShJ":"20160603165500","id":"e5491024551573af01551579bade0000","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"remark":"","banJName":"测试群","jieShShJ":"20160604000000","user":{"id":"e5491024512807630151280a0b530000","createTime":"2015-11-21 11:15:25","name":"测试测试","state":"正常","mobile":"13453102883","loginName":"13453102883"},"banJID":"00000001"}
     * question : {"daA":"<p>C<\/p>","danYuan":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"defineTitle":"","fenX":"","fengZ":"","id":"e5491024509c41c00150a33bc1fa05ea","leiX":{"id":"2c90813a5074c128015074c7f33a0005","name":"单选","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074c7f33a0005","rcsValue":"单选","rowNum":0},"num":"12","orderId":0,"page":"2","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e5491024509c41c00150a33bc1fa05ea","rcsValue":"e5491024509c41c00150a33bc1fa05ea","tiM":"<p>如图，在菱形ABCD中，∠BAD＝2∠B，E，F分别为BC，CD的中点，连接AE，AC，AF，则图中与△ABE全等的三角形(△ABE除外)有(&nbsp;&nbsp;&nbsp; &nbsp;)<\/p><p>A．1个&nbsp;&nbsp;B．2个&nbsp;&nbsp;C．3个&nbsp;&nbsp;D．4个<\/p><p><\/p>","zhangJie":{"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"},"zhiShiDian":{"id":"402881ed50943a9801509451e9c101b2","name":"菱形的性质","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509451e9c101b2","rcsValue":"菱形的性质","zhangJ":{"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"}},"zklt":""}
     */

    private HomeworkQuestionEntity homeworkQuestion;
    /**
     * id : e54910245139d9a3015139ea33900026
     * createTime : 2015-11-24 22:33:48
     * name : 测试用户1
     * state : 正常
     * mobile : 15513640866
     * loginName : 15513640866
     */

    private StudentEntity student;
    private boolean duiC;
    /**
     * id : 00000001
     * school : {"agent":{"age":0,"createTime":"2016-04-20 15:49:56","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a3950035","entityIdDes":"id","id":"ff80808154329908015432a5a3950035","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_1","name":"代理_1","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a3950035","nodeName":"代理_1","nodeType":"user","open":false,"orderCode":2485,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a3950035","rcsValue":"代理_1","rtxSexCode":"0","shortName":"daili_1","type":2,"updateTime":"2016-04-20 15:49:56"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"2c90813a509266490150926bd86e00a3","name":"山西大学附属中学","orderId":0,"rcsField":"name","rcsKey":"2c90813a509266490150926bd86e00a3","rcsValue":"山西大学附属中学"}
     * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
     * name : 测试群
     * user : {"id":"e5491024512807630151280a0b530000","createTime":"2015-11-21 11:15:25","name":"测试测试","state":"正常","mobile":"13453102883","loginName":"13453102883"}
     */

    private BanJEntity banJ;
    /**
     * id : e5491024551573af0155157ae90d000b
     * createTime : 2016-06-03 16:57:04
     * filePath : /uploads/f8be6829-3447-48f6-8b8a-40cdc097a4a0.jpg
     * name : wx上传
     * type : 1
     * size : 0
     */

    private List<CuoTZhPEntity> cuoTZhP;

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

    public List<CuoTZhPEntity> getCuoTZhP()
    {
        return cuoTZhP;
    }

    public void setCuoTZhP(List<CuoTZhPEntity> cuoTZhP)
    {
        this.cuoTZhP = cuoTZhP;
    }

    public static class HomeworkQuestionEntity
    {
        private String id;
        /**
         * kaiShShJ : 20160603165500
         * id : e5491024551573af01551579bade0000
         * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
         * remark :
         * banJName : 测试群
         * jieShShJ : 20160604000000
         * user : {"id":"e5491024512807630151280a0b530000","createTime":"2015-11-21 11:15:25","name":"测试测试","state":"正常","mobile":"13453102883","loginName":"13453102883"}
         * banJID : 00000001
         */

        private HomeworkEntity homework;
        /**
         * daA : <p>C</p>
         * danYuan : {"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"}
         * defineTitle :
         * fenX :
         * fengZ :
         * id : e5491024509c41c00150a33bc1fa05ea
         * leiX : {"id":"2c90813a5074c128015074c7f33a0005","name":"单选","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074c7f33a0005","rcsValue":"单选","rowNum":0}
         * num : 12
         * orderId : 0
         * page : 2
         * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
         * rcsField : id
         * rcsKey : e5491024509c41c00150a33bc1fa05ea
         * rcsValue : e5491024509c41c00150a33bc1fa05ea
         * tiM : <p>如图，在菱形ABCD中，∠BAD＝2∠B，E，F分别为BC，CD的中点，连接AE，AC，AF，则图中与△ABE全等的三角形(△ABE除外)有(&nbsp;&nbsp;&nbsp; &nbsp;)</p><p>A．1个&nbsp;&nbsp;B．2个&nbsp;&nbsp;C．3个&nbsp;&nbsp;D．4个</p><p></p>
         * zhangJie : {"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"}
         * zhiShiDian : {"id":"402881ed50943a9801509451e9c101b2","name":"菱形的性质","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509451e9c101b2","rcsValue":"菱形的性质","zhangJ":{"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"}}
         * zklt :
         */

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
             * id : e5491024512807630151280a0b530000
             * createTime : 2015-11-21 11:15:25
             * name : 测试测试
             * state : 正常
             * mobile : 13453102883
             * loginName : 13453102883
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
            private String daA;
            /**
             * id : 402881ed50943a9801509446ae8100bd
             * name : 第一单元    特殊平行四边性
             * orderId : 0
             * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
             * rcsField : name
             * rcsKey : 402881ed50943a9801509446ae8100bd
             * rcsValue : 第一单元    特殊平行四边性
             */

            private DanYuanEntity danYuan;
            private String defineTitle;
            private String fenX;
            private String fengZ;
            private String id;
            /**
             * id : 2c90813a5074c128015074c7f33a0005
             * name : 单选
             * orderId : 1
             * rcsField : name
             * rcsKey : 2c90813a5074c128015074c7f33a0005
             * rcsValue : 单选
             * rowNum : 0
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
             * school : {"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
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
             * danY : {"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"}
             * id : 402881ed50943a98015094486c8a00e7
             * name : 菱形的性质与判定
             * orderId : 1
             * rcsField : name
             * rcsKey : 402881ed50943a98015094486c8a00e7
             * rcsValue : 菱形的性质与判定
             */

            private ZhangJieEntity zhangJie;
            /**
             * id : 402881ed50943a9801509451e9c101b2
             * name : 菱形的性质
             * orderId : 0
             * rcsField : name
             * rcsKey : 402881ed50943a9801509451e9c101b2
             * rcsValue : 菱形的性质
             * zhangJ : {"danY":{"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"},"id":"402881ed50943a98015094486c8a00e7","name":"菱形的性质与判定","orderId":1,"rcsField":"name","rcsKey":"402881ed50943a98015094486c8a00e7","rcsValue":"菱形的性质与判定"}
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

            public DanYuanEntity getDanYuan()
            {
                return danYuan;
            }

            public void setDanYuan(DanYuanEntity danYuan)
            {
                this.danYuan = danYuan;
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

            public ZhangJieEntity getZhangJie()
            {
                return zhangJie;
            }

            public void setZhangJie(ZhangJieEntity zhangJie)
            {
                this.zhangJie = zhangJie;
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

            public static class DanYuanEntity
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
                 * school : {"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
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
                     * agent : {"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"}
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
                         * age : 0
                         * createTime : 2016-04-20 15:49:57
                         * dept : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"}
                         * deptID : 402881e836e72cd70136e72d96f50001
                         * detailRecord : true
                         * dictboolean : {"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"}
                         * entityDes : 用户
                         * entityId : ff80808154329908015432a5a55e0038
                         * entityIdDes : id
                         * id : ff80808154329908015432a5a55e0038
                         * isDelete : 0
                         * isDeleteState : 有效
                         * isModifyPassword : false
                         * isParent : false
                         * loginName : agent_2
                         * name : 代理_2
                         * nodeIcon : /base/js/ztree3.5/img/ico_system_2.gif
                         * nodeId : ff80808154329908015432a5a55e0038
                         * nodeName : 代理_2
                         * nodeType : user
                         * open : false
                         * orderCode : 2486
                         * parentNode : false
                         * password : 666666
                         * rcsField : name
                         * rcsKey : ff80808154329908015432a5a55e0038
                         * rcsValue : 代理_2
                         * rtxSexCode : 0
                         * shortName : daili_2
                         * type : 2
                         * updateTime : 2016-04-20 15:49:57
                         */

                        private AgentEntity agent;
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
                            /**
                             * childDeptNum : 1
                             * childRoleNum : 1
                             * childUserNum : 2559
                             * deptState : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"}
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
                                 * childUserNum : 2559
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
                 * agent : {"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"}
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
                     * age : 0
                     * createTime : 2016-04-20 15:49:57
                     * dept : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"}
                     * deptID : 402881e836e72cd70136e72d96f50001
                     * detailRecord : true
                     * dictboolean : {"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"}
                     * entityDes : 用户
                     * entityId : ff80808154329908015432a5a55e0038
                     * entityIdDes : id
                     * id : ff80808154329908015432a5a55e0038
                     * isDelete : 0
                     * isDeleteState : 有效
                     * isModifyPassword : false
                     * isParent : false
                     * loginName : agent_2
                     * name : 代理_2
                     * nodeIcon : /base/js/ztree3.5/img/ico_system_2.gif
                     * nodeId : ff80808154329908015432a5a55e0038
                     * nodeName : 代理_2
                     * nodeType : user
                     * open : false
                     * orderCode : 2486
                     * parentNode : false
                     * password : 666666
                     * rcsField : name
                     * rcsKey : ff80808154329908015432a5a55e0038
                     * rcsValue : 代理_2
                     * rtxSexCode : 0
                     * shortName : daili_2
                     * type : 2
                     * updateTime : 2016-04-20 15:49:57
                     */

                    private AgentEntity agent;
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
                        /**
                         * childDeptNum : 1
                         * childRoleNum : 1
                         * childUserNum : 2559
                         * deptState : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"}
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
                             * childUserNum : 2559
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

            public static class ZhangJieEntity
            {
                /**
                 * id : 402881ed50943a9801509446ae8100bd
                 * name : 第一单元    特殊平行四边性
                 * orderId : 0
                 * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                 * rcsField : name
                 * rcsKey : 402881ed50943a9801509446ae8100bd
                 * rcsValue : 第一单元    特殊平行四边性
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
                     * school : {"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
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
                         * agent : {"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"}
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
                             * age : 0
                             * createTime : 2016-04-20 15:49:57
                             * dept : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"}
                             * deptID : 402881e836e72cd70136e72d96f50001
                             * detailRecord : true
                             * dictboolean : {"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"}
                             * entityDes : 用户
                             * entityId : ff80808154329908015432a5a55e0038
                             * entityIdDes : id
                             * id : ff80808154329908015432a5a55e0038
                             * isDelete : 0
                             * isDeleteState : 有效
                             * isModifyPassword : false
                             * isParent : false
                             * loginName : agent_2
                             * name : 代理_2
                             * nodeIcon : /base/js/ztree3.5/img/ico_system_2.gif
                             * nodeId : ff80808154329908015432a5a55e0038
                             * nodeName : 代理_2
                             * nodeType : user
                             * open : false
                             * orderCode : 2486
                             * parentNode : false
                             * password : 666666
                             * rcsField : name
                             * rcsKey : ff80808154329908015432a5a55e0038
                             * rcsValue : 代理_2
                             * rtxSexCode : 0
                             * shortName : daili_2
                             * type : 2
                             * updateTime : 2016-04-20 15:49:57
                             */

                            private AgentEntity agent;
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
                                /**
                                 * childDeptNum : 1
                                 * childRoleNum : 1
                                 * childUserNum : 2559
                                 * deptState : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"}
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
                                     * childUserNum : 2559
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

            public static class ZhiShiDianEntity
            {
                private String id;
                private String name;
                private int orderId;
                private String rcsField;
                private String rcsKey;
                private String rcsValue;
                /**
                 * danY : {"id":"402881ed50943a9801509446ae8100bd","name":"第一单元    特殊平行四边性","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"402881ed50943a9801509446ae8100bd","rcsValue":"第一单元    特殊平行四边性"}
                 * id : 402881ed50943a98015094486c8a00e7
                 * name : 菱形的性质与判定
                 * orderId : 1
                 * rcsField : name
                 * rcsKey : 402881ed50943a98015094486c8a00e7
                 * rcsValue : 菱形的性质与判定
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
                     * id : 402881ed50943a9801509446ae8100bd
                     * name : 第一单元    特殊平行四边性
                     * orderId : 0
                     * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                     * rcsField : name
                     * rcsKey : 402881ed50943a9801509446ae8100bd
                     * rcsValue : 第一单元    特殊平行四边性
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
                         * school : {"agent":{"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"},"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"}
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
                             * agent : {"age":0,"createTime":"2016-04-20 15:49:57","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a55e0038","entityIdDes":"id","id":"ff80808154329908015432a5a55e0038","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_2","name":"代理_2","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a55e0038","nodeName":"代理_2","nodeType":"user","open":false,"orderCode":2486,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a55e0038","rcsValue":"代理_2","rtxSexCode":"0","shortName":"daili_2","type":2,"updateTime":"2016-04-20 15:49:57"}
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
                                 * age : 0
                                 * createTime : 2016-04-20 15:49:57
                                 * dept : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"}
                                 * deptID : 402881e836e72cd70136e72d96f50001
                                 * detailRecord : true
                                 * dictboolean : {"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"}
                                 * entityDes : 用户
                                 * entityId : ff80808154329908015432a5a55e0038
                                 * entityIdDes : id
                                 * id : ff80808154329908015432a5a55e0038
                                 * isDelete : 0
                                 * isDeleteState : 有效
                                 * isModifyPassword : false
                                 * isParent : false
                                 * loginName : agent_2
                                 * name : 代理_2
                                 * nodeIcon : /base/js/ztree3.5/img/ico_system_2.gif
                                 * nodeId : ff80808154329908015432a5a55e0038
                                 * nodeName : 代理_2
                                 * nodeType : user
                                 * open : false
                                 * orderCode : 2486
                                 * parentNode : false
                                 * password : 666666
                                 * rcsField : name
                                 * rcsKey : ff80808154329908015432a5a55e0038
                                 * rcsValue : 代理_2
                                 * rtxSexCode : 0
                                 * shortName : daili_2
                                 * type : 2
                                 * updateTime : 2016-04-20 15:49:57
                                 */

                                private AgentEntity agent;
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
                                    /**
                                     * childDeptNum : 1
                                     * childRoleNum : 1
                                     * childUserNum : 2559
                                     * deptState : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"}
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
                                         * childUserNum : 2559
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
         * agent : {"age":0,"createTime":"2016-04-20 15:49:56","dept":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"},"deptID":"402881e836e72cd70136e72d96f50001","detailRecord":true,"dictboolean":{"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"},"entityDes":"用户","entityId":"ff80808154329908015432a5a3950035","entityIdDes":"id","id":"ff80808154329908015432a5a3950035","isDelete":0,"isDeleteState":"有效","isModifyPassword":false,"isParent":false,"loginName":"agent_1","name":"代理_1","nodeIcon":"/base/js/ztree3.5/img/ico_system_2.gif","nodeId":"ff80808154329908015432a5a3950035","nodeName":"代理_1","nodeType":"user","open":false,"orderCode":2485,"parentNode":false,"password":"666666","rcsField":"name","rcsKey":"ff80808154329908015432a5a3950035","rcsValue":"代理_1","rtxSexCode":"0","shortName":"daili_1","type":2,"updateTime":"2016-04-20 15:49:56"}
         * clime : {"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"}
         * id : 2c90813a509266490150926bd86e00a3
         * name : 山西大学附属中学
         * orderId : 0
         * rcsField : name
         * rcsKey : 2c90813a509266490150926bd86e00a3
         * rcsValue : 山西大学附属中学
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
         * id : e5491024512807630151280a0b530000
         * createTime : 2015-11-21 11:15:25
         * name : 测试测试
         * state : 正常
         * mobile : 13453102883
         * loginName : 13453102883
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
             * age : 0
             * createTime : 2016-04-20 15:49:56
             * dept : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"deptState":{"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"},"deptType":{"id":"0","name":"机构","rcsField":"id","rcsKey":"0","rcsValue":"机构"},"description":"根部门","detailRecord":true,"entityDes":"部门","entityId":"402881e836e72cd70136e72d96f50001","entityIdDes":"id","id":"402881e836e72cd70136e72d96f50001","isDelete":0,"levelByIds":0,"levelCode":0,"name":"组织机构","nodeId":"402881e836e72cd70136e72d96f50001","nodeName":"组织机构","nodeType":"dept","open":true,"orderCode":-2147483648,"parentNode":false,"rcsField":"name","rcsKey":"402881e836e72cd70136e72d96f50001","rcsValue":"组织机构","type":"0"}
             * deptID : 402881e836e72cd70136e72d96f50001
             * detailRecord : true
             * dictboolean : {"id":"0","name":"有效","rcsField":"name","rcsKey":"0","rcsValue":"有效"}
             * entityDes : 用户
             * entityId : ff80808154329908015432a5a3950035
             * entityIdDes : id
             * id : ff80808154329908015432a5a3950035
             * isDelete : 0
             * isDeleteState : 有效
             * isModifyPassword : false
             * isParent : false
             * loginName : agent_1
             * name : 代理_1
             * nodeIcon : /base/js/ztree3.5/img/ico_system_2.gif
             * nodeId : ff80808154329908015432a5a3950035
             * nodeName : 代理_1
             * nodeType : user
             * open : false
             * orderCode : 2485
             * parentNode : false
             * password : 666666
             * rcsField : name
             * rcsKey : ff80808154329908015432a5a3950035
             * rcsValue : 代理_1
             * rtxSexCode : 0
             * shortName : daili_1
             * type : 2
             * updateTime : 2016-04-20 15:49:56
             */

            private AgentEntity agent;
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
                /**
                 * childDeptNum : 1
                 * childRoleNum : 1
                 * childUserNum : 2559
                 * deptState : {"childDeptNum":1,"childRoleNum":1,"childUserNum":2559,"id":"402881e836e72cd70136e72d96f50001"}
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
                     * childUserNum : 2559
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

    public static class CuoTZhPEntity
    {
        private String id;
        private String createTime;
        private String filePath;
        private String name;
        private String type;
        private int size;

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

        public String getFilePath()
        {
            return filePath;
        }

        public void setFilePath(String filePath)
        {
            this.filePath = filePath;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getType()
        {
            return type;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public int getSize()
        {
            return size;
        }

        public void setSize(int size)
        {
            this.size = size;
        }
    }
}



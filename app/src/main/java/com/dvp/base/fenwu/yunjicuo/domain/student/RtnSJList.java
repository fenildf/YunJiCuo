package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/28 11:38
 * <p/>
 * 功能描述:可选的书架练习册
 */
public class RtnSJList
{

    /**
     * page : 1
     * totalCount : 64
     * pageSize : 9999
     * orderCondition :  order by orderId, name
     * searchCondition :  where user.id is null
     * data : [{"examRcsValue":"2011年山西省高中阶段教育学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102451bf7bb10151c32b9c50014f","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2011年山西省高中阶段教育学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c32b9c50014f","rcsValue":"2011年山西省高中阶段教育学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"e549102451bf7bb10151c32a1186014b","name":"2010-2011","orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c32a1186014b","rcsValue":"2010-2011"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2012年山西省高中阶段教育学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102451bf7bb10151c32b529e014e","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2012年山西省高中阶段教育学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c32b529e014e","rcsValue":"2012年山西省高中阶段教育学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"e549102451bf7bb10151c329caf1014a","name":"2011-2012","orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c329caf1014a","rcsValue":"2011-2012"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2013年山西省高中阶段教育学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102451bf7bb10151c32ae13b014d","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2013年山西省高中阶段教育学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c32ae13b014d","rcsValue":"2013年山西省高中阶段教育学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"e549102451bf7bb10151c3299c830149","name":"2012-2013","orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c3299c830149","rcsValue":"2012-2013"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2014年山西省高中阶段教育学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102451bf7bb10151c328450a0148","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2014年山西省高中阶段教育学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c328450a0148","rcsValue":"2014年山西省高中阶段教育学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d712920080","name":"2013-2014","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074d712920080","rcsValue":"2013-2014"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015山西中考模拟百校联考试卷（三）数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4a2a2c00e8","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015山西中考模拟百校联考试卷（三）","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4a2a2c00e8","rcsValue":"2015山西中考模拟百校联考试卷（三）数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015山西省中考考前适应性训练试题数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc46150100e6","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015山西省中考考前适应性训练试题","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc46150100e6","rcsValue":"2015山西省中考考前适应性训练试题数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年上海市初中毕业统一学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397c3be881e55","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年上海市初中毕业统一学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397c3be881e55","rcsValue":"2015年上海市初中毕业统一学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年乌鲁木齐市初中毕业学业水平测试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcc33fab01ed","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年乌鲁木齐市初中毕业学业水平测试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcc33fab01ed","rcsValue":"2015年乌鲁木齐市初中毕业学业水平测试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年兰州市初中毕业学生学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e5c162b2b86","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年兰州市初中毕业学生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e5c162b2b86","rcsValue":"2015年兰州市初中毕业学生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年内蒙古包头市初中升学考试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcc1b85001eb","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年内蒙古包头市初中升学考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcc1b85001eb","rcsValue":"2015年内蒙古包头市初中升学考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年北京市高级中等学校招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539174cdaa10f7","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年北京市高级中等学校招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539174cdaa10f7","rcsValue":"2015年北京市高级中等学校招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a508d47c401508d4f44db002f","name":"2014-2015","orderId":2,"rcsField":"name","rcsKey":"2c90813a508d47c401508d4f44db002f","rcsValue":"2014-2015"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年南京市初中毕业学生学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e5e0e902b8c","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年南京市初中毕业学生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e5e0e902b8c","rcsValue":"2015年南京市初中毕业学生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年南宁市初中毕业升学考试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcc029ef01ea","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年南宁市初中毕业升学考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcc029ef01ea","rcsValue":"2015年南宁市初中毕业升学考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年吉林省初中毕业生学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397f2747a1e96","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年吉林省初中毕业生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397f2747a1e96","rcsValue":"2015年吉林省初中毕业生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年呼和浩特市中考试卷数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e5b37152b81","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年呼和浩特市中考试卷","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e5b37152b81","rcsValue":"2015年呼和浩特市中考试卷数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年哈尔滨市初中升学考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e5f77d42b95","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年哈尔滨市初中升学考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e5f77d42b95","rcsValue":"2015年哈尔滨市初中升学考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年天津市初中毕业生学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab30153977d1e831e03","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年天津市初中毕业生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab30153977d1e831e03","rcsValue":"2015年天津市初中毕业生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年太原市初中毕业班综合测试（一）数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4d16f300e9","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年太原市初中毕业班综合测试（一）","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4d16f300e9","rcsValue":"2015年太原市初中毕业班综合测试（一）数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年太原市初中毕业班综合测试（三）数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4dffad00eb","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年太原市初中毕业班综合测试（三）","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4dffad00eb","rcsValue":"2015年太原市初中毕业班综合测试（三）数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年太原市初中毕业班综合测试（二）数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4d77d000ea","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年太原市初中毕业班综合测试（二）","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4d77d000ea","rcsValue":"2015年太原市初中毕业班综合测试（二）数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年宁夏回族自治区初中毕业暨高中阶段招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e58d7e82b79","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年宁夏回族自治区初中毕业暨高中阶段招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e58d7e82b79","rcsValue":"2015年宁夏回族自治区初中毕业暨高中阶段招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年安徽省初中毕业学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397ed42f31e90","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年安徽省初中毕业学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397ed42f31e90","rcsValue":"2015年安徽省初中毕业学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年山西省中考摸底性试题数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc477afa00e7","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年山西省中考摸底性试题","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc477afa00e7","rcsValue":"2015年山西省中考摸底性试题数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年山西省临汾市中考模拟试卷数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4f8fe300ed","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年山西省临汾市中考模拟试卷","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4f8fe300ed","rcsValue":"2015年山西省临汾市中考模拟试卷数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年山西省大同市中考模拟试卷数学初三模拟试卷","fullScore":120,"id":"e549102453bab5700153bc4f090f00ec","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年山西省大同市中考模拟试卷","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bc4f090f00ec","rcsValue":"2015年山西省大同市中考模拟试卷数学初三模拟试卷","shiJLX":{"id":"402881ed50943a9801509458d9b90210","name":"模拟试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a9801509458d9b90210","rcsValue":"模拟试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年山西省高中阶段教育学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102450abda6a0150cc3b60c70955","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年山西省高中阶段教育学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102450abda6a0150cc3b60c70955","rcsValue":"2015年山西省高中阶段教育学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a508d47c401508d4f44db002f","name":"2014-2015","orderId":2,"rcsField":"name","rcsKey":"2c90813a508d47c401508d4f44db002f","rcsValue":"2014-2015"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年山西省高中阶段教育学校招生统一考试11数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e647e352ba3","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年山西省高中阶段教育学校招生统一考试11","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e647e352ba3","rcsValue":"2015年山西省高中阶段教育学校招生统一考试11数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年广东省初中毕业生学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397eea2e01e92","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年广东省初中毕业生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397eea2e01e92","rcsValue":"2015年广东省初中毕业生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年成都市高中阶段教育学校统一招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e60f1072b99","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年成都市高中阶段教育学校统一招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e60f1072b99","rcsValue":"2015年成都市高中阶段教育学校统一招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年杭州市各类高中招生文化考试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcbe24c901e7","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年杭州市各类高中招生文化考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcbe24c901e7","rcsValue":"2015年杭州市各类高中招生文化考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年武汉市初中毕业学生学业考试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcbf02b501e8","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年武汉市初中毕业学生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcbf02b501e8","rcsValue":"2015年武汉市初中毕业学生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年江西省中等学校招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e578a882b75","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年江西省中等学校招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e578a882b75","rcsValue":"2015年江西省中等学校招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年沈阳市中等学校招生统一考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e5d0d7b2b8b","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年沈阳市中等学校招生统一考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e5d0d7b2b8b","rcsValue":"2015年沈阳市中等学校招生统一考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年河北省初中毕业升学文化课考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397f1395a1e94","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年河北省初中毕业升学文化课考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397f1395a1e94","rcsValue":"2015年河北省初中毕业升学文化课考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年福州市初中毕业会考，高级中等学校招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e623ef32b9d","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年福州市初中毕业会考，高级中等学校招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e623ef32b9d","rcsValue":"2015年福州市初中毕业会考，高级中等学校招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年贵阳市初中毕业生学业考试数学初三中考真题","fullScore":120,"id":"e549102453bab5700153bcc41b1701ef","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年贵阳市初中毕业生学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453bab5700153bcc41b1701ef","rcsValue":"2015年贵阳市初中毕业生学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年重庆市初中毕业暨高中招生考试（A卷）数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397eb11bb1e8f","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年重庆市初中毕业暨高中招生考试（A卷）","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397eb11bb1e8f","rcsValue":"2015年重庆市初中毕业暨高中招生考试（A卷）数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年长沙市初中毕业学业水平考试数学初三中考真题","fullScore":120,"id":"e549102453838ab301539e59bc8b2b7e","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年长沙市初中毕业学业水平考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab301539e59bc8b2b7e","rcsValue":"2015年长沙市初中毕业学业水平考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015年陕西省初中毕业学业考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397f4757a1e99","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015年陕西省初中毕业学业考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397f4757a1e99","rcsValue":"2015年陕西省初中毕业学业考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"2015河南省普通高中招生考试数学初三中考真题","fullScore":120,"id":"e549102453838ab3015397efb9801e93","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"2015河南省普通高中招生考试","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab3015397efb9801e93","rcsValue":"2015河南省普通高中招生考试数学初三中考真题","shiJLX":{"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"3年中考2年模拟数学初三null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e549102453838ab30153a21accd53020","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"3年中考2年模拟","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453838ab30153a21accd53020","rcsValue":"3年中考2年模拟全一册数学初三北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"伴你学数学数学初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e5491024536a035f01537fb7c37024e8","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"伴你学数学","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024536a035f01537fb7c37024e8","rcsValue":"伴你学数学下册数学初二北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"全品作业本化学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024510f8f8601511d4bdd7a0324","keM":{"id":"e5491024509498a501509945498301aa","name":"化学","orderId":3,"rcsField":"name","rcsKey":"e5491024509498a501509945498301aa","rcsValue":"化学"},"name":"全品作业本","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024510f8f8601511d4bdd7a0324","rcsValue":"全品作业本上册化学初三人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"全品作业本化学初三null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e54910245165943401516b9e58340159","keM":{"id":"e5491024509498a501509945498301aa","name":"化学","orderId":3,"rcsField":"name","rcsKey":"e5491024509498a501509945498301aa","rcsValue":"化学"},"name":"全品作业本","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e54910245165943401516b9e58340159","rcsValue":"全品作业本下册化学初三人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"全品作业本数学初一null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e5491024525799110153271446bf1dbf","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全品作业本","nianJ":{"id":"2c90813a5092715d01509277991e00ef","name":"初一","orderId":7,"rcsField":"name","rcsKey":"2c90813a5092715d01509277991e00ef","rcsValue":"初一","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024525799110153271446bf1dbf","rcsValue":"全品作业本下册数学初一北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"全品作业本数学初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e5491024536a035f01537f9f41642443","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全品作业本","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024536a035f01537f9f41642443","rcsValue":"全品作业本下册数学初二北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"全品学练考数学初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102451acc3ca0151af355e08017d","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全品学练考","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451acc3ca0151af355e08017d","rcsValue":"全品学练考下册数学初二北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"全品学练考数学必修4数学高一null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e5491024536a035f015378329f9016ab","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全品学练考数学必修4","nianJ":{"id":"402881ed50943a980150945b0c0b0247","name":"高一","orderId":10,"rcsField":"name","rcsKey":"402881ed50943a980150945b0c0b0247","rcsValue":"高一","xueD":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024536a035f015378329f9016ab","rcsValue":"全品学练考数学必修4全一册数学高一人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"全效学习数学初三null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102450df8c700150f3fea35d175d","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全效学习","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102450df8c700150f3fea35d175d","rcsValue":"全效学习下册数学初三北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"全效学习物理初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e54910245340e3a201534ed72f78048a","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"全效学习","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e54910245340e3a201534ed72f78048a","rcsValue":"全效学习下册物理初二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"全效学习 中考学练测课时作业本数学初三null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e549102451f4f388015215c1e84d1513","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"全效学习 中考学练测课时作业本","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451f4f388015215c1e84d1513","rcsValue":"全效学习 中考学练测课时作业本全一册数学初三北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"同步解析与测评物理初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102453c6cb870153e648c821252d","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"同步解析与测评","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453c6cb870153e648c821252d","rcsValue":"同步解析与测评下册物理初二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"太原小店区三中初二年级三月数学学科知识竞赛试题数学初二月考试卷","fullScore":100,"id":"e549102453c6cb870153cc16586a083c","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"太原小店区三中初二年级三月数学学科知识竞赛试题","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453c6cb870153cc16586a083c","rcsValue":"太原小店区三中初二年级三月数学学科知识竞赛试题数学初二月考试卷","shiJLX":{"id":"402881ed50943a98015094588ede020a","name":"月考试卷","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a98015094588ede020a","rcsValue":"月考试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"太原市2015-2016学年第一学期七年级期末考试数学初一期末试卷","fullScore":100,"id":"e549102452579911015261d7b631025f","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"太原市2015-2016学年第一学期七年级期末考试","nianJ":{"id":"2c90813a5092715d01509277991e00ef","name":"初一","orderId":7,"rcsField":"name","rcsKey":"2c90813a5092715d01509277991e00ef","rcsValue":"初一","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102452579911015261d7b631025f","rcsValue":"太原市2015-2016学年第一学期七年级期末考试数学初一期末试卷","shiJLX":{"id":"2c90813a5074c128015074c974040008","name":"期末试卷","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c974040008","rcsValue":"期末试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"太原市2015-2016学年第一学期八年级期末考试数学初二期末试卷","fullScore":100,"id":"e549102452579911015261d4dc64025c","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"太原市2015-2016学年第一学期八年级期末考试","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102452579911015261d4dc64025c","rcsValue":"太原市2015-2016学年第一学期八年级期末考试数学初二期末试卷","shiJLX":{"id":"2c90813a5074c128015074c974040008","name":"期末试卷","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c974040008","rcsValue":"期末试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"examRcsValue":"太原市2015-2016学年第一学期八年级期末试卷物理初二期末试卷","fullScore":100,"id":"e549102452579911015261d7e3e80260","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"太原市2015-2016学年第一学期八年级期末试卷","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102452579911015261d7e3e80260","rcsValue":"太原市2015-2016学年第一学期八年级期末试卷物理初二期末试卷","shiJLX":{"id":"2c90813a5074c128015074c974040008","name":"期末试卷","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c974040008","rcsValue":"期末试卷"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"1","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"步步高40分钟作业-选修4化学高二null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e549102450d5790f0150d5974c3000a4","keM":{"id":"e5491024509498a501509945498301aa","name":"化学","orderId":3,"rcsField":"name","rcsKey":"e5491024509498a501509945498301aa","rcsValue":"化学"},"name":"步步高40分钟作业-选修4","nianJ":{"id":"e5491024509498a5015099665d43036f","name":"高二","orderId":11,"rcsField":"name","rcsKey":"e5491024509498a5015099665d43036f","rcsValue":"高二","xueD":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102450d5790f0150d5974c3000a4","rcsValue":"步步高40分钟作业-选修4上册化学高二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"步步高40分钟作业\u2014\u2014选修3化学高二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102451cc45730151cc6d4eaf0003","keM":{"id":"e5491024509498a501509945498301aa","name":"化学","orderId":3,"rcsField":"name","rcsKey":"e5491024509498a501509945498301aa","rcsValue":"化学"},"name":"步步高40分钟作业\u2014\u2014选修3","nianJ":{"id":"e5491024509498a5015099665d43036f","name":"高二","orderId":11,"rcsField":"name","rcsKey":"e5491024509498a5015099665d43036f","rcsValue":"高二","xueD":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102451cc45730151cc6d4eaf0003","rcsValue":"步步高40分钟作业\u2014\u2014选修3下册化学高二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"百练百胜物理初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102453c6cb870153e61450db2424","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"百练百胜","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453c6cb870153e61450db2424","rcsValue":"百练百胜下册物理初二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"百练百胜周末作业物理初二null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e549102453c6cb870153e6151f852425","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"百练百胜周末作业","nianJ":{"id":"402881ed50943a980150945c20920250","name":"初二","orderId":8,"rcsField":"name","rcsKey":"402881ed50943a980150945c20920250","rcsValue":"初二","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e549102453c6cb870153e6151f852425","rcsValue":"百练百胜周末作业下册物理初二人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"高考总复习课堂作业本物理高三null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e5491024510f8f8601511d6a73620742","keM":{"id":"e5491024509498a50150994d56d60261","name":"物理","orderId":2,"rcsField":"name","rcsKey":"e5491024509498a50150994d56d60261","rcsValue":"物理"},"name":"高考总复习课堂作业本","nianJ":{"id":"e5491024509498a5015099669f460375","name":"高三","orderId":12,"rcsField":"name","rcsKey":"e5491024509498a5015099669f460375","rcsValue":"高三","xueD":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024510f8f8601511d6a73620742","rcsValue":"高考总复习课堂作业本全一册物理高三人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},{"banBen":{"id":"e5491024509498a501509945e8df01c4","name":"人教版","orderId":0,"rcsField":"name","rcsKey":"e5491024509498a501509945e8df01c4","rcsValue":"人教版"},"examRcsValue":"高考热点专题专练（二轮）化学高三null","fenCe":{"id":"402881ed50942cdc0150942e12850041","name":"全一册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942e12850041","rcsValue":"全一册"},"fullScore":0,"id":"e54910245362c3b20153635038ca0044","keM":{"id":"e5491024509498a501509945498301aa","name":"化学","orderId":3,"rcsField":"name","rcsKey":"e5491024509498a501509945498301aa","rcsValue":"化学"},"name":"高考热点专题专练（二轮）","nianJ":{"id":"e5491024509498a5015099669f460375","name":"高三","orderId":12,"rcsField":"name","rcsKey":"e5491024509498a5015099669f460375","rcsValue":"高三","xueD":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},"orderId":0,"rcsField":"name","rcsKey":"e54910245362c3b20153635038ca0044","rcsValue":"高考热点专题专练（二轮）全一册化学高三人教版","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"2c90813a5092715d0150927777f500e6","name":"高中","orderId":"3","rcsField":"name","rcsKey":"2c90813a5092715d0150927777f500e6","rcsValue":"高中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942dfd1d003b","name":"下册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942dfd1d003b","rcsValue":"下册"},"fullScore":0,"id":"e5491024510f8f8601511f6674dc290c","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024510f8f8601511f6674dc290c","rcsValue":"黄冈100分闯关下册数学初三北师大","shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}]
     */

    private int page;
    private int totalCount;
    private int pageSize;
    private String orderCondition;
    private String searchCondition;
    /**
     * examRcsValue : 2011年山西省高中阶段教育学校招生统一考试数学初三中考真题
     * fullScore : 120
     * id : e549102451bf7bb10151c32b9c50014f
     * keM : {"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"}
     * name : 2011年山西省高中阶段教育学校招生统一考试
     * nianJ : {"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
     * orderId : 0
     * rcsField : name
     * rcsKey : e549102451bf7bb10151c32b9c50014f
     * rcsValue : 2011年山西省高中阶段教育学校招生统一考试数学初三中考真题
     * shiJLX : {"id":"2c90813a5074c128015074c9c1130009","name":"中考真题","orderId":0,"rcsField":"name","rcsKey":"2c90813a5074c128015074c9c1130009","rcsValue":"中考真题"}
     * shiJNF : {"id":"e549102451bf7bb10151c32a1186014b","name":"2010-2011","orderId":0,"rcsField":"name","rcsKey":"e549102451bf7bb10151c32a1186014b","rcsValue":"2010-2011"}
     * type : 1
     * xueDuan : {"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}
     */

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
         * id : 2c90813a5074c128015074c9c1130009
         * name : 中考真题
         * orderId : 0
         * rcsField : name
         * rcsKey : 2c90813a5074c128015074c9c1130009
         * rcsValue : 中考真题
         */

        private ShiJLXEntity shiJLX;
        /**
         * id : e549102451bf7bb10151c32a1186014b
         * name : 2010-2011
         * orderId : 0
         * rcsField : name
         * rcsKey : e549102451bf7bb10151c32a1186014b
         * rcsValue : 2010-2011
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



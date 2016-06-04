package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/30 11:06
 * <p/>
 * 功能描述:学生错题本点进去的错题列表
 */
public class RtnStuCuoTiLieBiaoList
{


    /**
     * page : 1
     * totalCount : 6
     * pageSize : 20
     * orderCondition :
     * searchCondition :  where  student.id ='e54910245143f903015146aa3ab6042c' and question.paper.id ='e5491024509c41c00150a2c5e6d90541'
     * data : [{"id":"e5491024536a035f01537591daed15dc","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p>12<\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adbf1b640167","leiX":{"id":"e5491024509c41c001509cdcc35c00e8","name":"填空","orderId":2,"rcsField":"name","rcsKey":"e5491024509c41c001509cdcc35c00e8","rcsValue":"填空","rowNum":0},"num":"11","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adbf1b640167","rcsValue":"e549102450abda6a0150adbf1b640167","tiM":"<p>如图，在△ABC中，BC＝6，E，F分别是AB，AC的中点，动点P在射线EF上，BP交CE于D，∠CBP的平分线交CE于Q，当CQ＝<span class=\"mathquill-embedded-latex\" style=\"width: 26px; height: 42px;\">\\frac{1}{3}<\/span>CE时，EP＋BP＝<span style=\"text-decoration:underline;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <\/span><\/p><p><span style=\"text-decoration:underline;\"><br/><\/span><\/p><p><span style=\"text-decoration:underline;\"><img src=\"data:image/png;base64,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\"/><\/span><\/p><p><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}},{"id":"e5491024536a035f01537591daed15dd","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p>（3,4）或（0，4）<\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adc1e0860168","leiX":{"id":"e5491024509c41c001509cdcc35c00e8","name":"填空","orderId":2,"rcsField":"name","rcsKey":"e5491024509c41c001509cdcc35c00e8","rcsValue":"填空","rowNum":0},"num":"12","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adc1e0860168","rcsValue":"e549102450abda6a0150adc1e0860168","tiM":"<p>如图，在平面直角坐标系中，△ABC的顶点坐标分别为(4，0)，(8，2)，(6，4)．已知△A<sub>1<\/sub>B<sub>1<\/sub>C<sub>1<\/sub>的两个顶点的坐标为(1，3)，(2，5)，若△ABC与△A<sub>1<\/sub>B<sub>1<\/sub>C<sub>1<\/sub>位似，则△A<sub>1<\/sub>B<sub>1<\/sub>C<sub>1<\/sub>的第三个顶点的坐标为<span style=\"text-decoration:underline;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <\/span><\/p><p><\/p><p><img src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJcAAAB9CAYAAACvQPGdAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAACwzSURBVHhe7d0HlDRFtQfw9mHEjIIoKDlJkJxUBBQko6BECR8gIhkBESQKAkoSFZEoICAZBQkKIjkYQDCAgAQzBsyKiXn1u3Ttm2+Yna7eN6u7uv9z9uxUd3V1hVtVN9XtZ3QSqilMYRzwP/X/KUxh6JgwxPWPf/yjOvnkk6u99967vlJVhxxySPXYY4/Vqap69NFHq+985zt1agoTHROGuJ7xjGdUCyywQHXhhRdWDz74YFz74Q9/WN1///3xG7761a9Wn/vc5+rUFCY6JgxxzTDDDNWb3vSmILAHHnggrq255prVoosuGr/hmmuuqT7/+c/XqSlMdEw4nmvGGWesnnzyyeqb3/xm9apXvap6yUteEtf/+c9/Vrfddlt13333TbdVTmHiYsIR16tf/erq4osvrn77299WK664Yn21qr7xjW9UDz/8cBDeFVdcUV+dwkTGhCOul73sZdVvfvObapVVVqmvPAXb5rve9a5qrbXWqmadddb66hQmMiYUcf3lL3+pFl544er000+v/ud/pq/a0ksvXb31rW+tFl988SCwKUx8TAji+uUvfxkqiM9+9rPVMsssU730pS+t70yPP/3pT9UTTzxRp6Yw0TEhiGvmmWeuFlxwwWrttdeu5phjjvrq04Gpf97znlenpjDRMS7ERVe15ZZbVueee26kDzjggOCXMOV//etfq/e85z3V1ltvXf3iF7+obrzxxmqbbbapfvzjH1ezzTZbqBvk/fjHPx7PnnrqqZG+7rrrRph96Xvvvbf63e9+F89ut9121Z///Ofq7rvvjnsf+MAH4tmrr7467n3605+O9HHHHTdSFkLdddddI/2DH/yg+tWvflXttNNO1fvf//64d/vtt8e9Qw89NJ79zGc+E+ncpo997GPVFltsUX3961+v/va3v0WbtFmbHnnkkci75557hnL4hhtuqN773vfG+0Hb3P/CF75Qsb6pr/T3v//96g9/+EPUQ938/va3vx339tlnn8h7+eWXR1q/wEc/+tEo+/rrr4/07rvvHvX4yU9+EnWZNm1atf3220cdb7755nj2Ix/5SJRFZyid23TwwQdHWj75PbfttttGf40FQycug6yxtjbMOcw+++yxMr3oRS8KZek888xTzT///HEPkWHW3YMXvvCFkfcVr3hFpJUh/YIXvCAaLL3QQgtVz33uc+O5eeedN/6Um59FhHD88ceHzgzRgjJzWaAe0s9+9rOjrEsuuSRUIPD85z8/7uVncz0IEwQOBKFdVtKsANYm5ShPXquwe5TBl1122YggMssss8T9vP2rr/SznvWs6pnPfGb1ta99rbryyiujLO10T11BP0lb7UGbEJyJBHPOOedIPZQ333zzxbN4WO1Wz/333z8mVG5TrsdrXvOaSMsnv351753vfGf1+9//PvK0AsP1MJGIq5MkvU6qTH1lMN785jd3HnvssTo1GCeccELngx/8YJ1qRpq1nbTS1alm7LLLLp2zzz67To2OtCp0Vl111TrVjEQsnbSy1almfOpTn2rVzj322KNz4okn1qlmrLHGGp20ItapwUgTutV4dmNSeUWcdNJJYQ465phj6itTmMgY+raIXyH1/fGPf6yvDIb9/te//nWdGi4uvfTS6p577qlTzcAD3XXXXXVqdFCZaOPf//73+spg4H9sXaXA77Xhc5Sdt/MmWEvOPPPM4MdKYBzxm6VtnQ5WrmEiMdmdxBd0EnNaXxkdTz75ZCft+5077rijvjIYiTHvvO9976tTzVhxxRU7hx12WJ1qxkorrVS0HSUeKtqYhID6ymB8+ctf7qy88sp1qhk77rhj521ve1udagbWIgkidWow0uTvJD6qkwSR+spgPProo53Eyxa3tRtDX7me85znVO94xztGGPQmbLDBBsHgjgcSsVSLLbZYnWrGG9/4xmqJJZaoU6MDs7/hhhsWq0Uw3yussEKdasayyy4bdSnF61//+mqppZaqU4NBwEiEW734xS+urwyGNso/FhXQFM81hXHD0Fcuep20tRTt6eiaWPyzn/2svjJcUEVk/U8JPvnJT1bXXnttnRodVBH77bdf6OxK8L3vfa866qij6lQzqC1OO+20OtWMJF1WX/rSl+rUYOhzescf/ehH9ZXB4EDQpq3dGBc9l0E1AE3Q0BNOOKG4oW1x3nnnhUKwFOeff344JDaBcpMitFRooSD+4he/WKeaQWdFuCjFRRddVH3lK1+pU4Ohzz/xiU9UP//5z+srg0G/1aat3ZjhYGrZIYISkBIOj8E3qwn2ck6C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\"/><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}},{"id":"e5491024536a035f01537591dafc15de","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p><img src=\"data:image/png;base64,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\"/><\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adc46504016c","leiX":{"id":"402881ed50943a980150945e4462027d","name":"解答","orderId":3,"rcsField":"name","rcsKey":"402881ed50943a980150945e4462027d","rcsValue":"解答","rowNum":2},"num":"13","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adc46504016c","rcsValue":"e549102450abda6a0150adc46504016c","tiM":"<p>如图，在矩形ABCD中，CD＝2，CF⊥BD分别交BD，AD于点E，F，连接BF.<\/p><p>(1)求证：△DEC∽△FDC；<\/p><p>(2)当F为AD的中点时，求BC的长度．<\/p><p><\/p><p><img src=\"data:image/png;base64,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\"/><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}},{"id":"e5491024536a035f01537591dafc15df","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p><img src=\"data:image/png;base64,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\"/><\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adc5f62f016e","leiX":{"id":"402881ed50943a980150945e4462027d","name":"解答","orderId":3,"rcsField":"name","rcsKey":"402881ed50943a980150945e4462027d","rcsValue":"解答","rowNum":2},"num":"14","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adc5f62f016e","rcsValue":"e549102450abda6a0150adc5f62f016e","tiM":"<p>如图，在▱ABCD中，对角线AC，BD交于点O，M为AD的中点，连接CM交BD于点N，且ON＝1.<\/p><p>(1)求BD的长；<\/p><p>(2)若△DCN的面积&nbsp;2，求四边形ABNM的面积．<\/p><p><\/p><p><img src=\"data:image/png;base64,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\"/><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":"2014·乐山"}},{"id":"e5491024536a035f01537591dafc15e0","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p><img src=\"data:image/png;base64,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\"/><\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adc7a66e0170","leiX":{"id":"402881ed50943a980150945e4462027d","name":"解答","orderId":3,"rcsField":"name","rcsKey":"402881ed50943a980150945e4462027d","rcsValue":"解答","rowNum":2},"num":"15","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adc7a66e0170","rcsValue":"e549102450abda6a0150adc7a66e0170","tiM":"<p>如图，四边形ABCD中，AC平分∠DAB，∠ADC＝∠ACB＝90°，E为AB的中点．<\/p><p>(1)求证：AC2＝AB·AD；<\/p><p>(2)求证：CE∥AD；<\/p><p>(3)若AD＝4，AB＝6，求<span class=\"mathquill-embedded-latex\" style=\"width: 39px; height: 42px;\">\\frac{AC}{AF}<\/span>的值．<\/p><p><br/><\/p><p><img src=\"data:image/png;base64,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\"/><\/p><p><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}},{"id":"e5491024536a035f01537591db0c15e1","student":{"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"},"chuangJShJ":"20160314224006","question":{"daA":"<p><img src=\"data:image/png;base64,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\"/><\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adc8f9c50172","leiX":{"id":"402881ed50943a980150945e4462027d","name":"解答","orderId":3,"rcsField":"name","rcsKey":"402881ed50943a980150945e4462027d","rcsValue":"解答","rowNum":2},"num":"16","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adc8f9c50172","rcsValue":"e549102450abda6a0150adc8f9c50172","tiM":"<p>如图，在矩形ABCD中，AB＝12&nbsp;cm，BC＝8&nbsp;cm，点E，F，G分别从A，B，C三点同时出发，沿矩形的边按逆时针方向移动，点E，G的速度为2&nbsp;cm/s，点F的速度为4&nbsp;cm/s，当点F追上点G(即点F与点G重合)时，三个点随之停止移动．设移动开始后第t秒时，△EFG的面积为S(cm2)．<\/p><p>(1)当t＝1秒时，S的值是多少？<\/p><p>(2)若点F在矩形的边BC上移动，当t为何值时，以点E，B，F为顶点的三角形与以点F，C，G为顶点的三角形相似？请说明理由．<\/p><p><img src=\"data:image/png;base64,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\"/><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}}]
     */

    private int page;
    private int totalCount;
    private int pageSize;
    private String orderCondition;
    private String searchCondition;
    /**
     * id : e5491024536a035f01537591daed15dc
     * student : {"id":"e54910245143f903015146aa3ab6042c","createTime":"2015-11-27 09:59:00","name":"王军平","state":"正常","mobile":"13994228195","loginName":"13994228195"}
     * chuangJShJ : 20160314224006
     * question : {"daA":"<p>12<\/p>","defineTitle":"","fenX":"","fengZ":"","id":"e549102450abda6a0150adbf1b640167","leiX":{"id":"e5491024509c41c001509cdcc35c00e8","name":"填空","orderId":2,"rcsField":"name","rcsKey":"e5491024509c41c001509cdcc35c00e8","rcsValue":"填空","rowNum":0},"num":"11","orderId":0,"page":"78","paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"id","rcsKey":"e549102450abda6a0150adbf1b640167","rcsValue":"e549102450abda6a0150adbf1b640167","tiM":"<p>如图，在△ABC中，BC＝6，E，F分别是AB，AC的中点，动点P在射线EF上，BP交CE于D，∠CBP的平分线交CE于Q，当CQ＝<span class=\"mathquill-embedded-latex\" style=\"width: 26px; height: 42px;\">\\frac{1}{3}<\/span>CE时，EP＋BP＝<span style=\"text-decoration:underline;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <\/span><\/p><p><span style=\"text-decoration:underline;\"><br/><\/span><\/p><p><span style=\"text-decoration:underline;\"><img src=\"data:image/png;base64,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\"/><\/span><\/p><p><\/p>","zhiShiDian":{"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}},"zklt":""}
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
        private String id;
        /**
         * id : e54910245143f903015146aa3ab6042c
         * createTime : 2015-11-27 09:59:00
         * name : 王军平
         * state : 正常
         * mobile : 13994228195
         * loginName : 13994228195
         */

        private StudentEntity student;
        private String chuangJShJ;
        /**
         * daA : <p>12</p>
         * defineTitle :
         * fenX :
         * fengZ :
         * id : e549102450abda6a0150adbf1b640167
         * leiX : {"id":"e5491024509c41c001509cdcc35c00e8","name":"填空","orderId":2,"rcsField":"name","rcsKey":"e5491024509c41c001509cdcc35c00e8","rcsValue":"填空","rowNum":0}
         * num : 11
         * orderId : 0
         * page : 78
         * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
         * rcsField : id
         * rcsKey : e549102450abda6a0150adbf1b640167
         * rcsValue : e549102450abda6a0150adbf1b640167
         * tiM : <p>如图，在△ABC中，BC＝6，E，F分别是AB，AC的中点，动点P在射线EF上，BP交CE于D，∠CBP的平分线交CE于Q，当CQ＝<span class="mathquill-embedded-latex" style="width: 26px; height: 42px;">\frac{1}{3}</span>CE时，EP＋BP＝<span style="text-decoration:underline;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></p><p><span style="text-decoration:underline;"><br/></span></p><p><span style="text-decoration:underline;"><img src="data:image/png;base64,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"/></span></p><p></p>
         * zhiShiDian : {"id":"e5491024509c41c00150a742ae99088b","name":"平面直角坐标系中的位似","orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a742ae99088b","rcsValue":"平面直角坐标系中的位似","zhangJ":{"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}}
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

        public StudentEntity getStudent()
        {
            return student;
        }

        public void setStudent(StudentEntity student)
        {
            this.student = student;
        }

        public String getChuangJShJ()
        {
            return chuangJShJ;
        }

        public void setChuangJShJ(String chuangJShJ)
        {
            this.chuangJShJ = chuangJShJ;
        }

        public QuestionEntity getQuestion()
        {
            return question;
        }

        public void setQuestion(QuestionEntity question)
        {
            this.question = question;
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

        public static class QuestionEntity
        {
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
             * id : e5491024509c41c00150a742ae99088b
             * name : 平面直角坐标系中的位似
             * orderId : 0
             * rcsField : name
             * rcsKey : e5491024509c41c00150a742ae99088b
             * rcsValue : 平面直角坐标系中的位似
             * zhangJ : {"danY":{"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"},"id":"e5491024509c41c00150a73a5d7b0807","name":"图形的位似","orderId":4,"rcsField":"name","rcsKey":"e5491024509c41c00150a73a5d7b0807","rcsValue":"图形的位似"}
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
                 * danY : {"id":"e5491024509c41c00150a733d2a907a2","name":"第四单元    图形的相似","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a733d2a907a2","rcsValue":"第四单元    图形的相似"}
                 * id : e5491024509c41c00150a73a5d7b0807
                 * name : 图形的位似
                 * orderId : 4
                 * rcsField : name
                 * rcsKey : e5491024509c41c00150a73a5d7b0807
                 * rcsValue : 图形的位似
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
                     * id : e5491024509c41c00150a733d2a907a2
                     * name : 第四单元    图形的相似
                     * orderId : 0
                     * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
                     * rcsField : name
                     * rcsKey : e5491024509c41c00150a733d2a907a2
                     * rcsValue : 第四单元    图形的相似
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



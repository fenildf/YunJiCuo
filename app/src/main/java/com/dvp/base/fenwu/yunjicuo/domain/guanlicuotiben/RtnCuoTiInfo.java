package com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben;

/**
 * 作者：Administrator on 2016/5/27 15:53
 * <p/>
 * 功能描述:YunJiCuo
 */
public class RtnCuoTiInfo
{

    /**
     * daA : <p><img src="data:image/png;base64,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"/></p>
     * defineTitle :
     * fenX :
     * fengZ :
     * id : e549102450abda6a0150af0b673a02ef
     * leiX : {"id":"402881ed50943a980150945e4462027d","name":"解答","orderId":3,"rcsField":"name","rcsKey":"402881ed50943a980150945e4462027d","rcsValue":"解答","rowNum":2}
     * num : 11
     * orderId : 0
     * page : 98
     * paper : {"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}}
     * rcsField : id
     * rcsKey : e549102450abda6a0150af0b673a02ef
     * rcsValue : e549102450abda6a0150af0b673a02ef
     * tiM : <p><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAbIAAAAdCAIAAABALH7EAAAE20lEQVR4nO2b25mrMAyEqYuCqIdqaMbFsA9kHceSRmMnBAL6H87HGmHL0ljh4jOsQRAEQcFwtANBEHyFZRo2puVoV85OlMUguAPL9KiGyxSF0SPKYhDcgJTS/+EyRVl0iLIYBDcizWMURZcoi0FwE9I8xrtFiiiLQXAn0jwOwzgn3/LGRFkMgnsRz9EuL2VxGPwqORDs5i3rapNjsv07UzgJ1WTVubcmnQ9gd6hJvXWfLU9dTU7im8uxGuiz35WesvimQR8fD3puAQd3gFwSfCdvFhHLbI+StJ1Ve2YuVFtOL6c0j/Uz9LEaYIawSzHVcytmOKyBKxt1Ap910XKPtFxtgeZV0dT5z0Bs31WX9ztJb5UEqXUyI+p0GGN84QXk9P+1ZZDvFY/SAE691ADuzSHv2uRQfi1lXldjzm74PgsYWrrtHoAcuFk5D6aHaR43Idiv2D+edDWkqr3v/4fMKs+ZU2UoLi+nM2igz+0W8+bPTIoyyOgw4dsJdQjptqpveVylqm8iX5CCNa7anpYliyDNo6oJGQfLgE+6ZWB5S0aGDCwzhbJD2f/qyeZicjqnBtwJtkUgzdPYVhc7y2JlY6lkJ3j1M8bWXLSJvD6XPp5M9viqlx96xjltg+pJpaK9TExZBJ3zSW9az7xUVE3KFjkWELOVcXAhbjmxnExOqwGsDV4567ou0zinNI8NoR3yalHnL/1QhUh4rNzHuuGTna9eIuVZOR0gXLwk8jxyeNM8dewAIyeb//PqMpk/dIw+lHfs4lpX6NJ/1w3XNz71VkZcN1QJVcbVASObn5OTdfZYDZBnXZ2ALOfXit6D9Mv5YRH+qVkEWZfHpn/v/RLKnkELc2B5i3T8su2rT8Y8j7uJKmqNyjCLqnUtDh2T9HzKDTUAu6R2yLSAPkufK/8vISeFM2igKWukQSa/Y99WE3yQfhaoYTPDyV5FUECMbI+X+b2k88vAykSleKwJMJHHQ2nxeUv2ZnXehnfv7/YMPsHhKK3tSZdmqx9ME+yS2mfTApPu4X8tB35JTkYQwPF3NIDTiu0h+TVFBiymZ4EaslHlejWw1S4bDY+Lqt2FpXjLT7IFrDcQ+jSPwzhN782IYJkerxap0ibBQXez1p10a5FUBnjZ4xXrugQ8t3yW/V9LTgoHakDtiqx3bFmsnpSWya6LL2tlqF72WQPL6FhTpQt5Gx1lEazJ0kDt35uFe0P+Ps9bejAY8rPUhHbT2LEk3KTLkDbJHY+OvbUcdvsHf15ITjqn0gAvEs5SvrXbvmr5Pz/mb9ogUB2SMdqjLOKF4aYW94a1brHze6Diq2T5UVrYWX4W23c3FCl0LIn8p1tTmiqUCi4xwGEwL142fDX/BTmZnEcDfMA5s7wCnsovnqidysje8+OJtRamVtzKC6q5SnmhtZbgRBp3zZ8SKyalQXWgnl2LiOHVYg1kuYcvV8dy16o8BrO7vJzOoAE3rXjcPWio0I8LWlSyB1b//Lhl/tR2v88rVEXnrkoqtTXp3WJwV451Crgh/ZTprux5by2f17PIydwGe6AGcJyts63Z6WPf3q/HEVtug8vyTTkx22CDjSiLQXAT9G2wgSTKYhDchrb/AndfoiwGwU3wt8EGG1EWg+AOUNtgg40oi0FwedhtsMFGlMUgCIIX/gBgavH2sDFBPAAAAABJRU5ErkJggg==" alt=""/><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAV0AAAASCAIAAAB3k5rtAAADt0lEQVR4nO1ayYGDMAykLgpyPVTjZiiGfZBwWNLoQCb78Dx2EyLLI2ksbJJpGxgYGLhj+jWBgYGBf4c3+sI0Zc6S6w34xBP1oBHD/2Hyb2FJEbV5M7EBBXqNfd5cE1vwkJCFRqI34PNJogNZCiPR2zuEw+itwMaMjupX1ie0sYfjus/btq3LTOKbl9VMQp0vPYOJhQHD6VsLpFk0IlwV1DLIxPRhHp6aw1qujNelWHh/EAx86qBAl0+jjcWJxIr6NxobvSFW+791madSvxfXZVZK462KnZCKXG/UYeIyk6aQwFTBsEQSExLpC3ex7KRN/azx4Qw8UYFsxS3Vz8p8TIH7RWCpukWU9n/3wtD3iLE6U6Jw071Rh8db+kIi8FCXB2jWa5nUVZaYEH8F12WeWqWsy8xoB8Ee+AsKtBtnZd6rQDyKveIVrbxf4ErLEgXrx1U8C5xjjz3qvKz7XreV2vRtunQKHKyLWLgvgK1bp/T6fNbi3xwwsAf+ggLtCTRYHiesUrdDj7dQXQqUIqUecLwq80tfuEAqtbcq2AkH5QgDKi3Vu5ZPIWrR7z9sOKAYbFwqSYkqt0urpRVSO53x+jEDTq/run7gtNnaA++vQDQqUtb7TZY+e3Ep8HhtEScbCI79NDvJnzXYmxx/jpCI0iljVdm2Wth1YIDg+dOzgdMmHFxsYwFcBjv694UNpzfUF+zFEqf+YV8Irnbov8ElOvGR7BMFNp2i8RPjzPYFZReH/6oMVOEu0Y2p6FnTLxYZTq4l0fG+AM8RoblQet0+fecIcWrvOaKfAqU15vVzRy17KLVIInQpsFnwUuxsZowBuvuCtCTYrubqvt+J+dQBb00KCGr5PF5A90nqBPSFrY+AhMdv7oTAGdDt3e+TJcjKH01tD7whM2UrsEdZtz3AuRQ5A3YFSgzZ2OmnWNWn/cm7/aKIP41LPNSZXgBH4Ny7svc2KhR7Bu3xhvoC95CqMyKRtt8cRI6B9sC7KhA7x/YaxJ2VV4GSLEHvMA6/mbl+WKL0GH9suSBuLwq7fjUBBxr7QvaNha2C/iAgN73BDnjj7m0KwcDVT70pCnQZV57xr72MzEEIRv6gxE1fcCBQlS1bu0YC4YFUpLQA1L4TMSNhcDHs1nL9fXRSYCxwT1rkRwscGVaBXjKuvtCaWYxUp836kTpZv75gWZx4OPv6eoXtEQ0BduxDbpjtlpReVousOn+LdAWqceWUVWkLj85HQHsWM96nxWhgYCCGHzwlysDoCwMDAy3+AE3NHG05pP5sAAAAAElFTkSuQmCC" alt=""/></p><p><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJcAAAASCAIAAADZgNtFAAACLElEQVRYhe1Y3XnDIAxkLgZiHqZhGYahD3Zs0M9JENdJ+/keWoOROOuQgIT24O8jfJrAgwtwmYoh/J8F4fkWMmbBZGFS1XbZUiPxPXIGH0RDj3OPSd+vPZMeJ8nBtm/UHFPpGiHmurdKOp+n6Koo6ZxrDjVH9pUGuzl6ZhxFDcTBCyou4LQsaRCNxaakEI64Ly/zF2qOdugBao5hXHHY26yK+C35RqCx89kXNJ3S/r+kQFNjkFUbJNKyUXOKb8k4qsjbJ6uFdWaqSPxrA4jGWr9nUozNsubIA8pVHMZhEphTSTHXmmPQV4UBIRclVzyCWmeDkos+uQfNP5aTjJlacLvtKwg8BoKKRG5PuZCwb4lWHUTvyd6oeZlVETtxuuKp1vdo5ni5cEqDn9ZkvVQVO71FEmZl6M5QJRlVVa3hI5FtG5crKnnQOgFznLKmW9N/61TR/mrj92ajp9EDorZCpzkl80AAqmrJisbSvijQxaG5MBebpCL9UAZOUuwxo/pWLmrU0YTkylKSLuNw8eHvnCqCoOMkExOOO+HcFnKxwUhyQyEXb9wXeYXcNrjpQ45wupFWImblqBwC7leR20oq8jNqd3ggK34bh1eoOKBzSjc0Ng+GdOtXtldn4NpMEH9VRf9EXEV8FTxw3X3xLiyo2CwhQbHFk/rJmONpzhxPw28zApR7tXJK/hKAgPactbril7Z3S6bAEF3hkAp69w1wnDB/R33wQXxjAj2YxQ9jX4H/IJrLyQAAAABJRU5ErkJggg==" alt=""/></p><p><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIAAAAATCAIAAADXrpJxAAACHklEQVRYhe1YyZHEIAwkLgIiHqIhGYLRPmyDbuSjyju7068BC9OideBJ8MWrSG8T+O/4CvAyHhMgpY/RklGVzFMMz5B55C2A3Fgye12qpQDLJarBZnNWJ/K411waAAC0sq/ex9BKrj1K0dl1sPRpQSvHzoOa8IwzGqRTrh16LRrjZbxHlsi1lvEJAVo5PBo69Jqnm61MOa4naUwAsjGZnbJQG2UkX6CctXVep1x7QoBWhm+9tUG814z8QEbyRScT2bPvtWRFASoAHveaE6c209kkoGaD9cOa9P0KCtBrNirMzAtu5++0zGWHWSu5duVMlQzYhq1o4a5gSeCsAPGUMilJzzC4MnRs+bM8fZfcXv5lGWJ9wCg/HpbhHDliyfx2BtAwRxCtl0olWTpbBgVAlYMHNt18a7ml6QVIh1XHncAPliBLsJAAtNBP8JvINidM8bnHT9+YnzeZA7To8B6Qcu33S9AdAZaRt6AEoGeA1sOUYuUzlmaLeZZyrWAFTAGY3Vi8asIOn3gJioS5A6MH4IPAjlzqAT4/9FTesrayv08qTZhcknEU6Re2awIsn1r+WluQdx7OTPLim0c5fym7VRZlTVSBtuVlPqWUUs7yQ4ylLeGtt4THBVgO5S6qAP4Vf+Dud8DrEKorBqqlFjHKKjBO3KM0fpEvXQXmXdXx57fBOSkemNGySYa+qPqr8EBvvAAQ+C/oi2v4gLD92/gB9qOms1+nzC8AAAAASUVORK5CYII=" alt=""/></p><p><img src="data:image/png;base64,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"/></p><p></p>
     * zhiShiDian : {"id":"e549102450a8dfd40150a99343180267","name":"反比例函数的应用","orderId":0,"rcsField":"name","rcsKey":"e549102450a8dfd40150a99343180267","rcsValue":"反比例函数的应用","zhangJ":{"danY":{"id":"e5491024509c41c00150a7345dfb07af","name":"第六单元    反比例函数","orderId":0,"paper":{"banBen":{"id":"2c90813a5092715d015092788b9b0123","name":"北师大","orderId":0,"rcsField":"name","rcsKey":"2c90813a5092715d015092788b9b0123","rcsValue":"北师大"},"clime":{"climeName":"太原","id":"e5491024509c41c00150a1a86ee80414","parentClime":{"climeName":"山西","id":"e5491024509c41c00150a1a82dd2040f","rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a82dd2040f","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"山西"},"rcsField":"climeName","rcsKey":"e5491024509c41c00150a1a86ee80414","rcsParentField":"parentClime","rcsParentKey":"e5491024509c41c00150a1a82dd2040f","rcsValue":"太原"},"examRcsValue":"黄冈100分闯关数学初三null","fenCe":{"id":"402881ed50942cdc0150942de8d50035","name":"上册","orderId":0,"rcsField":"name","rcsKey":"402881ed50942cdc0150942de8d50035","rcsValue":"上册"},"fullScore":0,"id":"e5491024509c41c00150a2c5e6d90541","keM":{"id":"2c90813a5074c128015074cb6707000b","name":"数学","orderId":1,"rcsField":"name","rcsKey":"2c90813a5074c128015074cb6707000b","rcsValue":"数学"},"name":"黄冈100分闯关","nianJ":{"id":"402881ed50943a980150945c72780256","name":"初三","orderId":9,"rcsField":"name","rcsKey":"402881ed50943a980150945c72780256","rcsValue":"初三","xueD":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"orderId":0,"rcsField":"name","rcsKey":"e5491024509c41c00150a2c5e6d90541","rcsValue":"黄冈100分闯关上册数学初三北师大","school":{"clime":{"climeName":"太原","id":"2","parentClime":{"climeName":"忻州","id":"1","rcsField":"climeName","rcsKey":"1","rcsParentField":"parentClime","rcsParentKey":"","rcsValue":"忻州"},"rcsField":"climeName","rcsKey":"2","rcsParentField":"parentClime","rcsParentKey":"1","rcsValue":"太原"},"id":"402881ed50943a980150945ef5640297","name":"太原市志达中学","orderId":0,"rcsField":"name","rcsKey":"402881ed50943a980150945ef5640297","rcsValue":"太原市志达中学"},"shiJNF":{"id":"2c90813a5074c128015074d6f93c007f","name":"2015-2016","orderId":3,"rcsField":"name","rcsKey":"2c90813a5074c128015074d6f93c007f","rcsValue":"2015-2016"},"type":"0","xueDuan":{"id":"402881ed50943a9801509459f81d0229","name":"初中","orderId":"2","rcsField":"name","rcsKey":"402881ed50943a9801509459f81d0229","rcsValue":"初中"}},"rcsField":"name","rcsKey":"e5491024509c41c00150a7345dfb07af","rcsValue":"第六单元    反比例函数"},"id":"e5491024509c41c00150a73b7d660825","name":"反比例函数的应用","orderId":6,"rcsField":"name","rcsKey":"e5491024509c41c00150a73b7d660825","rcsValue":"反比例函数的应用"}}
     * zklt : 2014·宜宾
     */

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



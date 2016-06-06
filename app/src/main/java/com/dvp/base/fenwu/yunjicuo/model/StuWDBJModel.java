package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnIsJiaRuBanJ;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSearchWDBJList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuWDBJCTKList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuWDBJList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/31 16:47
 * <p/>
 * 功能描述:YunJiCuo
 */
public class StuWDBJModel extends AppModel
{
    private Gson gson;
    public StuWDBJModel()
    {
    }

    public StuWDBJModel(Context context)
    {
        super(context);
        gson = new Gson();
    }


    public RtnStuWDBJList getRtnStuWDBJList()
    {
        return rtnStuWDBJList;
    }

    public void setRtnStuWDBJList(RtnStuWDBJList rtnStuWDBJList)
    {
        this.rtnStuWDBJList = rtnStuWDBJList;
    }

    /**
     * 返回我的班级列表
     */
    private RtnStuWDBJList rtnStuWDBJList = new RtnStuWDBJList();


    public int getmWDBJTotalpages()
    {
        return mWDBJTotalpages;
    }

    public void setmWDBJTotalpages(int mWDBJTotalpages)
    {
        this.mWDBJTotalpages = mWDBJTotalpages;
    }

    /**
     * 我的班级列表总页数
     */
    private int mWDBJTotalpages;
    /**
     *
     * 获取我的班级列表
     * @param tranCode
     * @param stuId
     * @param pageSize
     * @param page
     */
    public void getWDBJList(final String tranCode,final String stuId,final int pageSize,final int page )
    {
        String jsonparam = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.stu_wdbj_list_requesturl) +
                "?searchCondition=[{\"searchVal\":\"" +
                stuId +
                "\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"isValid\"},{\"searchVal\":\"0\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]&" +
                "pageSize=" +
                String.valueOf(pageSize) +
                "&page=" +
                String.valueOf(page) +
                "&orderCondition=";
        pd.show();
        OkHttpUtils.get()
                .url(jsonparam)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println(""+response.toString());
                        RtnStuWDBJList rtn = gson.fromJson(response,RtnStuWDBJList.class);
                        mWDBJTotalpages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);
                        rtnStuWDBJList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnSearchWDBJList getRtnSearchWDBJList()
    {
        return rtnSearchWDBJList;
    }

    public void setRtnSearchWDBJList(RtnSearchWDBJList rtnSearchWDBJList)
    {
        this.rtnSearchWDBJList = rtnSearchWDBJList;
    }

    /**
     * 接收搜索到的班级数据
     */
    private RtnSearchWDBJList rtnSearchWDBJList = new RtnSearchWDBJList();

    /**
     * 搜索班级通过班级编号
     * @param tranCode
     * @param banJBH
     */
    public void searchBanJByBanJBH(final String tranCode,final String banJBH)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.stu_sousuobanji_requesturl)+banJBH;
        pd.show();
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }
                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("搜索班级结果====="+response.toString());
                        RtnSearchWDBJList rtn = gson.fromJson(response,RtnSearchWDBJList.class);
                        rtnSearchWDBJList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnIsJiaRuBanJ getRtnIsJiaRuBanJ()
    {
        return rtnIsJiaRuBanJ;
    }

    public void setRtnIsJiaRuBanJ(RtnIsJiaRuBanJ rtnIsJiaRuBanJ)
    {
        this.rtnIsJiaRuBanJ = rtnIsJiaRuBanJ;
    }

    /**
     * 是否加入班级的属性
     */
    private RtnIsJiaRuBanJ rtnIsJiaRuBanJ = new RtnIsJiaRuBanJ();

    /**
     * 获取是否加入班级的接口
     * @param tranCode
     * @param banJBH
     * @param stuId
     */
    public void getIsJiaRuProperty(final String tranCode,final String banJBH,final String stuId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.stu_getisjiarubanji_requesturl) +
                "?searchCondition=[{\"searchPro\":\"banJ.id\",\"searchVal\":\"" +
                banJBH +
                "\"},{\"searchPro\":\"user.id\",\"searchVal\":\"" +
                stuId +
                "\"}]&" +
                "pageSize=" +
                "1" +
                "&page=" +
                "1" +
                "&orderCondition=";

        pd.show();
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("获取是否加入班级的属性结果====="+response.toString());
                        RtnIsJiaRuBanJ rtn = gson.fromJson(response,RtnIsJiaRuBanJ.class);
                        rtnIsJiaRuBanJ = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     *  申请加入班级
     * @param tranCode
     * @param banJBH
     */
    public void shenQJiaRuBanJ(final String tranCode,final String banJBH)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.stu_shenqingjiaru_requesturl))
                .addParams("banJ.id",banJBH)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("申请加入班级返回结果===="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnStuWDBJCTKList getRtnStuWDBJCTKList()
    {
        return rtnStuWDBJCTKList;
    }

    public void setRtnStuWDBJCTKList(RtnStuWDBJCTKList rtnStuWDBJCTKList)
    {
        this.rtnStuWDBJCTKList = rtnStuWDBJCTKList;
    }

    /**
     * 接收我的班级 错题库列表
     */
    private RtnStuWDBJCTKList rtnStuWDBJCTKList = new RtnStuWDBJCTKList();

    /**
     *
     * 学生我的班级 获取错题库列表
     * @param tranCode
     * @param banJBH
     * @param userId
     */
    public void getStuBanJCuoTK(final String tranCode,final String banJBH,final String userId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/studentquestion/" +
                banJBH +
                "/data4paper/" +
                userId;
        pd.show();
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("获取班级错题库列表结果===="+response.toString());
                        RtnStuWDBJCTKList rtn = gson.fromJson(response,RtnStuWDBJCTKList.class);
                        rtnStuWDBJCTKList =  rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 退出班级
     * @param tranCode
     * @param dataId
     */
    public void exitBJ(final String tranCode,final String dataId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/banUser/data/" +
                dataId +
                "?_method=DELETE";

        pd.show();
        OkHttpUtils.post()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println(""+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

    /**
     * 获取分册列表
     * @param tranCode
     * @param stuId
     * @param banJBH
     * @param paperId
     * @param page
     * @param pageSize
     */
    public void getStuWDBJCTKFCList(final String tranCode,final String stuId,final String banJBH,final String paperId,final int page,final int pageSize)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/banjiquestion/data4stu?searchCondition=%5B%7B%22searchPro%22%3A%22sq.student.id%22%2C%22searchVal%22%3A%22" +
                stuId +
                "%22%7D%2C%7B%22searchPro%22%3A%22bjq.bjId%22%2C%22searchVal%22%3A%22" +
                banJBH +
                "%22%7D%2C%7B%22searchPro%22%3A%22bjq.paperId%22%2C%22searchVal%22%3A%22" +
                paperId +
                "%22%7D%5D&" +
                "pageSize=" +
                String.valueOf(pageSize) +
                "&page=" +
                String.valueOf(page) +
                "&orderCondition=+order+by+bjq.qpage%2Cbjq.qnum";

        pd.show();
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("获取分册错题列表结果==="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }
}



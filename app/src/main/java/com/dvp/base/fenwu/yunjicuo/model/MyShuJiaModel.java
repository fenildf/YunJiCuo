package com.dvp.base.fenwu.yunjicuo.model;

import android.animation.TimeAnimator;
import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSJList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnWDSjList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/28 10:31
 * <p/>
 * 功能描述:我的书架model类
 */
public class MyShuJiaModel extends AppModel
{

    private Gson gson;
    public MyShuJiaModel()
    {
    }

    public MyShuJiaModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    public RtnWDSjList getRtnWDSjList()
    {
        return rtnWDSjList;
    }

    public void setRtnWDSjList(RtnWDSjList rtnWDSjList)
    {
        this.rtnWDSjList = rtnWDSjList;
    }

    /**
     * 用来接收我的书架列表
     */
    private RtnWDSjList rtnWDSjList = new RtnWDSjList();

    public int getmShujiaTotalPages()
    {
        return mShujiaTotalPages;
    }

    public void setmShujiaTotalPages(int mShujiaTotalPages)
    {
        this.mShujiaTotalPages = mShujiaTotalPages;
    }

    /**
     * 我的书架总页数
     */
    private int mShujiaTotalPages;
    /**
     * 获取我的书架接口
     * @param tranCode
     * @param page
     * @param pageSize
     */
    public void getWoDeSJ(final String tranCode,final int page,final int pageSize)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.wodeshujia_requestUrl))
                .addParams("searchCondition","[]")
                .addParams("pageSize",String.valueOf(pageSize))
                .addParams("page",String.valueOf(page))
                .addParams("orderCondition","")
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("我的书架返回结果===="+response.toString());
                        RtnWDSjList rtn = gson.fromJson(response,RtnWDSjList.class);
                        rtnWDSjList = rtn;
                        mShujiaTotalPages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnSJList getRtnSJList()
    {
        return rtnSJList;
    }

    public void setRtnSJList(RtnSJList rtnSJList)
    {
        this.rtnSJList = rtnSJList;
    }

    /**
     * 接收书架列表
     */
    private RtnSJList rtnSJList = new RtnSJList();

    /**
     * 获取我的练习册列表
     * @param tranCode
     */
    public void getWDLXCList(final String tranCode)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.add_wodeshujia_requestUrl)+"?searchCondition=%5B%5D&pageSize=9999&page=1&orderCondition=+order+by+orderId%2C+name";
        pd.show();
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("获取我的练习册结果==="+response.toString());
                        RtnSJList rtn =  gson.fromJson(response,RtnSJList.class);
                        rtnSJList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 保存新增练习册的接口
     * @param tranCode
     * @param stuId
     * @param paperId
     */
    public void submitAddLXC(final String tranCode,final String stuId,final String paperId)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.submit_add_wode_lianxice_requestURl))
                .addParams("stu.id",stuId)
                .addParams("paper.id",paperId)
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
                        System.out.println("保存返回结果"+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 删除我的练习册接口
     * @param tranCode
     * @param id
     */
    public void stuDeleteLXC(final String tranCode,final String id)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.stu_delete_lianxice_requesturl))
                .addParams("id",id)
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
                        System.out.println("删除结果===="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

}



package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;
import android.graphics.Bitmap;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiInfo;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiKuList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnFenCeCuoTList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/26 17:18
 * <p/>
 * 功能描述:YunJiCuo
 */
public class CuoTiKuModel extends AppModel
{

    private Gson gson;
    public CuoTiKuModel()
    {
    }

    public CuoTiKuModel(Context context)
    {
        super(context);
        gson = new Gson();
    }


    public RtnCuoTiKuList getRtnCuoTiKuList()
    {
        return rtnCuoTiKuList;
    }

    public void setRtnCuoTiKuList(RtnCuoTiKuList rtnCuoTiKuList)
    {
        this.rtnCuoTiKuList = rtnCuoTiKuList;
    }

    /**
     * 接收错题库列表
     */
    private RtnCuoTiKuList rtnCuoTiKuList = new RtnCuoTiKuList();

    /**
     *获取错题库列表
     * @param tranCode
     * @param banJBH
     */
    public void getCuoTKuList(final String tranCode,final String banJBH)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.cuotiku_list_requestUrl)+banJBH)
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
                        System.out.println("错题库列表结果====="+response.toString());
                        RtnCuoTiKuList rtn = gson.fromJson(response,RtnCuoTiKuList.class);
                        rtnCuoTiKuList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 用来接收返回的分册错题列表
     */
    private RtnFenCeCuoTList rtnFenCeCuoTList = new RtnFenCeCuoTList();
    public RtnFenCeCuoTList getRtnFenCeCuoTList()
    {
        return rtnFenCeCuoTList;
    }

    public void setRtnFenCeCuoTList(RtnFenCeCuoTList rtnFenCeCuoTList)
    {
        this.rtnFenCeCuoTList = rtnFenCeCuoTList;
    }


    public int getmFenCeTotalPages()
    {
        return mFenCeTotalPages;
    }

    public void setmFenCeTotalPages(int mFenCeTotalPages)
    {
        this.mFenCeTotalPages = mFenCeTotalPages;
    }

    private int mFenCeTotalPages;  //分册总页数


    /**
     * 获取分册错题列表
     * @param tranCode
     */
    public void getFenCeCuoTiList(final String tranCode,final String banJBH,final String lianXCId,final int page,final int pageSize)
    {
        String tempUrl = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.fence_cuoti_list_requestUrl) +
                "?searchCondition=%5B%7B%22searchPro%22%3A%22bjId%22%2C%22searchVal%22%3A%22" +
                banJBH +
                "%22%7D%2C%7B%22searchPro%22%3A%22paperId%22%2C%22searchVal%22%3A%22" +
                lianXCId +
                "%22%7D%5D&pageSize=" +
                String.valueOf(pageSize) +
                "&page=" +
                String.valueOf(page) +
                "&orderCondition=+order+by+qpage+desc%2Cqnum";
         pd.show();
        OkHttpUtils.get()
                .url(tempUrl)
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
                        System.out.println("获取分册错题列表===="+response.toString());
                        RtnFenCeCuoTList rtn  = gson.fromJson(response,RtnFenCeCuoTList.class);
                        rtnFenCeCuoTList = rtn;
                        mFenCeTotalPages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 返回错题详情
     */
    private RtnCuoTiInfo rtnCuoTiInfo = new RtnCuoTiInfo();
    public RtnCuoTiInfo getRtnCuoTiInfo()
    {
        return rtnCuoTiInfo;
    }

    public void setRtnCuoTiInfo(RtnCuoTiInfo rtnCuoTiInfo)
    {
        this.rtnCuoTiInfo = rtnCuoTiInfo;
    }




    /**
     * 获取错题详情接口
     * @param tranCode
     * @param lianXCId
     */
    public void getCuoTInfo(final String tranCode,final String lianXCId)
    {
        pd.show();
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.cuotilist_info_requesturl)+lianXCId;
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
                        System.out.println("获取错题详情结果===="+response.toString());
                        RtnCuoTiInfo rtn = gson.fromJson(response,RtnCuoTiInfo.class);
                        rtnCuoTiInfo = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }



}



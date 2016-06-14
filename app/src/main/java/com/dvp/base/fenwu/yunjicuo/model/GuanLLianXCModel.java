package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.ParLianxiceList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnGuanLLianXC;
import com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice.RtnLianXiCeList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/24 15:48
 * <p/>
 * 功能描述:YunJiCuo
 */
public class GuanLLianXCModel extends AppModel
{
    private Gson gson;
    public GuanLLianXCModel()
    {
        super();
    }

    public GuanLLianXCModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    /**
     * 接受返回的练习册列表
     */
    private RtnGuanLLianXC rtnGuanLLianXC = new RtnGuanLLianXC();

    public RtnGuanLLianXC getRtnGuanLLianXC()
    {
        return rtnGuanLLianXC;
    }

    public void setRtnGuanLLianXC(RtnGuanLLianXC rtnGuanLLianXC)
    {
        this.rtnGuanLLianXC = rtnGuanLLianXC;
    }

    /**
     * 总页数
     */
    private int  totalPages;
    public int getTotalPages()
    {
        return totalPages;
    }

    public void setTotalPages(int totalPages)
    {
        this.totalPages = totalPages;
    }


    /**
     * 获取管理的练习册
     *
     * @param tranCode
     * @param page
     * @param pageSize
     * @param banJBHao
     */
    public void getGuanLiLianXCList(final String tranCode,final int pageSize,final int page,final String banJBHao)
    {
        pd.show();

        String searchCondition = "[{\"searchVal\":\"00000002\",\"searchPro\":\"banJ.id\"}]";

        String jsonParam = "["+gson.toJson(new ParLianxiceList(banJBHao,"banJ.id")).toString()+"]";


        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.getlianxicelist))
                .addParams("searchCondition",jsonParam)
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
                        System.out.println("练习册列表===="+response.toString());
                        RtnGuanLLianXC rtn = gson.fromJson(response,RtnGuanLLianXC.class);

                        if(page == 1)
                        {
                            if(rtnGuanLLianXC!=null)
                            {
                                if( rtnGuanLLianXC.getData()!=null &&  rtnGuanLLianXC.getData().size()>0)
                                {
                                    rtnGuanLLianXC.getData().clear();
                                }

                            }

                        }
                        rtnGuanLLianXC= rtn;
                        totalPages = (rtn.getTotalCount()%3==0)?(rtn.getTotalCount()/3):(rtn.getTotalCount()/3+1);
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 用来接收具体的练习册
     */
    private RtnLianXiCeList rtnJuTiLianXiCeList = new RtnLianXiCeList();
    public RtnLianXiCeList getRtnJuTiLianXiCeList()
    {
        return rtnJuTiLianXiCeList;
    }

    public void setRtnJuTiLianXiCeList(RtnLianXiCeList rtnJuTiLianXiCeList)
    {
        this.rtnJuTiLianXiCeList = rtnJuTiLianXiCeList;
    }
    /**
     * 获取具体的练习册    然后用于新增练习册的接口
     *
     * @param tranCode
     * @param banJId
     */
    public void getLianxiceList(final String tranCode,final String banJId)
    {

        System.out.println("==="+banJId);
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.get_banji_lianxice_list_requestUrl))
                .addParams("banJId",banJId)
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

                        System.out.println("具体联系册====="+response.toString());
                        String result = "{\"mLianXList\":"+response+"}";
                        RtnLianXiCeList rtn = gson.fromJson(result,RtnLianXiCeList.class);
                        rtnJuTiLianXiCeList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 新增练习册的保存接口
     * @param tranCode
     * @param banJId
     * @param paperId
     */
    public void submitAddLianXC(final String tranCode,final String banJId,final String paperId)
    {

        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.submit_add_lianxice_requestUrl))
                .addParams("banJ.id",banJId)
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
                        System.out.println("保存练习册成功==="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }
}



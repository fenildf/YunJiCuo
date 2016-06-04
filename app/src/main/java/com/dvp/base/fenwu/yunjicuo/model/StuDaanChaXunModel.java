package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;
import android.text.style.ReplacementSpan;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnDaAnInfo;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSJList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/6/1 16:13
 * <p/>
 * 功能描述:YunJiCuo
 */
public class StuDaanChaXunModel extends AppModel
{

    private Gson gson;
    public StuDaanChaXunModel()
    {
    }

    public StuDaanChaXunModel(Context context)
    {
        super(context);
        gson = new Gson();
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
     * 接收练习册列表
     */
    private RtnSJList rtnSJList = new RtnSJList();

    public void getWDLXCList(final String tranCode)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.add_wodeshujia_requestUrl)+"?searchCondition=%5B%5D&pageSize=999999&page=1&orderCondition=+order+by+orderId%2C+name";
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




    public String[] getStrYeMa()
    {
        return strYeMa;
    }

    public void setStrYeMa(String[] strYeMa)
    {
        this.strYeMa = strYeMa;
    }

    private String[] strYeMa;//接收页码

    /**
     * 获取页码
     *
     * @param tranCode
     * @param lianxiceId
     */
    public void getYeMa(final String tranCode, final String lianxiceId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) + mContext.getResources().getString(R.string.stu_add_wodecuotiben_getyema_requesturl) + lianxiceId + "/pages";
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
                        System.out.println("获取页码结果=====" + response.toString());
                        String result = response.substring(1, response.length() - 1);
                        String[] str = result.split(",");
                        strYeMa = str;
                        OnHttpResponse(tranCode, null);
                    }
                });
    }


    /**
     * 接收返回的题号
     */
    private RtnTiHaoList rtnTiHaoList = new RtnTiHaoList();

    public RtnTiHaoList getRtnTiHaoList()
    {
        return rtnTiHaoList;
    }

    public void setRtnTiHaoList(RtnTiHaoList rtnTiHaoList)
    {
        this.rtnTiHaoList = rtnTiHaoList;
    }

    /**
     * 获取题号
     *
     * @param tranCode
     * @param lianxiceId
     * @param yema
     */
    public void getTihao(final String tranCode, final String lianxiceId, final String yema)
    {
        //这里拼接了数组传递参数来请求数据
        /*StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < yema.size(); i++)
        {
            strBuilder.append("page=");
            strBuilder.append(yema.get(i));
            strBuilder.append("&");

        }*/
        String url = mContext.getResources().getString(R.string.http_request_url) + mContext.getResources().getString(R.string.stu_add_wodecuotiben_gettihao_requesturl) + lianxiceId + "/nums?page="+yema;

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
                        System.out.println("获取题号结果=====" + response.toString());
                        String result = "{\"data\":" + response + "}";
                        RtnTiHaoList rtn = gson.fromJson(result, RtnTiHaoList.class);
                        rtnTiHaoList = rtn;
                        OnHttpResponse(tranCode, null);

                    }
                });
    }


    public RtnDaAnInfo getRtnDaAnInfo()
    {
        return rtnDaAnInfo;
    }

    public void setRtnDaAnInfo(RtnDaAnInfo rtnDaAnInfo)
    {
        this.rtnDaAnInfo = rtnDaAnInfo;
    }

    /**
     * 返回的错题详情
     */
    private RtnDaAnInfo rtnDaAnInfo = new RtnDaAnInfo();

    /**
     *
     * @param tranCode
     * @param xitiId
     */
    public void getDaAnInfo(final String tranCode,final String xitiId)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.stu_daanchaxun_byxitiid_requesturl)+xitiId)
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

                        System.out.println("获取答案详情结果==="+ response.toString());
                        RtnDaAnInfo rtn = gson.fromJson(response,RtnDaAnInfo.class);
                        rtnDaAnInfo = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 加入错题库
     *
     * @param tranCode
     * @param stuId
     * @param paperId
     * @param qId
     * @param yema
     */
    public void submitJiaRuCuoTK(final String tranCode,final String stuId,final String paperId,final String qId,final String yema)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.stu_daanchaxun_jiarucuotiku_requesturl)+stuId+"/"+paperId+"/data";
        pd.show();
        OkHttpUtils.post()
                .url(url)
                .addParams("qId",qId)
                .addParams("page",yema)
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
                        System.out.println("加入错题库结果====="+response.toString());
                       /* if(response.equals("[]"))   //  返回[] 说明该题加过。。如果返回json串则说明是新加的错题
                        {*/
                            OnHttpResponse(tranCode,null);
                        //}
                      /*  else {
                            DialogUtil.showToast(mContext,"加入失败");
                        }*/

                    }
                });
    }

}



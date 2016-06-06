package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiInfo;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuCuoTiLieBiaoList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuLianXCOrShiJuanList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnStuWDCTBList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/30 09:27
 * <p/>
 * 功能描述:YunJiCuo
 */
public class StuWoDeCuoTiBenModel extends AppModel
{
    private Gson gson;

    public StuWoDeCuoTiBenModel()
    {
    }

    public StuWoDeCuoTiBenModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    public RtnStuWDCTBList getRtnStuWDCTBList()
    {
        return rtnStuWDCTBList;
    }

    public void setRtnStuWDCTBList(RtnStuWDCTBList rtnStuWDCTBList)
    {
        this.rtnStuWDCTBList = rtnStuWDCTBList;
    }

    /**
     * 返回我的错题本列表
     */
    private RtnStuWDCTBList rtnStuWDCTBList = new RtnStuWDCTBList();

    /**
     * 获取我的错题本
     *
     * @param tranCode
     * @param stuId
     */
    public void getStuWDCTB(final String tranCode, final String stuId)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url) + mContext.getResources().getString(R.string.stu_wodecuotiben_requestUrl) + stuId)
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
                        System.out.println("获取学生我的错题本=====" + response.toString());
                        RtnStuWDCTBList rtn = gson.fromJson(response, RtnStuWDCTBList.class);
                        rtnStuWDCTBList = rtn;
                        OnHttpResponse(tranCode, null);
                    }
                });
    }


    /**
     * 获取练习册列表
     */
    private RtnStuLianXCOrShiJuanList rtnStuLianXCOrShiJuanList = new RtnStuLianXCOrShiJuanList();

    public RtnStuLianXCOrShiJuanList getRtnStuLianXCOrShiJuanList()
    {
        return rtnStuLianXCOrShiJuanList;
    }

    public void setRtnStuLianXCOrShiJuanList(RtnStuLianXCOrShiJuanList rtnStuLianXCOrShiJuanList)
    {
        this.rtnStuLianXCOrShiJuanList = rtnStuLianXCOrShiJuanList;
    }

    /**
     * 新增我的错题本时候获取练习册或者我的书架列表
     *
     * @param tranCode
     */
    public void addStuCuoTiBen(final String tranCode)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url) + mContext.getResources().getString(R.string.stu_add_wodecuotiben_requestUrl))
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
                        System.out.println("获取练习册列表和我的书架列表====" + response.toString());
                        RtnStuLianXCOrShiJuanList rtn = gson.fromJson(response, RtnStuLianXCOrShiJuanList.class);
                        rtnStuLianXCOrShiJuanList = rtn;
                        OnHttpResponse(tranCode, null);
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
    public void getTihao(final String tranCode, final String lianxiceId, final List<String> yema)
    {
        //这里拼接了数组传递参数来请求数据
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < yema.size(); i++)
        {
            strBuilder.append("page=");
            strBuilder.append(yema.get(i));
            strBuilder.append("&");

        }
        String url = mContext.getResources().getString(R.string.http_request_url) + mContext.getResources().getString(R.string.stu_add_wodecuotiben_gettihao_requesturl) + lianxiceId + "/nums?"+strBuilder.toString();

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

    /**
     * 保存我的错题本接口
     * @param tranCode
     * @param stuId
     * @param paperId
     * @param yemaList
     * @param tihaoMap
     */
    public void submitAddCuoTiBen(final String tranCode,final String stuId,final String paperId,final List<String> yemaList,final HashMap<String,String> tihaoMap)
    {

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < yemaList.size(); i++)
        {
            strBuilder.append("page=");
            strBuilder.append(yemaList.get(i));
            strBuilder.append("&");

        }

        StringBuilder strMap = new StringBuilder();
        Iterator iter = tihaoMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();

            strMap.append("qId=");
            strMap.append(key+"&");
        }


        String url = mContext.getResources().getString(R.string.http_request_url)+
                mContext.getResources().getString(R.string.stu_add_wodecuotiben_submit_requesturl)+
                stuId+
                "/"
                +paperId
                +"/data?"
                +strBuilder.toString()
                +strMap.toString();
        pd.show();
        try
        {
            OkHttpUtils.getInstance().setConnectTimeout(500000,null);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
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
                        System.out.println("保存错误===="+call.toString());
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if(pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("保存学生错题本返回结果===="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }




    public RtnStuCuoTiLieBiaoList getRtnStuCuoTiLieBiaoList()
    {
        return rtnStuCuoTiLieBiaoList;
    }

    public void setRtnStuCuoTiLieBiaoList(RtnStuCuoTiLieBiaoList rtnStuCuoTiLieBiaoList)
    {
        this.rtnStuCuoTiLieBiaoList = rtnStuCuoTiLieBiaoList;
    }

    /**
     * 返回错题列表
     */
    private RtnStuCuoTiLieBiaoList rtnStuCuoTiLieBiaoList = new RtnStuCuoTiLieBiaoList();

    public int getmCuoTTotalPages()
    {
        return mCuoTTotalPages;
    }

    public void setmCuoTTotalPages(int mCuoTTotalPages)
    {
        this.mCuoTTotalPages = mCuoTTotalPages;
    }

    private int mCuoTTotalPages;

    /**
     * 获取错题列表界面
     *
     * @param tranCode
     * @param stuId
     * @param questionPaperId
     * @param page
     * @param pageSize
     */
    public void getStuCTLieBiaoList(final String tranCode, final String stuId, final String questionPaperId, final int page, final int pageSize)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.stu_wodecuotiben_cuotiliebiao_requesturl) +
                "searchCondition=%5B%7B%22searchPro%22%3A%22student.id%22%2C%22searchVal%22%3A%22" +
                stuId +
                "%22%7D%2C%7B%22searchPro%22%3A%22question.paper.id%22%2C%22searchVal%22%3A%22" +
                questionPaperId +
                "%22%7D%5D&pageSize=" +
                String.valueOf(pageSize) +
                "&page=" +
                String.valueOf(page) +
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
                        System.out.println("获取错题列表====" + response.toString());
                        RtnStuCuoTiLieBiaoList rtn = gson.fromJson(response, RtnStuCuoTiLieBiaoList.class);
                        rtnStuCuoTiLieBiaoList = rtn;
                        mCuoTTotalPages = (rtn.getTotalCount() % rtn.getPageSize() == 0) ? (rtn.getTotalCount() / rtn.getPageSize()) : (rtn.getTotalCount() / rtn.getPageSize() + 1);

                        OnHttpResponse(tranCode, null);
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



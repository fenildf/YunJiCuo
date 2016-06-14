package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnBuZXiTList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnBuZhiZuoYeList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetBanJList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetKeMList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnGetLianXCList;
import com.dvp.base.fenwu.yunjicuo.domain.buzhizuoye.RtnSubmitZuoYe;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTiInfo;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/25 16:53
 * <p/>
 * 功能描述:YunJiCuo
 */
public class BuZhiZuoYeModel extends AppModel
{

    private Gson gson;
    public BuZhiZuoYeModel()
    {
        super();
    }

    public BuZhiZuoYeModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    /**
     * 接收返回的布置作业列表
     */
    private RtnBuZhiZuoYeList rtnBuZhiZuoYeList = new RtnBuZhiZuoYeList();

    public RtnBuZhiZuoYeList getRtnBuZhiZuoYeList()
    {
        return rtnBuZhiZuoYeList;
    }

    public void setRtnBuZhiZuoYeList(RtnBuZhiZuoYeList rtnBuZhiZuoYeList)
    {
        this.rtnBuZhiZuoYeList = rtnBuZhiZuoYeList;
    }


    public int getTotalPages()
    {
        return totalPages;
    }

    public void setTotalPages(int totalPages)
    {
        this.totalPages = totalPages;
    }

    private int totalPages;//总页数

    public void getBuZhiZuoYeList(final String tranCode,final String staffId,final int pageSize,final int page)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)
                +mContext.getResources().getString(R.string.buzhizuoye_getList_requestUrl)
                +staffId
                +"/data"
                +"?searchCondition=%5B%5D&pageSize="
                +String.valueOf(pageSize)
                +"&page="
                +String.valueOf(page)
                +"&orderCondition=+order+by+homework.kaiShShJ+desc";


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

                        System.out.println("布置作业返回数据====="+response.toString());
                        RtnBuZhiZuoYeList rtn = gson.fromJson(response,RtnBuZhiZuoYeList.class);
                        if(page == 1)
                        {
                            if(rtnBuZhiZuoYeList!=null)
                            {
                                if( rtnBuZhiZuoYeList.getData()!=null &&  rtnBuZhiZuoYeList.getData().size()>0)
                                {
                                    rtnBuZhiZuoYeList.getData().clear();
                                }

                            }
                        }

                        totalPages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);

                        rtnBuZhiZuoYeList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 用来接收返回的布置作业的习题列表
     */
    private RtnBuZXiTList rtnBuZXiTList = new RtnBuZXiTList();
    public RtnBuZXiTList getRtnBuZXiTList()
    {
        return rtnBuZXiTList;
    }

    public void setRtnBuZXiTList(RtnBuZXiTList rtnBuZXiTList)
    {
        this.rtnBuZXiTList = rtnBuZXiTList;
    }



    /**
     * 获取习题详情列表   从布置作业里的习题详情点击进去后的接口
     * @param tranCode
     * @param homeworkId
     */
    public void getXiTiList(final String tranCode,final String homeworkId)
    {

      /*  String jsonParam = "[{\"searchVal\":\"" +
                homeworkId                      //"e549102453c6cb870153e675882f25ff"
                + "\",\"searchPro\":\"homework.id\"}]";*/

        String url = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.xitixiangqing_list_requestUrl) +
                "?searchCondition=%5B%7B%22searchVal%22%3A%22" +
                homeworkId +
                "%22%2C%22searchPro%22%3A%22homework.id%22%7D%5D&pageSize=999999&page=1&orderCondition=+order+by+question.paper%2Ccast(question.page+as+int)%2Cquestion.num";

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
                        System.out.println("获取习题列表结果===="+response.toString());
                        RtnBuZXiTList rtn = gson.fromJson(response,RtnBuZXiTList.class);
                        rtnBuZXiTList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnGetKeMList getRtnGetKeMList()
    {
        return rtnGetKeMList;
    }

    public void setRtnGetKeMList(RtnGetKeMList rtnGetKeMList)
    {
        this.rtnGetKeMList = rtnGetKeMList;
    }

    /**
     * 获取科目列表
     */
    private RtnGetKeMList rtnGetKeMList = new RtnGetKeMList();


    /**
     * 获取科目列表
     * @param tranCode
     * @param teacherId
     */
    public void getKeMuList(final String tranCode,final String teacherId)
    {
        pd.show();
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.teacher_buzhizuoye_getkemu_requesturl)+teacherId)
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
                        System.out.println("获取科目结果===="+response.toString());
                        RtnGetKeMList rtn = gson.fromJson(response,RtnGetKeMList.class);
                        rtnGetKeMList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnGetBanJList getRtnGetBanJList()
    {
        return rtnGetBanJList;
    }

    public void setRtnGetBanJList(RtnGetBanJList rtnGetBanJList)
    {
        this.rtnGetBanJList = rtnGetBanJList;
    }

    /**
     * 接收通过科目找到的班级列表
     */
    private RtnGetBanJList rtnGetBanJList = new RtnGetBanJList();

    /**
     *
     * 获取班级
     * @param tranCode
     * @param userId
     * @param keMId
     */
    public void getBanJList(final String tranCode,final String userId,final String keMId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/banUser/data?" +
                "searchCondition=%5B%7B%22searchPro%22%3A%22user.id%22%2C%22searchVal%22%3A%22" +
                userId +
                "%22%7D%2C%7B%22searchPro%22%3A%22banJ.keM.id%22%2C%22searchVal%22%3A%22" +
                keMId +
                "%22%7D%2C%7B%22searchPro%22%3A%22isValid%22%2C%22searchVal%22%3A%221%22%7D%2C%7B%22searchPro%22%3A%22type%22%2C%22searchVal%22%3A%221%22%2C%22searchBy%22%3A%22!%3D%22%7D%5D&pageSize=999999&page=1&orderCondition=+order+by+banJ.orderId%2CbanJ.name";

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
                        System.out.println(response.toString());
                        RtnGetBanJList rtn = gson.fromJson(response,RtnGetBanJList.class);
                        rtnGetBanJList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnGetLianXCList getRtnGetLianXCList()
    {
        return rtnGetLianXCList;
    }

    public void setRtnGetLianXCList(RtnGetLianXCList rtnGetLianXCList)
    {
        this.rtnGetLianXCList = rtnGetLianXCList;
    }

    /**
     * 获取练习册接口
     */
    private RtnGetLianXCList rtnGetLianXCList = new RtnGetLianXCList();

    /**
     * 获取练习册
     * @param tranCode
     * @param banJBH  班级编号
     */
    public void getLianXC(final String tranCode,final String banJBH)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/banjipaper/data?searchCondition=%5B%7B%22searchVal%22%3A%22" +
                banJBH +
                "%22%2C%22searchPro%22%3A%22banJ.id%22%7D%5D&pageSize=999999&page=1&orderCondition=";

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
                        System.out.println(response.toString());
                        RtnGetLianXCList rtn = gson.fromJson(response,RtnGetLianXCList.class);
                        rtnGetLianXCList = rtn;
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


    public RtnSubmitZuoYe getRtnSubmitZuoYe()
    {
        return rtnSubmitZuoYe;
    }

    public void setRtnSubmitZuoYe(RtnSubmitZuoYe rtnSubmitZuoYe)
    {
        this.rtnSubmitZuoYe = rtnSubmitZuoYe;
    }

    /**
     * 保存返回成功接口
     */
    private RtnSubmitZuoYe rtnSubmitZuoYe = new RtnSubmitZuoYe();


    /**
     * 布置作业提交接口
     * @param tranCode
     * @param userId
     * @param keMId
     * @param beginTime
     * @param endTime
     * @param remark
     * @param banJBH
     * @param qIDs
     * @param yemas
     */
    public void submitBZZY(final String tranCode,final String userId,final String keMId,final String beginTime,final String endTime,final String remark,final String banJBH,final List<String> qIDs,final  List<String> yemas)
    {

        StringBuilder strBuilder1 = new StringBuilder();
        for (int i = 0; i < qIDs.size(); i++)
        {
            strBuilder1.append("qIds=");
            strBuilder1.append(qIDs.get(i));
            strBuilder1.append("&");

        }

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < yemas.size(); i++)
        {
            strBuilder.append("page=");
            strBuilder.append(yemas.get(i));
            strBuilder.append("&");

        }

        String param = "agent=wechat&"+"user.id="+userId+"&keM.id="+keMId+"&kaiShShJ="+beginTime+"&jieShShJ="+endTime+"&remark="+remark+"&isActived=true"+"&banJID="+banJBH+"&";
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.teacher_buzhizuoye_submit_requesturl)+"?"+param+strBuilder1.toString()+strBuilder.toString();


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
                        System.out.println("====="+response.toString());
                        RtnSubmitZuoYe rtn = gson.fromJson(response,RtnSubmitZuoYe.class);
                        rtnSubmitZuoYe = rtn;
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



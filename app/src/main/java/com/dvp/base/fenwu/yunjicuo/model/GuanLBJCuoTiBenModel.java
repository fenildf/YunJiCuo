package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnBanList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlicuotiben.RtnCuoTTJLXCList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/24 18:58
 * <p/>
 * 功能描述:YunJiCuo
 */
public class GuanLBJCuoTiBenModel extends AppModel
{

    private Gson gson;
    public GuanLBJCuoTiBenModel()
    {
    }

    public GuanLBJCuoTiBenModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    private RtnBanList rtnBanList = new RtnBanList();//用来接收返回的班级列表

    public RtnBanList getRtnBanList()
    {
        return rtnBanList;
    }

    public void setRtnBanList(RtnBanList rtnBanList)
    {
        this.rtnBanList = rtnBanList;
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
    /**
     * 获取错题本列表  这里和获取班级列表的请求是一样的
     *
     * @param tranCode
     */
    public void getBanJCTBList(final String tranCode, final int pageSize, final int page, final String searchCondition)
    {

        //18636832995 的id测试
        //String tempSearchCondition = "[{\"searchVal\":\"e54910245435d22201549344b6c6181d\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]";

        //18735168983的id测试   e549102451280f4f01512828961f0058   密码：218519
        String staffId = CommonApp.getInstance().getAppConfig().getConfig(User.class).getStaffId();
        String tempSearchCondition = "[{\"searchVal\":\""+staffId+"\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]";
        pd.show();

      /*  String tempSearchCondition = "[{\"searchVal\":\"e549102451280f4f01512828961f0058\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]";
        pd.show();*/
        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.banjicuotiben_requestUrl)).addParams("pageSize", String.valueOf(pageSize)).addParams("page", String.valueOf(page))
                .addParams("searchCondition", tempSearchCondition)
                .build().execute(new StringCallback()
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

                System.out.println("班级错题本列表====="+response.toString());
                RtnBanList rtn = gson.fromJson(response, RtnBanList.class);

                if(page == 1)
                {
                    if(rtnBanList!=null)
                    {
                        if( rtnBanList.getData()!=null &&  rtnBanList.getData().size()>0)
                        {
                            rtnBanList.getData().clear();
                        }

                    }

                }
                rtnBanList = rtn;
                totalPages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);

                OnHttpResponse(tranCode, null);
            }
        });
    }


    public RtnCuoTTJLXCList getRtnCuoTTJLXCList()
    {
        return rtnCuoTTJLXCList;
    }

    public void setRtnCuoTTJLXCList(RtnCuoTTJLXCList rtnCuoTTJLXCList)
    {
        this.rtnCuoTTJLXCList = rtnCuoTTJLXCList;
    }

    /**
     *   错题统计模块 接收练习册列表
     */
    private RtnCuoTTJLXCList rtnCuoTTJLXCList = new RtnCuoTTJLXCList();

    /**
     * 统计获取练习册
     * @param tranCode
     * @param banJBH
     */
    public void getCuoTTJLianXCList(final String tranCode,final String banJBH)
    {

        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/banjipaper/data?searchCondition=%5B%7B%22searchPro%22%3A%22banJ.id%22%2C%22searchVal%22%3A%22" +
                banJBH +
                "%22%7D%5D&pageSize=999999&page=1&orderCondition=+order+by+paper.orderId%2C+paper.name";
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
                        System.out.println("统计获取练习册"+response.toString());
                        RtnCuoTTJLXCList rtn = gson.fromJson(response,RtnCuoTTJLXCList.class);
                        rtnCuoTTJLXCList = rtn;
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

}



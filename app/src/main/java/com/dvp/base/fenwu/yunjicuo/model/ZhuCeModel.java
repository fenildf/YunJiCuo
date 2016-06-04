package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;
import android.os.TransactionTooLargeException;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnSchoolList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/6/3 18:28
 * <p/>
 * 功能描述:YunJiCuo
 */
public class ZhuCeModel extends AppModel
{

    private Gson gson;
    public ZhuCeModel()
    {
    }

    public ZhuCeModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    /**
     * 接收返回的学校列表
     */
    private RtnSchoolList rtnSchoolList = new RtnSchoolList();

    public RtnSchoolList getRtnSchoolList()
    {
        return rtnSchoolList;
    }

    public void setRtnSchoolList(RtnSchoolList rtnSchoolList)
    {
        this.rtnSchoolList = rtnSchoolList;
    }


    /**
     * 获取学校列表  目前是固定的死方法获取
     *
     * @param tranCode
     */
    public void getShoolList(final String tranCode)
    {
        pd.show();
        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+"/ct/dynamicpage/2c90813a509266490150926977590058/data?searchCondition=%5B%5D&pageSize=999999&page=1&orderCondition=+order+by+orderId&eId=2c90813a509266490150926977590058"/*mContext.getResources().getString(R.string.getschoolList_request_url)*/)
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

                        System.out.println("获取学校列表====" + response.toString());
                        RtnSchoolList rtn = gson.fromJson(response, RtnSchoolList.class);
                        rtnSchoolList = rtn;
                        OnHttpResponse(tranCode, null);
                    }
                });
    }



    public void getYanZhengMa(final String tranCode,final String telNum)
    {
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/register/sendSMS")
                .addParams("mobile",telNum)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {

                    }

                    @Override
                    public void onResponse(String response)
                    {
                        System.out.println(""+response.toString());
                        if(response.equals("yes"))  //获取验证码成功
                        {
                            OnHttpResponse(tranCode,"0");
                        }
                        else
                        {
                            OnHttpResponse(tranCode,"1");
                        }

                    }
                });

    }


    public String getIsTrueYanzhengma()
    {
        return isTrueYanzhengma;
    }

    public void setIsTrueYanzhengma(String isTrueYanzhengma)
    {
        this.isTrueYanzhengma = isTrueYanzhengma;
    }

    private String isTrueYanzhengma;

    /**
     * 验证验证码是否正确
     * @param tranCode
     * @param vcode
     */
    public void validataVCode(final String tranCode,final String vcode)
    {
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/register/validateVCode")
                .addParams("vCode",vcode)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {

                    }

                    @Override
                    public void onResponse(String response)
                    {
                        System.out.println("验证码是否正确==="+response.toString());
                        isTrueYanzhengma = response.toString();
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 提交注册数据
     * @param tranCode
     * @param name
     * @param password
     * @param repassword
     * @param schoolID
     * @param mobile
     * @param vCode
     */
    public void postSignUp(final String tranCode,final String name,final String password,final String repassword,final String schoolID,final String mobile,final String vCode)
    {

        System.out.println(name+" "+password+" "+repassword+" "+schoolID+" "+mobile+" "+vCode);
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/register")
                .addParams("name",name)
                .addParams("password",password)
                .addParams("repassword",repassword)
                .addParams("schoolID",schoolID)
                .addParams("mobile",mobile)
                .addParams("vCode",vCode)
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

                        System.out.println("提交注册是否成功"+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });


    }
}



package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/6/10 22:03
 * <p>
 * 功能描述:YunJiCuo
 */

public class ForgetPswModel extends AppModel
{

    private Gson gson;

    public ForgetPswModel()
    {
    }

    public ForgetPswModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    /**
     * 发送短信验证码
     *
     * @param tranCode
     * @param telNum
     */
    public void getYanZhengMa(final String tranCode, final String telNum)
    {
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url) + "/register/sendSMS")
                .addParams("mobile", telNum)
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
                        System.out.println("" + response.toString());
                        if (response.equals("yes"))  //获取验证码成功
                        {
                            OnHttpResponse(tranCode, "0");
                        } else
                        {
                            OnHttpResponse(tranCode, "1");
                        }

                    }
                });

    }

    public void createTuXingYanZhengMa(final String tranCode)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/system/createvalicode";
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("" + response.toString());

                        OnHttpResponse(tranCode, null);

                    }
                });

    }

    /**
     * 验证图形验证码是否正确
     *
     * @param tranCode
     */
    public void checkValidata(final String tranCode,final String tuxYZM)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/system/checkvalicode";
        OkHttpUtils.post()
                .url(url)
                .addParams("valiCode",tuxYZM)
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
                        System.out.println("" + response.toString());

                        if(response.equals("true"))
                        {
                            OnHttpResponse(tranCode, "1");
                        }
                        else
                        {
                            OnHttpResponse(tranCode, "0");
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
}

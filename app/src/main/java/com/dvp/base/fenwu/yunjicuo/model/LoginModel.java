package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/23 14:01
 * <p>
 * 功能描述:登陆model
 */
public class LoginModel extends AppModel
{
    public LoginModel()
    {
        super();
    }

    public LoginModel(Context context)
    {
        super(context);
    }

    private String staffId;

    public String getStaffId()
    {
        return staffId;
    }

    public void setStaffId(String staffId)
    {
        this.staffId = staffId;
    }

    /**
     * 登陆接口
     * @param tranCode
     * @param loginName
     * @param password
     */
    public void getLogin(final String tranCode,final String loginName,final String password)
    {
        pd.show();
        OkHttpUtils.post().url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.loginRequestUrl)).addParams("loginName",loginName).addParams("password",password).build().execute(new StringCallback()
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
                if (response.equals("0"))
                {

                    DialogUtil.showToast(mContext,"用户名或者密码错误！");

                }
                else
                {
                    staffId = response.toString();
                    OnHttpResponse(tranCode,null);
                }

            }
        });
    }


}



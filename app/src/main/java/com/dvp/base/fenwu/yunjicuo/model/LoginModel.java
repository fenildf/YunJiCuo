package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.user.RtnUserInfo;
import com.google.gson.Gson;
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
    private Gson gson;
    public LoginModel()
    {
        super();
    }

    public LoginModel(Context context)
    {
        super(context);
        gson = new Gson();
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
                DialogUtil.showToast(mContext,call.toString());
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
                else if(response.equals("1"))
                {
                    DialogUtil.showToast(mContext,"服务端返回异常信息！");
                }
                else
                {
                    staffId = response.toString();
                    OnHttpResponse(tranCode,null);
                }

            }
        });
    }


    public RtnUserInfo getRtnUserInfo()
    {
        return rtnUserInfo;
    }

    public void setRtnUserInfo(RtnUserInfo rtnUserInfo)
    {
        this.rtnUserInfo = rtnUserInfo;
    }

    private RtnUserInfo rtnUserInfo = new RtnUserInfo();

    /**
     * 获取用户的详细信息
     * @param tranCode
     * @param userId
     */
    public void getUserInfo(final String tranCode,final String userId)
    {
        System.out.println("=="+mContext.getResources().getString(R.string.http_request_url)+"/system/user/"+userId+"     "+userId);
        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/system/user/"+userId)
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
                        RtnUserInfo rtn = gson.fromJson(response,RtnUserInfo.class);
                        rtnUserInfo = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


/*
    private void controlKeyboardLayout(final View root, final View scrollToView) {

        root.getViewTreeObserver().addOnGlobalLayoutListener(

                new ViewTreeObserver.OnGlobalLayoutListener() {

                    @Override

                    public void onGlobalLayout() {

                        Rect rect =new Rect();

// 获取root在窗体的可视区域

                        root.getWindowVisibleDisplayFrame(rect);

// 获取root在窗体的不可视区域高度(被其他View遮挡的区域高度)

                        int rootInvisibleHeight = root.getRootView()

                                .getHeight() - rect.bottom;

// 若不可视区域高度大于100，则键盘显示

                        if (rootInvisibleHeight > 100) {

                            int[] location = new int[2];

// 获取scrollToView在窗体的坐标

                            scrollToView.getLocationInWindow(location);

// 计算root滚动高度，使scrollToView在可见区域

                            intsrollHeight = (location[1]

                                    + scrollToView.getHeight() + PixelUtil

                                    .dp2px(10)) - rect.bottom;

                            root.scrollTo(0,srollHeight);

                        } else {

// 键盘隐藏

                            root.scrollTo(0, 0);

                        }

                    }

                });

    }*/

}



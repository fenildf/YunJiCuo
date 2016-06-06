package com.dvp.base.fenwu.yunjicuo.common;

import android.os.Environment;

import com.dvp.base.app.APP;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.zhy.http.okhttp.OkHttpUtils;

/**
 * 类: ProjectNameApp
 * 功能描述:
 * 创建人: 田翔
 * 创建日期: 2016/4/20 09:14
 * 开发环境: JDK1.8
 */
public class CommonApp extends APP
{
    private static CommonApp ourInstance = new CommonApp();

    public static CommonApp getInstance() {
        return ourInstance;
    }


    /**
     * 班级编号
     */
    private String banJBH = "";
    public String getBanJBH()
    {
        return banJBH;
    }

    public void setBanJBH(String banJBH)
    {
        this.banJBH = banJBH;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        ourInstance = this;

        //图片缓存框架
        Fresco.initialize(getApplicationContext());

    }
}

package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 作者：Administrator on 2016/6/1 22:14
 * <p/>
 * 功能描述:YunJiCuo
 */
public class SerMap implements Serializable
{
    public HashMap<String, String> getmMap()
    {
        return mMap;
    }

    public void setmMap(HashMap<String, String> mMap)
    {
        this.mMap = mMap;
    }

    public HashMap<String,String> mMap = new HashMap<>();

}



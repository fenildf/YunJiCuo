package com.dvp.base.fenwu.yunjicuo.domain.user;

/**
 * 作者：Administrator on 2016/5/25 10:00
 * <p/>
 * 功能描述:用户实体类
 */
public class User
{
    private String loginName;
    private String password;
    private String staffId;


    public String getStaffId()
    {
        return staffId;
    }

    public void setStaffId(String staffId)
    {
        this.staffId = staffId;
    }

    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }




}



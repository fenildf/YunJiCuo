package com.dvp.base.fenwu.yunjicuo.domain.guanlibanji;

/**
 * 作者：Administrator on 2016/5/26 10:01
 * <p/>
 * 功能描述:删除班级时候的返回结果
 */
public class RtnDeleteClass
{

    /**
     * errorMessage : ConstraintViolation
     * statusCode : 500
     */

    private String errorMessage;
    private String statusCode;

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(String statusCode)
    {
        this.statusCode = statusCode;
    }
}



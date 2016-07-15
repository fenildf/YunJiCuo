package com.dvp.base.fenwu.yunjicuo.domain;

/**
 * 类：FunctionEntity
 * 功能描述:主界面九宫格功能列表实体
 * 创建人：温涛
 * 创建日期：2016/7/3
 * 开发环境：JDK1.8
 */
public class FunctionEntity
{
    public String functionStr;  //标题
    public int functionIconStr;//图标
    public String functionContent;  //内容


    public String getFunctionContent()
    {
        return functionContent;
    }

    public void setFunctionContent(String functionContent)
    {
        this.functionContent = functionContent;
    }




    public String getFunctionStr()
    {
        return functionStr;
    }

    public void setFunctionStr(String functionStr)
    {
        this.functionStr = functionStr;
    }

    public int getFunctionIconStr()
    {
        return functionIconStr;
    }

    public void setFunctionIconStr(int functionIconStr)
    {
        this.functionIconStr = functionIconStr;
    }
}



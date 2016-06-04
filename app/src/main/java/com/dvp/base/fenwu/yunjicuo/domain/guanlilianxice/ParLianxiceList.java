package com.dvp.base.fenwu.yunjicuo.domain.guanlilianxice;

/**
 * 作者：Administrator on 2016/5/24 15:59
 * <p/>
 * 功能描述:YunJiCuo
 */
public class ParLianxiceList
{

    /**
     * searchVal : 00000002
     * searchPro : banJ.id
     */

    private String searchVal;

    public ParLianxiceList(String searchVal, String searchPro)
    {
        this.searchVal = searchVal;
        this.searchPro = searchPro;
    }

    private String searchPro;

    public String getSearchVal()
    {
        return searchVal;
    }

    public void setSearchVal(String searchVal)
    {
        this.searchVal = searchVal;
    }

    public String getSearchPro()
    {
        return searchPro;
    }

    public void setSearchPro(String searchPro)
    {
        this.searchPro = searchPro;
    }
}



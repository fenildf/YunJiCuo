package com.dvp.base.fenwu.yunjicuo.domain.guanlibanji;

/**
 * 作者：Administrator on 2016/5/23 16:08
 * <p/>
 * 功能描述:YunJiCuo
 */
public class ParGetBanJList
{
    /**
     * searchVal : e54910245435d22201549344b6c6181d
     * searchPro : user.id
     */

    private String searchVal;
    private String searchPro;
    public ParGetBanJList(String searchVal, String searchPro)
    {
        this.searchVal = searchVal;
        this.searchPro = searchPro;
    }

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



package com.dvp.base.fenwu.yunjicuo.domain.student;

import java.util.List;

/**
 * 作者：Administrator on 2016/5/30 15:17
 * <p/>
 * 功能描述:返回题号
 */
public class RtnTiHaoList
{


    /**
     * page : 34
     * nums : [{"id":"e549102453823eff015382af4d940043","num":"提升-1"},{"id":"e549102453823eff015382b0b1890044","num":"提升-2"},{"id":"e549102453823eff015382b146470045","num":"提升-3"},{"id":"e549102453823eff015382b217330046","num":"提升-4"},{"id":"e549102453823eff0153837dcfca0080","num":"提升-5"},{"id":"e549102453823eff0153837f2ad50081","num":"提升-6"},{"id":"e549102453823eff015383844a9a0082","num":"提升-7"},{"id":"e549102453823eff0153838560110083","num":"提升-8"},{"id":"e549102453823eff015383877d830084","num":"提升-9"}]
     */

    private List<DataEntity> data;

    public List<DataEntity> getData()
    {
        return data;
    }

    public void setData(List<DataEntity> data)
    {
        this.data = data;
    }

    public static class DataEntity
    {
        private int page;
        /**
         * id : e549102453823eff015382af4d940043
         * num : 提升-1
         */

        private List<NumsEntity> nums;

        public int getPage()
        {
            return page;
        }

        public void setPage(int page)
        {
            this.page = page;
        }

        public List<NumsEntity> getNums()
        {
            return nums;
        }

        public void setNums(List<NumsEntity> nums)
        {
            this.nums = nums;
        }

        public static class NumsEntity
        {
            private String id;
            private String num;

            public String getId()
            {
                return id;
            }

            public void setId(String id)
            {
                this.id = id;
            }

            public String getNum()
            {
                return num;
            }

            public void setNum(String num)
            {
                this.num = num;
            }
        }
    }
}



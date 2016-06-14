package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.common.webservice.WebserviceCallback;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnBanList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnDeleteClass;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnKeMList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlibanji.RtnSchoolList;
import com.dvp.base.fenwu.yunjicuo.domain.guanlixuesheng.RtnStudentList;
import com.dvp.base.fenwu.yunjicuo.domain.user.User;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/5/23 14:50
 * <p>
 * 功能描述:老师   管理班级的model
 */
public class GuanLBJModel extends AppModel
{

    private Gson gson;

    public GuanLBJModel()
    {
    }

    public GuanLBJModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    private RtnBanList rtnBanList = new RtnBanList();//用来接收返回的班级列表

    public RtnBanList getRtnBanList()
    {
        return rtnBanList;
    }

    public void setRtnBanList(RtnBanList rtnBanList)
    {
        this.rtnBanList = rtnBanList;
    }


    public int getTotalPages()
    {
        return totalPages;
    }

    public void setTotalPages(int totalPages)
    {
        this.totalPages = totalPages;
    }

    private int totalPages;//总页数
    /**
     * 获取班级list
     *
     * @param tranCode
     */
    public void getClassList(final String tranCode, final int pageSize, final int page, final String searchCondition)
    {

        //18636832995 的id测试
        //String tempSearchCondition = "[{\"searchVal\":\"e54910245435d22201549344b6c6181d\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]";

        //18735168983的id测试   e549102451280f4f01512828961f0058   密码：218519
        String staffId = CommonApp.getInstance().getAppConfig().getConfig(User.class).getStaffId();
        String tempSearchCondition = "[{\"searchVal\":\""+staffId+"\",\"searchPro\":\"user.id\"},{\"searchVal\":\"1\",\"searchPro\":\"type\",\"searchBy\":\"!=\"}]";
        pd.show();
        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.getBanJIRequestUrl)).addParams("pageSize", String.valueOf(pageSize)).addParams("page", String.valueOf(page))
                .addParams("searchCondition", tempSearchCondition)
                .build().execute(new StringCallback()
        {
            @Override
            public void onError(Call call, Exception e)
            {
                if (pd.isShowing())
                {
                    pd.dismiss();
                }
            }

            @Override
            public void onResponse(String response)
            {
                if (pd.isShowing())
                {
                    pd.dismiss();
                }
                RtnBanList rtn = gson.fromJson(response, RtnBanList.class);

                if(page == 1)
                {
                    if(rtnBanList!=null)
                    {
                        if( rtnBanList.getData()!=null &&  rtnBanList.getData().size()>0)
                        {
                            rtnBanList.getData().clear();
                        }

                    }

                }
                rtnBanList = rtn;
                totalPages = (rtn.getTotalCount()%3==0)?(rtn.getTotalCount()/3):(rtn.getTotalCount()/3+1);

                OnHttpResponse(tranCode, null);
            }
        });
    }

    /**
     * 接收返回的学校列表
     */
    private RtnSchoolList rtnSchoolList = new RtnSchoolList();

    public RtnSchoolList getRtnSchoolList()
    {
        return rtnSchoolList;
    }

    public void setRtnSchoolList(RtnSchoolList rtnSchoolList)
    {
        this.rtnSchoolList = rtnSchoolList;
    }


    /**
     * 获取学校列表  目前是固定的死方法获取
     *
     * @param tranCode
     */
    public void getShoolList(final String tranCode)
    {
        pd.show();
        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+"/ct/dynamicpage/2c90813a509266490150926977590058/data?searchCondition=%5B%5D&pageSize=999999&page=1&orderCondition=+order+by+orderId&eId=2c90813a509266490150926977590058"/*mContext.getResources().getString(R.string.getschoolList_request_url)*/)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }

                        System.out.println("获取学校列表====" + response.toString());
                        RtnSchoolList rtn = gson.fromJson(response, RtnSchoolList.class);
                        rtnSchoolList = rtn;
                        OnHttpResponse(tranCode, null);
                    }
                });
    }


    /**
     * 接受科目列表
     */
    private RtnKeMList rtnKeMList = new RtnKeMList();

    public RtnKeMList getRtnKeMList()
    {
        return rtnKeMList;
    }

    public void setRtnKeMList(RtnKeMList rtnKeMList)
    {
        this.rtnKeMList = rtnKeMList;
    }


    /**
     * 获取科目列表  这是固定方法获取
     *
     * @param tranCode
     */
    public void getKemuList(final String tranCode)
    {
        pd.show();
        OkHttpUtils.get().url(mContext.getResources().getString(R.string.http_request_url)+"/ct/dynamicpage/2c90813a5089a67c015089ab7dc1003e/data?searchCondition=%5B%5D&pageSize=999999&page=1&orderCondition=+order+by+orderId&eId=2c90813a509266490150926977590058")
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }

                        System.out.println("获取科目列表====" + response.toString());
                        RtnKeMList rtn = gson.fromJson(response, RtnKeMList.class);
                        rtnKeMList = rtn;
                        OnHttpResponse(tranCode, null);
                    }
                });
    }

    /**
     * 新增班级时候的提交类
     * @param tranCode
     * @param schoolId
     * @param keMId
     * @param banJMingCh
     */
    public void postAddClass(final String tranCode,final String schoolId,final String keMId,final String banJMingCh)
    {
        pd.show();
        OkHttpUtils.post().url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.addclass_submit_requestUrl))
                .addParams("school.id",schoolId)
                .addParams("keM.id",keMId)
                .addParams("name",banJMingCh)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {

                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {

                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }

                        System.out.println("提交===="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 修改班级
     * @param tranCode
     * @param banJBH
     * @param schoolId
     * @param banjiName
     */
    public void submitModifyClass(final String tranCode,final String banJBH,final String schoolId,final String banjiName)
    {
        String tempUrl = banJBH+"?_method=PUT";
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.xiugai_banji_requestUrl)+tempUrl)
                .addParams("school.id",schoolId)
                .addParams("name",banjiName)
                .build()
                .execute(new StringCallback()
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
                        System.out.println("修改班级提交结果====="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

    /**
     * 删除班级
     * @param tranCode
     * @param banJBH
     */
    public void deleteClass(final String tranCode,final String banJBH)
    {
        String tempUrl = "?_method=DELETE";
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.delete_banji_requestUrl)+tempUrl)
                .addParams("id",banJBH)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("==");
                        DialogUtil.showToast(mContext,"网络异常");
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("删除班级结果===="+response.toString());
                        RtnDeleteClass rtn = gson.fromJson(response,RtnDeleteClass.class);
                        if(rtn.getStatusCode().equals("500"))
                        {
                            DialogUtil.showToast(mContext,"暂时无法删除");
                        }
                        else{
                            OnHttpResponse(tranCode,null);
                        }

                    }
                });
    }


    /**
     * 接收已审学生列表
     */
    private RtnStudentList rtnStudentList1 = new RtnStudentList();
    public RtnStudentList getRtnStudentList1()
    {
        return rtnStudentList1;
    }

    public void setRtnStudentList1(RtnStudentList rtnStudentList1)
    {
        this.rtnStudentList1 = rtnStudentList1;
    }


    /**
     * 学生
     */
    private int mXueShTotalPages1;//已审总页数
    private int mXueShTotalPages2;//未审总页数
    public int getmXueShTotalPages2()
    {
        return mXueShTotalPages2;
    }

    public void setmXueShTotalPages2(int mXueShTotalPages2)
    {
        this.mXueShTotalPages2 = mXueShTotalPages2;
    }

    public int getmXueShTotalPages1()
    {
        return mXueShTotalPages1;
    }

    public void setmXueShTotalPages1(int mXueShTotalPages1)
    {
        this.mXueShTotalPages1 = mXueShTotalPages1;
    }



    /**
     * 接收未审学生列表
     */
    private RtnStudentList trnStudentList2 = new RtnStudentList();
    public RtnStudentList getTrnStudentList2()
    {
        return trnStudentList2;
    }

    public void setTrnStudentList2(RtnStudentList trnStudentList2)
    {
        this.trnStudentList2 = trnStudentList2;
    }


    /**
     * 获取已审学生列表
     *
     * @param tranCode
     * @param banJBH
     */
    public void getYiShenXueSList(final String tranCode,final String banJBH,final int pageSize,final int page)
    {
        String searchContion ="[{\"searchPro\":\"banJ.id\",\"searchVal\":\""+banJBH+"\"},{\"searchPro\":\"isValid\",\"searchVal\":\"1\"},{\"searchPro\":\"type\",\"searchVal\":\"0\",\"searchBy\":\"!=\"}]";
        pd.show();

        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.xueshengguanli_list_requestUrl))
                .addParams("searchCondition",searchContion)
                .addParams("pageSize",String.valueOf(pageSize))
                .addParams("page",String.valueOf(page))
                .addParams("orderCondition","")
                .build()
                .execute(new StringCallback()
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
                        System.out.println("获取学生已审列表===="+response.toString());
                        RtnStudentList rtn = gson.fromJson(response,RtnStudentList.class);
                        if(page == 1)
                        {
                            if(rtnStudentList1!=null)
                            {
                                if( rtnStudentList1.getData()!=null &&  rtnStudentList1.getData().size()>0)
                                {
                                    rtnStudentList1.getData().clear();
                                }

                            }

                        }

                        mXueShTotalPages1 = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);
                        rtnStudentList1 = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });

    }


    /**
     * 获取未审学生列表
     *
     * @param tranCode
     * @param banJBH
     */
    public void getWeiShenXueSList(final String tranCode,final String banJBH,final int pageSize,final int page)
    {
        String searchContion ="[{\"searchPro\":\"banJ.id\",\"searchVal\":\""+banJBH+"\"},{\"searchPro\":\"isValid\",\"searchVal\":\"0\"},{\"searchPro\":\"type\",\"searchVal\":\"0\",\"searchBy\":\"!=\"}]";
        pd.show();

        OkHttpUtils.get()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.xueshengguanli_list_requestUrl))
                .addParams("searchCondition",searchContion)
                .addParams("pageSize",String.valueOf(pageSize))
                .addParams("page",String.valueOf(page))
                .addParams("orderCondition","")
                .build()
                .execute(new StringCallback()
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
                        System.out.println("获取学生已审列表===="+response.toString());
                        RtnStudentList rtn = gson.fromJson(response,RtnStudentList.class);

                        if(page == 1)
                        {
                            if(trnStudentList2!=null)
                            {
                                if( trnStudentList2.getData()!=null &&  trnStudentList2.getData().size()>0)
                                {
                                    trnStudentList2.getData().clear();
                                }

                            }

                        }

                        mXueShTotalPages2 = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);
                        trnStudentList2 = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 设置管理员
     * @param tranCode
     * @param staffId
     */
    public void setAdmin(final String tranCode,final String staffId)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.setadmin_requestUrl)+staffId)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("设置管理员==="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 取消管理员
     * @param tranCode
     * @param staffId
     */
    public void cancelAdmin(final String tranCode,final String staffId)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.cancel_requestUrl)+staffId)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("取消管理员==="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

    /**
     * 学生审核接口
     * @param tranCode
     * @param id
     */
    public void shenheXS(final String tranCode,final String id)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.shenhe_requestUrl))
                .addParams("id",id)
                .build()
                .execute(new StringCallback()
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
                        System.out.println("审核完毕"+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    /**
     * 删除学生的接口
     *
     * @param tranCode
     * @param id
     */
    public void deleteStudent(final String tranCode,final String id)
    {
        String tempUrl = "?_method=DELETE";
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.delete_stu_requestUrl)+id+tempUrl)
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        if (pd.isShowing())
                        {
                            pd.dismiss();
                        }
                        System.out.println("删除学生结果=="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

}



package com.dvp.base.fenwu.yunjicuo.model;

import android.content.Context;
import android.text.style.ReplacementSpan;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.webservice.AppModel;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnChouTList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnChouTStatusList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnCuoTZhaoPian;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnPanJStatusList;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnPanJWanC;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnSetFalse;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnWDZYList;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * 作者：Administrator on 2016/6/1 10:49
 * <p/>
 * 功能描述:YunJiCuo
 */
public class StuWDZYModel extends AppModel
{

    private Gson gson;
    public StuWDZYModel()
    {
    }

    public StuWDZYModel(Context context)
    {
        super(context);
        gson = new Gson();
    }

    public RtnWDZYList getRtnWDZYList()
    {
        return rtnWDZYList;
    }

    public void setRtnWDZYList(RtnWDZYList rtnWDZYList)
    {
        this.rtnWDZYList = rtnWDZYList;
    }

    public int getmTotalPages()
    {
        return mTotalPages;
    }

    public void setmTotalPages(int mTotalPages)
    {
        this.mTotalPages = mTotalPages;
    }

    private int mTotalPages;
    /**
     * 接收返回的作业列表
     */
    private RtnWDZYList rtnWDZYList = new RtnWDZYList();

    public void getWDZYList(final String tranCode,final String stuId,final int pageSize,final int page)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.stu_wdzy_list_requesturl) +
                stuId +
                "/data?searchCondition=%5B%5D&" +
                "pageSize=" +
                String.valueOf(pageSize) +
                "&page=" +
                String.valueOf(page) +
                "&orderCondition=+order+by+homework.kaiShShJ+desc";
        pd.show();
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("获取我的作业列表结果====="+ response.toString());
                        RtnWDZYList rtn = gson.fromJson(response,RtnWDZYList.class);

                        if(page == 1)
                        {
                            if(rtnWDZYList!=null)
                            {
                                if( rtnWDZYList.getData()!=null &&  rtnWDZYList.getData().size()>0)
                                {
                                    rtnWDZYList.getData().clear();
                                }
                            }
                        }

                        rtnWDZYList = rtn;
                        mTotalPages = (rtn.getTotalCount()%rtn.getPageSize()==0)?(rtn.getTotalCount()/rtn.getPageSize()):(rtn.getTotalCount()/rtn.getPageSize()+1);

                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnPanJStatusList getRtnPanJStatusList()
    {
        return rtnPanJStatusList;
    }

    public void setRtnPanJStatusList(RtnPanJStatusList rtnPanJStatusList)
    {
        this.rtnPanJStatusList = rtnPanJStatusList;
    }

    /**
     * 接收返回的判卷状态
     */
    private RtnPanJStatusList rtnPanJStatusList = new RtnPanJStatusList();

    /**
     * 获取判卷状态
     * @param tranCode
     * @param stuId
     * @param hwIds
     */
    public void getPanJStatus(final String tranCode,final String stuId,final List<String> hwIds)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < hwIds.size(); i++)
        {
            stringBuilder.append("hwIDs=");
            stringBuilder.append(hwIds.get(i));
            stringBuilder.append("&");
        }

        String url = mContext.getResources().getString(R.string.http_request_url) +
                mContext.getResources().getString(R.string.stu_wdzy_list_panjuan_status_requesturl) +
                stuId +
                "/data4stu?" +
                stringBuilder.toString();
        pd.show();
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("获取判卷状态结果===="+response.toString());
                        if(response.equals("[]"))
                        {
                            OnHttpResponse(tranCode,"0");
                        }
                        else
                        {
                            String result = "{\"data\":"+response+"}";
                            RtnPanJStatusList rtn = gson.fromJson(result,RtnPanJStatusList.class);
                            rtnPanJStatusList = rtn;
                            OnHttpResponse(tranCode,"1");
                        }

                    }
                });
    }


    public RtnChouTList getRtnChouTList()
    {
        return rtnChouTList;
    }

    public void setRtnChouTList(RtnChouTList rtnChouTList)
    {
        this.rtnChouTList = rtnChouTList;
    }

    /**
     * 接收抽题列表
     */
    private RtnChouTList rtnChouTList = new RtnChouTList();

    /**
     *
     * 判卷获取题目列表
     * @param tranCode
     * @param homeworkId
     */
    public void getPanJuanList(final String tranCode,final String homeworkId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/homeworkquestion/data?searchCondition=%5B%7B%22searchVal%22%3A%22" +
                homeworkId +
                "%22%2C%22searchPro%22%3A%22homework.id%22%7D%5D&pageSize=999999&page=1&orderCondition=+order+by+question.paper%2Ccast(question.page+as+int)%2Cquestion.num";

        pd.show();
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("抽题结果====="+response.toString());
                        RtnChouTList rtn = gson.fromJson(response,RtnChouTList.class);
                        rtnChouTList = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnChouTStatusList getRtnChouTStatusList()
    {
        return rtnChouTStatusList;
    }

    public void setRtnChouTStatusList(RtnChouTStatusList rtnChouTStatusList)
    {
        this.rtnChouTStatusList = rtnChouTStatusList;
    }

    /**
     * 抽题状态
     */
    private RtnChouTStatusList rtnChouTStatusList = new RtnChouTStatusList();

    /**
     *
     * 获取抽题状态
     * @param tranCode
     * @param questionHomeworkId
     * @param stuId
     * @param banJBH
     */
    public void getChouTStatus(final String tranCode,final String questionHomeworkId,final String stuId,final String banJBH)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/homeworkscore/data?searchCondition=%5B%7B%22searchVal%22%3A%22" +
                questionHomeworkId +
                "%22%2C%22searchPro%22%3A%22homeworkQuestion.homework.id%22%7D%2C%7B%22searchVal%22%3A%22" +
                stuId +
                "%22%2C%22searchPro%22%3A%22student.id%22%7D%2C%7B%22searchVal%22%3A%22" +
                banJBH +
                "%22%2C%22searchPro%22%3A%22banJ.id%22%7D%5D&pageSize=999999&page=1&orderCondition=";
        pd.show();
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("抽题状态返回结果===="+response.toString());
                        RtnChouTStatusList rtn = gson.fromJson(response,RtnChouTStatusList.class);
                        rtnChouTStatusList = rtn;
                        if(rtnChouTStatusList.getData().size()==0)
                        {
                            OnHttpResponse(tranCode,"0");
                        }
                        else
                        {
                            OnHttpResponse(tranCode,"1");
                        }

                    }
                });
    }


    public RtnSetFalse getRtnSetFalse()
    {
        return rtnSetFalse;
    }

    public void setRtnSetFalse(RtnSetFalse rtnSetFalse)
    {
        this.rtnSetFalse = rtnSetFalse;
    }

    /**
     * 判为错误返回的结果
     */
    private RtnSetFalse rtnSetFalse = new RtnSetFalse();

    public void panJError(final String tranCode,final String homeworkQuestionId,final String banJBH,final String stuId)
    {
       /* homeworkQuestion.id:e549102453bab5700153bd2fe42b02d6
        banJ.id:00000261
        student.id:e54910245143f90301514778082d088f
        duiC:false*/

        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/homeworkscore/datum")
                .addParams("homeworkQuestion.id",homeworkQuestionId)
                .addParams("banJ.id",banJBH)
                .addParams("student.id",stuId)
                .addParams("duiC",String.valueOf(false))
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
                        System.out.println("判题为错误==="+response.toString());
                        RtnSetFalse rtn =  gson.fromJson(response,RtnSetFalse.class);
                        rtnSetFalse = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });

    }


    /**
     * 判卷正确
     */
    public void panJTrue(final String tranCode,final String homeworkScoreId)
    {
        pd.show();
        OkHttpUtils.post()
                .url(mContext.getResources().getString(R.string.http_request_url)+"/homeworkscore/data?_method=DELETE")
                .addParams("id",homeworkScoreId)
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
                        System.out.println("判对结果"+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }

    public RtnPanJWanC getRtnPanJWanC()
    {
        return rtnPanJWanC;
    }

    public void setRtnPanJWanC(RtnPanJWanC rtnPanJWanC)
    {
        this.rtnPanJWanC = rtnPanJWanC;
    }

    /**
     * 接收判卷完成返回的结果
     */
    private RtnPanJWanC rtnPanJWanC = new RtnPanJWanC();


    /**
     *
     * 判卷完成接口
     * @param tranCode
     * @param homeworkId
     * @param banJBH
     * @param stuId
     */
    public void panJAllEnd(final String tranCode,final String homeworkId,final String banJBH,final String stuId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/homeworkstate/" +
                homeworkId +
                "/" +
                banJBH +
                "/" +
                stuId +
                "/setState/pj";
        pd.show();
        OkHttpUtils.post()
                .url(url)
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
                        System.out.println("===="+response.toString());
                        RtnPanJWanC rtn = gson.fromJson(response,RtnPanJWanC.class);
                        rtnPanJWanC = rtn;
                        OnHttpResponse(tranCode,null);
                    }
                });
    }


    public RtnCuoTZhaoPian getRtnCuoTZhaoPian()
    {
        return rtnCuoTZhaoPian;
    }

    public void setRtnCuoTZhaoPian(RtnCuoTZhaoPian rtnCuoTZhaoPian)
    {
        this.rtnCuoTZhaoPian = rtnCuoTZhaoPian;
    }

    /**
     * 接收错题照片列表
     */
    private RtnCuoTZhaoPian rtnCuoTZhaoPian = new RtnCuoTZhaoPian();

    /**
     * 错题拍照   下载图片接口
     * @param tranCode
     * @param homeworkScoreId
     */
    public void downloadPic(final String tranCode,final String homeworkScoreId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url)+mContext.getResources().getString(R.string.down_load_pic_url)+homeworkScoreId;
        pd.show();
        OkHttpUtils.get()
                .url(url)
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
                        System.out.println("下载图片结果===="+response.toString());
                        if(response.equals("{\"statusCode\":\"500\"}"))
                        {
                            OnHttpResponse(tranCode,"0");
                        }
                        else
                        {
                            RtnCuoTZhaoPian rtn = gson.fromJson(response,RtnCuoTZhaoPian.class);
                            rtnCuoTZhaoPian = rtn;
                            OnHttpResponse(tranCode,"1");
                        }

                    }
                });
    }


    /**
     *  上传图片id的接口
     * @param tranCode
     * @param homeworkScoreId
     * @param cuoTZPId
     */
    public void uploadPicMethod(final String tranCode,final String homeworkScoreId,final String cuoTZPId)
    {
        String url = mContext.getResources().getString(R.string.http_request_url) +
                "/homeworkscore/datum4zp/" +
                homeworkScoreId.toString() +
                "?_method=PUT";
        pd.show();
        OkHttpUtils.post()
                .url(url)
                .addParams("cuoTZhP",cuoTZPId)
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
                        System.out.println("返回结果==="+response.toString());
                        OnHttpResponse(tranCode,null);
                    }
                });
    }
}



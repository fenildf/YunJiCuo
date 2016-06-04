package com.dvp.base.fenwu.yunjicuo.common.wheelpicker.utils;

import android.app.Activity;

import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerMonthDayListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerTimeListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerYearMonthDayHourMinuteListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerYearMonthDayListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.myinterface.MyTimePickerYearMonthListener;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.picker.DatePicker;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.picker.DateTimePicker;
import com.dvp.base.fenwu.yunjicuo.common.wheelpicker.picker.TimePicker;

import java.util.Calendar;

/**
 * 作者：xue on 2016/5/27 11:17
 * <p/>
 * 功能描述:向外提供接口来调用，每一个时间点都对应一个接口， 使用时：
 * 1.实现要使用的接口，复写该接口必要的方法
 * 2.注册接口
 * 3.实例化ShowTimePickerUtils后调用需要的方法即可
 */
public class ShowTimePickerUtils {
    static public Activity activity;
    public ShowTimePickerUtils(Activity activity){
        this.activity=activity;
    }

    Calendar calendar=Calendar.getInstance();

    private static MyTimePickerYearMonthDayHourMinuteListener myTimePickerYearMonthDayHourMinuteListener;//年月日时分
    public static void setMyTimePickerYearMonthDayHourMinuteListener(MyTimePickerYearMonthDayHourMinuteListener myTimePickerYearMonthDayHourMinuteListener)
    {
        ShowTimePickerUtils.myTimePickerYearMonthDayHourMinuteListener = myTimePickerYearMonthDayHourMinuteListener;
    }

    private static MyTimePickerYearMonthDayListener myTimePickerYearMonthDayListener; //年 月 日
    public static void setMyTimePickerYearMonthDayListener(MyTimePickerYearMonthDayListener myTimePickerYearMonthDayListener)
    {
        ShowTimePickerUtils.myTimePickerYearMonthDayListener = myTimePickerYearMonthDayListener;
    }

    private static MyTimePickerMonthDayListener myTimePickerMonthDayListener; // 月 日
    public static void setMyTimePickerMonthDayListener(MyTimePickerMonthDayListener myTimePickerMonthDayListener)
    {
        ShowTimePickerUtils.myTimePickerMonthDayListener = myTimePickerMonthDayListener;
    }

    private static MyTimePickerYearMonthListener myTimePickerYearMonthListener; //  年 月
    public static void setMyTimePickerYearMonthListener(MyTimePickerYearMonthListener myTimePickerYearMonthListener)
    {
        ShowTimePickerUtils.myTimePickerYearMonthListener = myTimePickerYearMonthListener;
    }

    private static MyTimePickerTimeListener myTimePickerTimeListener;// 时间
    public static void setMyTimePickerTimeListener(MyTimePickerTimeListener myTimePickerTimeListener)
    {
        ShowTimePickerUtils.myTimePickerTimeListener = myTimePickerTimeListener;
    }



    /**
     * 显示 年 月 日 时 分
     */
    public  void  showTimePickerYearMonthDayHourMinute(){
        DateTimePicker picker = new DateTimePicker(activity, DateTimePicker.HOUR_OF_DAY);
        picker.setRange(1990, 2030);
        picker.setSelectedItem(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
        picker.setOnDateTimePickListener(new DateTimePicker.OnYearMonthDayTimePickListener() {
            @Override
            public void onDateTimePicked(String year, String month, String day, String hour, String minute) {
                myTimePickerYearMonthDayHourMinuteListener.doYearMouthDayHourMinute(year,month,day,hour,minute);
            }
        });
        picker.show();
    }

    /***
     * 显示 年 月 日
     */
    public  void showTimePickerYearMonthDay(){
        DatePicker picker = new DatePicker(activity);
        picker.setRange(2000, 2030);
        picker.setSelectedItem(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        picker.setOnDatePickListener(new DatePicker.OnYearMonthDayPickListener() {
            @Override
            public void onDatePicked(String year, String month, String day) {
                myTimePickerYearMonthDayListener.doYearMouthDay(year,month,day);
            }
        });
        picker.show();
    }

    /**
     * 显示 年 月
     */
    public static void showTimehPickerYearMonth() {
        DatePicker picker = new DatePicker(activity, DatePicker.YEAR_MONTH);
        picker.setRange(1990, 2015);
        picker.setOnDatePickListener(new DatePicker.OnYearMonthPickListener() {
            @Override
            public void onDatePicked(String year, String month) {
                myTimePickerYearMonthListener.doYearMouth(year,month);
            }
        });
        picker.show();
    }


    /**
     * 显示 月 日
     */

    public static void showTimePickerMonthDay() {
        DatePicker picker = new DatePicker(activity, DatePicker.MONTH_DAY);
        picker.setOnDatePickListener(new DatePicker.OnMonthDayPickListener() {
            @Override
            public void onDatePicked(String month, String day) {
                myTimePickerMonthDayListener.doMouthDay(month, day);
            }
        });
        picker.show();
    }


    /**
     * 显示 时间
     */
    public void ShowTimePickerTime(){
        TimePicker picker = new TimePicker(activity, TimePicker.HOUR_OF_DAY);
        picker.setTopLineVisible(false);
        picker.setOnTimePickListener(new TimePicker.OnTimePickListener() {
            @Override
            public void onTimePicked(String hour, String minute) {
                myTimePickerTimeListener.doTime(hour,minute);
            }
        });
        picker.show();
    }




}



package com.dvp.base.fenwu.yunjicuo.common.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

import java.util.Collection;

/**
 * 作者：Administrator on 2016/5/17 16:22
 * <p>
 * 功能描述:company_projectname_android
 */
public class DialogUtil
{
    /**
     * @param context 上下文
     * @param contentView view
     * @param title 标题
     * @param content 内容
     * @param icon 图标
     * @param callback 回调
     * @return
     */
    public static MaterialDialog getBasicDialog(Context context, final View contentView, final String title, final String content, final int icon, final MaterialDialog.SingleButtonCallback callback)
    {
        final MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        if(!title.equals("")|| title!=null)
        {
            md.title(title);
        }


        if(contentView!=null)
        {
            md.customView(contentView,true);
        }
        else
        {
            md.content(content);
        }
        if(icon!=0)
        {
            md.iconRes(icon);
        }
        md.positiveText("确定");
        md.negativeText("取消");
        md.onPositive(callback);
        md.onNegative(new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                dialog.dismiss();
            }
        });

        MaterialDialog dialog = md.build();
        return dialog;
    }

    public static MaterialDialog getListDialog(Context context, final String title, final int icon, final Collection collection, MaterialDialog.ListCallback listCallback)
    {
        final MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        md.title(title);
        if(icon!=0)
        {
            md.iconRes(icon);
        }
        if (collection != null)
            md.items(collection);
        md.itemsCallback(listCallback);
        MaterialDialog dialog = md.build();
        return dialog;
    }

    /**
     * @param context    上下文
     * @param title  标题
     * @param icon  图标   例如：R.mipmap.xxxx
     * @param selectedIndex   默认选中的索引
     * @param collection   集合
     * @param listCallbackSingleChoice   列表选中响应
     * @param buttonCallback   确定按钮的响应
     * @return
     */
    public static MaterialDialog getSinggleChoiceDialog(Context context, final String title, final int icon, final int selectedIndex, final Collection collection, MaterialDialog.ListCallbackSingleChoice listCallbackSingleChoice, final MaterialDialog.SingleButtonCallback buttonCallback)
    {
        final MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        md.title(title);
        if(icon!=0)
        {
            md.iconRes(icon);
        }
        md.items(collection);
        md.itemsCallbackSingleChoice(selectedIndex,listCallbackSingleChoice);
        md.positiveText("确定");
        md.negativeText("取消");
        md.onNegative(new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                dialog.dismiss();
            }
        });
        md.onNegative(buttonCallback);

        MaterialDialog dialog = md.build();
        return dialog;
    }


    /**
     * @param context  上下文
     * @param title  标题
     * @param icon  图标  例如：R.mipmap.xxx
     * @param dafaultSelected   默认选中的索引整型数组
     * @param collection  数据集合
     * @param listCallbackMultiChoice  多选响应
     * @param positiveButtonCallBack 确定响应
     * @return
     */
    public static MaterialDialog.Builder getMultiChoiceDialog(final Context context, final String title, final int icon, final Integer[] dafaultSelected, final Collection collection, final MaterialDialog.ListCallbackMultiChoice listCallbackMultiChoice, final MaterialDialog.SingleButtonCallback positiveButtonCallBack)
    {
        final MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        md.title(title);
        if(icon!=0)
        {
            md.iconRes(icon);
        }
        md.items(collection);
        md.itemsCallbackMultiChoice(dafaultSelected,listCallbackMultiChoice);
        md.positiveText("确定");
        md.negativeText("取消");
        md.onNegative(new MaterialDialog.SingleButtonCallback()
        {
            @Override
            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which)
            {
                dialog.dismiss();
            }
        });
        md.onPositive(positiveButtonCallBack);
        return md;
    }

    /**
     * 加载数据提示框  可自定义内容
     */
    public static MaterialDialog getLoadingDialog(final Context context, final String content){
        MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        md.content(content);
        md.progress(true, 0);
        md.progressIndeterminateStyle(false);

        MaterialDialog dialog = md.build();
        return dialog;
    }





    /**
     * 加载数据提示框 固定的提示内容：请稍等···
     */
    public static MaterialDialog getLoadingDialog(final Context context){
        MaterialDialog.Builder md = new MaterialDialog.Builder(context);
        md.content("请稍等···");
        md.progress(true, 0);
        md.progressIndeterminateStyle(false);
        MaterialDialog dialog = md.build();
        return dialog;
    }





    /**
     * 功能描述: 显示Toast提示信息(LENGTH_LONG)
     * @param context 上下文对象
     * @param text 提示信息
     */
    public static void showToast(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    /**
     * 功能描述: 显示Toast提示信息(LENGTH_SHORT)
     * @param context 上下文对象
     * @param text 提示信息
     */
    public static void showToastShort(Context context,String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}



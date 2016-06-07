package com.dvp.base.fenwu.yunjicuo.common.pictureselect.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.util.BitmapUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

public class ImagePublishAdapter extends BaseAdapter
{
	private List<String> mDataList = new ArrayList<String>();
	private Context mContext;

	private BitmapUtil bitmapUtil;
	//原始bitmip
	private Bitmap perBitmap;
	//压缩后的bitmip
	private Bitmap bitmap;

	private Double picWidth;
	private Double picHight;

	private int mark = 0;
	public ImagePublishAdapter(Context context, List<String> dataList)
	{
		this.mContext = context;
		this.mDataList = dataList;
	}

	public ImagePublishAdapter(Context context, List<String> dataList,int mark)
	{
		this.mContext = context;
		this.mDataList = dataList;
		this.mark = mark;
		this.bitmapUtil = new BitmapUtil();
	}
	public int getCount()
	{
		// 多返回一个用于展示添加图标
		if (mDataList == null)
		{
			return 1;
		}
		else if (mDataList.size() == 9)
		{
			return 9;
		}
		else
		{
			return mDataList.size() + 1;
		}
	}

	public Object getItem(int position)
	{
		if (mDataList != null
				&& mDataList.size() == 9)
		{
			return mDataList.get(position);
		}

		else if (mDataList == null || position - 1 < 0
				|| position > mDataList.size())
		{
			return null;
		}
		else
		{
			return mDataList.get(position - 1);
		}
	}

	public long getItemId(int position)
	{
		return position;
	}

	@SuppressLint("ViewHolder")
	public View getView(int position, View convertView, ViewGroup parent)
	{
		//所有Item展示不满一页，就不进行ViewHolder重用了，避免了一个拍照以后添加图片按钮被覆盖的奇怪问题
		convertView = View.inflate(mContext, R.layout.multimg_list_item_publish, null);
		SimpleDraweeView imageIv = (SimpleDraweeView) convertView
				.findViewById(R.id.item_grid_image);

		ViewGroup.LayoutParams para = imageIv.getLayoutParams();
		picWidth = Double.valueOf(para.width);
		picHight = Double.valueOf(para.height);
		if (isShowAddItem(position))
		{
			imageIv.setImageResource(R.drawable.btn_add_pic);
			imageIv.setBackgroundResource(R.color.bg_gray);
		}
		else
		{
			if(mark == 1)
			{
				final String item1 = mDataList.get(position);
				imageIv.setImageURI(Uri.parse(item1));
			}
			else
			{
				//bitmapUtil = new BitmapUtil();
				final String item = mDataList.get(position);
				perBitmap = bitmapUtil.disposeBitmap((Activity) mContext, item);//解析bitmap
				bitmap = bitmapUtil.scale(perBitmap, picWidth, picHight);
				imageIv.setBackgroundResource(R.mipmap.bg_img);
				imageIv.setImageBitmap(bitmap);
			}

		}

		return convertView;
	}

	private boolean isShowAddItem(int position)
	{
		int size = mDataList == null ? 0 : mDataList.size();
		return position == size;
	}

}

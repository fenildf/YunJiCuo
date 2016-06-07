package com.dvp.base.fenwu.yunjicuo.common.pictureselect.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.util.BitmapUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MultiImageZoomActivity extends CommonActivity
{

	@Bind(R.id.toolbar)
	Toolbar toolbar;

	private ViewPager pager;
	private MyPageAdapter adapter;
	private int currentPosition;
	private List<String> mDataList = new ArrayList<>();
	private RelativeLayout photo_relativeLayout;
	//xue add
	private String type;

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multimg_zoom_activity);
		ButterKnife.bind(this);
		photo_relativeLayout = (RelativeLayout) findViewById(R.id.photo_relativeLayout);
		photo_relativeLayout.setBackgroundColor(0x70000000);

		init();
		initData();
		Button photo_bt_del = (Button) findViewById(R.id.photo_bt_del);
		photo_bt_del.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				if (mDataList.size() == 1)
				{
					removeImgs();
					finish();
				}
				else
				{
					removeImg(currentPosition);
					pager.removeAllViews();
					adapter.removeView(currentPosition);
					adapter.notifyDataSetChanged();
				}
			}
		});

		pager = (ViewPager) findViewById(R.id.viewpager);
		pager.setOnPageChangeListener(pageChangeListener);

		adapter = new MyPageAdapter(mDataList);
		pager.setAdapter(adapter);
		pager.setCurrentItem(currentPosition);
	}

	private void init(){
		setTitle(getResources().getString(R.string.preview_picture));
		//Toolbar too
		setSupportActionBar(toolbar);
	}

	//返回按钮监听
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void initData()
	{
		type=getIntent().getStringExtra(MultiImageSelectorActivity.EXTRA_TYPE);
		currentPosition = getIntent().getIntExtra(
				CommonApp.EXTRA_CURRENT_IMG_POSITION, 0);
		if(type!=null && type.equals("StuCuoTPaiZhaoActivity")){ // xue add
			mDataList=getIntent().getStringArrayListExtra("image_list");
		}else {
			mDataList = MultiImageListActivity.mDataList;
		}

	}

	private void removeImgs()
	{
		mDataList.clear();
	}

	private void removeImg(int location)
	{
		if (location + 1 <= mDataList.size())
		{
			mDataList.remove(location);
		}
	}


	private OnPageChangeListener pageChangeListener = new OnPageChangeListener()
	{

		public void onPageSelected(int arg0)
		{
			currentPosition = arg0;
		}

		public void onPageScrolled(int arg0, float arg1, int arg2)
		{
		}

		public void onPageScrollStateChanged(int arg0)
		{

		}
	};

	@Override
	public void OnHttpResponse(String var1, String var2)
	{

	}

	class MyPageAdapter extends PagerAdapter
	{
		private List<String> dataList = new ArrayList<String>();
		private Context mContext;
		private ArrayList<ImageView> mViews = new ArrayList<ImageView>();

		private BitmapUtil bitmapUtil;

		private Bitmap bitmap;

		public MyPageAdapter(Context context, List<String> dataList)
		{
			this.mContext = context;
			this.dataList = dataList;
		}

		public MyPageAdapter(List<String> dataList)
		{
			this.dataList = dataList;
			int size = dataList.size();
			bitmapUtil = new BitmapUtil();
			for (int i = 0; i != size; i++)
			{
				ImageView iv = new ImageView(MultiImageZoomActivity.this);
				bitmap = bitmapUtil.disposeBitmap((Activity) mContext, dataList.get(i));//解析bitmap
				iv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
						LayoutParams.MATCH_PARENT));
				iv.setImageBitmap(bitmap);
				iv.setBackgroundResource(R.mipmap.bg_img);
				mViews.add(iv);
			}
		}

		public int getItemPosition(Object object)
		{
			return POSITION_NONE;
		}

		public Object instantiateItem(View arg0, int arg1)
		{
			ImageView iv = mViews.get(arg1);
			((ViewPager) arg0).addView(iv);
			return iv;
		}

		public void destroyItem(View arg0, int arg1, Object arg2)
		{
			if (mViews.size() >= arg1 + 1)
			{
				((ViewPager) arg0).removeView(mViews.get(arg1));
			}
		}

		public boolean isViewFromObject(View arg0, Object arg1)
		{
			return arg0 == arg1;
		}

		@Override
		public int getCount()
		{
			return dataList.size();
		}

		public void removeView(int position)
		{
			if (position + 1 <= mViews.size())
			{
				mViews.remove(position);
			}
		}

	}
}
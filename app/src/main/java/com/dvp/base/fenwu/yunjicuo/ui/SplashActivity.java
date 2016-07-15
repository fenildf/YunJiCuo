package com.dvp.base.fenwu.yunjicuo.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.WindowManager;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;

/**
 * 类: MainActivity
 * 功能描述: (1)判断是否是首次加载应用--采取读取SharedPreferences的方法 (2)是，则进入引导activity；否，则进入MainActivity
 *          (3)5s后执行(2)
 * 创建人: 邓奋武
 * 创建日期: 2016/5/9 11:48
 * 开发环境: JDK1.8
 */
public class SplashActivity extends CommonActivity
{

	private static final int TIME = 2000;//多少秒后执行
	private static final int GO_LOGIN = 1001;//去登录界面

	@SuppressLint("HandlerLeak")
	Handler mHandler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
				case GO_LOGIN:
					goLogin();
					break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		// 隐藏状态栏
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splashactivity);
		mHandler.sendEmptyMessageDelayed(GO_LOGIN, TIME);//发送消息 通知它去登录界面

	}


	public void goLogin(){
		startActivity(NewLoginActivity.class);
		finish();
	}


	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK){
			return true;
		}
		return false;
	}

	@Override
	public void OnHttpResponse(String var1, String var2)
	{

	}
}

package com.dvp.base.fenwu.yunjicuo.common.webservice;

import android.content.Context;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;

import java.util.ArrayList;
import java.util.List;

public class AppModel implements HttpResponse{

	protected Context mContext;
	protected List<HttpResponse> messageResponseList = new ArrayList<HttpResponse>();

	protected MaterialDialog pd;
	public AppModel() {
	}

	public AppModel(Context context) {
		mContext = context;
		pd= DialogUtil.getLoadingDialog(context,"请稍等···");
	}

	@Override
	public void OnHttpResponse(String apiCode, String status) {
		for (HttpResponse iterable_element : messageResponseList) {
			iterable_element.OnHttpResponse(apiCode, status);
		}

	}

	public void addResponseListener(HttpResponse listener) {
		if (!messageResponseList.contains(listener)) {
			messageResponseList.add(listener);
		}
	}

	public void removeResponseListener(HttpResponse listener) {
		messageResponseList.remove(listener);
	}

	// 公共的错误处理
	public void errorCallback(String statusCode, String errorMessage) {
		if (null == statusCode) {
			Toast.makeText(mContext, "网络错误", Toast.LENGTH_SHORT).show();
			return;
		}
		Toast.makeText(mContext, errorMessage, Toast.LENGTH_SHORT).show();
	}

}
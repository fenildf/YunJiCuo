package com.dvp.base.fenwu.yunjicuo.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SelectDialog extends Dialog{

	@Override
	public void dismiss() {
		// TODO Auto-generated method stub
		super.dismiss();
	}

	private ListView selectlistview;
	private Context mContext;
	private ArrayList<HashMap<String, String>> mArrayList = new ArrayList<HashMap<String, String>>();
	private LayoutInflater layoutInflater;
	
	private ItemClickInterface interfaces;
	
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectdialog);
		init();
	}

	public void init() {
		selectlistview = (ListView) findViewById(R.id.selectlistview);

		SelectArrayAdapter adapter =  new SelectArrayAdapter(mContext,mArrayList);
		selectlistview.setAdapter(adapter);
		
		selectlistview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				interfaces.click(arg0,arg1,arg2,arg3);
				HashMap<String, String> hashmap=mArrayList.get(arg2);
				
				Iterator ite = hashmap.keySet().iterator();
				
				String key=ite.next().toString();
				
				interfaces.SelectClick(key, hashmap.get(key));
			}
		});
	}
	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		super.cancel();

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}

	public SelectDialog(Context context, ArrayList<HashMap<String, String>> arraylist,ItemClickInterface a) {
		super(context,R.style.AppCompatAlertDialogStyle);
		mContext = context;
		// TODO Auto-generated constructor stub
		this.mArrayList = arraylist;
		layoutInflater = LayoutInflater.from(context);
		interfaces = a;
	}

	public class SelectArrayAdapter extends BaseAdapter {

		private ArrayList<HashMap<String, String>> alist;
		private Context mcontext;
		public SelectArrayAdapter(Context context,ArrayList<HashMap<String, String>> alist) {
			super();
			this.mcontext = context;
			this.alist = alist;
		}

		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return this.alist!=null? this.alist.size(): 0 ;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			 return this.alist.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub

			if (convertView == null) {
				convertView = layoutInflater.inflate(
						R.layout.selectdialoglistitem_layout, null);
			}
			// 得到条目中的子组件
			TextView tv1 = (TextView) convertView
					.findViewById(R.id.selectitemtv);
			//为子组件赋值
			tv1.setText(alist.get(position).values().toString());

			return convertView;
		}

	}
	
	public interface ItemClickInterface{
		public void click(AdapterView<?> arg0, View arg1, int arg2,
						  long arg3);
		
		public void SelectClick(String selectItemKey, String selectItemValue);
	}
	
	 
}

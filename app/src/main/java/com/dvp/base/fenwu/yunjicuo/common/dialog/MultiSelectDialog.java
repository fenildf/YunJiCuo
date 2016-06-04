package com.dvp.base.fenwu.yunjicuo.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.afollestad.materialdialogs.internal.MDButton;
import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.domain.student.RtnTiHaoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 作者：Administrator on 2016/5/31 10:06
 * <p>
 * 功能描述:YunJiCuo
 */
public class MultiSelectDialog extends Dialog
{
    private ExpandableListView contactExpandableListView;
    private MDButton sutmitBtn;
    private MDButton quxiao_btn;
    private Context mContext;

    private multiselectCallBack myInterfaces;
    private List<RtnTiHaoList.DataEntity> mArrayList;
    private LayoutInflater layoutInflater;


    //获取选中的集合
    private HashMap<String, String> mSelectList = new HashMap<String, String>();
    public MultiSelectDialog(Context context, List<RtnTiHaoList.DataEntity> arraylist, multiselectCallBack a) {
        super(context,R.style.AppCompatAlertDialogStyle);
        mContext = context;
        // TODO Auto-generated constructor stub
        this.mArrayList = arraylist;
        layoutInflater = LayoutInflater.from(context);
        myInterfaces = a;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiselectdialog);

        init();
    }

    private void init()
    {
        quxiao_btn = (MDButton)findViewById(R.id.quxiao_btn);
        quxiao_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                dismiss();
            }
        });
        sutmitBtn = (MDButton)findViewById(R.id.ok_btn);
        sutmitBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myInterfaces.SelectClick(mSelectList);
                dismiss();
            }
        });
        contactExpandableListView = (ExpandableListView) findViewById(R.id.contactExpandableListView);
        contactExpandableListView.setChoiceMode(ExpandableListView.CHOICE_MODE_MULTIPLE);
        final ContactsDeptAdapter adapter = new ContactsDeptAdapter(mContext,mArrayList);
        contactExpandableListView.setAdapter(adapter);
        contactExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
        {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, final int groupPosition, final int childPosition, long id)
            {
                // 多选
                // 取得ViewHolder对象，这样就省去了通过层层的findViewById去实例化我们需要的cb实例的步骤
                ContactsDeptAdapter.ItemHolder holder = (ContactsDeptAdapter.ItemHolder) v.getTag();
                // 改变CheckBox的状态
                holder.child_name.toggle();
                // 将CheckBox的选中状况记录下来
                adapter.getIsSelected().put(
                        ((RtnTiHaoList.DataEntity.NumsEntity)adapter.getChild(groupPosition,childPosition)).getId(), holder.child_name.isChecked());

                if(holder.child_name.isChecked())
                {
                    mSelectList.put(((RtnTiHaoList.DataEntity.NumsEntity)adapter.getChild(groupPosition,childPosition)).getId(),((RtnTiHaoList.DataEntity.NumsEntity)adapter.getChild(groupPosition,childPosition)).getNum());
                }
                else
                {
                    mSelectList.remove(((RtnTiHaoList.DataEntity.NumsEntity)adapter.getChild(groupPosition,childPosition)).getId());
                }


                return true;
            }
        });
    }


    private int num = 0;
    public class ContactsDeptAdapter extends BaseExpandableListAdapter
     {
        private Context context;
        private List<RtnTiHaoList.DataEntity> deptsList;
         private  HashMap<String,Boolean> checkedMap;
        public ContactsDeptAdapter(Context context,List<RtnTiHaoList.DataEntity> deptsList){
            this.context=context;
            this.deptsList=deptsList;

            checkedMap = new HashMap<>();

            for (int i = 0; i < deptsList.size(); i++) {
                for (int j = 0; j < deptsList.get(i).getNums().size(); j++) {
                    getIsSelected().put(deptsList.get(i).getNums().get(j).getId(), false);
                }
            }
            System.out.println("======");
        }

         public  HashMap<String, Boolean> getIsSelected() {
             return checkedMap;
         }


         public  void setIsSelected(HashMap<String, Boolean> isSelected) {
             checkedMap = isSelected;
         }
         /**
         * 获取组的个数
         */
        @Override
        public int getGroupCount() {
            return deptsList.size();
        }

        /**
         *
         * 获取指定组中的子元素个数
         */
        @Override
        public int getChildrenCount(int groupPosition) {
            return deptsList.get(groupPosition).getNums().size();
        }


        /**
         *
         * 获取指定组中的数据
         */
        @Override
        public Object getGroup(int groupPosition) {
            return deptsList.get(groupPosition);
        }

        /**
         *
         * 获取指定组中的指定子元素数据。
         */
        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return deptsList.get(groupPosition).getNums().get(childPosition);
        }

        /**
         *
         * 获取指定组的ID，这个组ID必须是唯一的
         */
        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        /**
         *
         * 获取指定组中的指定子元素ID
         */
        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        /**
         *
         * 组和子元素是否持有稳定的ID,也就是底层数据的改变不会影响到它们。
         */
        @Override
        public boolean hasStableIds() {
            return true;
        }

        /**
         *
         * 是否选中指定位置上的子元素。
         */
        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

         @Override
         public void notifyDataSetChanged() {//通知数据发生变化
             super.notifyDataSetChanged();
         }
         /**
         * 得到父布局以及数据
         */
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parent) {
            GroupHolder groupHolder=null;
            if (convertView==null) {
                convertView=LayoutInflater.from(context).inflate(R.layout.multi_parent_layout, null);
                groupHolder = new GroupHolder();
                groupHolder.txt=(TextView) convertView.findViewById(R.id.parent_title_tv);
                convertView.setTag(groupHolder);
            }else {
                groupHolder = (GroupHolder)convertView.getTag();
            }
          /*  if (!isExpanded) {
                groupHolder.img.setBackgroundResource(R.drawable.xs_ic);//收缩
            }else {
                groupHolder.img.setBackgroundResource(R.drawable.xx_ic);
            }*/
            groupHolder.txt.setText("页码："+deptsList.get(groupPosition).getPage()+" 页");
            return convertView;
        }

        /**
         * 得到自布局以及数据
         */
        @Override
        public View getChildView(int groupPosition, int childPosition,
                                 boolean isLastChild, View convertView, ViewGroup parent) {
            ItemHolder itemHolder = null;
            if (convertView == null)
            {
                convertView = LayoutInflater.from(context).inflate(R.layout.multi_child_layout, null);
                itemHolder = new ItemHolder();
                itemHolder.child_name = (CheckedTextView)convertView.findViewById(R.id.child_checkedtv);
                convertView.setTag(itemHolder);
            }
            else
            {
                itemHolder = (ItemHolder)convertView.getTag();
            }
            itemHolder.child_name.setText(deptsList.get(groupPosition).getNums().get(childPosition).getNum());


            itemHolder.child_name.setChecked(getIsSelected().get(((RtnTiHaoList.DataEntity.NumsEntity)getChild(groupPosition,childPosition)).getId()));
            itemHolder.child_name.setClickable(false);
           // itemHolder.child_name.setEnabled(false);
            notifyDataSetChanged();
            return convertView;
        }

        public class GroupHolder{
            public TextView txt;

        }

        public class ItemHolder{
            public CheckedTextView child_name;

        }

    }


    public interface multiselectCallBack{
       // public void click(AdapterView<?> arg0, View arg1, int arg2, long arg3);
        public void SelectClick(HashMap<String,String> mMap);
    }
}



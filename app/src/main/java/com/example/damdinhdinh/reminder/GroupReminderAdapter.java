package com.example.damdinhdinh.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GroupReminderAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<GroupReminder> listGroupReminder;

    public GroupReminderAdapter(Context context, int layout, List<GroupReminder> listGroupReminder) {
        this.context = context;
        this.layout = layout;
        this.listGroupReminder = listGroupReminder;
    }

    @Override
    public int getCount() {
        return listGroupReminder.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView tvGroupTaskName;
        ImageView imgGroupTaskIcon;
        TextView tvGroupTaskSize;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.tvGroupTaskName = view.findViewById(R.id.tv_group_task_name);
            holder.imgGroupTaskIcon = view.findViewById(R.id.img_icon_group_task);
            holder.tvGroupTaskSize = view.findViewById(R.id.tv_group_task_size);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        GroupReminder groupReminder = listGroupReminder.get(i);
        holder.tvGroupTaskName.setText(groupReminder.getName());
        holder.imgGroupTaskIcon.setImageResource(groupReminder.getIcon());
        holder.tvGroupTaskSize.setText(String.valueOf(groupReminder.getArrayReminder().size()));

        return view;
    }
}

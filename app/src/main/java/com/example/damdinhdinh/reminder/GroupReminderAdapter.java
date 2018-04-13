package com.example.damdinhdinh.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GroupTaskAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<GroupReminder> listGroupReminder;

    public GroupTaskAdapter(Context context, int layout, List<GroupReminder> listGroupReminder) {
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView tvGroupTaskName;
        ImageView imgGroupTaskIcon;
        TextView tvGroupTaskSize;

        tvGroupTaskName = view.findViewById(R.id.tv_group_task_name);
        imgGroupTaskIcon = view.findViewById(R.id.img_icon_group_task);
        tvGroupTaskSize = view.findViewById(R.id.tv_group_task_size);

        GroupReminder groupReminder = listGroupReminder.get(i);

        tvGroupTaskName.setText(groupReminder.getName());
        imgGroupTaskIcon.setImageResource(groupReminder.getIcon());
        tvGroupTaskSize.setText(groupReminder.getArrayReminder().size());

        return view;
    }
}

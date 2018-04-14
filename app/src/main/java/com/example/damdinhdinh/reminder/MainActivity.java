package com.example.damdinhdinh.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<GroupReminder> arrayGroupReminder;
    private ImageView imgNewGroup;
    private TextView tvNewGroup;
    private ListView lvGroupReminder;
    private GroupReminderAdapter groupReminderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();
        arrayGroupReminder = new ArrayList<>();
        arrayGroupReminder.add(new GroupReminder("Daily", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Exam", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Work", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Day tasks", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Week tasks", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Month tasks", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.add(new GroupReminder("Year tasks", R.drawable.icons8_tasklist_48, new ArrayList<Reminder>()));
        arrayGroupReminder.get(0).getArrayReminder().add(new Reminder("Something", "Just something", true));
        arrayGroupReminder.get(0).getArrayReminder().add(new Reminder("Something", "Just something", true));
        arrayGroupReminder.get(0).getArrayReminder().add(new Reminder("Something", "Just something", true));
        arrayGroupReminder.get(0).getArrayReminder().add(new Reminder("Something", "Just something", true));
        groupReminderAdapter = new GroupReminderAdapter(this, R.layout.item_group_reminder_list, arrayGroupReminder);
        lvGroupReminder.setAdapter(groupReminderAdapter);

    }
    public void binding(){
        imgNewGroup = findViewById(R.id.img_icon_add_new_group);
        tvNewGroup = findViewById(R.id.tv_add_new_group);
        lvGroupReminder = findViewById(R.id.lv_group_reminder);
    }
}

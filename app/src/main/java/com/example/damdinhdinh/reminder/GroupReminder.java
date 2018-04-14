package com.example.damdinhdinh.reminder;

import java.util.ArrayList;
import java.util.List;

public class GroupReminder {
    private String name;
    private int icon;
    private List<Reminder> arrayReminder;

    public GroupReminder(String name, int icon, List<Reminder> arrayReminder) {
        this.name = name;
        this.icon = icon;
        this.arrayReminder = arrayReminder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public List<Reminder> getArrayReminder() {
        return arrayReminder;
    }

    public void setArrayReminder(ArrayList<Reminder> arrayReminder) {
        this.arrayReminder = arrayReminder;
    }
}

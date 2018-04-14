package com.example.damdinhdinh.reminder;

public class Reminder {
    private String name;
    private String describe;
    private int date;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int repeat;
    private boolean notification;

    public Reminder(String name, String describe, int date, int month, int year, int hour, int minute, int repeat, boolean notification) {
        this.name = name;
        this.describe = describe;
        this.date = date;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.repeat = repeat;
        this.notification = notification;
    }

    public Reminder(String name, String describe, boolean notification) {
        this.name = name;
        this.describe = describe;
        this.notification = notification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }
}

package com.mb.learn.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class TestTime {
    public static Properties p = new Properties();

    public static void main(String[] args) throws Exception{
        System.out.println(p.getProperty("close.channel.interval", "48"));
        String str = "2017-12-07 15:37:25";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, Integer.valueOf(p.getProperty("close.channel.interval", "48")));
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(!calendar.getTime().after(new Date()));
    }
}

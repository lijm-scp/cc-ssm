package com.mb.learn.test;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String access_id = "access_1000";
        String access_key = "access_1000_key";
        String timestamp = String.valueOf(System.currentTimeMillis());
        String key = access_id+"|"+access_key+"|"+timestamp;
        String access_sign= MD5.getMD5(key);
        System.out.println(timestamp);
        System.out.println(access_sign);
        Map<String,String> map = new HashMap<>();
        Date date = new Date(1500629025091l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}

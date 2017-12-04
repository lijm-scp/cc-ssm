package com.mb.learn.test;


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
    }
}

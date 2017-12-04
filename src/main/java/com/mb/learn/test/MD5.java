package com.mb.learn.test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String getMD5(String password) {
		if (password == null) {
            return null;
        }
        
        String hashtext  = null ;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
     
            byte[] messageDigest = md.digest( password.getBytes("UTF-8") );
		 
            BigInteger number = new BigInteger(1, messageDigest);
            hashtext  = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

        }
        catch (NoSuchAlgorithmException e) {
           
        }
        catch (UnsupportedEncodingException e) {
        	 throw new RuntimeException(e);
		}
        
        return hashtext;
	}
	/**
	 * get 16 chars of MD5
	 * @param text
	 * @return
	 */
	public static String getShortMD5(String text){
		return getMD5(text).substring(8,24);
	}

	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
//		System.out.println(MD5.getMD5("www.baidu.com"));
//		System.out.println(MD5.getShortMD5("cc-b157.bokecc.com"));
//		System.out.println(ChannelUtil.getMD5Name("cc-b157.bokecc.com", "cnc"));
		String key = "access_1000"+"|"+"access_1000_key"+"|"+currentTimeMillis;
		System.out.println(MD5.getMD5(key));
	}

}

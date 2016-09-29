package com.hylg.xxxh.utils;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * 标识，加密工具类
 * @author Ruby
 * @datatime 2016年9月29日上午10:26:46
 */
public class CoreUtile {

	/**
	 * 生成36位随机标识(有4个“-”)
	 */
	public static String createUUID() {
		return UUID.randomUUID().toString();
	}
	
    /**
     * MD5加密 生成32位md5码 
     */  
    public static String toMD5(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  
  
    /** 
     * 加密解密算法 执行一次是加密，执行两次是解密(对称加密) 
     */   
    public static String convertMD5(String inStr){  
  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++){
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
  
    }  
}

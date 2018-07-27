package com.chapter13;

/**
 * Created by yangyunming on 2018/7/26
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "hey";
        System.out.println(str);
        String str1 =upcase(str);
        System.out.println(str1);
        System.out.println(str);
    }
}

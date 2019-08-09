package com.chapter13;

/**
 * Created by yangyunming on 2018/7/27
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));

    }
}

package com.chapter13;

/**
 * Created by yangyunming on 2018/7/27
 */
public class Rudolph {
    public static void main(String[] args) {
        for(String pattern : new String[]{
                "Rodulph",
                "[rR]odulph",
                "[rR][aeiou][a-z]ul.*",
                "R.*"
        })
            System.out.println("Rodulph".matches(pattern));
    }
}

package com.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by yangyunming on 2018/7/30
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));//设置分割出的字符串数量
    }
}

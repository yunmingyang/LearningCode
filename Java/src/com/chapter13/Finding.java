package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yangyunming on 2018/7/30
 */
public class Finding {
    public static void main(String[] args) {//find(int i)设置搜索的起始位置
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while(m.find()){
            System.out.println(m.group());
        }
        System.out.println("\n");
        int i = 0;
        while(m.find(i)){//起始点
            System.out.println(m.group());
            i++;
        }
    }
}

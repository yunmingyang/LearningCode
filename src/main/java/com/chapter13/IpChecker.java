package com.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yangyunming on 2018/7/31
 */
public class IpChecker {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(\\d{1,3}\\.){3}(\\d{1,3})$");
        //由于正则目的是文本匹配，所以这样无法检查到005.125.125.125
        //这种有冗余的ip地址
        //以及每个ip大于255这种
        Matcher m = p.matcher("0.0.0.999");
        while (m.find())
            System.out.println(m.group());
    }
}

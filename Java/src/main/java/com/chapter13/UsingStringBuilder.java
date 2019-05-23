package com.chapter13;

import java.util.Random;

/**
 * Created by yangyunming on 2018/7/26
 */
public class UsingStringBuilder {
    public static Random random = new Random(47);
    public  String toString(){//只创建了一个StringBuilder对象
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(random.nextInt(100));
            result.append(",");
        }
        result.delete(result.length()-1,result.length());//start应设置为倒数第一个，end设置为最后一个
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder str = new UsingStringBuilder();
        System.out.println(str);
    }
}

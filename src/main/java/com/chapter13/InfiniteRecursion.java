package com.chapter13;

/**
 * Created by yangyunming on 2018/7/26
 */
public class InfiniteRecursion {
    private String add = (super.toString().split("@"))[1];
    public String toString(){
//        return "InifiniteRecursion: " + this;//此处使用this会导致this调用toString方法，造成递归
        System.out.println(super.toString());
        return "InifiniteRecursion: " + add;
    }

    public static void main(String[] args) {
        InfiniteRecursion inf = new InfiniteRecursion();
        System.out.println(inf.toString());
    }
}

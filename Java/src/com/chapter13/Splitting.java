package com.chapter13;

import java.util.Arrays;

/**
 * Created by yangyunming on 2018/7/27
 */
public class Splitting {
    public static String knights =
            "Then,when you have found the shrubbery,you must " +
                    "cut down the mightiest tree in the forest..." +
                    "with... a herring!";
    public static void split(String split){
        System.out.println(Arrays.toString(knights.split(split)));
    }

    public static void main(String[] args) {
        split(" ");//以空格为划分打印
        split("\\W+");//非词作为划分打印
        split("n\\W+");//以n和非词作为划分打印
    }
}

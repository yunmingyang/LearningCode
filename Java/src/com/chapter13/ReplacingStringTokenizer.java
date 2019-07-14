package com.chapter13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by yangyunming on 2018/7/31
 */
public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But i'm not dead yet! i feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.print(stoke.nextToken() + " ");
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));
        Scanner sc = new Scanner(input);
        while (sc.hasNext())
            System.out.print(sc.next() + " ");
    }
}

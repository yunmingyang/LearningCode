package com.chapter5;

public class MultiArgs {
    public static void argsPrint(int... args){
        for (int i :
             args) {
            System.out.println(args[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[4];

        argsPrint(arr);
    }
}

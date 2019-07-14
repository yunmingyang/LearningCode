package com.chapter5;

public class LoadOrder {
    public int test1 = 10;
    public int test2 = test();
    public static int d = 0;
    public static LoadOrder i = new LoadOrder();
    public static int l = test();

    LoadOrder(){
        System.out.println("format");
    }

    {
        System.out.println("usual code block order " + d++);
        // 此处证明了加载时,非static域也被加载了,且为顺序加载
        System.out.println("test1 is " + test1);
        System.out.println("test2 is " + test2);
    }

    static {
        System.out.println("static code block order");
    }

    public static int test(){
        System.out.println("static order");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("starting....");
        new LoadOrder();
    }

}

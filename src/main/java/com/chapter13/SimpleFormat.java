package com.chapter13;

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;

        System.out.println("Row 1: [" + x + " " + y + "]");
        System.out.format("Row 1: [%d %f]\n",x,y);//等价于printf
        System.out.printf("Row 1: [%d %f]\n",x,y);
    }

}

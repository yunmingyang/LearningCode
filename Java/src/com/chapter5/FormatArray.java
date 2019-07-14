package com.chapter5;

public class FormatArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        int[] arr3 = new int[4];
        // 此种初始化方式不支持在大括号中填入数字
        int[] arr4 = new int[]{
          1,2,3,4
        };

        System.out.println("The address of arr1 is " + arr1);
        System.out.println("The address of arr2 is " + arr2);

        for (int i :
             arr3) {
            System.out.println("arr3[" + i +"] is" + i);
        }

        for (int i :
                arr4) {
            System.out.println("arr4[" + i +"] is" + i);
        }

    }
}

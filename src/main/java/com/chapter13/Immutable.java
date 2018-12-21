package com.chapter13;

/**
 * Created by yangyunming on 2018/7/26
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "hey";
        System.out.println(str);
        String str1 = upcase(str);
        System.out.println(str1);
        System.out.println(str);

        char[] arr  = new char[3];
        System.out.println(str.getBytes());
        str.getChars(1,2,arr,0);//start代表数组的下标，end代表实际个数，所以若是要全部复制，就要传入0，3参数
        System.out.println(arr);
        System.out.println(str.substring(0,2));


        char[] arr1 = {'a','v','c','d'};
        System.out.println(String.valueOf(arr1,0,4));
        System.out.println(str.intern());//看常量池中是否存在，若不存在放入常量池
    }
}

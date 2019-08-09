package com.chapter13;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * Created by yangyunming on 2018/7/30
 */
public class SimpleRead {
    public static BufferedReader br = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803"));
    public static void main(String[] args) {
        try{
            System.out.println("What's your name");
            String str = br.readLine();
            System.out.println(str);
            System.out.println("How old are you?What is your favorite double?");
            System.out.println("(input: <age> <double>)");
            String num = br.readLine();
            System.out.println(num);
            String[] numArr = num.split(" ");
            int age = Integer.parseInt(numArr[0]);
            double favorite = Double.parseDouble(numArr[1]);
            System.out.format("Hi, %s .\n",str);
            System.out.format("In 5 years you will be %d.\n",age + 5);
            System.out.format("My favorite double is %f.", favorite/2);
        }catch (Exception e){
            System.err.println("I/O exception");
        }

    }
}

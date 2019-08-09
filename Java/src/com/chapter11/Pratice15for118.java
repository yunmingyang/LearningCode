package com.chapter11;

import java.util.Stack;

public class Pratice15for118 {
    public static String stackWord = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+r+u--+l+e+s";
    public static Stack stack = new Stack();

    public Pratice15for118(){
        System.out.println("your word is " + stackWord);
    }

    public static void main(String[] args) {
        Pratice15for118 pratice15for118 = new Pratice15for118();
        char[] str = stackWord.toCharArray();
        for(int i = 0 ; i < str.length;i++){
            if(str[i] == '+'){
                //todo:判断当前stack中是否还有剩余
                if ( i + 1 > str.length ){
                    break;
                }
                stack.push(str[i+1]);
            }else if(str[i] == '-'){
                System.out.println(stack.peek());
                stack.pop();
            }
        }
//        System.out.println(stack.clone());
    }
}

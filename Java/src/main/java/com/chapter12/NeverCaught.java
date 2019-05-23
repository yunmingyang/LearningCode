package com.chapter12;

/**
 * Created by yangyunming on 2018/7/24
 */
public class NeverCaught {//RuntimeException属于"不受检查异常"。这种异常属于错误，将被自动捕获
    static void f(){
        throw  new RuntimeException("From f()");
    }
    static void g(){
        f();
    }
    public static void main(String[] args){
        g();
    }
}

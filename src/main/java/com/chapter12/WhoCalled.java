package com.chapter12;

/**
 * Created by yangyunming on 2018/7/25
 */
public class WhoCalled {
    static void f() throws Exception{
        try {
            throw new Exception();
        }catch (Exception e){
//            for (StackTraceElement ste : e.getStackTrace()) {
//               System.out.println(ste.getMethodName());//打印栈轨迹
//            }
            throw e;//重新抛出异常
        }
    }
    static void g() throws Exception{ f();}
    static void h() throws Exception{ g();}
    public static void main(String[] args) throws Exception{
        f();
        System.out.println("---------------------------");
        g();
        System.out.println("---------------------------");
        h();
    }
}

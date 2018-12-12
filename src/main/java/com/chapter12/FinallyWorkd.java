package com.chapter12;

class ExceptionThird extends Exception{}

public class FinallyWorkd {
    static int count = 0;

    public static void main(String[] args) {
        while(true){
            try{
                if (count ++ == 0)
                    throw new ExceptionThird();
                System.out.println("No Exception");
            }catch (ExceptionThird e){
                System.out.println("ExceptionThird");
            }finally {
                System.out.println("In Finally clause");
                if (count == 2)//计数，代表最大尝试恢复次数
                    break;
            }
        }
    }
}

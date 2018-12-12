package com.Runnable;

public class TestRunnable implements Runnable {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        TestRunnable TR = new TestRunnable();
        for (int i = 0;i < 100;i ++){
            if(i % 10 == 0){
                new Thread(TR,"name1").start();
                new Thread(TR,"name2").start();
            }
        }
    }
}

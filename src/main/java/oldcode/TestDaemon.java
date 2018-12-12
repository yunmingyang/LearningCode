package com.DaemonThread;



public class TestDaemon extends Thread {
    public TestDaemon(String name) { super(name); }
    public void run() {
        int i=100;
        try {
            while (i-- > 0) {
                sleep(100);
            }
        }catch(InterruptedException e){

        }
    }

    public static void main(String[] args)throws Exception {
        Thread son_1=new TestDaemon("thread-1");
        Thread son_2=new TestDaemon("thread-2");
        Thread daemonThread=new TestDaemon("thread-daemonThread");
        son_1.start();
        son_2.start();

        daemonThread.setDaemon(true);//注意看这里
        daemonThread.start();
        son_1.join();
        son_2.join();
        System.out.println("all son_threads is over");
    }
}


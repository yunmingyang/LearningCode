import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        for(int i = 0;i<5;i++){
//            exec.execute(new UnsafeSequence());
//        }
//        exec.shutdown();
//        Thread t1 = new Thread(new UnsafeSequence(),"t1");
//        Thread t2 = new Thread(new UnsafeSequence(),"t2");
//
//
//        t1.start();
//        t2.start();
//
//        System.gc();
//        Runnable r1 = new Sequence();
//        Thread t1 = new Thread(r1,"t1");
//        Thread t2 = new Thread(r1,"t2");
//
//
//        t1.start();
//        t2.start();

//        System.gc();
//        Thread t1 = new Thread(new LiftOff(),"t1");
//        Thread t2 = new Thread(new LiftOff(),"t2");
//        t1.start();
//        t2.start();
//        for(int i = 0;i < 5;i++)
//            new Thread(new LiftOff()).start();
//        System.out.println("Waiting for LiftOff");
//        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec1 = Executors.newCachedThreadPool();
//        for(int i = 0 ;i < 5; i++) {
//            exec.execute(new LiftOff());
//            exec1.execute(new LiftOff());
//        }
//        exec.shutdown()
//        ExecutorService exec = Executors.newFixedThreadPool(5);
//        //newFixedThreadPool返回是一个ExecutorService,在内部实际调用的是ThreadPoolExecutor方法
          //是一个类中的构造函数,这个类继承AbstractExecutorService，而AbstractExecutorService则继承
          //ExecutorService,所以,实际上相当于一个向上转型.从设计模式来讲,属于工厂模式
//        for(int i = 0;i < 5;i++)
//            exec.execute(new LiftOff());
//        exec.shutdown();
//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        for(int i = 0;i < 10;i++)
//            exec.execute(new LiftOff());
//        exec.shutdown();
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0;i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}

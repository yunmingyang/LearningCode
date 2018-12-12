import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnsafeSequence implements Runnable{
    private static int value = 9;
    public int getNext(){
        System.out.println(value++);
        return value;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " value is : " + ++value);
    }

}

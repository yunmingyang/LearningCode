import java.util.concurrent.TimeUnit;

public class DaemonTask implements Runnable{
    public void run(){
        try{
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(Thread.currentThread() + " " + this);
        }catch (InterruptedException e){
            System.out.println("sleep interrput");
        }
    }
    public static void main(String[] args) throws Exception{
        for(int i = 0;i < 10;i++) {
            Thread Daemon = new Thread(new DaemonTask());
            Daemon.setDaemon(true);
            Daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(1000);
    }
}

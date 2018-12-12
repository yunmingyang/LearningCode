import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableTask implements Callable<String>{
    private int id;
    public CallableTask(int id){
        this.id = id;
    }
    public String call(){
        return "result of CallableTask " + id;
    }


    public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results =
        new ArrayList<Future<String>>();
        for(int i = 0;i < 10;i++)
            results.add(exec.submit(new CallableTask(i)));
        for(Future<String> t :results)
            try {
                System.out.println(t.get());
            }catch (InterruptedException e){
            e.printStackTrace();
            }catch (ExecutionException e){
            e.printStackTrace();
            }
            finally{
            exec.shutdown();
            }
    }
}

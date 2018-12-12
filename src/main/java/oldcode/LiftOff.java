public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    @Override
    public void run() {
        while(countDown-- > 0) {
            System.out.println(status());
            if (countDown == 5) {
                Thread.yield();
            }
        }
    }
    public  String status(){
        return "#" + Thread.currentThread().getName() +id + "(" +
                (countDown > 0? countDown : "LiftOff!") + ")";
    }
}

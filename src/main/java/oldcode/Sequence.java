public class Sequence implements Runnable{
    private int value;
    public  int getNext(){
        return ++value;
    }
    public void run(){
        System.out.println("value is :" + getNext());
    }
}

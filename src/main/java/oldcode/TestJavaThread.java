package oldcode;

public class TestJavaThread extends Thread {
    private int i = 0;
    public void run(){
            System.out.println(getName());

    }




    public static void main(String[] args){
        for (int i = 0;i < 100; i ++){
            if(i % 10 ==0){
                new TestJavaThread().start();
                new TestJavaThread().start();
            }
        }
    }
}

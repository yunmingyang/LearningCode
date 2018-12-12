import java.io.IOException;

public class Fibonacci {
    int Fibonacci(int n){
        if(n<=0){
            System.out.println("请输入一个比0大的整数");
            return 0;
        }


        int a = 1;
        int b = 1;
        int temp;


        for(int i=0;i<n;i++){
            if(i <= 1){
                System.out.println(b);
                continue;
            }
            temp = a;
            a = b;
            b = temp + b;
            System.out.println(b);
        }
        return b;
    }




    public static void main(String[] args){
        Fibonacci fb = new Fibonacci();
        try {
            fb.Fibonacci(100);
        }catch (Exception e){
            System.out.println("也许数太大了");
        }
    }

}

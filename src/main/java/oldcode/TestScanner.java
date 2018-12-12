import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //创建承接数据变量
        String temp = null;
        String temp_s = null;
        int temp_int = 0;


        System.out.println("请输入不带空格得数据");
        if (sc.hasNext()) {
            temp = sc.next();
            System.out.println(temp);
            temp_int = sc.nextInt();
            System.out.println(temp_int);
        }else{
            System.out.println("没有输入数据");
        }

        System.out.println("请输数据");
        if (sc.hasNext()){
            temp_s = sc.nextLine();
            System.out.println(temp_s);
            temp_int = sc.nextInt();
            System.out.println(temp_int);
        }else{
            System.out.println("没有输入数据");
        }
    }
}


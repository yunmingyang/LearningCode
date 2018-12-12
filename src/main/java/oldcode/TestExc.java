import java.io.IOException;

public class TestExc {

    public static void main(String[] args){
        try {
            int[] arr = new int []{1,2,3};
            System.out.println("arr's length is :" + arr.length);
            for (int i = 0;i <= arr.length;i++){
                System.out.println("数字" + i + "为：" + arr[i]);
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("我在末尾被执行");
        }


    }
}

package oldcode;

public class PerformceStr {
    public static void main(String[] args){
        System.out.println("--------开始---------");
        long starttime = System.nanoTime();
        for(int i = 0 ; i < 500000; i++){
            String temp1 = "aaaa";
            String temp2 = "bbbb";
        }
        long endtime = System.nanoTime();
        System.out.println("第一种方式需要的时间为： " + (endtime-starttime));
        System.out.println("---------结束---------");



        System.out.println("--------开始---------");
        long starttime1 = System.nanoTime();
        for(int i = 0 ; i < 5000000; i++){
            String temp1 = new String("aaaa");
            String temp2 = new String("bbbb");
        }
        long endtime1 = System.nanoTime();
        System.out.println("第二种方式需要的时间为： " + (endtime1-starttime1));
        System.out.println("---------结束---------");
    }
}

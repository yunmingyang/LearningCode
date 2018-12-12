package oldcode;

public class InternStr {
    public static void main(String[] args){
        String[] value = new String[500000];

        long starttime  = System.nanoTime();
        for(int i = 0;i < 500000;i++){
            value[i] = "Hello";
        }
        long endtime = System.nanoTime();
        System.out.println("直接创建花费： " + (endtime-starttime));

        System.out.println("-------华丽的分割线--------");
        long starttime1  = System.nanoTime();
        for(int i = 0;i < 500000;i++){
            value[i] = new String("Hello");
        }
        long endtime1 = System.nanoTime();
        System.out.println("new创建花费： " + (endtime1-starttime1));

        System.out.println("--------华丽的分割线-------");
        long starttime2  = System.nanoTime();
        for(int i = 0;i < 500000;i++){
            value[i] = new String("Hello");
            value[i] = value[i].intern();
        }
        long endtime2 = System.nanoTime();
        System.out.println("直接创建花费： " + (endtime2-starttime2));



    }
}

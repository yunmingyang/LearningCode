package oldcode;

public class Stringconcatenate {
    public static void main(String[] args){


        System.out.println("--------开始---------");
        long starttime  = System.nanoTime();
        for (int i = 0;i < 5000;i++){
           String value = "you " + "are " + "fool " + "hahahahahhahahahahahah";
        }
        long endtime = System.nanoTime();
        System.out.println("计算结果为" + "----使用”+“连接字符耗时： " + (endtime-starttime));


        System.out.println("--------开始---------");
        long starttime1  = System.nanoTime();
        for (int i = 0;i < 5000;i++){
            StringBuffer value = new StringBuffer();
            value.append("you ");
            value.append("are ");
            value.append("fool ");
            value.append("hahahahahhahahahahahah");
        }
        long endtime1 = System.nanoTime();
        System.out.println("计算结果为" + "----使用”+“连接字符耗时： " + (endtime1-starttime1));
    }
}

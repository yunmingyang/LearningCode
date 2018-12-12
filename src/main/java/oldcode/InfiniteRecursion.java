import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }//此处发生了异常,因为使用了String的重载操作符,所以this会发生自动类型转换到String类型，于是出现了异常

    public static void main(String[] args){
        List<InfiniteRecursion> list =
                new ArrayList<InfiniteRecursion>();
        for(int i = 0;i < 10;i++)
            list.add(new InfiniteRecursion());
        System.out.println(list);



        String a = "aa";
        String b = "aa";
        if(a .equals(b)) {
            System.out.println("比较的是内容");
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
        }
    }
}

import java.lang.reflect.Array;
import java.util.*;

public class IntegerTest {
    public static void main(String[] args){
        Collection<Integer> a = new ArrayList<Integer>();
        for(int i = 0 ;i < 10;i++)
            a.add(i);
        for (Integer c : a)
            System.out.println(c);
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0;i < 10;i++) {
            c.add(i);
        }
        for (Integer i : c){
            System.out.println(i);
        }


        Collection<Integer> a1 = new ArrayList<Integer>(c);
        for (Integer i : a1)
            System.out.println(i);
        Integer[] arr = {1,2,2,3,4};
        Collection<Integer> b1 = new ArrayList<Integer>();
        b1.addAll(c);
        for (Integer i : b1)
            System.out.println(i);


        Collection<Integer> c1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3));
        for (Integer i : c1)
            System.out.println(i);
    }
}

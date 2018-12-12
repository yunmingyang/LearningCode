//import java.util.ArrayList;
//
//public class Vector {
//    @SuppressWarnings("unchecked")
//    public static void main(String[] args){
//        ArrayList apples = new ArrayList();
//        for(int i = 0;i < 3; i++)
//            apples.add(new Apple());
//        apples.add(new Orange());
//        for(int i =0 ; i < apples.size();i++)
//            ((Apple)apples.get(i)).getId();
//    }
//}
//class Apple{
//    private static long counter;
//    private final long id = counter++;
//    public long getId(){
//        return id;
//    }
//}
//class Orange{}
import java.util.ArrayList;

public class Apple {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList<Apple1> apples = new ArrayList();
        for(int i = 0;i < 3; i++)
            apples.add(new Apple1());
//        apples.add(new Orange());
        for(int i =0 ; i < apples.size();i++)
            apples.get(i).getId();
    }
}
class Apple1{
    private static long counter;
    private final long id = counter++;
    public long getId(){
        return id;
    }
}
class Orange{}
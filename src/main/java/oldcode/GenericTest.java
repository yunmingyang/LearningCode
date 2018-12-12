import java.time.LocalDate;


public class GenericTest {
    public static void main(String[] args){
        LocalDate[] birthdays = {
                LocalDate.of(1995,4,2),
                LocalDate.of(2006,6,4),
                LocalDate.of(1997,6,5),
                LocalDate.of(1960,5,6),
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}


class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if(a == null && a.length == 0){
            return null;
        }
        T min = a[0];
        T max = a[0];
        for(int i = 0;i < a.length; i++){
            if(min.compareTo(a[i]) < 0) min = a[i];
            if(max.compareTo(a[i]) > 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}
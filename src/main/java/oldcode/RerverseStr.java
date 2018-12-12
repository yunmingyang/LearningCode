package Str;

public class RerverseStr {
    public static void main(String[] args){
        String str = "Hello World!";
        String reserve = new StringBuffer(str).reverse().toString();
        System.out.println(reserve);

    }
}

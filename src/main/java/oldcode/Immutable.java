import java.util.ArrayList;

public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }
    public  String toString(){
        return super.toString();
    }
    public static void main(String[] args){
        String s1 = "asd";
        System.out.println(s1);
        String s2 = upcase(s1);
        System.out.println(s2);
        System.out.println(s1);//upcase不改变原String的值



        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);//String中“+”以及“+=”被重载

        Immutable a = new Immutable();
        Immutable b = new Immutable();
        Immutable c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if(b == c)
            System.out.println(b);
        if(b.equals(c))
            System.out.println(b);//本质上equals在Object中调用了“return (this == obj);”即“b==c”.equals的价值在于可以在子类中继承它
        //并自己重写它，这样就能达到

    }
}

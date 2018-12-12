package oldcode;

import java.util.Locale;

public class FormatStr {
    public static void main(String[] args){
        double a = Math.E;
        System.out.printf("%f%n",a);
        System.out.printf(Locale.CHINA  , "%-10.4f%n%n", a);
    }
}

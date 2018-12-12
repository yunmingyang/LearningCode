package oldcode;

public class CompareStr {
    public static void main(String[] args){
        String str = "aaajjjjsss";
        String compared = "sssjjjaaaa";
        String compared1 = "AAAJJJJSSS";
        Object obj = str;

        System.out.println(str.compareTo(compared));
        System.out.println(str.compareToIgnoreCase(compared1));
        System.out.println(str.compareTo(obj.toString()));

    }
}

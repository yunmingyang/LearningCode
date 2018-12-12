package oldcode;

public class DelStr {
    public static String DelStr(String str,int pos){
        return str.substring(0,pos) + str.substring(pos+1);
    }

    public static void main(String[] args){
        String str = "Hello World! Hello girl!";
        System.out.println(DelStr.DelStr(str,12));
    }
}

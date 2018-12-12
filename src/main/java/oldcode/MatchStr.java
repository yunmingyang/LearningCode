package Str;

public class MatchStr {
    public static void main(String[] args){
        String str1 = "www.runoob.com";
        String str2 = "www.RUNOOB.com";
        boolean match1 = str1.regionMatches(4,str2,4,6);
        System.out.println(match1);
        boolean match2 = str2.regionMatches(true,4,str2,4,6);
        System.out.println(match2);
    }
}

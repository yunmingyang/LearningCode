package Str;

public class ReplaceStr {
    public static void main(String[] args){
        String str = "Hello World!Hello Yang";

        System.out.println(str.replace("H","A"));
        System.out.println(str.replaceFirst("Hello","aha"));
        System.out.println(str.replaceAll("H","A"));//replace将新串替换旧串，replaceAll使用给定的replacement
                                                                     // 字符串替换此字符串匹配给定的正则表达式的每个子字符串

    }
}

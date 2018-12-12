public class TestString {
    public static void main(String[] args){
        System.out.println("hello");

        char[] helloArry = {'r','u','n','o','o','b'};
        String helloString = new String(helloArry);
        System.out.println(helloString);



        String str = "www.runboob.com";
        System.out.println("length is :" + str.length());


        String str1 = "你";
        String str2 = "我";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("you are ".concat("sb"));


        char a = str.charAt(1);
        System.out.println(a);


        int a1 = str.compareTo(str3);
        System.out.println(a1);
    }
}

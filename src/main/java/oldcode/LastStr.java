package oldcode;

public class LastStr {
    public static void main(String[] args){
        String str = "Hello World! Hello yang";
        int index = str.lastIndexOf("yang");

        if(index == -1){
            System.out.println("未找到");
        }else{
            System.out.println("字符中最后一次出现的位置为:" + index);
        }


    }
}

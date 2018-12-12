package oldcode;

public class FindStr {
    public static void main(String[] args){
        String str = "Hello World!";
        int index = str.indexOf("e");
        if(index < 0 ){
            System.out.println("请重新查询");
        }else{
            System.out.println("字符位置为：" + index);
        }


    }
}

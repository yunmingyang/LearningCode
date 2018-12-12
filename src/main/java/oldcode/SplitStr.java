package Str;

public class SplitStr {
    public  static void main(String[] args){
        String str = "www-runoob-com";
        String split = "-";
        String[] temp = str.split(split);
        for(int i = 0;i < temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println("-------分割线---------");
        String str1 = "www.runoob.com";
        String split1 = "\\.";//  .代表所有字符，\.代表仅取一个.
        String temp1[] = str1.split(split1);
        for(String x : temp1){
            System.out.println(x);
        }
    }
}

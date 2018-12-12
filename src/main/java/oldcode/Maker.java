public class Maker {
//    String str;
    static String str = "sss";
    String str1 = "aaa";
    public Maker(String str){
        this.str1 = str;
    }

    public void useLess(String str, int i){
        System.out.println(str +" is " + "useless");
    }
    public void useLess(int i, String str){
        System.out.println(str + " is " + "useless");
    }

    public static void main(String[] args){
        System.out.println(str);
        Maker maker = new Maker("asdasd");
        System.out.println(maker.str1);
        Maker maker1 = new Maker("aaaaaaaa");
        System.out.println(maker1.str1);

        maker.useLess("yuxianwei",1);
        maker.useLess(1,"yuxianwei");
        int[] nums = {1,2};
        System.out.println(nums.length);
    }
}

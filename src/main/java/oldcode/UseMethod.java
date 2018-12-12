public class UseMethod {
    int ium;
    public UseMethod(String um){
        System.out.println("um");
    }
    public void set(int num){
        ium=num;
    }






    public static void main(String[] args){
        UseMethod useMeth = new UseMethod("heiheihei");
        useMeth.set(1000);
        System.out.println("num is "+useMeth.ium);
    }

}

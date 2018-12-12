public class TestLoader {
    public static void main(String[] args){
//        System.out.println("inside main");
//        new Candy();
//        System.out.println("After creating Candy");
//        try{
//            Class.forName("Gum");
//        }catch(ClassNotFoundException e){
//            System.out.println("Couldn't find Gum");
//        }
//        System.out.println("After Class.forName(\"Gum\")");
//        new Cookie();
//        System.out.println("After creating Cookie");
//    }
        Candy c = new Candy(10);
        Candy b = new Candy(11);
        Class a = Candy.class;
        System.out.println("a.getName() is " + a.getName());
    }
}
class Candy{
    public int i;
    static  { System.out.println("Loading Candy"); }
    public Candy(int i ){
        this.i = i;
        System.out.println(this.i);
    }
}
class Gum{
    //static { System.out.println("Loading Gum"); }
}
class Cookie {
    //static { System.out.println("Loading Cookie"); }
}
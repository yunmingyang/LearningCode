public class Ploymorphs {
    public static void main(String[] args){
        Bike b = new Splendar();
    }
}
class Bike{
    void run(){
        System.out.println("bike");
    }
}


class Splendar extends Bike{
    void run(){
        System.out.println("~~~~~~");
    }
}

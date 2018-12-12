public class TestIns {
    public static void main(String[] args){
        Dogggg dgg = new Dogggg();
        System.out.println(dgg instanceof Dogggg);
        System.out.println(dgg instanceof Animallll);


        Dogggg dggg = null;
        System.out.println(dggg instanceof Dogggg);
        System.out.println(dggg instanceof Animallll);

        Animallll a2 = new Dogggg();
        Dogggg.method(a2);//通过在方法中用instanceof判断后，再将父类强转，由于向上升级后，丢弃重写得方法，所以该方法要声明为静态直接使用
        //类来调用
    }
}


class Animallll{
    /*void run(){
        System.out.println("running~~~");
    }*/
}

class Dogggg extends Animallll{
    void run(){
        System.out.println("dog is running");
    }
    void eat(){
        System.out.println("dog is eating");
    }

    static void method(Animallll a){
        if(a instanceof Dogggg){
            Dogggg d1 = (Dogggg)a;
            System.out.println("is true");
        }
    }
}
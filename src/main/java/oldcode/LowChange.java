public class LowChange {
    public static void main(String[] args){/*
        AnimalTwo a = new DogTwo();
        DogTwo dg = new DogTwo();
        a.eating();
        System.out.println(a instanceof DogTwo);
        a = dg;
        a.eating();
        System.out.println(a instanceof DogTwo);*/
        AnimalTwo a1 = new DogTwo();
        a1.eating();
        //a1.fly();  向上转型时候会遗失所有除重写方法以外得方法
        DogTwo DT =(DogTwo)a1;//安全得向下转型，父类实例原本就引用得是一个子类对象
        DT.eating();
        DT.fly();
        DogTwo dt1 = new DogTwo();
        dt1.fly();
        AnimalTwo AT = new AnimalTwo();
        dt1 = (DogTwo)AT;//不安全得向下转型，父类实例原本引用得就是父类对象
        //因此此处会报异常
    }
}

class AnimalTwo{
    void eating(){
        System.out.println("eating");
    }
}

class DogTwo extends AnimalTwo{
    void eating(){
        System.out.println("Dog eating");
    }
    void fly(){
        System.out.println("you can fly?");
    }
}
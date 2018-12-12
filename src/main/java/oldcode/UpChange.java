public class UpChange {
    public static void main(String[] args){
        Animals a = new Brid();
        a.ear();
        //a.fly();//向上转型时候，会丢失与父类对象共有得其他方法
    }
}



class Animals{
    public void ear(){
        System.out.println("eating");
    }
}


class Brid extends Animals{
    public void ear(){
        System.out.println("brid eating!");
    }

    public void fly(){
        System.out.println("brid flying!");
    }
}
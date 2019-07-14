package com.chapter5;


public class EnumOrder {


    public static void main(String[] args) {
        Spiciness sn = Spiciness.HOT;
        System.out.println(sn);

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
            System.out.println(s + ", code " + s.code);
        }
        Burrito b = new Burrito(Spiciness.MILD);
        b.describe();
    }
}

enum Spiciness {
    NOT(10), MILD(20), MEDIUM(30), HOT(40), FLAMING(50);

    // 其它域和方法的定义要在定义了枚举元素之后
    int code;
    Spiciness(int code){this.code = code;}

    int getCode(){return this.code;}
}

class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
                break;
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
                break;
            case FLAMING:
                break;
            default:
                System.out.println("maybe too hot");
                break;
        }
    }
}
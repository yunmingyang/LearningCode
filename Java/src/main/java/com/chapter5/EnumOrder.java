package com.chapter5;


public class EnumOrder {


    public static void main(String[] args) {
        Spiciness sn = Spiciness.HOT;
        System.out.println(sn);

        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
        Burrito b = new Burrito(Spiciness.MILD);
        b.describe();
    }
}

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
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
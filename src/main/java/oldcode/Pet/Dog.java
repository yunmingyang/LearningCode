package com.Pet;

public class Dog extends Pet {
    public Dog(String name){ super(name); }
    public Dog(){ super(); }
}

class Mutt extends Dog {
    public Mutt(String name){
        super(name);
    }
    public  Mutt(){ super(); }
}
class Pug extends Dog {
    public Pug(String name){
        super(name);
    }
    public  Pug(){ super(); }
}
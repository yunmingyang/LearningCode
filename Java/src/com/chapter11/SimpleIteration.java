package com.chapter11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/**
 * Created by yangyunming on 2018/7/20
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(
                new Pet(1),
                new Pet(2),
                new Pet(3)
        );

        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println("\n");

        for (Pet p : pets) {
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println("\n");

        it = pets.iterator();
//        it.remove();//array转的不支持
        for (int i = 0; i < 2; i++) {
            System.out.println(it.next().id());
        }

        System.out.println(pets);
    }
}
class Pet{
    public Pet(int num){ id = num;}
    private long count ;
    private long id = ++count;
    public long id(){return id;}
}

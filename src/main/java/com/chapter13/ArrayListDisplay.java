package com.chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by yangyunming on 2018/7/26
 */
public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee c : new CoffeeGenerator(10)){
            coffees.add(c);
        }
        System.out.println(coffees);
    }
}
class Coffee{
    String str;
    int num;
    static int counter;
    public String toString(){
        return str + " " + num;
    }
}
class CoffeeGenerator implements Iterable<Coffee> {
    private Coffee[] temp;
    static String[] str = {"A","B","C","D","E","F","G","H","I","J"};
    static Random random = new Random(47);
    public CoffeeGenerator(int num){
        temp = new Coffee[10];
        for (int i = 0; i < num; i++) {
            temp[i] = new Coffee(){
                {
                    str = CoffeeGenerator.str[random.nextInt(9)];
                    num = ++counter;
                }
            };
        }
    }
    @Override
    public Iterator iterator() {//重写
        return new Iterator() {
            private int index;
            @Override
            public boolean hasNext() {
                return index < temp.length;
            }

            @Override
            public Coffee next() {
                return temp[index++];
            }
        };
    }
}

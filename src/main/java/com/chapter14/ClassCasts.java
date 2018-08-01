package com.chapter14;



/**
 * Created by yangyunming on 2018/8/1
 */

class Building{}
class House extends Building{}
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        //h=(House)b;
    }
}

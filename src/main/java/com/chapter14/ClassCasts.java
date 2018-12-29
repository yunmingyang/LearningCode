package com.chapter14;



/**
 * Created by yangyunming on 2018/8/1
 */

class Building{}
class House extends Building{}
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
//        Building b = new Building();
        Class<House> houseType = House.class;
//       向下转型。一般用不到，可在普通转型无法使用的地方使用
        House h = houseType.cast(b);
        //h=(House)b;
    }
}

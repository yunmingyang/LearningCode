package com.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yangyunming on 2018/7/20
 */
public class AsListInfrence {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Power(),new Crusty(),new Slush());
        List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());


    }
}
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}

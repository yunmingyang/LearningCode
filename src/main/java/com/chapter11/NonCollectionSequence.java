package com.chapter11;

import java.util.Iterator;

public class NonCollectionSequence extends Sequence{
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < str.length;
            }

            @Override
            public String next() {
                return str[index++];
            }
        };
    }


    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
//        for (String n:
//             nc) {
//            //未继承AbstractCollection，因此实现了iterator也无法遍历
//        }
        Iterator it = nc.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
class Sequence{
    protected String[] str = {"ss","dd","ff","gg","ll","kk"};
}
package com.chapter11;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by yangyunming on 2018/7/24
 */
public class CollectionSequence extends AbstractCollection {
    private Pet[] pets = new Pet[]{
            new Pet(1),
            new Pet(2),
            new Pet(3),
    };
    public int size(){return pets.length;}
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){
                //未实现，使用会抛异常
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        //todo:chapter14

    }
}

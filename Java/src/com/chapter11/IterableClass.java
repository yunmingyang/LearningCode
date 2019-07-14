package com.chapter11;

import java.util.Iterator;

/**
 * Created by yangyunming on 2018/7/24
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];//这样可以在移动同时保证hasNext函数的正确性
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s :new IterableClass()) {
            System.out.print(s + " ");
        }
    }
}

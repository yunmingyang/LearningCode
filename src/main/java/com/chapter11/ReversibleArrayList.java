package com.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by yangyunming on 2018/7/24
 */
public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c){ super(c); }
    public Iterable<T> reversed(){//相当于继承了Iterable
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {//相当于继承了Iterator
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        ReversibleArrayList<String> reversibleArrayList =new ReversibleArrayList<>(
                Arrays.asList("To be or not to be".split(" ")));
        for (String s : reversibleArrayList)
            System.out.print(s + " ");
        System.out.println();
        for (String s:reversibleArrayList.reversed()) {
            System.out.print(s + " ");
        }
    }
}

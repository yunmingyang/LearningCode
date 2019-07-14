package com.chapter11;


import java.util.*;

public class MultiIterableClass  extends IterableClass{

    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int current = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current -- ];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(
                        Arrays.asList(words)
                );
                Collections.shuffle(shuffled,new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();

        for (String str:
                mic.randomized()) {
            System.out.println(str);
        }//未影响排序
        System.out.println("----------next---------------");
        for (String str:
             mic) {
            System.out.println(str);
        }
        System.out.println("----------next---------------");
        for (String str:
                mic.reversed()) {
            System.out.println(str);
        }
    }
}

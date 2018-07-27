package com.chapter11;

import java.util.LinkedList;

/**
 * Created by yangyunming on 2018/7/23
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T t){storage.addFirst(t);}
    public T pop(){return storage.removeFirst();}
    public T peek(T t){return storage.getFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "My Dog has fleas".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.println(stack.pop() + "\t");
        }
    }
}

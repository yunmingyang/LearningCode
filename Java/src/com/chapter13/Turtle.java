package com.chapter13;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by yangyunming on 2018/7/26
 */
public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name,Formatter f){
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y){
        f.format("%s : The Turtle is at x = %d , y = %d\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy",new Formatter(System.out));
        Turtle terry = new Turtle("terry",new Formatter(outAlias));
        tommy.move(0,0);
        tommy.move(1,1);
        tommy.move(2,2);
        terry.move(3,3);
        terry.move(4,4);
        terry.move(5,5);
    }
}

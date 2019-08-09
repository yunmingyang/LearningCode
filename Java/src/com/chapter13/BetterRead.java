package com.chapter13;

import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
//        Scanner 可以接受任何类型的输入对象，包括file、inputstream、string或者readable
        Scanner scanner = new Scanner(SimpleRead.br);
//        由于Scanner会检查IOException所以可以通过该方法来检查是否有IOException抛出,若未抛出过，则应该未null
//        scanner.ioException();
//        Scanner scanner = new Scanner("Sir Robin of Camelot\n22 1.61803");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What's your favroite double?");
        System.out.println("Input : <age><double>");
        int age = scanner.nextInt();
        double num = scanner.nextDouble();
        System.out.println(age);
        System.out.println(num);
        System.out.printf("Hi , %s\n",name);
        System.out.printf("In 5 years you will be %d \n", age + 5);
        System.out.printf("My favorite double is %f " , num / 2);
    }
}

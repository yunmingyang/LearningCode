package com.chapter13;

import java.util.Scanner;

/**
 * Created by yangyunming on 2018/7/30
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12,42,78,99,42");
        scanner.useDelimiter(",");//\\s*,\\s*
        while (scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}

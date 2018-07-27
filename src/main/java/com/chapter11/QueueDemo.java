package com.chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by yangyunming on 2018/7/24
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove() + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.add(random.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char e:
             "Brontosaurus".toCharArray()) {
            qc.offer(e);
        }
        printQ(qc);
    }
}

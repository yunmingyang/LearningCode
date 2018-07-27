package com.chapter11;

import java.util.*;

/**
 * Created by yangyunming on 2018/7/24
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);
        List<Integer> list = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<>(list.size(),Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);

        String fact = "EDUCATUIB SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        priorityQueue1.addAll(strings);
        QueueDemo.printQ(priorityQueue1);

        Set<Character> charSet = new HashSet<>();
        for (char c:fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ);

    }
}

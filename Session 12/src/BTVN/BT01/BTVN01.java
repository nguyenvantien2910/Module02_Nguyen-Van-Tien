package BTVN.BT01;

import java.util.PriorityQueue;
import java.util.Queue;

public class BTVN01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.add((int)(Math.random() * 100));
        }

        System.out.println(queue);

    }

}

package BTVN.BT13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập vào số lượng phần tử của mảng số nguyên : ");
            int length = Integer.parseInt(scanner.nextLine());

            Integer[] numbers = new Integer[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = (int) (Math.random() * 1000);
            }

            for (Integer num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            Queue<Integer> queue = new LinkedList<>();
            for (Integer i : numbers) {
                queue.add(i);
            }

            boolean isDescending = true;
            int prev = Integer.MAX_VALUE;
            while (!queue.isEmpty()) {
                int current = queue.poll();
                if (current < prev) {
                    prev = current;
                } else {
                    isDescending = false;
                    break;
                }
            }

            if (isDescending) {
                System.out.println("Mảng số nguyên là mảng giảm dần.");
            } else {
                System.out.println("Mảng số nguyên không phải là mảng giảm dần.");
            }
        }
    }
}

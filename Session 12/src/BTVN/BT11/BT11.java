package BTVN.BT11;

import java.util.Scanner;
import java.util.Stack;

public class BT11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào số lượng phần tử của mảng số nguyên : ");
            int length = Integer.parseInt(scanner.nextLine());

            Integer[] numbers = new Integer[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = (int) (Math.random() * 1000);
            }

            for (Integer i : numbers) {
                System.out.print( i + " ");
            }
            System.out.println();

            Stack<Integer> stack = new Stack<>();
            for (Integer num : numbers) {
                if (stack.isEmpty() || num >= stack.peek()) {
                    stack.push(num);
                }
            }

            System.out.println("Phần tử lớn nhất : " + stack.peek());
        }
    }
}

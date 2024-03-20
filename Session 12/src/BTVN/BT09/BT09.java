package BTVN.BT09;

import java.util.Scanner;
import java.util.Stack;

public class BT09 {
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
                System.out.print(i + " ");
            }
            System.out.println();

            Stack<Integer> wStack = new Stack<>();
            for (int i = 0; i < length; i++) {
                wStack.push(numbers[i]);
            }

            System.out.println("Chuỗi đảo ngược :");
            while (!wStack.isEmpty()) {
                System.out.print(wStack.pop() + " ");
            }
            System.out.println("\n");
        }
    }
}

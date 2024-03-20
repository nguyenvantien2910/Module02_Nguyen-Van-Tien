package BTVN.BT14;

import java.util.Scanner;
import java.util.Stack;

public class BT14 {
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

            Stack<Integer> stack = new Stack<>();
            for (int i : numbers) {
                stack.push(i);
            }

            System.out.println(stack);

            System.out.println(isPrimeStack(stack));

        }
    }

    public static boolean isPrimeStack(Stack<Integer> stack) {
        for (int num : stack) {
            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

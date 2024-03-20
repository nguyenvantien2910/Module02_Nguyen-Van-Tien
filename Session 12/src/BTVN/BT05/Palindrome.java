package BTVN.BT05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào chuỗi cần kiểm tra : ");

            String checkString = scanner.nextLine().toLowerCase();

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            for (char c : checkString.toCharArray()) {
                stack.push(c);
                queue.add(c);
            }

            boolean isPalindrome = true;
            while (!stack.isEmpty()) {
                if (!stack.pop().equals(queue.poll())) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Chuỗi là chuỗi Palindrome.");
            } else {
                System.out.println("Chuỗi không là chuỗi Palindrome.");
            }
        }
    }
}

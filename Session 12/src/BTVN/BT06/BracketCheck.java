package BTVN.BT06;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mời bạn nhập vào chuỗi cần kiểm tra : ");

            String input = scanner.nextLine();

            Stack<Character> bStack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(') {
                    bStack.push(ch);
                } else if (ch == ')') {
                    if (!bStack.isEmpty() && bStack.peek() == '(') {
                        bStack.pop();
                    } else {
                        System.out.println("Chuỗi không cân đối");
                        return;
                    }
                }
            }

            if (bStack.isEmpty()) {
                System.out.println("Chuỗi cân đối");
            } else {
                System.out.println("Chuỗi không cân đối");
            }
        }
    }
}
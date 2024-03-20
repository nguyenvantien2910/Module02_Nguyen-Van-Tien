package BTVN.BT04;

import java.util.Scanner;
import java.util.Stack;

public class BT04 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập số lượng kí tự muốn nhập : ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.printf("Nhập từ thứ %d: ", i + 1);
            stack.push(scanner.nextLine());
        }

        System.out.println("Văn bản đảo ngược là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

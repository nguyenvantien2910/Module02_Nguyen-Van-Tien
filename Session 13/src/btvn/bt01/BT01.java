package btvn.bt01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng số nguyên
        while (true) {
            System.out.println("Nhập vào số lượng phần tử của mảng số nguyên : ");
            int length = Integer.parseInt(scanner.nextLine());

            Integer[] numbers = new Integer[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = (int) (Math.random() * 1000);
            }

            System.out.println("Mảng số nguyên được tạo:");
            for (Integer i : numbers) {
                System.out.print(i + " ");
            }

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (Integer i : numbers) {
                if (hashMap.containsKey(i)) {
                    // Có tồn tại trong HashMap
                    hashMap.put(i, hashMap.get(i) + 1);
                } else {
                    // Không tồn tại trong HashMap
                    hashMap.put(i, 1);
                }
            }

            System.out.println("\nSố lần xuất hiện của mỗi phần tử trong mảng:");
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                System.out.printf("Số lần xuất hiện của phần tử %s là : %s%n", entry.getKey(), entry.getValue());
            }
        }
    }
}

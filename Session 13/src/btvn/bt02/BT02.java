package btvn.bt02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng số nguyên
        while (true) {
            System.out.println("\nNhập vào số lượng phần tử của mảng số nguyên : ");
            int length = Integer.parseInt(scanner.nextLine());

            Integer[] numbers = new Integer[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = (int) (Math.random() * 10);
            }

            System.out.println("\nMảng số nguyên được tạo:");
            for (Integer i : numbers) {
                System.out.print(i + " ");
            }

            //Tạo hashMap tương ứng
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            HashMap<Integer, Integer> onlyHashMap = new HashMap<>();

            //Thêm các phần từ của mảng vào hashMap
            for (Integer i : numbers) {
                if (!hashMap.containsKey(i)) {
                    hashMap.put(i, 1);
                } else {
                    hashMap.put(i, hashMap.get(i) + 1);
                }
            }

            //Duyệt in các phàn từ có số lần xuất hiện là 1
            //C1:
            System.out.println("\nMap chỉ chứa các phần tử có giá trị = 1: ");
            for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
                if (map.getValue() == 1) {
                    onlyHashMap.put(map.getKey(), map.getValue());
                    System.out.printf("\nKey: %-10s | Value: %-20s", map.getKey(), map.getValue());
                }
            }

            //C2:
            System.out.println("\nMap chỉ chứa các phần tử có giá trị = 1 (sử dụng forEach):");
            onlyHashMap.forEach((key, value) -> {
                System.out.printf("\nKey: %-10s | Value: %-20s", key, value);
            });
        }
    }
}

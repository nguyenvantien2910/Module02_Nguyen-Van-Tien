package btvn.bt07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bt07 {
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

            //Tạo 2 hashMap tương ứng
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            HashMap<Integer, Integer> cloneMap = new HashMap<>();

            //Push phần từ từ array vào hashMap
            for (Integer i : numbers) {
                if (hashMap.containsKey(i)) {
                    hashMap.put(i, hashMap.get(i) + 1);
                } else {
                    hashMap.put(i, 1);
                }
            }
            //Copy các phần tử hashMap sang cho cloneMap
            //C1:
            cloneMap.putAll(hashMap);

            //C2:
            for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
                cloneMap.put(entry.getKey(),entry.getValue());
            }

            //In hashMap và cloneMap
            System.out.println("hashMap");
            hashMap.forEach((key, value) -> {
                System.out.printf("\nKey : %-10s | Value : %-20s", key, value);
            });

            System.out.println("\ncloneMap");
            cloneMap.forEach((key, value) -> {
                System.out.printf("\nKey : %-10s | Value : %-20s", key, value);
            });
        }
    }
}

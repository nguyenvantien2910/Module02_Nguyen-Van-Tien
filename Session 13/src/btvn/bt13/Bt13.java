package btvn.bt13;

import java.util.Scanner;
import java.util.TreeMap;

public class Bt13 {
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

            //Tạo tree map
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            for (Integer i : numbers) {
                if (treeMap.containsKey(i)) {
                    treeMap.put(i, treeMap.get(i) + 1);
                } else {
                    treeMap.put(i, 1);
                }
            }

            //Tìm giá trị nhỏ nhất và in ra
            System.out.printf("\nGiá trị nhỏ nhất là : \nKey: %-10s | Value: %-20s", treeMap.firstEntry().getKey(), treeMap.firstEntry().getValue());

        }
    }
}

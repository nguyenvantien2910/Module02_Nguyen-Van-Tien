package btvn.bt011;

import java.util.*;

public class Bt11 {
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

            //In mảng đã tạo
            System.out.println("\nMảng số nguyên được tạo:");
            for (Integer i : numbers) {
                System.out.print(i + " ");
            }

            //Tạo treeMap
            TreeMap<Integer,Integer> treeMap = new TreeMap<>();

            //Thêm các phần từ của mảng vào treeMap
            for (Integer i : numbers) {
                if (treeMap.containsKey(i)) {
                    treeMap.put(i,treeMap.get(i) + 1);
                } else {
                    treeMap.put(i,1);
                }
            }

            //Duyệt mảng và hiển thị danh sách
            System.out.println("\nDanh sách mảng sau khi được sắp xếp : ");
            treeMap.forEach((key,value) -> {
                System.out.printf("\nKey: %-10s | Value: %-20s", key, value);
            });
        }
    }
}

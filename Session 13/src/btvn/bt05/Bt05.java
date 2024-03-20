package btvn.bt05;

import java.util.*;
import java.util.stream.Collectors;

public class Bt05 {
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

            //Tạo hashMap
            HashMap<Integer,Integer> hashMap = new HashMap<>();

            //Thêm các phần từ của mảng vào hashMap
            for (Integer i : numbers) {
                if (hashMap.containsKey(i)) {
                    hashMap.put(i,hashMap.get(i) + 1);
                } else {
                    hashMap.put(i,1);
                }
            }

            // sắp xếp lại hashMap theo thứ tự tăng dần
            Map<Integer,Integer> sortedMap = hashMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));

            //Duyệt mảng và hiển thị danh sách
            System.out.println("\nDanh sách mảng sau khi được sắp xếp : ");
            hashMap.forEach((key,value) -> {
                System.out.printf("\nKey: %-10s | Value: %-20s", key, value);
            });
        }
    }
}

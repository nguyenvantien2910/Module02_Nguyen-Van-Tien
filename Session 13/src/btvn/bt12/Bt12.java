package btvn.bt12;

import java.util.Scanner;
import java.util.TreeMap;

public class Bt12 {
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

            //Nhập thứ tự số lớn nhất muốn lấy ra
            System.out.println("\nNhập thứ tự số lớn nhất muốn tìm kiếm: ");
            int searchkey = Integer.parseInt(scanner.nextLine());

            // Không đủ số lượng để tìm khóa lớn thứ n đã nhập
            if (treeMap.size() < searchkey) {
                System.out.println("\nSố lượng phần tử trong map nhỏ hơn thứ tự muốn tìm kiếm !");
            } else {
                int count = 0;
                Integer desiredRankKey = null;

                //lặp để tìm phần tử lớn thứ n đã nhập
                for (Integer key : treeMap.descendingKeySet()) {
                    count++;
                    if (count == searchkey) {
                        desiredRankKey = key;
                        break;
                    }
                }

                int frequency = treeMap.get(desiredRankKey);
                System.out.printf("\nSố lớn thứ %s trong mảng là : %s, có tần số xuất hiện là : %s%n", searchkey, desiredRankKey, frequency);
            }
        }
    }
}

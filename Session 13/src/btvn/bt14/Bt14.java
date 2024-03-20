package btvn.bt14;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Bt14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khởi tạo mảng
        System.out.println("Mời bạn nhập vào số lượng phần tử của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        Integer[] integers = new Integer[length];

        for (int i = 0; i < length; i++) {
            integers[i] = (int) (Math.random() * 100);
        }

        //Tạp treeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        //Push phần từ vào treeMap
        for (Integer i : integers) {
            if (!treeMap.containsKey(i)) {
                treeMap.put(i, 1);
            } else {
                treeMap.put(i,treeMap.get(i) + 1);
            }
        }

        //In ra treeMap
        System.out.println("\nMap theo thứ tự tăng dần : ");
        System.out.println(treeMap);

        //Tạo treeMap để reverse
        TreeMap<Integer, Integer> reverseMap = new TreeMap<>(Collections.reverseOrder());
        reverseMap.putAll(treeMap);

        //In reverse treeMap
        System.out.println("\nMap sau khi được đổi chiều theo thứ tự giảm dần : ");
        System.out.println(reverseMap);
    }
}

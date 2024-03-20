package btvn.bt15;

import java.util.Scanner;
import java.util.TreeMap;

public class Bt15 {
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
        System.out.println("\nMap khi chưa xóa phần tử : ");
        System.out.println(treeMap);

        //Nhập vào key muốn xóa
        System.out.println("Mời bạn nhập vào key muốn xóa : ");
        int deleteNum = Integer.parseInt(scanner.nextLine());

        //Thực hiện xóa theo key đã nhập
        treeMap.remove(deleteNum);

        //In mảng sau khi dã xóa
        System.out.println("\nMap khi đã xóa phần tử : ");
        System.out.println(treeMap);
    }
}

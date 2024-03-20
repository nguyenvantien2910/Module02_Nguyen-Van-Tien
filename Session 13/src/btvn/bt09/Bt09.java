package btvn.bt09;

import java.util.HashMap;
import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) {
        //Tạo mảng
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào số lượng phần tử của mảng : ");
            Integer length = Integer.parseInt(scanner.nextLine());

            Integer[] numbers = new Integer[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = (int) (Math.random() * 100);
            }

            //Tạo hasMap để gán giá trị
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (Integer i : numbers) {
                if (hashMap.containsKey(i)) {
                    hashMap.put(i, hashMap.get(i) + 1);
                } else {
                    hashMap.put(i, 1);
                }
            }

            //Nhập số để kiểm tra
            System.out.println("Mời bạn nhập số để kiểm tra : ");
            Integer checkNum = Integer.parseInt(scanner.nextLine());

            //In hashMap
            hashMap.forEach((key,value) -> {
                System.out.printf("\nKey : %-10s | Value : %-20s", key,value);
            });

            //In kết quả kiểm tra
            System.out.println("\n" + hashMap.containsKey(checkNum));
        }
    }
}

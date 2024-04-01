package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bt04 {
    public static void main(String[] args) {
        //Khai báo biến string lấy dữ liệu từ bàn phím
        String inputValue;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi bất kì : ");
        inputValue = scanner.nextLine();
        if (inputValue.isBlank()) {
            throw new RuntimeException("Giá trị nhập vào không được bỏ trống !");
        }

        //Tạo 1 danh sách các số nguyên
        List<Integer> integerList = new ArrayList<>();

        //Duyệt chuỗi đã nhập và thêm vào danh sách số nguyên đã khai báo
        for (int i = 0; i < inputValue.length(); i++) {
            try {
                // Sử dụng charAt(i) để lấy ký tự thứ i trong chuỗi inputValue
                int num = Integer.parseInt(String.valueOf(inputValue.charAt(i)));
                integerList.add(num);
            } catch (NumberFormatException e) {
                System.err.printf("Giá trị '%c' bạn đã nhập không phải là số nguyên và đã được thay thế bằng 0\n", inputValue.charAt(i));
                integerList.add(0);
            }
        }

        // In danh sách số nguyên sau khi đã được thay th
        System.out.println("Danh sách số nguyên từ chuỗi nhập vào:");
        for (int num : integerList) {
            System.out.println(num);
        }
    }
}

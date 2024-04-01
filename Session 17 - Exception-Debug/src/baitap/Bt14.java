package baitap;

import java.util.Scanner;

public class Bt14 {
    public static void main(String[] args) {
        //Viết một chương trình Java để tìm giá trị trung bình của một mảng số nguyên.
        // Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.

        //Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        double avg;

        int length;
        int sum = 0;

        do {
            System.out.println("Nhập số lượng phẩn tử của mảng : ");
            try {
                length = Integer.parseInt(scanner.nextLine());
                if (length <= 0) {
                    System.err.println("Độ dài mảng phải lớn hơn 0, mời nhập lại!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Độ dài nhập vào không hợp lệ, mời nhập lại !");
            }
        } while (true);

        int[] ints = new int[length];

        //Nhập giá trị cho từng giá trị của mảng
        for (int i = 0; i < length; i++) {
            do {
                System.out.printf("Nhập giá trị cho phần tử thứ %d\n", i + 1);
                try {
                    ints[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Giá trị nhập vào không hợp lệ, mời nhập lại !");
                }
            } while (true);
        }

        //Tính giá trị trung bình và in ra
        for (int i = 0; i < length; i++) {
            sum += ints[i];
        }
        avg = (double) sum/length;

        System.out.printf("Giá trị trung bình các phẩn tử của mảng là : %.2f\n",avg);
    }
}

package baitap;

import java.util.Scanner;

public class Bt03 {
    public static void main(String[] args) {
        //Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int length;

        do {
            System.out.println("Mời bạn nhập độ dài cho mảng số nguyên : ");
            try {
                length = Integer.parseInt(scanner.nextLine());
                //Check mảng rỗng
                if (length <= 0) {
                    System.out.println("Độ dài của mảng phải lớn hơn 0 ( > 0)");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Số nhập vào không phải là số nguyên, mời nhập lại !");
            }
        } while (true);

        //Khai báo mảng có độ dài đã nhập
        String[] arr = new String[length];

        //Nhập các giá trị phần từ cho mảng
        for (int i = 0; i < length; i++) {
            System.out.printf("Mời nhập giá trị cho phần từ thứ %d của mảng : \n", i + 1);
            arr[i] = scanner.nextLine();
        }
        scanner.close();

        //tính tổng các giá trị trong mảng và hiển thị
        int sum = 0;

        for (int i = 0; i < length; i++) {
            try {
                sum += Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
                System.err.printf("Giá trị %s đã nhập không phải là số nguyên !\n",arr[i]);
            }
        }

        System.out.printf("Tổng các số nguyên trong mảng là : %d\n", sum);
    }
}

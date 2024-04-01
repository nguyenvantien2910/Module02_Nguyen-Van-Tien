package baitap;

import java.util.Scanner;

public class Bt02 {
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
        } while(true);

        //Khai báo mảng có độ dài đã nhập
        int[] intArray = new int[length];

        //Nhập các giá trị phần từ cho mảng
        for (int i = 0; i < length; i++) {
            do {
                System.out.printf("Mời nhập giá trị cho phần từ thứ %d của mảng : \n",i +1);
                try {
                    intArray[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    throw new NumberFormatException("Số nhập vào không phải là số nguyên, mời nhập lại !");
                }
            }while (true);
        }

        scanner.close();

        //Tìm giá trị lớn nhất:
        int maxNum = intArray[0];

        for (int i = 1; i < length; i++) {
            if (maxNum < intArray[i]) {
                maxNum = intArray[i];
            }
        }

        System.out.printf("Giá trị lớn nhất trong mảng số nguyên đã nhập là : %d\n", maxNum);
    }
}

package baitap;

import java.util.Scanner;

public class Bt06 {
    public static void main(String[] args) {
        // Bước 1: Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secondNum;

        do {
            System.out.println("Mời nhập số chia : ");
            try {
                firstNum = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập không hợp lệ, mời nhập lại");
            }
        }while (true);

        do {
            System.out.println("Mời nhập số chia : ");
            try {
                secondNum = Double.parseDouble(scanner.nextLine());
                if (secondNum == 0) {
                    throw new RuntimeException("Số chia phải khác 0, mời nhập lại !");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Số nhập không hợp lệ, mời nhập lại !");
            }
        }while (true);
        scanner.close();

        //Thực hiện phép chia
        double result = firstNum/secondNum;

        System.out.printf("Kết quả của phép chia %.2f cho %.2f là : %.2f\n", firstNum, secondNum,result);
    }
}

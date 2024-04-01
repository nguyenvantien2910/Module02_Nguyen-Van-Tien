package baitap;

import java.util.Scanner;

public class Bt08 {
    public static void main(String[] args) {
        //Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int checkNum;

        do {
            System.out.println("Nhập số cần kiểm tra : ");
            try {
                checkNum = Integer.parseInt(scanner.nextLine());
                if (checkNum <= 0) {
                    System.err.println("Số nhập không hợp lệ, mời nhập số nguyên lớn hơn 0");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không phải là số nguyên, mời nhập lại");
            }
        } while (true);

        scanner.close();

        boolean isPrime = true;
        if (checkNum < 2) {
            System.err.printf("Số %d không phải là số nguyên tố \n", checkNum);
        } else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.printf("Số %d là số nguyên tố \n",checkNum);
        } else {
            System.err.printf("Số %d không phải là số nguyên tố \n", checkNum);
        }
    }
}

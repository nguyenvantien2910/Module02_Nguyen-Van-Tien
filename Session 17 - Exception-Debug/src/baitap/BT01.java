package baitap;

import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        //Khai bao biến
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);

        //Nhập số thứ nhất
        do {
            System.out.println("Mời bạn nhập vào số nguyên thứ nhất : ");
            try {
                firstNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không phải số nguyên, mời nhập lại !");
            }
        } while (true);

        //Nhập số thứ 2
        do {
            System.out.println("Mời bạn nhập vào số nguyên thứ hai : ");
            try {
                secondNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không phải số nguyên, mời nhập lại !");
            }
        } while (true);

        //Tính tổng của 2 số đã nhập và in ra ngoài màn hình
        System.out.printf("Tổng 2 số nguyên đã nhập %d, %s là : %d\n", firstNumber, secondNumber, firstNumber + secondNumber);

        scanner.close();
    }
}

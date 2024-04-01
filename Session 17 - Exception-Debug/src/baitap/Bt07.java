package baitap;

import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        //Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;

        do {
            System.out.println("Mời bạn nhập vào số thứ nhất :");
            try{
                firstNum = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập số nguyên !");
            }
        } while (true);

        do {
            System.out.println("Mời bạn nhập vào số thứ hai :");
            try{
                secondNum = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập số nguyên !");
            }
        } while (true);

        scanner.close();

        //So sánh và tìm số lớn nhất
        if (firstNum == secondNum) {
            System.out.println("Hai số bằng nhau ");
        } else if (firstNum > secondNum) {
            System.out.printf("%d lớn hơn %d\n", firstNum,secondNum);
        } else {
            System.out.printf("%d lớn hơn %d\n",secondNum,firstNum);
        }
    }
}

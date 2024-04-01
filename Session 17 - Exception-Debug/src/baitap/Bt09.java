package baitap;

import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) {
        //Khai báo biến
        int fibonacciFirstNum = 0;
        int fibonachiSecondNum = 1;
        int printNum;
        int printFicbonacciNum = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập vào số thứ tự của số Fibonacci muốn in ra : ");
            try {
                printNum = Integer.parseInt(scanner.nextLine());

                if (printNum <= 0) {
                    System.err.println("Số thứ tự nhập vào phải lớn hơn 0, mời nhập lại !");
                } else {
                    // Duyệt và in ra số Fibbonacci muốn in :
                    if (printNum == 1) {
                        System.out.printf("Số Fibonacci thứ 1 là : %d\n",fibonacciFirstNum);
                    } else if (printNum == 2) {
                        System.out.printf("Số Fibonacci thứ 2 là : %d\n",fibonachiSecondNum);
                    } else {
                        System.out.printf("Số Fibonnacci thứ %d là :", printNum);

                        for (int i = 2; i < printNum; i++) {
                            printFicbonacciNum = fibonacciFirstNum + fibonachiSecondNum;
                            fibonacciFirstNum = fibonachiSecondNum;
                            fibonachiSecondNum = printFicbonacciNum;
                        }
                        System.out.printf(" %d\n",printFicbonacciNum);
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập số nguyên !");
            }
        } while (true);
    }
}

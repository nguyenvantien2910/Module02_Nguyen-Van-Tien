package baitap;

import java.util.Scanner;

public class Bt12 {
    public static void main(String[] args) {
        //Viết một chương trình Java để tìm ước chung lớn nhất của hai số nguyên.
        // Nếu hai số đều bằng 0, chương trình sẽ hiển thị thông báo lỗi.

        //Khai báo biến
        int firstNum, secondNum;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Mời bạn nhập số nguyên thứ nhất :");
            try {
                firstNum = Integer.parseInt(scanner.nextLine());
                if (firstNum == 0) {
                    System.err.println("Số nguyên nhập vào phải lớn hơn 0");
                } else break;
            } catch (NumberFormatException e) {
                System.err.println("Số nguyên nhập vào không hợp lê, mời nhập lại !");
            }
        } while (true);

        do {
            System.out.println("Mời bạn nhập số nguyên thứ hai :");
            try {
                secondNum = Integer.parseInt(scanner.nextLine());
                if (secondNum == 0) {
                    System.err.println("Số nguyên nhập vào phải lớn hơn 0");
                } else break;
            } catch (NumberFormatException e) {
                System.err.println("Số nguyên nhập vào không hợp lê, mời nhập lại !");
            }
        } while (true);

        //Tìm ước chung lớn nhất của 2 số

        System.out.printf("UCLN của %d và %d là : %d\n",firstNum,secondNum,euclidAlgorithm(firstNum,secondNum));
    }

    //Hàm tính UCLN của 2 số
    public static int euclidAlgorithm(int firstNum, int secondNum) {
        while (secondNum != 0) {
            int temp = secondNum;
            secondNum = firstNum % secondNum;
            firstNum = temp;
        }
        return firstNum;
    }
}

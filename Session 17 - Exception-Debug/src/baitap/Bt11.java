package baitap;

import java.util.Scanner;

public class Bt11 {
    public static void main(String[] args) {
        //Khai báo biến
        int day, month, year;
        Scanner scanner = new Scanner(System.in);

        //check năm
        do {
            System.out.println("Mời bạn nhập vào số năm : ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (year <= 0) {
                    System.err.println("Số năm phải lớn hơn 0, mời nhập lại !");
                } else break;
            } catch (NumberFormatException e) {
                System.err.println("Năm nhập vào không hợp lệ, mời nhập lại");
            }
        } while (true);


        //check tháng
        do {
            System.out.println("Mời bạn nhập vào số tháng : ");
            try {
                month = Integer.parseInt(scanner.nextLine());
                if (month <= 0 || month > 12) {
                    System.err.println("Số tháng phải nằm trong khoảng 1 ~ 12, mời nhập lại !");
                } else break;
            } catch (NumberFormatException e) {
                System.err.println("Tháng nhập vào không hợp lệ, mời nhập lại");
            }
        } while (true);

        //check ngày
        do {
            System.out.println("Mời bạn nhập vào ngày : ");
            try {
                day = Integer.parseInt(scanner.nextLine());
                if (day <=  0) {
                    System.err.println("Ngày phải lớn hơn 0, mời nhập lại !");
                } else {
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 :
                            if (day > 31) {
                                System.err.println("Ngày nhập vào không hợp lệ, mời nhập lại (1 ~ 31)");
                            }
                            break;
                        case 2:
                            if (day > 28) {
                                System.err.println("Ngày nhập vào không hợp lệ, mời nhập lại (1 ~ 28)");
                            }
                            break;
                        case 4, 6, 9, 11:
                            if (day > 30) {
                                System.err.println("Ngày nhập vào không hợp lệ, mời nhập lại (1 ~ 30)");
                            }
                            break;
                        default:
                            System.err.println("Tháng nhập vào không hợp lệ, mời nhập lại");
                    }
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Ngày nhập vào không hợp lệ, mời nhập lại !");
            }
        } while (true);
        System.out.println("Ngày tháng năm nhập vào hợp lệ !");
    }
}

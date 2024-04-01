package baitap.bt15;

import java.util.Scanner;

public class Bt15 {
    public static void main(String[] args) throws IllegalTriangleException {
        //Viết một ứng dụng nhập vào 3 cạnh của hình tam giác.
        // Kiểm tra nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ

        Scanner scanner = new Scanner(System.in);
        double canhA, canhB,canhC;

        do {
            System.out.println("Mời nhập nhập vào cạnh A của tam giác :");
            try {
                canhA = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập lại");
            }
        } while (true);

        do {
            System.out.println("Mời nhập nhập vào cạnh B của tam giác :");
            try {
                canhB = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập lại");
            }
        } while (true);

        do {
            System.out.println("Mời nhập nhập vào cạnh A của tam giác :");
            try {
                canhC = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Số nhập vào không hợp lệ, mời nhập lại");
            }
        } while (true);

        isTriangle(canhA,canhB,canhC);
    }

    public static boolean isTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0){
            throw new IllegalTriangleException("Độ dài cạnh phải lớn hơn 0");
        }
        if (a+b<=c || a+c<=b || b+c<=a){
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        return true;
    }
}

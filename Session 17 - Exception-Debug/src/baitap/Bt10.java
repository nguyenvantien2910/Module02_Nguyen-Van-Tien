package baitap;

import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        //Khai báo biến
        Scanner scanner = new Scanner(System.in);
        double radius;
        double area;

        do {
            System.out.println("Mời bạn nhập vào bán kính của hình tròn : ");
            try {
                radius = Double.parseDouble(scanner.nextLine());
                if (radius <= 0) {
                    System.err.println("Giá trị bán kính phải lớn hơn 0, mời nhập lại");
                } else {
                    area = Math.PI * radius *radius;

                    System.out.printf("Diện tích của hình tròn có bánh kính %.2f là : %.2f \n",radius,area);
                }

            } catch (NumberFormatException e) {
                System.err.println("Giá trị số nhập vào không hợp lệ, mời nhập lại !");
            }
        } while (true);

    }
}

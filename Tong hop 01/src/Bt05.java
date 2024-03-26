import java.util.Scanner;

public class Bt05 {
    public static void main(String[] args) {
        //Bài 5: Nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và
        //nhập giá trị các phần tử mảng 2 chiều số thực (row*col), in ra gia tri các
        //phần tử có giá trị chẵn và tính tổng các phần tử đó

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng cho mảng 2 chiều");
        int rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời bạn nhập số cột cho mảng 2 chiều");
        int cols = Integer.parseInt(scanner.nextLine());

        Integer[][] integers = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Mời bạn nhập giá trị cho hàng %d , cột %d :\n", i + 1, j + 1);
                integers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (integers[i][j] % 2 == 0) {
                    sum += integers[i][j];
                    System.out.println(integers[i][j]);
                }
            }
        }
        System.out.println("Tổng các số chẵn là : " + sum);
    }
}

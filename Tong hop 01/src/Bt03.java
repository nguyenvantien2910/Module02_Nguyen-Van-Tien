import java.util.Scanner;

public class Bt03 {
    public static void main(String[] args) {
        //Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col), khai báo và
        //nhập giá trị các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử
        //mảng theo ma trận

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng cho mảng 2 chiều");
        int rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời bạn nhập số cột cho mảng 2 chiều");
        int cols = Integer.parseInt(scanner.nextLine());

        Integer[][] integers = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Mời bạn nhập giá trị cho hàng %d , cột %d :\n", i + 1, j +1);
                integers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Các phần tử của mảng 2 chiều : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(integers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

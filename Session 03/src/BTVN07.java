import java.util.Scanner;

public class BTVN07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;

        do {
            System.out.println("Moi ban nhap so hang cho mang: ");
            rows = Integer.parseInt(scanner.nextLine());

            if (rows > 0) {
                break;
            }
        } while (true);

        do {
            System.out.println("Moi ban nhap so cot cho mang: ");
            cols = Integer.parseInt(scanner.nextLine());

            if (cols > 0) {
                break;
            }
        } while (true);

        // Khai bao mang 2 chieu
        int[][] arrays = new int[rows][cols];

        //Nhap gia tri cho mang 2 chieu
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhap gia tri cho arrays[%d][%d]: ", i, j);
                arrays[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        //Khai bao bien de tinh tong
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    sum += arrays[i][j];
                }
            }
        }

        System.out.printf("Tong cac so o duong cheo chinh la: %d", sum);
    }
}

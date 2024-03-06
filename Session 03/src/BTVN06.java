import java.util.Scanner;

public class BTVN06 {
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

        //Khai bao col muon tinh tong
        System.out.println("Moi ban muon nhap col muon tinh tong: ");
        int colCaculate = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j == colCaculate) {
                        sum += arrays[i][j];
                        break;
                    }
                }
            }

        System.out.printf("Tong cac so o cot %d la : %d", colCaculate, sum);
        }
    }

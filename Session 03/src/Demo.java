import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //==Khai báo mảng arr[r][c]
        //========== MENU===========
        //==> Nhập giá trị cho tất cả phần tử mảng
        //==> In các phần tử của mảng dưới dạng ma trận
        //==> Tính tổng tất cả phần tử mảng
        //==> In ra đường chéo chính
        //==> In ra đường chéo phụ (phải là ma trận vuông)
        //==> In ra đường viền

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

        //Hien thi menu

        int choise;
        int sum = 0;
        do {
            System.out.println("===========MENU==========");
            System.out.println("1.Nhập giá trị cho tất cả phần tử mảng ");
            System.out.println("2.In các phần tử của mảng dưới dạng ma trận ");
            System.out.println("3.Tính tổng tất cả phần tử mảng  ");
            System.out.println("4.In ra đường chéo chính ");
            System.out.println("5.In ra đường chéo phụ (phải là ma trận vuông) ");
            System.out.println("6.In ra đường viền ");
            System.out.println("7.Thoát ");

            choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.printf("Nhap gia tri cho arrays[%d][%d]: ", i, j);
                            arrays[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;

                case 2:
                    System.out.println("IN ARRAY DUOI DANG TRAN");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.printf("%-3d", arrays[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            sum += arrays[i][j];
                        }
                    }
                    System.out.printf("Tong cac phan tu trong mang la : %d\n", sum);
                    break;

                case 4:
                    System.out.println("IN DUONG CHEO CHINH");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (i == j) {
                                System.out.printf("%-3d", arrays[i][j]);
                            } else {
                                System.out.printf("%-3s", "");
                            }
                        }
                    }
                    break;

                case 5:
                    if (rows == cols) {
                        System.out.println("IN DUONG CHEO PHU");
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                if (i + j == arrays.length - 1) {
                                    System.out.printf("%-3d", arrays[i][j]);
                                } else {
                                    System.out.printf("%-3s", "");
                                }
                            }
                        }
                    } else {
                        System.out.println("Duong cheo phu chi danh cho ma tran vuong");
                    }
                    break;

                case 6:
                    System.out.println("IN DUONG BIEN");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (i == 0 || j == 0 || j == cols - 1 || i == rows - 1) {
                                System.out.printf("%-3d", arrays[i][j]);
                            } else {
                                System.out.printf("%-3s", "");
                            }
                        }
                    }
                    break;
            }
        } while (true);
    }
}

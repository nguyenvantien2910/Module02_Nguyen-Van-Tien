import java.util.Scanner;

public class BTVN07 {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("===========MENU===========");
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình tròn");
            System.out.println("4.Thoat");

            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    double chieuDai, chieuRong, chuVi, dienTich;

                    while (true) {
                        System.out.println("Moi ban nhap chieu dai");
                        chieuDai = Integer.parseInt(scanner.nextLine());

                        if (chieuDai > 0) {
                            break;
                        }
                    }

                    while (true) {
                        System.out.println("Moi ban nhap chieu dai");
                        chieuRong = Integer.parseInt(scanner.nextLine());

                        if (chieuRong > 0) {
                            break;
                        }
                    }

                    chuVi = 2 * chieuRong * chieuDai;
                    dienTich = chieuRong * chieuDai;

                    System.out.printf("Chu vi cua hinh vuong la : %.2f\n", chuVi);
                    System.out.printf("Dien tich cua hinh vuong la : %.2f\n", dienTich);

                    break;

                case 2:
                    int canhA, canhB, canhC;
                    while (true) {
                        System.out.println("Moi ban nhap canh A: ");
                        canhA = Integer.parseInt(scanner.nextLine());

                        if (canhA > 0) {
                            break;
                        }
                    }

                    while (true) {
                        System.out.println("Moi ban nhap canh B: ");
                        canhB = Integer.parseInt(scanner.nextLine());

                        if (canhB > 0) {
                            break;
                        }
                    }

                    while (true) {
                        System.out.println("Moi ban nhap canh C: ");
                        canhC = Integer.parseInt(scanner.nextLine());

                        if (canhC > 0) {
                            break;
                        }
                    }

                    chuVi = canhA + canhB + canhC;
                    double nuaChuVi = chuVi / 2;
                    dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - canhA) * (nuaChuVi - canhB) * (nuaChuVi - canhC));

                    System.out.printf("Chu vi cua hinh tam giac la : %.2f\n", chuVi);
                    System.out.printf("Dien tich cua hinh tam giac la : %.2f\n", dienTich);

                    break;

                case 3:
                    double R;
                    final double Pi = 3.14;
                    while (true) {
                        System.out.println("Moi ban nhap ban kinh cua hinh tron");
                        R = Integer.parseInt(scanner.nextLine());

                        if (R > 0) {
                            break;
                        }
                    }

                    dienTich = Pi * R * R;
                    chuVi = 2 * Pi * R;

                    System.out.printf("Chu vi cua hinh tron la : %.2f\n", chuVi);
                    System.out.printf("Dien tich cua hinh tron la : %.2f\n", dienTich);

                    break;

                case 4:
                    break;

                default:
                    System.out.println("Moi ban nhap so hop le");
            }
            ;
        } while (true);
    }
}

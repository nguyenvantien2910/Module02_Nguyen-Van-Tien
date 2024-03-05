import java.util.Scanner;

public class BTVN08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canhA, canhB, canhC, chuVi;
        double dienTich;
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

        if (canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA || canhB + canhA > canhC || canhC + canhB > canhA || canhC + canhA > canhB) {
            chuVi = canhA + canhB + canhC;
            double nuaChuVi = chuVi / 2;
            dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - canhA) * (nuaChuVi - canhB) * (nuaChuVi - canhC));

            System.out.printf("Chu vi cua hinh tam giac la : %.2f\n", chuVi);
            System.out.printf("Dien tich cua hinh tam giac la : %.2f\n", dienTich);
        } else {
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
        }


    }
}

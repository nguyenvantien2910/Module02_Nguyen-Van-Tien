import java.util.Scanner;

public class BTVN_04 {
    public static void main(String[] args) {
        int chieuDai;
        int chieuRong;
        int chuVi;
        int dienTich;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap chieu dai: ");

            chieuDai = Integer.parseInt(scanner.nextLine());

            if (chieuDai > 0) {
                break;
            }
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap chieu rong: ");

            chieuRong = Integer.parseInt(scanner.nextLine());

            if (chieuRong > 0) {
                break;
            }
        }

        chuVi = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi cua hinh vuong co chieu dai %d va chieu rong %d la : %d\n", chieuDai, chieuRong, chuVi);
        dienTich = chieuDai * chieuRong;
        System.out.printf("Dien tich cua hinh vuong co chieu dai %d va chieu rong %d la : %d", chieuDai, chieuRong, dienTich);
    }
}

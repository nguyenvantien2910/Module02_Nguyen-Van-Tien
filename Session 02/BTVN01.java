import java.util.Scanner;

public class BTVN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex;
        int endIndex;
        int sum = 0;

        while (true) {
            System.out.println("Moi ban nhap vao so bat dau: ");
            startIndex = Integer.parseInt(scanner.nextLine());

            if (startIndex > 0) {
                break;
            }
        }

        while (true) {
            System.out.println("Moi ban nhap so ket thuc: ");
            endIndex = Integer.parseInt(scanner.nextLine());

            if (endIndex > 0) {
                break;
            }
        }

        for (int i = startIndex; i <= endIndex ; i++) {
            sum += i;
        }

        System.out.printf("Tong cac so tu %d den %d la: %d", startIndex, endIndex, sum);
    }
}

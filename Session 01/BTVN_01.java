import java.util.Scanner;

public class BTVN_01 {
    public static void main(String[] args) {
        System.out.println("Moi ban nhap ten: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Ten cua ban la: %s", name);
    }
}

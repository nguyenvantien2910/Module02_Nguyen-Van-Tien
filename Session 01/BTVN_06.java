import java.util.Scanner;

public class BTVN_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Moi ban nhap vao so kiem tra: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 0) {
                break;
            }
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("So %d chia het cho ca 3 va 5\n", number);
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.printf("So %d chi chia het cho 5\n", number);
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.printf("So %d chi chia het cho 3\n", number);
        } else {
            System.out.printf("So %d khong chia het cho 3 va 5\n", number);
        }
    }
}

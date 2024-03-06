import java.util.Arrays;
import java.util.Scanner;

public class BTVN01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Moi ban nhap so muon xoa trong mang (1 ~ 9): ");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0 && number < 10) {
                break;
            }
        } while (true);

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[array.length - 1] = 0;
                break;
            }
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println("Mang moi: ");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}

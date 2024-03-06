import java.util.Arrays;
import java.util.Scanner;

public class BTVN03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length1, length2;

        System.out.println("Mơi nhap do dai của mang 1: ");
        length1 = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            System.out.printf("Moi ban nhap gia tri tai index %d trong mang 1: ", i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mơi nhap do dai của mang 2: ");
        length2 = Integer.parseInt(scanner.nextLine());

        int[] array2 = new int[length2];
        for (int j = 0; j < length2; j++) {
            System.out.printf("Moi ban nhap gia tri tai index %d trong mang 2: ", j);
            array2[j] = Integer.parseInt(scanner.nextLine());
        }

        int[] array3 = new int[length1 + length2];

        for (int k = 0; k < (length1 + length2); k++) {
            if (k < length1) {
                array3[k] = array1[k];
            } else {
                array3[k] = array2[k - length1];
            }
        }
        
        System.out.println(Arrays.toString(array3));
    }
}

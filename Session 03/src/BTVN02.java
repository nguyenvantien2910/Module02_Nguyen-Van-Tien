import java.util.Scanner;

public class BTVN02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, index, length;
        System.out.println("Moi nhap do dai của mang");
        length = Integer.parseInt(scanner.nextLine());

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Moi ban nhap gia tri tai index %d trong mang: ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Moi ban nhap so muon them: ");
        number = Integer.parseInt(scanner.nextLine());

        do {
            System.out.println("Moi ban nhap vi tri can chen");
            index = Integer.parseInt(scanner.nextLine());
        } while (index <= -1 || index >= length);

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}

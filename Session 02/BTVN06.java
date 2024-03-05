import java.io.PrintStream;
import java.util.Scanner;

public class BTVN06 {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("===========MENU===========");
            System.out.println("1.Kiem tra tinh chan le cua 1 so");
            System.out.println("2.Kiem tra so nguyen to");
            System.out.println("3.Kiem tra 1 so co chia het cho 3 hay khong");
            System.out.println("4.Thoat");

            int choise = Integer.parseInt(scanner.nextLine());
            int number;

            switch (choise) {
                case 1:
                    while (true) {
                        System.out.println("Moi ban nhap 1 so nguyen duong bat ki");
                        number = Integer.parseInt(scanner.nextLine());

                        if (number > 0) {
                            break;
                        }
                    }

                    if (number % 2 == 0) {
                        System.out.printf("%d la so chan\n", number);
                    } else {
                        System.out.printf("%d la so le\n", number);
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("Moi ban nhap 1 so nguyen duong bat ki");
                        number = Integer.parseInt(scanner.nextLine());

                        if (number > 0) {
                            break;
                        }
                    }

                    Boolean flag = true;
                    for (int i = 2; i < number / 2; i++) {
                        if (number % i == 0) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.printf("%d la so nguyen to\n", number);
                    } else {
                        System.out.printf("%d khong phai la so nguyen to\n", number);
                    }

                    break;

                case 3:
                    while (true) {
                        System.out.println("Moi ban nhap 1 so nguyen duong bat ki");
                        number = Integer.parseInt(scanner.nextLine());

                        if (number > 0) {
                            break;
                        }
                    }

                    if (number % 3 == 0) {
                        System.out.printf("So %d co chia het cho 3\n", number);
                    } else {
                        System.out.printf("So %d khong chia het cho 3\n", number);
                    }
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


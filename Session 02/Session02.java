import java.util.Scanner;

public class Session02 {
    public static void main(String[] args) {
        //int sum = 0;
        //for (int i = 1; i <= 10; i++) {
        //    if (i % 2 == 0) {
        //        sum += i;
        //        System.out.printf("So %d la so chan\n", i);
        //    }
        //}
        //System.out.printf("Tong cac so chan la %d\n", sum);


        //for (int i = 0; i <= 10; i++) {
        //    for (int j = 0; j <= 10; j++) {
        //        int sum = i * j;
        //        System.out.printf("%d * %d = %d\n", i, j, sum );
        //    }
        //    System.out.printf("-----------------------\n" );
        //}


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap 1 so nguyen bat ki :");
            int number = Integer.parseInt(scanner.next());

            System.out.println("=================MENU==============");
            System.out.println("1.Tim so uoc cua so vua nhap");
            System.out.println("2.Tinh tong cac uoc do");
            System.out.println("3.Tim cac so chia het cho 3 va 5 trong khoang 1 - n(n la so vua nhap)");
            System.out.println("4.Thoat");

            int choise = Integer.parseInt(scanner.next());

            switch (choise) {
                case 1:
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            System.out.printf("%d la uoc cua %d\n", i, number);
                        }
                    }
                    ;
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    ;
                    System.out.printf("Tong cac uoc so cua %d la: %d\n", number, sum);
                    break;

                case 3:
                    Boolean flag = false;
                    for (int i = 1; i <= number; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.printf("So %d chia het cho 3 va 5\n", i);
                            flag = true;
                        }
                    }
                    ;

                    if (flag == false) {
                        System.out.printf("Trong khoang 1 den %d khong co so nao chia het cho 3 va 5", number);
                    }
                    break;

                default:
                    System.out.println("Xin moi nhap so hop le\n");
                    break;
            }
        }
        while (true);
    }
}

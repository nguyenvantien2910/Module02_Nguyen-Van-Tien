import java.util.Scanner;

public class BTVN04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Moi ban nhap so luong so nguyen to muon in ra: ");
        number = Integer.parseInt(scanner.nextLine());

        int i = 0;
        int check;
        while (i < number) {

            check = isprime(i);

            if (check == 1) System.out.print(i + " \n");

            ++i;
        }
    }

    private static int isprime(int n) {
        int flag = 1;
        int i = 2;

        if (n < 2) return flag = 0;
        while (i < n) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
            i++;
        }

        return flag;
    }
}

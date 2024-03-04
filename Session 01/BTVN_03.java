import java.util.Scanner;

public class BTVN_03 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Moi ban nhap vao so bat ki(0 ~ 999):");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0 && number <= 999) {
                break;
            }
        }

        int hangTram = number / 100;
        int hangChuc = (number % 100) / 10;
        int hangDV = number % 10;
        String chuoi = "";

        if (hangTram != 0) {
            switch (hangTram) {
                case 1:
                    chuoi += " One Hundred";
                    break;

                case 2:
                    chuoi += " Two Hundred";
                    break;

                case 3:
                    chuoi += " Three Hundred";
                    break;

                case 4:
                    chuoi += " Four Hundred";
                    break;

                case 5:
                    chuoi += " Five Hundred";
                    break;

                case 6:
                    chuoi += " Six Hundred";
                    break;

                case 7:
                    chuoi += " Seven Hundred";
                    break;

                case 8:
                    chuoi += " Eight Hundred";
                    break;

                case 9:
                    chuoi += " Nine Hundred";
                    break;
            }
        }

        if (hangChuc >= 2) {
            switch (hangChuc) {
                case 2:
                    chuoi += " Twenty";
                    break;

                case 3:
                    chuoi += " Thrity";
                    break;

                case 4:
                    chuoi += " Fourty";
                    break;

                case 5:
                    chuoi += " Fifty";
                    break;

                case 6:
                    chuoi += " Sixty";
                    break;

                case 7:
                    chuoi += " Seventy";
                    break;

                case 8:
                    chuoi += " Eighty";
                    break;

                case 9:
                    chuoi += " Ninety";
                    break;
            }
        }

        if (hangDV != 0) {
            switch (hangDV) {
                case 1:
                    chuoi += " One";
                    break;

                case 2:
                    chuoi += " Two";
                    break;

                case 3:
                    chuoi += " Three";
                    break;

                case 4:
                    chuoi += " Four";
                    break;

                case 5:
                    chuoi += " Five";
                    break;

                case 6:
                    chuoi += " Six";
                    break;

                case 7:
                    chuoi += " Six";
                    break;

                case 8:
                    chuoi += " Eight";
                    break;

                case 9:
                    chuoi += " Nine";
                    break;
            }
        }

        System.out.printf("Cach doc cua so %d la: %s", number, chuoi);
    }
}

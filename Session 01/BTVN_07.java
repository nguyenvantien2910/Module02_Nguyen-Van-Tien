import java.util.Scanner;

public class BTVN_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Moi ban nhap vao 1 so bat ki(0 ~ 9): ");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0 && number <= 9) {
                break;
            }
        }

        switch (number) {
            case 1:
                System.out.printf("So ban nhap vao la: so mot\n");
                break;

            case 2:
                System.out.printf("So ban nhap vao la: so hai\n");
                break;

            case 3:
                System.out.printf("So ban nhap vao la: so ba\n");
                break;

            case 4:
                System.out.printf("So ban nhap vao la: so bon\n");
                break;

            case 5:
                System.out.printf("So ban nhap vao la: so nam\n");
                break;

            case 6:
                System.out.printf("So ban nhap vao la: so sau\n");
                break;

            case 7:
                System.out.printf("So ban nhap vao la: so bay\n");
                break;

            case 8:
                System.out.printf("So ban nhap vao la: so tam\n");
                break;

            case 9:
                System.out.printf("So ban nhap vao la: so chin\n");
                break;

            default:
                break;
        }
    }
}

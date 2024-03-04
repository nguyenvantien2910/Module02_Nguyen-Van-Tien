import java.util.Scanner;

public class BTVN_02 {
    public static void main(String[] args) {
        final double rate = 23000;
        double USD;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap so tien USD muon chuyen doi: ");
            USD = Double.parseDouble(scanner.nextLine());

            if (USD > 0) {
                break;
            }
        }

        double VND = USD * rate;

        System.out.printf("So tien chuyen doi duoc tu %.2f USD la: %.2f VND", USD, VND);
    }
}

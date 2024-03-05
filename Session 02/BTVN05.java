public class BTVN05 {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            if (number % 5 == 0 && number % 11 == 0 && number % 11 == 0) {
                System.out.printf("%d la so nguyen duong nho nhat chia het cho 5, 7, 11", number);
                break;
            } else {
                number += 1;
            }
        }
    }
}

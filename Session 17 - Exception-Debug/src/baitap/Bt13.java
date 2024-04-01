package baitap;

import java.util.Scanner;

public class Bt13 {
    public static void main(String[] args) {
        //Viết một chương trình Java để đảo ngược một chuỗi.
        // Nếu chuỗi không hợp lệ (ví dụ như null hoặc rỗng), chương trình sẽ hiển thị thông báo lỗi.

        String inputString;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Mời bạn nhập vào chuỗi bất kì :");
            try {
                inputString = scanner.nextLine();
                if (inputString == null || inputString.trim().isEmpty()) {
                    System.err.println("Chuỗi rỗng hoặc null, mời nhập lại !");
                } else {
                    break;
                }
            } catch (Exception exception) {
                System.err.println("Chuỗi nhập vào không hợp lệ, mời nhập lại !");
            }
        } while (true);

        //Đảo ngược chuỗi
        System.out.printf("Chuỗi trước khi đảo ngược %s", inputString);

        StringBuilder reverseString = new StringBuilder(inputString).reverse();

        System.out.printf("Chuỗi sau khi được đảo ngược là : %s",reverseString);
    }
}

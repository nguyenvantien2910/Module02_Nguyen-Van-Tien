package ra;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Moi nhap email: ");
            String inputEmail = scanner.nextLine();

            String regexEmail = "^(.+)@(.+)$";

            if (inputEmail.matches(regexEmail)) {
                System.out.println(inputEmail);
                break;
            } else {
                System.out.println("Mời bạn nhập lại email đúng định dạng!");
            }
        }
    }
}

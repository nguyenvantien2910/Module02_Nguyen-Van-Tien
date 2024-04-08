package Exam_Advance_3;

import Exam_Advance_1.ra.config.InputMethod;
import Exam_Advance_1.ra.config.ShopMessage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    public static Queue<String> customerName = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte choice;
        boolean isExit = false;

        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
            System.out.println("2. Khách tiếp theo");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn của bạn : ");

            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    inputCustomerName();
                    break;
                case 2:
                    printNextCustomer();
                    break;
                case 3:
                    isExit = true;
                    scanner.close();
                    System.out.println("Đã thoát khỏi chương trinh!");
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }

        } while (!isExit);
    }

    private static void printNextCustomer() {
        if (customerName.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            String firstCutomer = customerName.poll();
            if (firstCutomer != null) {
                System.out.printf("Khách hàng đầu tiên trong danh sách là : %s\n",firstCutomer);
            } else {
                System.err.println(ShopMessage.EMTY_LIST);
            }
        }
    }

    private static void inputCustomerName() {
        System.out.println("Nhập tên khách hàng : ");
        String inputName = InputMethod.getString();
        if (customerName.offer(inputName)) {
            System.out.println(ShopMessage.ADD_NEW_SUCESS);
        } else {
            System.err.println(ShopMessage.FULL_LIST);
        }
    }
}

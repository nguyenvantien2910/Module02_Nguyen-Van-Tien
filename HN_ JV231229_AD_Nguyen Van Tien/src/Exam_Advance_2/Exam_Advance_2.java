package Exam_Advance_2;

import Exam_Advance_1.ra.config.InputMethod;
import Exam_Advance_1.ra.config.ShopMessage;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static Stack<String> stackURL = new Stack<>();

    public static void main(String[] args) {
        byte choice;
        boolean isExit = false;


        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn của bạn : ");

            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    inputURL();
                    break;
                case 2:
                    deleteUrl();
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

    private static void deleteUrl() {
        if (!stackURL.isEmpty()) {
            stackURL.pop();
            if (!stackURL.isEmpty()) {
                String nextUrl = stackURL.peek();
                System.out.printf("URL tiếp theo trong stack là : %s\n",nextUrl);
            } else {
                System.err.println(ShopMessage.EMTY_LIST);
            }
        } else {
            System.err.println(ShopMessage.EMTY_LIST);
        }
    }


    private static void inputURL() {
        System.out.println("Mời nhập URL : ");
        String inputUrl = InputMethod.getString();

        stackURL.push(inputUrl);
        System.out.println(ShopMessage.ADD_NEW_SUCESS);
    }
}

package presentation;

import bussiness.config.InputMethod;
import bussiness.config.ShopMessage;

public class ShopManagement {
    public static void main(String[] args) {
        byte choice;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("===========SHOP MANAGEMENT===========");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sách");
            System.out.println("3. Thoát");

            System.out.print("Lựa chọn của bạn là : ");

            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    CategoryManagement.displayMenu();
                    break;
                case 2:
                    BookManagement.displayMenu();
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }
        }
    }
}

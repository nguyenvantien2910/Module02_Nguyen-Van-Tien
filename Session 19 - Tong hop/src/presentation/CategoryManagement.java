package presentation;

import bussiness.config.InputMethod;
import bussiness.config.ShopMessage;
import bussiness.impliment.CategoryIplm;

public class CategoryManagement {
    public static void displayMenu() {
        CategoryIplm categoryIplm = new CategoryIplm();
        byte choice;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("===========CATEGORY MANAGEMENT===========");
            System.out.println("1. Hiển thị tất cả các danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Sửa thông tin danh mục");
            System.out.println("4. Thay đổi trạng thái danh mục");
            System.out.println("5. Thoát");

            System.out.print("Lựa chọn của bạn là : \n");

            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    categoryIplm.displayAll();
                    break;
                case 2:
                    categoryIplm.addNewElement();
                    break;
                case 3:
                    categoryIplm.editElement();
                    break;
                case 4:
                    categoryIplm.updateStatus();
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }
        }
    }
}

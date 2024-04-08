package presentation;

import bussiness.config.InputMethod;
import bussiness.config.ShopMessage;
import bussiness.impliment.BookIplm;

public class BookManagement {
    public static void displayMenu() {
        BookIplm bookIplm = new BookIplm();
        byte choice;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("===========BOOK MANAGEMENT===========");
            System.out.println("1. Hiển thị tất cả sách");
            System.out.println("2. Thêm mới sách");
            System.out.println("3. Sửa thông tin sách");
            System.out.println("4. Thay đổi trạng thái sách");
            System.out.println("5. Tìm kiếm sách theo thể loại (danh mục)");
            System.out.println("6. Sắp xếp sách theo giá giảm dần");
            System.out.println("7. Thoát");

            System.out.print("Lựa chọn của bạn là : ");

            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    bookIplm.displayAll();
                    break;
                case 2:
                    bookIplm.addNewElement();
                    break;
                case 3:
                    bookIplm.editElement();
                    break;
                case 4:
                    bookIplm.updateStatus();
                    break;
                case 5:
                    bookIplm.findBookByCategoryName();
                    break;
                case 6:
                    bookIplm.sortBookByPrice();
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }
        }
    }
}

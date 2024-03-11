package Book;

import ra.model.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("➢ ===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println(" 1. Quản lý Thể loại");
            System.out.println(" 2. Quản lý Sách");
            System.out.println(" 0. Thoát");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện: ");
            Integer choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 0 :
                    System.exit(0);
                    break;
                case 1:
                    menuCategory(scanner);
                    break;

                case 2:
                    menuBook(scanner);
                    break;

                default:
                    System.out.println("Nhập số không hợp lệ \n");
                    break;
            }
        }
    }

    public static void menuCategory(Scanner scanner) {
        Category[] categories = new Category[100];
        int categoryCount = 0;

        while (true) {
            System.out.println("➢ ===== QUẢN LÝ THỂ LOẠI =====");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên thể loại A – Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xóa thể loại (kiểm tra tồn tai sách trước khi xóa) ");
            System.out.println("0. Quay lại");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện: ");
            Integer choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 0:
                    return;
                case 1:
                    System.out.println("Nhập số lượng thể loại muốn thêm");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++)
                    {
                        System.out.println("Mời nhập thông tin của thể loại: " + (i +1));
                        Category newCategory = new Category();
                        newCategory.inputData(scanner, categories);
                        categories[categoryCount] = newCategory;
                        categoryCount++;
                    }
                    break;

                case 2:
                    if (categoryCount <= 0)
                    {
                        System.out.println("Hiện không có thể loại nào để hiển thị");
                        break;
                    } else {
                        Arrays.sort(categories);
                        for (int i = 0; i < categoryCount; i++) {
                            categories[i].displayData();
                        }
                    }
                    break;
            }
        }
    }

    public static void menuBook(Scanner scanner) {
        while (true) {
            System.out.println("➢ ===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("0. Quay lại");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện: ");
            Integer choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 0:
                    return;
                case 1:
                    break;

            }
        }
    }
}

package ra.run;

import ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = new Book[100];
    static int bookCount = 0;
    static int choise;

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVAVAVA-HACKATATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");

            System.out.println("Mời bạn nhập lựa chọn muốn thực hiện ( 1~7):");

            choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1 :
                    System.out.println("Mời bạn nhập số lượng sách muốn thêm :");
                    int addNum = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < addNum; i++)
                    {
                        System.out.println("Mời nhập thông tin của sản sách thứ " + (i + 1));
                        Book newBook = new Book();
                        newBook.inputData(scanner, books);
                        books[bookCount] = newBook;
                        bookCount++;
                    }
                    break;

                case 7:
                    System.exit(0);
                    break;

            }
        }
    }
}

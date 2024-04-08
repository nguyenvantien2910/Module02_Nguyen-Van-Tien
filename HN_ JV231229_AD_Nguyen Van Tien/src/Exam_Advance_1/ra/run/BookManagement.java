package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Author;
import Exam_Advance_1.ra.bussinessImp.Book;
import Exam_Advance_1.ra.config.InputMethod;
import Exam_Advance_1.ra.config.ShopMessage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManagement {
    public static final List<Author> authorList = new ArrayList<>();
    public static final List<Book> bookList = new ArrayList<>();

    static {
        authorList.add(new Author(10,"Nguyen Van Tien",true,1999));
        authorList.add(new Author(4,"Le Quang Dao",false,2000));
        authorList.add(new Author(2,"Truong Quang Thang",true,1996));
        authorList.add(new Author(1,"Nguyen Trung Hieu",true,1993));
    }

    public static void main(String[] args) {
        byte choice;
        boolean isExit = false;

        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập số tác giả và nhập thông tin các tác giả");
            System.out.println("2. Nhập số sách và nhập thông tin các sách");
            System.out.println("3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sách theo tên tác giả sách");
            System.out.println("5. Thoát");

            System.out.println("Lựa chọn của bạn là : ");
            choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    addNewAuthor();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    sortBookByExportPrice();
                    break;
                case 4:
                    findBookByAuthorName();
                    break;
                case 5:
                    isExit = true;
                    System.out.println("Đã thoát chương trình");
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }
        } while (!isExit);
    }

    private static void findBookByAuthorName() {
        do {
            System.out.println("Nhập vào tên tác giả muốn tìm kiếm sách :");
            String searchAuthorName = InputMethod.getString().toLowerCase();

            List<Book> filterListBookByAuthorName = bookList.stream().filter(book -> book.getAuthor().getAuthorName().toLowerCase().contains(searchAuthorName)).toList();
            if (filterListBookByAuthorName.isEmpty()) {
                System.err.println(ShopMessage.NAME_NOT_FOUND);
            } else {
                filterListBookByAuthorName.forEach(Book::displayData);
                break;
            }
        } while (true);
    }

    private static void sortBookByExportPrice() {
       if (bookList.isEmpty()) {
           System.err.println(ShopMessage.EMTY_LIST);
       } else {
           System.out.println("Danh sách sau khi đã sắp xếp theo giá bán tăng dần :");
           List<Book> sortedList = bookList.stream()
                   .sorted(Comparator.comparing(Book::getExportPrice))
                   .toList();
           sortedList.forEach(Book::displayData);
       }
    }

    private static void addNewBook() {
        System.out.println("Nhập số lượng sách muốn thêm mới :");
        byte addNum = InputMethod.getByte();
        for (int i = 0; i < addNum; i++) {
            Book book =new Book();
            System.out.printf("Nhập thông tin cho sách thứ %d\n", i + 1);
            book.inputData();
            bookList.add(book);
            System.out.println(ShopMessage.ADD_NEW_SUCESS);
        }
    }

    private static void addNewAuthor() {
        System.out.println("Nhập số lượng tác giả muốn thêm mới :");
        byte addNum = InputMethod.getByte();
        for (int i = 0; i < addNum; i++) {
            Author author = new Author();
            System.out.printf("Nhập thông tin cho tác giả thứ %d\n", i + 1);
            author.inputData();
            authorList.add(author);
            System.out.println(ShopMessage.ADD_NEW_SUCESS);
        }
    }
}

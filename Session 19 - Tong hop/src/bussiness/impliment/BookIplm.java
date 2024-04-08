package bussiness.impliment;

import bussiness.config.InputMethod;
import bussiness.config.ShopMessage;
import bussiness.design.BookDesign;
import bussiness.entity.Book;
import bussiness.entity.Category;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static bussiness.impliment.CategoryIplm.categoryList;

public class BookIplm implements BookDesign {
    List<Book> bookList = new ArrayList<>();

    @Override
    public void displayUpdateInfo(Book book) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("======UPDATE BOOK======");
            System.out.println("1. Cập nhật tên");
            System.out.println("2. Cập giá");
            System.out.println("3. Cập tác giả");
            System.out.println("4. Cập nhật mã danh mục");
            System.out.println("5. Cập nhật trạng thái");
            System.out.println("6. Thoát");

            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    book.setName(inputName());
                    System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
                    break;
                case 2:
                    book.setPrice(inputPrice());
                    System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
                    break;
                case 3:
                    book.setAuthor(inputAuthor());
                    System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
                    break;
                case 4:
                    book.setCategoryId(inputCategory(categoryList));
                    System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
                    break;
                case 5:
                    book.setStatus(!book.isStatus());
                    System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }
        }
    }

    @Override
    public void findBookByCategoryName() {
        if (categoryList.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            int searchCategoryIds = inputCategory(categoryList);
            if (!isEmtyList()) {
                Objects.requireNonNull(bookList.stream()
                        .filter(book -> book.getCategoryId() == searchCategoryIds)
                        .findFirst()
                        .orElse(null)).displayData();
            }
        }
    }

    @Override
    public void sortBookByPrice() {
        if (isEmtyList()) {
            System.err.println(ShopMessage.EMTY_LIST);
        } else {
            System.out.println("Danh sách được sắp xếp theo giá giảm dần:");
            List<Book> sortedList = bookList.stream()
                    .sorted(Comparator.comparing(Book::getPrice).reversed())
                    .collect(Collectors.toList());
            sortedList.forEach(System.out::println);
        }
    }


    @Override
    public void addNewElement() {
        System.out.println("Nhập số lượng sách muốn thêm mới : ");
        byte addNum = InputMethod.getByte();
        for (int i = 0; i < addNum; i++) {
            System.out.printf("Nhập thông tin cho sách thứ %d: \n", i + 1);
            bookList.add(inputData(true, categoryList));
            System.out.println(ShopMessage.ADD_NEW_SUCESS);
        }
    }

    @Override
    public void editElement() {
        if (!isEmtyList()) {
            System.out.println("Mời nhập mã sách muốn chỉnh sửa : ");
            int updateID = InputMethod.getByte();
            Book updateBook = findById(updateID);

            if (updateBook == null) {
                System.err.println(ShopMessage.ID_NOT_FOUND);
            } else {
                displayUpdateInfo(updateBook);
                System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
            }
        }
    }

    @Override
    public void deleteElement() {
        System.out.println("Nhập mã sách muốn xóa : ");
        int deleteID = InputMethod.getInteger();
        Book deleteBook = findById(deleteID);

        if (deleteBook == null) {
            System.err.println(ShopMessage.ID_NOT_FOUND);
        } else {
            bookList.remove(deleteBook);
            System.out.println(ShopMessage.DELETE_SUCESS);
        }
    }

    @Override
    public void displayAll() {
        if (!isEmtyList()) {
            System.out.println("Danh sách các danh mục");
            bookList.forEach(book -> book.displayData());
        }
    }

    @Override
    public Book findById(Integer id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book inputData(boolean isAdd, List<Category> categoryList) {
        Book book = new Book();
        if (isAdd) {
            book.setId(getNewID());
        }
        book.setName(inputName());
        book.setPrice(inputPrice());
        book.setAuthor(inputAuthor());
        book.setCategoryId(inputCategory(categoryList));
        book.setStatus(inputStatus());

        return book;
    }

    private boolean inputStatus() {
        System.out.println("Mời bạn nhập trạng thái cho sách :");
        return InputMethod.getBoolean();
    }

    private int inputCategory(List<Category> categoryList) {
        if (!categoryList.isEmpty()) {
            System.out.println("Chọn danh mục của sản phẩm:");
            for (int i = 0; i < categoryList.size(); i++) {
                if (categoryList.get(i).isStatus()) {
                    System.out.printf("%d.%s\n", i + 1, categoryList.get(i).getName());
                }
            }
            System.out.print("Lựa chọn của bạn: ");
            byte choice = InputMethod.getByte();
            return categoryList.get(choice - 1).getId();
        }
        return -1;
    }


    private String inputAuthor() {
        System.out.println("Mời bạn nhập tên cho tác giá : ");
        return InputMethod.getString();
    }

    private double inputPrice() {
        System.out.println("Mời bạn nhập giá cho sách : ");
        return InputMethod.getDouble();
    }

    private String inputName() {
        System.out.println("Mời bạn nhập tên cho sách : ");
        return InputMethod.getString();
    }

    @Override
    public int getNewID() {
        int idMax = 0;
        for (Book book : bookList) {
            if (book.getId() > idMax) {
                idMax = book.getId();
            }
        }
        return idMax + 1;
    }

    @Override
    public boolean isEmtyList() {
        if (bookList.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void updateStatus() {
        if (!isEmtyList()) {
            System.out.println("Nhập mã sách muốn thay đổi trạng thái: ");
            int updateStatusId = InputMethod.getInteger();
            Book book = findById(updateStatusId);
            if (book == null) {
                System.err.println(ShopMessage.ID_NOT_FOUND);
            } else {
                book.setStatus(!book.isStatus());
                System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
            }
        }
    }
}

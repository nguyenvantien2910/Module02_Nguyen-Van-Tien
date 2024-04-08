package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;
import Exam_Advance_1.ra.config.InputMethod;
import Exam_Advance_1.ra.config.ShopMessage;

import static Exam_Advance_1.ra.run.BookManagement.authorList;

public class Book implements IShop {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private Author author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, float exportPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        this.bookId = inputBookId();
        this.bookName = inputBookName();
        this.title = inputBookTitle();
        this.numberOfPages = inputNumberOfPage();
        this.author = selectAuthor();
        this.importPrice = inputImportPrice();
        this.exportPrice = this.importPrice * RATE;
        this.quantity = inputQuantity();
        this.bookStatus = inputBookStatus();
    }

    private boolean inputBookStatus() {
        System.out.println("Nhập trạng thái cho sách :");
        return InputMethod.getBoolean();
    }

    private int inputQuantity() {
        System.out.println("Nhập số lượng sách : ");
        return InputMethod.getInteger();
    }

    private float inputImportPrice() {
        System.out.println("Nhập giá sách :");
        return InputMethod.getFloat();
    }

    private Author selectAuthor() {
        if (authorList.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
            return null;
        } else {
            System.out.println("======DANH SÁCH TÁC GIẢ======");
            for (int i = 0; i < authorList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, authorList.get(i).getAuthorName());
            }
            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = InputMethod.getByte();
            return authorList.get(choice - 1);
        }
    }

    private int inputNumberOfPage() {
        System.out.println("Nhập số trang cho sách : ");
        return InputMethod.getInteger();
    }

    private String inputBookTitle() {
        System.out.println("Nhập tiêu đề cho sách :");
        return InputMethod.getString();
    }

    private String inputBookName() {
        System.out.println("Nhập tên cho sách :");
        return InputMethod.getString();
    }

    private int inputBookId() {
        System.out.println("Nhập mã sách :");
        return InputMethod.getInteger();
    }

    @Override
    public void displayData() {
        System.out.printf("|Book ID : %-5d | Name : %-15s | Author Name | %-20s | Export Price : %-15.2f | Quantity : %-4d | Status : %-10s\n",
                this.bookId, this.bookName, this.author.getAuthorName(), this.exportPrice, this.quantity, this.bookStatus ? "Đang bán" : " Ngưng bán");
    }
}

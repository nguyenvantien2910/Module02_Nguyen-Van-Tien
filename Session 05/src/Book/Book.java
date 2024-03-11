package Book;

import ra.model.Product;

import java.time.Year;
import java.util.Scanner;

public class Book {

    Scanner scanner = new Scanner(System.in);

    private String id, title, author, description,category;
    private Integer year;

    //Contructor

    public Book() {
    }

    public Book(String id, String title, String author, String description, Integer year, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.category = category;
    }

    //Getter

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public Integer getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    //Setter

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //inputData()

    public void inputData(Scanner scanner, Book[] arrBook) {
        //id
        while (true) {
            System.out.println("Mời bạn nhập vào mã sách (Bắt đầu bằng chữ B, độ dài 4 kí tự, duy nhất)");
            this.id = scanner.nextLine();

            if (!id.startsWith("B")) {
                System.out.println("Mã sách phải bắt đầu bằng kí tự B ");
            } else if (id.length() != 4) {
                System.out.println("Mã sách phải có 4 kí tự");
            } else {
                boolean isExit = false;
                for (Book book : arrBook) {
                    if (book == null) {
                        break;
                    }
                    if (book.id.equals(this.id)) {
                        System.out.println("Mã sách này đã tồn tại");
                        isExit = true;
                        break;
                    }
                }
                if (!isExit) {
                    break;
                }
            }
        }

//Title
        while (true) {
            System.out.println("Mời bạn nhập vào tiêu đề sách (từ 6-50 kí tự, duy nhất)");
            this.title = scanner.nextLine();

            if (title.length() < 6 || title.length() > 50) {
                System.out.println("Nhập tiêu đề sách từ 6 - 50 kí tự");

                boolean isExit = false;
                for (Book book : arrBook) {
                    if (book == null) {
                        break;
                    }
                    if (book.title.equals(this.title)) {
                        System.out.println("Tên sách đã tồn tại !");
                        isExit = true;
                        break;
                    }
                }
                if (!isExit) {
                    break;
                }
            } else {
                break;
            }
        }

//author
        while (true) {
            System.out.println("Mời bạn nhập vào tên tác giả (Không bỏ trống)");
            this.author = scanner.nextLine();
            if (!author.isEmpty()) {
                break;
            }
        }

//description
        while (true) {
            System.out.println("Mời bạn nhập vào mô tả sách (Không bỏ trống)");
            this.description = scanner.nextLine();
            if (!description.isEmpty()) {
                break;
            }
        }

//year
        while (true) {
            System.out.println("Mời bạn nhập năm xuất bản (tối thiểu từ năm 1970 và không lớn hơn năm hiện tại)");
            this.year = Integer.parseInt(scanner.nextLine());

            int currentYear = Year.now().getValue();
            if (year >= 1970 && year <= currentYear) {
                break;
            }
        }
    }

    public void displayData() {
        System.out.println("Mã sách là :" + id);
        System.out.println("Tiêu đề sách là :" + title);
        System.out.println("Tác giả của sách là :" + author);
        System.out.println("Năm xuất bản của sách là :" + year);
        System.out.println("Thể loại của sách là :" + category);
    }
}

package Book;

import java.util.Scanner;

public class Category {
    Scanner scanner = new Scanner(System.in);
private int id;
private String name;
private Boolean status;

//Contructor

    public Category() {};

    public Category(int id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    };

    // Getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getStatus() {
        return status;
    }

    //Setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //inputData()
    public void inputData(Scanner scanner, Category[] arrCate) {
        //ID
        do {
            System.out.println("Xin mời nhập mã thể loại : ");
            this.id = Integer.parseInt(scanner.nextLine());

            if ( id <= 0) {
                System.out.println(" Xin mời nhập ID lớn hơn 0 ");
            } else  {
                boolean isExit = false;
                for (Category category : arrCate) {
                    if (category == null) {
                        break;
                    }

                    if (category.id == this.id) {
                        System.out.println("Mã sản phẩm đã tồn tại");
                        isExit = true;
                    }
                }

                if (isExit);
                break;
            }
        } while (true);

        //Name
        while (true)
        {
            System.out.println("Mời nhập tên thể loại, độ dài 6-30 kí tự");
            this.name = scanner.nextLine();
            if (name.length() < 6 || name.length() > 30) {
                System.out.println("Tên sản phẩm phải có độ dài từ 6-30 kí tự");
            } else break;

            boolean isExit = false;
            for (Category category : arrCate) {
                if (category == null) {
                    break;
                }
                if (category.name == this.name) {
                    System.out.println("Tên thể loại đã tồn tại");
                    isExit = true;
                }
            }
            if (isExit) {
                break;
            }
        }

        //Status
        while (true) {
            System.out.println("Mời bạn nhập trạng thái của thể lại (true/ false)");
            Boolean status = Boolean.parseBoolean(scanner.nextLine());

            if (status == true || status == false) {
                    this.status = status;
                    break;
            } else {
                System.out.println("Mời bạn nhập trạng thái của thể lại (true/ false)");
            }
        }
    }

    //displayData()

    public void displayData() {
        System.out.println("Mã thể loại là: " + id);
        System.out.println("Tên thể loại là: " + name);
        System.out.println("Trạng thái thể loại là: " + (status ? "Hoạt động" : "Không hoạt động"));
    }
}


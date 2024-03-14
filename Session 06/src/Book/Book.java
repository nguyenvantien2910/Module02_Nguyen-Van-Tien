package Book;

import jdk.jfr.Category;

import java.util.Scanner;

public class Book {
    private String id, name;
    private Category category;

    public Book() {
    }

    public Book(String id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public void inputData(Scanner scanner, Category[] categories, int countCategory) {
        System.out.println("Lua chon the loai sach : ");
        if (countCategory == 0) {
            System.out.println("Danh sach the loai rong, can nhap the loai truoc!");
            return;
        }

        for (int i = 0; i < countCategory; i++) {
            System.out.println((i+1)+" : " + categories[i].getClass());
        }

        System.out.println("Moi lua chon theo danh sach");
        while (true) {
            int choise = Integer.parseInt(scanner.nextLine());
            if (choise > 0 && choise <= countCategory) {
                this.category = categories[choise - 1];
                break;
            } else {
                System.out.println("So nhap khong hop le!");
            }
        }
    }
}

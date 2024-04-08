package bt.bt08;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    int productID;
    String productName;
    String description;

    String productMaker;
    double price;

    public Product() {
    }

    public Product(int productID, String productName, String description, String productMaker, double price) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.productMaker = productMaker;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductMaker() {
        return productMaker;
    }

    public void setProductMaker(String productMaker) {
        this.productMaker = productMaker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập ID cho sản phẩm : ");
        this.productID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên cho sản phẩm : ");
        this.productName = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        this.productMaker = scanner.nextLine();
        System.out.println("Nhập giá cho sản phẩm : ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả cho sản phẩm : ");
        this.description = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", productMaker='" + productMaker + '\'' +
                ", price=" + price +
                '}';
    }
}

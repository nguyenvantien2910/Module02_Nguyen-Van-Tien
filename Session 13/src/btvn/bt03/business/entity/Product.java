package btvn.bt03.business.entity;

import java.util.Date;

public class Product {
    private String productID,description, productName;
    private Integer price;


    public Product() {
    }

    public Product(String description, String productName, Integer price) {
        this.description = description;
        this.productName = productName;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", description='" + description + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}

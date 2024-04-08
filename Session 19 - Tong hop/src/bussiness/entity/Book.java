package bussiness.entity;

import java.util.List;
import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private int categoryId;
    private boolean status;

    public Book() {
    }

    public Book(String name, double price, String author, int categoryId, boolean status) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.categoryId = categoryId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void displayData() {
        System.out.printf("|ID: %-5d | Name: %-15s | Price: %-12.2f | Author: %-15s | CategoryId: %-5d | Status: %-10s|\n", this.id, this.name,this.price,this.author,this.categoryId, this.status ? "Đang bán" : "Ngừng bán");
    }
}

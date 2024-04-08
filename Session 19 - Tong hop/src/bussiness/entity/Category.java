package bussiness.entity;

import java.util.List;
import java.util.Scanner;

public class Category {
    private int id;
    private String name;
    private boolean status;

    public Category() {
    }

    public Category(String name, boolean status) {
        this.name = name;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void displayData() {
        System.out.printf("|ID: %-5d | Name: %-15s | Status: %-15s|\n", this.id, this.name, this.status ? "Đang hoạt động" : "Không hoạt động");
    }
}

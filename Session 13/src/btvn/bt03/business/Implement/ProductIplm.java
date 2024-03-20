package btvn.bt03.business.Implement;

import btvn.bt03.business.design.IProduct;
import btvn.bt03.business.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductIplm implements IProduct {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private int countProduct = 0;

    @Override
    public Product findById(Integer id) {
        System.out.println("Mời bạn nhập vào ID sản phẩm muốn tìm kiếm");
        String searchID = scanner.nextLine();

    }

    @Override
    public void addNewElement() {

    }

    @Override
    public void editElement() {

    }

    @Override
    public void deleteElement() {

    }

    @Override
    public void displayAll() {

    }

    @Override
    public Product inputData(boolean isAdd) {
        return null;
    }

    @Override
    public String getNewId() {
        return "P" + countProduct;
    }
}

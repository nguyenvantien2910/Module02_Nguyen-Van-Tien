package bussiness.impliment;

import bussiness.config.ShopMessage;
import bussiness.design.CategoryDesign;
import bussiness.entity.Book;
import bussiness.entity.Category;
import bussiness.config.InputMethod;

import java.util.ArrayList;
import java.util.List;

public class CategoryIplm implements CategoryDesign {
    public static List<Category> categoryList = new ArrayList<>();

    @Override
    public void displayUpdateInfo(Category category) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("======UPDATE CATEGORY======");
            System.out.println("1. Cập nhật tên");
            System.out.println("2. Cập nhật trạng thái");
            System.out.println("3. Thoát");

            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = InputMethod.getByte();

            switch (choice) {
                case 1:
                    category.setName(inputName());
                    System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
                    break;
                case 2:
                    category.setStatus(!category.isStatus());
                    System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.err.println(ShopMessage.SELECT_INVALID);
            }

        }
    }

    @Override
    public void addNewElement() {
        System.out.println("Nhập số lượng danh mục muốn thêm mới : ");
        byte addNum = InputMethod.getByte();
        for (int i = 0; i < addNum; i++) {
            System.out.printf("Nhập thông tin cho danh mục thứ %d: \n", i + 1);
            categoryList.add(inputData(true));
            System.out.println(ShopMessage.ADD_NEW_SUCESS);
        }
    }

    @Override
    public void editElement() {
        if (!isEmtyList()) {
            System.out.println("Mời nhập mã danh mục muốn chỉnh sửa : ");
            int updateID = InputMethod.getByte();
            Category updateCategory = findById(updateID);

            if (updateCategory == null) {
                System.err.println(ShopMessage.ID_NOT_FOUND);
            } else {
                displayUpdateInfo(updateCategory);
                System.out.println(ShopMessage.UPDATE_INFO_SUCESS);
            }
        }
    }

    @Override
    public void deleteElement() {
       if (categoryList.isEmpty()) {
           System.err.println(ShopMessage.EMTY_LIST);
       } else {
           System.out.println("Nhập mã danh mục muốn xóa : ");
           int deleteID = InputMethod.getInteger();
           Category deleteCategory = findById(deleteID);

           if (deleteCategory == null) {
               System.err.println(ShopMessage.ID_NOT_FOUND);
           } else {
               categoryList.remove(deleteCategory);
               System.out.println(ShopMessage.DELETE_SUCESS);
           }
       }
    }

    @Override
    public void displayAll() {
        if (!isEmtyList()) {
            System.out.println("Danh sách các danh mục");
            categoryList.forEach(category -> category.displayData());
        }
    }

    @Override
    public Category findById(Integer id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public Category inputData(boolean isAdd) {
        Category category = new Category();
        if (isAdd) {
            category.setId(getNewID());
        }
        category.setName(inputName());
        category.setStatus(inputStatus());

        return category;
    }

    private boolean inputStatus() {
        System.out.println("Mời bạn nhập trạng thái cho danh mục :");
        return InputMethod.getBoolean();
    }

    private String inputName() {
        System.out.println("Mời bạn nhập tên cho danh mục : ");
        return InputMethod.getString();
    }

    @Override
    public int getNewID() {
        int idMax = 0;
        for (Category category : categoryList) {
            if (category.getId() > idMax) {
                idMax = category.getId();
            }
        }
        return idMax + 1;
    }

    @Override
    public boolean isEmtyList() {
        if (categoryList.isEmpty()) {
            System.err.println(ShopMessage.EMTY_LIST);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void updateStatus() {
        if (!isEmtyList()) {
            System.out.println("Nhập mã danh mục muốn thay đổi trạng thái: ");
            int updateStatusId = InputMethod.getInteger();
            Category category = findById(updateStatusId);
            if (category == null) {
                System.err.println(ShopMessage.ID_NOT_FOUND);
            } else {
                category.setStatus(!category.isStatus());
                System.out.println(ShopMessage.UPDATE_STATUS_SUCESS);
            }
        }
    }

}

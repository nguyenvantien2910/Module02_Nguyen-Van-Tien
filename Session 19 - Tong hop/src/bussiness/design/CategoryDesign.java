package bussiness.design;

import bussiness.entity.Category;

public interface CategoryDesign extends IGeneic<Category, Integer>{
    void displayUpdateInfo(Category category);

    boolean isEmtyList();
    Category inputData(boolean isAdd);

}

package bussiness.design;

import bussiness.entity.Book;
import bussiness.entity.Category;

import java.util.List;

public interface BookDesign extends IGeneic<Book,Integer>{
    void displayUpdateInfo(Book book);
    void findBookByCategoryName();

    void sortBookByPrice();

    Book inputData(boolean isAdd, List<Category> categoryList);

}

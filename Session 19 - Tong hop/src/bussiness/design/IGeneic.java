package bussiness.design;

public interface IGeneic<T,E> {
    void addNewElement();

    void editElement();

    void deleteElement();

    void displayAll();

    T findById(E id);

    int getNewID();
    boolean isEmtyList();
    void updateStatus();

}

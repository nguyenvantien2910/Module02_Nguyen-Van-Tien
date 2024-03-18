package ra.business.design;

public interface IGenericDesign<T,E> {
    T findById(E id);
    void addNewElement();
    void editElement();
    void deleteElement();
    void displayAll();
    T inputData(boolean isAdd);
}

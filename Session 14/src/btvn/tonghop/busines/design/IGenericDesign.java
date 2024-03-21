package btvn.tonghop.busines.design;

public interface IGenericDesign<T> {
    void addNemElement();
    void updateNemElement();
    void deleteNemElement();
    void displayAll();

    T findById(String id);
    T inputData(boolean isAdd);
}

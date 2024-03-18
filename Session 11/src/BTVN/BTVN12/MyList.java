package BTVN.BTVN12;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    void add(int index, MyList element) {
        // Implementation omitted for brevity
    }

    MyList remove(int index) {
        // Implementation omitted for brevity
        return null;
    }

    int size() {
        return size;
    }

    MyList clone() {
        try {
            MyList clonedList = (MyList) super.clone();
            clonedList.element = Arrays.copyOf(element, size);
            return clonedList;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    boolean contains(MyList o) {
        // Implementation omitted for brevity
        return false;
    }

    int indexOf(MyList o) {
        // Implementation omitted for brevity
        return -1;
    }

    boolean add(MyList e) {
        // Implementation omitted for brevity
        return false;
    }

    void ensureCapacity(int minCapacity) {
        // Implementation omitted for brevity
    }

    MyList get(int i) {
        // Implementation omitted for brevity
        return null;
    }

    void clear() {
        // Implementation omitted for brevity
    }
}

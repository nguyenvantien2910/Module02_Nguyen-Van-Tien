package BTVN.BTVN12;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    void add(int index, E element) {
        // Implementation omitted for brevity
    }

    E remove(int index) {
        // Implementation omitted for brevity
        return null;
    }

    int size() {
        return size;
    }

    E clone() {
        try {
            MyList clonedList = (MyList) super.clone();
            clonedList.element = Arrays.copyOf(element, size);
            return clonedList;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    boolean contains(E o) {
        // Implementation omitted for brevity
        return false;
    }

    int indexOf(E o) {
        // Implementation omitted for brevity
        return -1;
    }

    boolean add(E e) {
        // Implementation omitted for brevity
        return false;
    }

    void ensureCapacity(int minCapacity) {
        // Implementation omitted for brevity
    }

    E get(int i) {
        // Implementation omitted for brevity
        return null;
    }

    void clear() {
        // Implementation omitted for brevity
    }
}

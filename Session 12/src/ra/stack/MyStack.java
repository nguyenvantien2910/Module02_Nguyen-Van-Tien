package ra.stack;

import java.util.EmptyStackException;

public class MyStack <E> {
    private static  final  int INITIAL_SIZE  =16;
    private E[] elements;
    private  int count;

    public MyStack() {
        elements = (E[]) new Object[INITIAL_SIZE];
    }

    public void push(E e){
        ensureCapacity(); // kểm tra có cần nới rộng không
        elements[count] = e;
        count++;

    }
    private void ensureCapacity(){
        if (count>=elements.length){
            E[] newElements = (E[]) new Object[elements.length*2+1];
            System.arraycopy(elements,0,newElements,0,count);
            elements = newElements;
        }
    }
    public E pop(){
        if (count==0){
            throw new EmptyStackException();
        }
        // lấy phần tử cuối cùng
        E lastElement = elements[count-1];
        elements[count-1] = null;
        count--;
        return lastElement;
    }
}
package ra.example;

public class MyArray<E> {
    E[] array;
    public void printArray(E[] arr){ // in ra mảng
        for (E e : arr){
            System.out.println(e);
        }
    }

}

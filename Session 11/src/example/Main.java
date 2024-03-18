package ra.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();

        myArray.array = new Integer[]{1,2,3,4,5};

        myArray.printArray(myArray.array);

        MyArray<String> myStringArray = new MyArray<>();
        myStringArray.array = new String[]{"hung","duc","nam"};

        myStringArray.printArray(myStringArray.array);


        Calculator.printf(new String[]{"hung","duc","nam"});
        Calculator.printf(new Integer[]{1,2,3,4,5});
        MyArray<?> myArrayDouble = new MyArray<>();

        sort(new Integer[]{2,5,3,8,4,9,1,-1});
        MyArray<Circle> circles = new MyArray<>();
        MyArray<Shape> shapes = new MyArray<>();
        printShape(shapes);


    }

    public MyArray<?> genericWildcard (){
        return new MyArray<Integer>();
    }
    // xây dựng thuạt toán sắp xếp

    public static <T extends Comparable<T>> void sort(T[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].compareTo(array[j])>0){
                    // swap 2 phần tử
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // hiển thi
        for (T t : array){
            System.out.println(t);
        }
    };


    public static void printShape(MyArray<? super Circle> array){
//        double sumArea = 0;
        for (int i = 0; i < array.array.length ; i++) {
            System.out.println(array.array[i]);
        }
    }

}
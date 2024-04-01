package sort;

import java.util.Comparator;

public class InsertSort {
    public  static <T> void insertSort(T[] arr, Comparator<T> comparator){
        for (int i = 1; i <arr.length ; i++) {
            T insert = arr[i];
            int j =i-1;
            while ( j >=0 && comparator.compare(insert,arr[j])<0 ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = insert;
        }
    }
}

package sort;

import java.util.Comparator;

public class SelectionSort {
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int Minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[Minindex], arr[j]) > 0) {
                    Minindex = j;
                }
            }
            if (Minindex != i) {
                T temp = arr[i];
                arr[i] = arr[Minindex];
                arr[Minindex] = temp;
            }
        }
    }
}

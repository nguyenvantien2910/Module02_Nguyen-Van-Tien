package sort;

public class BublleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        boolean isNextPass = true;
        for (int i = 0; i <arr.length-1 && isNextPass ; i++) {
            isNextPass = false;
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNextPass =true;
                }
            }
        }
    }
}

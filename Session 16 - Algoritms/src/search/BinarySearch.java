package search;

import java.util.Objects;

public class BinarySearch {
    public static <T extends Comparable<T>> int indexOfNoRecursive(T[] arr ,T t){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(Objects.equals(arr[mid],t)){
                return mid;
            }
            if (arr[mid].compareTo(t)<0){
                start = mid+1;
            }else {
                end =mid-1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int indexOfRecursive(T[] arr,int start,int end ,T t){

        if (start<=end){
            int mid = start+(end-start)/2;
            if(Objects.equals(arr[mid],t)){
                return mid;
            }
            if (arr[mid].compareTo(t)<0){
                return indexOfRecursive(arr,mid+1,end,t);
            }else {
                return indexOfRecursive(arr,start,mid-1,t);
            }
        }
        return -1;
    }
}

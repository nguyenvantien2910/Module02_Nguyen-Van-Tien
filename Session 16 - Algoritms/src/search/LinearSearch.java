package search;

import java.util.Objects;

public class LinearSearch {
    public static <T> int linearSearch(T[] arr , T t){
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i],t)){
                return i;
            }
        }
        return -1;
    }
}

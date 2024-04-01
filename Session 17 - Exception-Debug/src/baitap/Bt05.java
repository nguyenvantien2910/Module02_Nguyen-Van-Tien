package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bt05 {
    public static void main(String[] args) {
        //Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int[] ints = {68,2767,489,97, 554,222,55,6789,778,3903,74,452,49999,};
        int searchNum;

        // Sắp xếp lại mảng theo quick sort
        quickSort(ints, 0, ints.length - 1);

        //in ra mảng sau khi sắp sếp
        System.out.println(Arrays.toString(ints));

        try {
            System.out.println("Mời bạn nhập vào số muốn tìm kiếm : ");
            searchNum = Integer.parseInt(scanner.nextLine());

            // Thực hiện tìm kiếm nhị phân
            int result = binarySearch(ints, searchNum);
            if (result == -1) {
                System.out.printf("Giá trị %d không nằm trong mảng \n", searchNum);
            } else {
                System.out.printf("Giá trị %d được tìm thấy ở vị trí là : %d\n", searchNum, result);
            }
        } catch (NumberFormatException e) {
            System.err.println("Giá trị đã nhập không hợp lệ, vui lòng nhập số nguyên !");
        }

        scanner.close();
    }


    // Quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Không tìm thấy giá trị đã nhập trong mảng
    }
}

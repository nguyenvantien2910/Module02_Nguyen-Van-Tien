import java.util.Scanner;

public class Bt01 {
    public static void main(String[] args) {
        //Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần
        //tử từ bàn phím và in ra giá trị các phần tử của mảng
        Scanner scanner = new Scanner(System.in);

        Integer[] integers = new Integer[5];
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Nập giá trị cho phần từ thứ %d của mảng : \n", i + 1);
            integers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (Integer i : integers) {
            System.out.println(i);
        }
    }
}

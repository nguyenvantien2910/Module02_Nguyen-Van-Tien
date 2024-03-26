import java.util.Arrays;
import java.util.Scanner;

public class Bt04 {
    public static void main(String[] args) {
        //Bài 4: Nhập số phần tử và giá trị các phần tử của mảng một chiều số
        //nguyên. Tìm giá trị lớn nhất và nhỏ nhất trong mảng

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào độ dài của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        Integer[] Integers = new Integer[length];

        for (int i = 0; i < Integers.length; i++) {
            System.out.printf("Mời bạn nhập giá trị cho phần từ thứ %d của mảng :\n", i + 1);
            Integers[i] = Integer.parseInt(scanner.nextLine());
        }
        //C1:
        int max = Integers[0];
        int tem;
        for (int i = 0; i < Integers.length -1 ; i++) {
            for (int j = i + 1; j < Integers.length ; j++) {
                if (Integers[j] > max) {
                    max = Integers[j];
                    Integers[j] = Integers[i];
                    tem = Integers[i];
                }
            }
        }

        System.out.println("Giá trị lớn nhất là : " + max);
        System.out.println("Giá trị nhỏ nhất là : " + Integers[0]);
    }
}

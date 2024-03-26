import java.util.Arrays;
import java.util.Scanner;

public class Bt08 {
    public static void main(String[] args) {
        //Bài 8: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
        //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số  phần
        //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
        //phần tử có chỉ số updateIndex

        //Nhập độ dài của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        //Khai báo mảng
        Integer[] integers = new Integer[length];

        //Gán giá trị cho mảng
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d của mảng : \n", i + 1);
            integers[i] = Integer.parseInt(scanner.nextLine());
        }

        while (true) {
            //Nhập giá trị (updateValue) và chỉ số  phần tử cần cập nhật (updateIndex)
            System.out.println("Nhập giá trị cập nhật (updateValue)");
            int updateValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập chỉ số phần tử cần cập nhật (updateIndex)");
            int updateIndex = Integer.parseInt(scanner.nextLine());

            if (updateIndex > 0 && updateIndex <= length) {
                //thực hiện cập nhật giá trị updateValue vào phần tử có chỉ số updateIndex
                integers[updateIndex - 1] = updateValue;
                System.out.println("Đã cập nhật thành công !");
                System.out.println(Arrays.toString(integers));
                break;
            } else {
                System.err.println("Chỉ số nhập vào không hợp lệ");
            }
        }
    }
}

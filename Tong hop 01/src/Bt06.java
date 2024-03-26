import java.util.Scanner;

public class Bt06 {

    public static void main(String[] args) {
        //Bài 6: Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
        //tử của mảng 1 chiều số nguyên. Nhập vào một giá trị (findNumber), in ra
        //chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng : ");
        int length = Integer.parseInt(scanner.nextLine());

        Integer[] integers = new Integer[length];
        for (int i = 0; i < integers.length; i++) {
            System.out.printf("Nập giá trị cho phần từ thứ %d của mảng : \n", i + 1);
            integers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Nhập vào giá trị cần tìm kiếm : ");
        int findNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == findNumber) {
                sum += integers[i];
                System.out.printf("Index của số %d là : %d \n", findNumber, i);
            }
        }

        System.out.printf("Tổng các số %d trong mảng là : %d", findNumber, sum);
    }
}

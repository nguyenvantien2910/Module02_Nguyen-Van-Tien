import java.util.Scanner;

public class BTVN09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length;

        System.out.println("Moi ban nhap do dai cua mang: ");
        length = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Moi ban nhap gia tri cho index tai %d : ", i);
            arr[i]= Integer.parseInt(scanner.nextLine());
        }

        int max1 = arr[0];
        int max2 = 0;

        for(int i = 1; i < length; i++){
            if (max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            } else if (max1 > arr[i] && max2 < arr[i]){
                max2 = arr[i];
            }
        }

        System.out.printf("So nho thu 2 trong mang la: %d", max2);
    }
}

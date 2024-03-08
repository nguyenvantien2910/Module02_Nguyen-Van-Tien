package BTVN03;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();

        StopWatch time = new StopWatch();

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(array));
        time.start();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        time.end();
        
        System.out.println(Arrays.toString(array));

        System.out.printf("Thoi gian de sap xep la: %.2f ms", (double)time.getElapsedTime());
    }
}

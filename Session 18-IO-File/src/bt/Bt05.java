package bt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bt05 {
    public static void main(String[] args) {
        String csvFile = "country.csv";
        String line;
        String delimiter = ","; // Khai báo dấu phân cách

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Đọc file CSV theo từng dòng
            while ((line = br.readLine()) != null) {
                // cắt các từ trên dòng
                String[] fields = line.split(delimiter);

                // in ra các từ theo formart
                System.out.printf("|ID: %-3s | Code: %-5s | Name: %-10s\n",fields[0],fields[1],fields[2]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

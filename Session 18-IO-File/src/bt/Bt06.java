package bt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bt06 {
    public static void main(String[] args) {
        //Khai báo biến
        String filePath = "bt01.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Đọc data theo từng dòng
            while ((line = reader.readLine()) != null) {
                // Cắt kí tự của từng dòng cách nhau bởi dấu cách, tab và dấu xuống dòng
                String[] words = line.split("\\s+");
                // thêm từ vào map
                for (String word : words) {
                    if (wordCounts.containsKey(word)) {
                        wordCounts.put(word, wordCounts.get(word) + 1);
                    } else {
                        wordCounts.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Tìm kiếm số lần suất hiện nhiều nhất
        int maxCount = 0;
        for (int count : wordCounts.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // in từ có nhiều lần suất hiện nhất
        System.out.println("Từ có số lần suất hiện nhiều nhất là :");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " lần");
            }
        }
    }
}

package bt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bt03 {
    public static void main(String[] args) throws IOException {
        try {
            String[] fileContentArray = readTxtFileToArray("bt01.txt");
            int maxLength = 0;
            for (String line : fileContentArray) {
                if (line.length() > maxLength) {
                    maxLength = line.length();
                }
            }

            for (String line : fileContentArray) {
                if (line.length() == maxLength) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Tạo method đọc file
    public static String[] readTxtFileToArray(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //Trả về 1 mảng string
        return content.toString().split(" ");
    }
}

package bt;

import java.io.*;

public class Bt01 {
    public static void main(String[] args) throws IOException {
        try {
            String[] fileContentArray = readTxtFileToArray("bt01.txt");
            for (String line : fileContentArray) {
                System.out.println(line);
            }
            System.out.printf("Độ dài của mảng là : %d\n", fileContentArray.length);
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

        return content.toString().split(" ");
    }
}

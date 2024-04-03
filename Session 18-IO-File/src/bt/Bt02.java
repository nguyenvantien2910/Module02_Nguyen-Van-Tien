package bt;

import java.io.*;

public class Bt02 {
    public static void main(String[] args) {
        copyFileByte("bt01.txt","bt02.txt");
    }

    public static void copyFileByte(String input, String output) {
        //Khởi tạo file
        File inputFile = new File(input);
        File outputFile = new File(output);

        //Kiểm tra tồn tại của file
        if (!inputFile.exists()) {
            throw new RuntimeException("File không tồn tại!");
        }

        //Khai báo biến và thực hiện copy file
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(inputFile);
            fos = new FileOutputStream(outputFile);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            System.out.println("Sao chép file thành công !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package bt;

import java.io.*;

public class Bt04 {
    public static void main(String[] args) {
        reverseFileText("bt01.txt");
    }

    public static void reverseFileText(String path) {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        String[] outputString = content.toString().split(" ");
        StringBuilder reversedContent = new StringBuilder();
        for (int i = outputString.length - 1; i >= 0; i--) {
            reversedContent.append(outputString[i]).append(" ");
        }
        String[] reverseStringArr = reversedContent.toString().split(" ");


        writeFile("bt04.txt", reverseStringArr);

    }

    public static void writeFile(String path, String[] strings) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < strings.length; i++) {
                writer.write(strings[i]);
                if (i != strings.length - 1) {
                    writer.write(" ");
                }
            }
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

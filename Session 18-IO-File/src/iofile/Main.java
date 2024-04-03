package iofile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khoi tao FILE
        File file = new File("student.txt");
        System.out.println("Existed : " + file.exists());
        System.out.println("Is Directory : " + file.isDirectory());
        System.out.println("Is File : " + file.isFile());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        if (file.exists()){
//            file.delete();
//        }

        File folder = new File("./src/../uploads");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        System.out.println("path uploads : " + folder.getPath());
        System.out.println("path uploads : " + folder.getAbsolutePath());
        try {
            System.out.println("path uploads : " + folder.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("size file : " + file.length());


//        boolean isSuccess = copyFileByte("student.txt","studentCopy.txt");
        boolean isSuccess = copyFileCharacter("student.txt", "studentCopy.txt");
        System.out.println(isSuccess);

//        Scanner sc = new Scanner(System.in);
//        sc.next();
//        sc.close();
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.id = 3;
        student1.name = "khanh";
        studentList.add(student1);


        Student student2 = new Student();
        student2.id = 2;
        student2.name = "hung";
        studentList.add(student2);

//        writeStudent("student.csv",studentList);
        List<Student> list = readStudent("student.csv");
        for (Student s : list) {
            System.out.printf("id : %s | name : %s \n", s.id, s.name);
        }

    }

    public static boolean copyFileCharacter(String input, String output) {
        File inputFile = new File(input);
        File outputFile = new File(output);
        if (!inputFile.exists()) {
            throw new RuntimeException("file ko ton khai");
        }
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader(inputFile));
            bfw = new BufferedWriter(new FileWriter(outputFile));

            int c;
            while ((c = bfr.read()) != -1) {
                bfw.write(c);
            }
            bfw.flush(); // day tu buffer ra file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bfw != null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

    public static boolean copyFileByte(String input, String output) {
        File inputFile = new File(input);
        File outputFile = new File(output);
        if (!inputFile.exists()) {
            throw new RuntimeException("file ko ton khai");
        }
        FileInputStream ins = null;
        FileOutputStream ous = null;
        try {
            ins = new FileInputStream(inputFile);
            ous = new FileOutputStream(outputFile);
            int c;
            while ((c = ins.read()) != -1) {
                ous.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }


    // thao tac doc ghi object
    // Student
    // luu ra file
    // dieu kien can : Student phai serialization
    // B1 : su dung FileOuputStream
    // B2 : su dung ObjectOutputStream

    public static void writeStudent(String path, List<Student> students) {
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            if (!file.exists() || file.length() == 0) {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos) {
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
            }

            // Write each student object to the file
            for (Student student : students) {
                oos.writeObject(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Student> readStudent(String path) {
        List<Student> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    list.add(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
}
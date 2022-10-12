package Assignment_5;
import java.util.*;
import java.io.*;
import java.io.File;

public class assignment_5_1 {

        public static void main(String[] arg) throws IOException {
            File f = new File("out.txt");
            if (f.exists()) {
                f.createNewFile();
                System.out.println("name:" + f.getName());
                System.out.println("read:" + f.canRead());
                System.out.println("write:" + f.canWrite());
                System.out.println("Execute:" + f.canExecute());
                System.out.println("length:" + f.length());
                System.out.println("list:" + f.list());
                System.out.println("makdir:" + f.mkdir());
                System.out.println("path:" + f.getAbsolutePath());
            } else {
                System.out.println("file does not exists");
            }
        }
    }
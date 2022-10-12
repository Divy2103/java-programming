package Assignment_5;

    import java.util.*;
import java.io.*;
import java.io.File;

public class assignment_5_5 {
        public static void main(String[] args) throws IOException {
            int arry[] = new int[15];
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 15 numbers : ");

            for (int i = 0; i < 15; i++) {
                arry[i] = sc.nextInt();
            }

            File f = new File("even.txt");
            if (f.createNewFile()) {
                FileWriter fw = new FileWriter("even.txt");
                for (int j = 0; j < 15; j++) {
                    if (arry[j] % 2 == 0) {
                        fw.write(arry[j] + " ");
                    }
                }
                fw.close();
                File f1 = new File("even.txt");
                Scanner myReader = new Scanner(f1);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } else {
                System.out.println("can,t create or already exist file");
            }
        }
    }


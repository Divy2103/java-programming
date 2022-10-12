package Assignment_5;
//When to use Character Stream over Byte Stream? When to use Byte Stream over Character Stream? Give example.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class assignment_5_2 {
        public static void main(String[] args) throws IOException {

            FileReader inputStream = null;
            FileWriter outputStream = null;

            try {
                inputStream = new FileReader("out.txt");
                outputStream = new FileWriter("outagain.txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }



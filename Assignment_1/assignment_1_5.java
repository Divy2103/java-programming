package Assignment_1;
// Kaila divy
// 21ce049
import java.util.Scanner;

public class assignment_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first String :");
       String str = sc.next();
        System.out.println("second String : ");
        String str1 = sc.next();
        int n = 0;
        int length = Math.min(str.length(), str1.length());
        for ( int i=0; i<length-1;i++){
            String a = str.substring(i, i + 2);
            String b = str1.substring(i, i + 2);
            if (a.equals(b)) {
                n++;
            }
        }
        System.out.println(n);
    }

}

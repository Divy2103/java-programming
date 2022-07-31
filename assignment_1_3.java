package Assignment_1;
// Kaila divy
// 21ce049
import java.util.Scanner;

public class assignment_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a%10;
        b = b%10;
        boolean c = a==b;
        System.out.println(c);
    }
}

package Assignment_1;
// Kaila divy
// 21ce049
import java.util.Scanner;

public class assignment_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean a = false;   // variable a is false
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==1){
                i++;
                if (arr[i]==2){
                    i++;
                    if (arr[i]==3)
                    {
                       a = true; // if all condition is satisfied a is true
                    }
                }
            }
        }
        System.out.println(a);
    }
}

package Assignment_1;
// Kaila divy
// 21ce049
import java.util.Scanner;

public class assignment_1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[8][10];
        String[] trueAns = {"D","B","D","C","C","D","A","E","A","D"};
        int n =0;
        int[] array = new int[8];
        for(int i=0;i<8;i++)
        {
            System.out.println("Student "+i);
            for (int j=0;j<10;j++)
            {
                arr[i][j] = sc.next();
                if (trueAns[j].equals(arr[i][j])){
                    n++;
                }
            }
                array[i] = n;
            n=0;
//            System.out.format("student %d get %d marks ",i,n);
        }
           for (int i=0;i<8;i++)
           {
               System.out.format("\nstudent %d get %d marks ",i,array[i]);

           }
    }
}

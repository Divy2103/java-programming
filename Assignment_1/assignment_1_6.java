package Assignment_1;
// Kaila divy
// 21ce049
import java.util.Scanner;

public class assignment_1_6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("plaese enter the length of character");
            int n= sc.nextInt();
            String A[]=new String[n];
            String C[]=new String[n];

            System.out.println("please enter the character");
            for(int i=0;i<n;i++)
            {
                A[i]=sc.next();
            }

            System.out.println("please enter the word Which you remove");
            String B=sc.next();
            //for cheaking the array
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(A[i].contains(B) ||A[i].contains(B)) {
                    int d=0;
                }
                else
                {
                    C[j]=A[i];
                    j++;
                }
            }
            //print the array

            for (int i=0;i<j;i++)
            {
                System.out.println(C[i]);
            }
        }


}

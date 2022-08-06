package Assignment_1;
// Kaila divy
// 21ce049
public class assignment_1_7 {
    public static void main(String[] args) {
        int n = 8;

        for (int i=1;i<=8;i++){
            for (int j=1;j<=8-i;j++)
            {
                System.out.print("    ");
            }
            for (int j=1;j<=i;j++){
               int  k=(int)Math.pow(2,(j-1));
                System.out.printf("%4d",k);
            }
            for (int j=i;j>1;j--){
                int m = (int)Math.pow(2,(j-2));
                System.out.printf("%4d",m);
            }
            System.out.println("");
        }
    }
}

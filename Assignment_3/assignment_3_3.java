package Assignment_3;
interface P
{
    final int p=21;
    void dispP();
}
interface P1 extends P
{
     int p1=3;
    void dispP1();
}
interface P2 extends P
{
     int p2=2004;
    void dispP2();
}
interface P12 extends P1,P2
{
     int p12=2022;
    void dispP12();
}
 class Display implements P12{
     @Override
     public void dispP() {
         System.out.println("your first number is " + p);
     }

     @Override
     public void dispP1() {
         System.out.println("your second number is " + p1);
     }

     @Override
     public void dispP2() {
         System.out.println("your third number is " + p2);
     }

     @Override
     public void dispP12() {
         System.out.println("your fourth number is " + p12);
     }
 }
public class assignment_3_3 {
    public static void main(String[] args) {
        Display display = new Display();
        display.dispP();
        display.dispP1();
        display.dispP2();
        display.dispP12();
    }
}

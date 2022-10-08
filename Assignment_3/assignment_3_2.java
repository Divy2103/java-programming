package Assignment_3;

interface Iprinter{
          int a = 11;
          int b = 1;
          int c = 1111;
          void birthday();


    default void display(){
        System.out.println("Hello ! good morning");
    }
}
interface IScanner{
        void greet();
}
class concrete implements Iprinter,IScanner{
   public void birthday(){
       System.out.println("Birthdate is " + a+"-"+b+"-"+c );
    }
    public void greet(){
        System.out.println("Welcome");
    }
}

public class assignment_3_2 {
    public static void main(String[] args) {

        for (int i=0;i< 5;i++){
              concrete c = new concrete();
              c.display();
              c.greet();
              c.birthday();
        }
    }
}

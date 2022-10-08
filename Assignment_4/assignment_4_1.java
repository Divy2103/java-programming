package Assignment_4;

public class assignment_4_1 {

    public static void main(String[] args) {

//         1 -- ArithmeticException
//        int x = 10;
//        try {
//            System.out.println(x/0);
//        }
//
//        catch (ArithmeticException e) {
//            System.out.println(e);
//            System.out.println(e.getMessage());
//        }

//           2 -- ArrayIndexOutOfBoundsException

//        int[] arr = new int[5];
//            try {
//                System.out.println("welcome");
//                arr[5] = 12;
//            }
//            catch (ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println(e);
//            }


//            3 -- exception class

        int x = 10;
        try {
            System.out.println(x/0);
        }

        catch (Exception e) {
            System.out.println(x+e.getMessage());
        }




//        int x = 10;
//        try {
//            System.out.println(x/0);
//        }
//
//        catch (Exception e) {
//            System.out.println(x+e.getMessage());
//        }
//         catch (ArithmeticException e) {                         // Compilation error  because  we declare  ArithmeticException class after
//            System.out.println(x+e.getMessage());                //     Exception class
//        }


//        int x = 10;
//        try {
//            System.out.println(x/0);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("hello");                   // not execute because Exception is ArithmeticException
//        }
//         catch (ArithmeticException e) {
//            System.out.println("nice day");
//        }


        }
    }


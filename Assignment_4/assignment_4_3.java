package Assignment_4;

public class assignment_4_3 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[6] = 21/0;
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException" + e.getMessage());
        }

        finally {
            System.out.println("Finally called");
        }
    }
}
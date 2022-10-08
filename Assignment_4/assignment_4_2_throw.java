package Assignment_4;

class MyException extends Exception {
    MyException(int b)
    {
        System.out.println("number is " + b);
    }
}

public class assignment_4_2_throw {
    public static void main(String[] args) {
        try{
            throw new MyException(2);
        }
        catch(MyException e){
            System.out.println("fight");
        }
    }
}
package Assignment_6;

class MultithreadingDemo1 implements Runnable {
    public void run() {
        try {
            System.out.println("hello world");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}


public class assignment_6_1_2 {
    public static void main(String[] args) {
        Thread object = new Thread(new MultithreadingDemo1());
        object.start();
    }

}

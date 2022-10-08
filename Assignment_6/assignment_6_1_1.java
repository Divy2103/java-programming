package Assignment_6;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("hello World");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}


public class assignment_6_1_1 {
    public static void main(String[] args) {
        MultithreadingDemo object = new MultithreadingDemo();
        object.start();
    }

}

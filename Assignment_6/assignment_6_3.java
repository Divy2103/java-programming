package Assignment_6;

class T1 implements Runnable {
    public void run() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                count++;
                System.out.println(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class assignment_6_3 {
    public static void main(String[] args) {
        Thread object = new Thread(new T1());
        object.start();
    }
}

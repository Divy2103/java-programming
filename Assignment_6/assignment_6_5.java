package Assignment_6;
import java.util.ArrayList;

 class Producer {
    ArrayList < Character > list = new ArrayList < Character > ();
    int capacity = 2;
    public void produce() throws InterruptedException {
        char value = 'a';
        while (true) {
            synchronized(this) {
                while (list.size() == capacity)
                    wait();
                System.out.println("Producer produced product :" + value);
                list.add(value);
                value++;
                if (value == 'g') {
                    System.exit(0);
                    break;
                }
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException {
        while (true) {
            synchronized(this) {
                while (list.size() == 0)
                    wait();
                char val = list.remove(0);
                if (val == 'g') {
                    break;
                }
                System.out.println("Consumer consumed Product :" + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}



public class assignment_6_5 {
    public static void main(String[] args) throws InterruptedException {
        final Producer p1 = new Producer();
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p1.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    p1.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
    }

}

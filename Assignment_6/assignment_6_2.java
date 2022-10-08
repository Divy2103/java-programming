package Assignment_6;

import java.util.*;

class newthread extends Thread {
    public void run() {
        Random rand = new Random();
        int arr[] = new int[10];
        arr[0] = rand.nextInt(100);
        arr[1] = rand.nextInt(100);
        arr[2] = rand.nextInt(100);
        arr[3] = rand.nextInt(100);
        arr[4] = rand.nextInt(100);
        arr[5] = rand.nextInt(100);
        arr[6] = rand.nextInt(100);
        arr[7] = rand.nextInt(100);
        arr[8] = rand.nextInt(100);
        arr[9] = rand.nextInt(100);

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("t1:" + arr[i]);
            } else {
                System.out.println("t2:" + arr[i]);
            }
        }
    }
}

public class assignment_6_2 {
    public static void main(String[] args) {
        newthread t1 = new newthread();
        newthread t2 = new newthread();
        t1.start();
        t2.start();
    }
}

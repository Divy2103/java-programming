package Assignment_6;

class FIRST extends Thread {
    public void run() {
        System.out.println("Priority of FIRST Thread " + getPriority());
    }
}
class SECOND extends Thread {
    public void run() {
        System.out.println("Priority of SECOND Thread " + getPriority());
    }
}
class THIRD extends Thread {
    public void run() {
        System.out.println("Priority of THIRD Thread " + getPriority());
    }
}


public class assignment_6_4 {
    public static void main(String[] args) {
        FIRST f = new FIRST();
        SECOND s = new SECOND();
        THIRD t = new THIRD();
        f.setPriority(3);
        s.setPriority(5);
        t.setPriority(7);
        f.start();
        s.start();
        t.start();
    }

}

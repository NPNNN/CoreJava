package Multithreading;

class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Executing.....");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread Executing.....");
        }
    }
}

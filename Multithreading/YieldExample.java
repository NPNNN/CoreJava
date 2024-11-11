package Multithreading;

class YieldExample extends Thread {
    public YieldExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running, iteration: " + i);
            
            // Calling yield to give other threads a chance
            if (i == 3) {
                System.out.println(Thread.currentThread().getName() + " yielding at iteration: " + i);
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }

    public static void main(String[] args) {
        YieldExample thread1 = new YieldExample("Thread-1");
        YieldExample thread2 = new YieldExample("Thread-2");

        thread1.start();
        thread2.start();
    }
}

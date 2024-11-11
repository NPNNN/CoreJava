package Multithreading;


public class SleepExample {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
System.out.println("Iteration " + i);
try {
// Sleep for 1 second (1000 milliseconds)
Thread.sleep(5000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}

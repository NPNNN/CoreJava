package Multithreading;


 class MyRunnable1 implements Runnable{
	@Override
	public void run(){
		Thread thread = Thread.currentThread();
		System.out.println("Thread  "+thread.getName()+" Priorities"+thread.getPriority());
	}
}
public class ThreadPriorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MyRunnable1(),"Thread-1");
		Thread thread2 = new Thread(new MyRunnable1(),"Thread-2");
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();

	}

}

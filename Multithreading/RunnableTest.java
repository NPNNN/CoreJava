package Multithreading;

class MyRannable implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Rannable");
		}
		
	}
	
}

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyRannable r = new MyRannable();
      
      Thread t = new Thread(r);
      t.start();
      for(int i=0; i<=5; i++) {
			System.out.println("Main thread");
		}
	}

}

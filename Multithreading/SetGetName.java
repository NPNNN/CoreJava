package Multithreading;

 class MyRunnable implements Runnable{
	 
	 @Override
	public void run() {
		 System.out.println("Child Thread");
	 }
	
}

public class SetGetName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyRannable());
		String defaultName1 = thread.getName();
		String defaultName2 = thread.getName();
		String defaultName3 = thread.getName();
		System.out.println("The Default name of the thread is = "+defaultName1);
		System.out.println("The Default name of the thread is = "+defaultName2);
		System.out.println("The Default name of the thread is = "+defaultName3);
		
		thread.setName("MyThread");
		String updateName = thread.getName();
		System.out.println("The updated thread name is = "+updateName);
		
		
		

	}

}

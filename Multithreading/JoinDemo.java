package Multithreading;

 class JoinExample implements Runnable{
	 static int sum=0;
	 @Override
	 
	 public void run() {
		 for(int i=0; i<=5; i++) {
			 sum=sum+i;
			 
		 }
	 }
 }
 public class JoinDemo {
	 public static void main(String [] args) throws InterruptedException {
		
		 Thread t1 = new Thread(new JoinExample(),"Join Example"); 
		 t1.start();
		 t1.join();//if use this then only ans is 15 otherwise 0 because it tell just complete your work and the print if not use the just it completed and print before the sum all the digit
		
//		 JoinExample sum= new JoinExample(); these two line use without the multithreading and sum is 15
//		 sum.run();
		 System.out.println("Sum = "+JoinExample.sum);
	 }
 }
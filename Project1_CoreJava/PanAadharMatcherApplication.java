package Project1_CoreJava;

import java.util.Scanner;


public class PanAadharMatcherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_CYAN ="\\u001B[36m";
		
		Scanner sc = new Scanner(System.in);
		
		AadharServices aadharservices = new AadharServices();
		PanServices panservices = new PanServices();
		
		System.out.println( ANSI_YELLOW+"Enter your Aadhar Number to check that this Aadhar number is link to your Pan Card or Not"+ANSI_RESET);
		String aadharNumber=sc.nextLine();
		
		if(aadharNumber.length() != 12) {
			System.out.println(ANSI_RED+"Please Enter a valid Aadhar Card Number....."+ANSI_RESET);
		}
		else {
		Aadhar aadhar = aadharservices.getAadharByNumber(aadharNumber);
		Pan pan = panservices.getPanByAadharNumber(aadharNumber);
	
        
        if(aadhar!=null && pan!=null)
        {
        	System.out.println(ANSI_GREEN+"Congratulation Your Aadhar Card is  link to your Pan Card.....\n"+ ANSI_RESET);
            System.out.println("Aadhaar Details.....\n"+aadhar);
            System.out.println("Pan Details.....\n"+pan);
        }
        else {
            System.out.println(ANSI_RED +"Your Aadhar Card is not link to your Pan Card....."+ ANSI_RESET);
        }
		

		}
	}

}

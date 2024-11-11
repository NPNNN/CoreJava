package Exception_Handling;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        //Example to demostrate finally
        try {
            System.out.println("This is a try block");
            System.out.println(10/0);
        }
        catch (Exception e) {
            System.out.println("This is a catch block");
           // System.exit(0); //if use this finally block will never be executed
        }
        finally {
            System.out.println("This is a finally block");
        }
    }
}

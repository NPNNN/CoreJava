package Exception_Handling;

public class Try_Catch {
    public static void main(String[] args) {
       System.out.println("Before Exception");
        try{
            System.out.println(10/0);
        }
        catch(RuntimeException e){
            System.out.println("Please do not divided by zero");
           // e.printStackTrace();
        }
        System.out.println("After Exception");
    }
}

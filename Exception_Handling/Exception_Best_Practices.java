package Exception_Handling;

public class Exception_Best_Practices {
    public static void main(String[] args) {
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
        try {
            //System.out.println(10 / 0);
            int res=arr[9];
            throw new ArithmeticException("Request fail due to some technical error");
        }
        catch(ArithmeticException e)
        {
           System.out.println("Arithmetic Exception occurred");
           // System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            //System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("I am in catch");
            System.out.println(e.getMessage());
        }

    }
}

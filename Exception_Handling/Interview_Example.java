package Exception_Handling;


class ThrowTest1{
    void m1() {
        try{
           // System.out.println(10/0);
            System.out.println("This is try block");
            return;
        }
        catch(Exception e){
            System.out.println("This is catch block");
        }
        finally{
            System.out.println("finally");
        }
    }

}
public class Interview_Example {
    public static void main(String[] args) {
        ThrowTest1 t = new ThrowTest1();


       t.m1();
    }

}

package Collections.ListInterface.Stack;

import java.util.Scanner;
import java.util.Stack;

public class OprationStack
{
    //just want to create the stack menu driven program which have all basic operation of the stack
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        while(true){
            System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter element into stack: ");
                int element = sc.nextInt();
                stack.push(element);
                System.out.println("Element pushed into the stack");

            }
            else if(choice == 2){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty");
                }else {

                    System.out.print("Enter element that you want to pop: ");
                    int element = sc.nextInt();
                    stack.pop();
                    System.out.println("Element popped from the stack");
                }

            }
            else if(choice == 3){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty");
                }else {
                    System.out.print("Here is the stack: "+stack);
                }
            }
            else if(choice == 4){
                if(stack.isEmpty()){
                    System.out.println("Stack is empty");
                }else{
                    System.out.print("Here is the stack top element: "+stack.peek());
                }

            }
            else if(choice == 5){
                System.exit(0);

            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }
}

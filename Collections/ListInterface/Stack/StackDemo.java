package Collections.ListInterface.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.print("The stack is "+stack);

        stack.pop();
        System.out.print("The stack after pop the element "+stack);


        System.out.print("The stack after peek the element "+stack.peek());
    }
}

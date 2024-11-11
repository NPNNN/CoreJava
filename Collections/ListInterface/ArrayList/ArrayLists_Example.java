package Collections.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists_Example {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int n = sc.nextInt();
        //code for adding the element in an arraylist
        System.out.println("Enter the elements of arraylist");
        for (int i = 0; i < n; i++) {
            int newElement = sc.nextInt();
            arr.add(newElement);

        }
        System.out.println("After adding the elements of arraylist"+arr+"\n");
        //code for updating the element in an arraylist
        System.out.println("Enter the index of an element that you want to update");
        int index = sc.nextInt();
        if(index>=0 && index<arr.size()-1){
           System.out.println("Enter the element that you want to update");
           int UpdateElement = sc.nextInt();
           arr.set(index, UpdateElement);
           System.out.println("After updating the elements of arraylist"+arr);
       }else {
           System.out.println("Please enter a valid index");
       }

        //code for removeing or deleting the element from the arraylist
        System.out.println("Enter the index of an element that you want to delete");
        int index1 = sc.nextInt();
        if(index1>=0 && index1<arr.size()-1){
            arr.remove(index1);
            System.out.println("After removing the elements of arraylist"+arr);

        }else{
            System.out.println("Please enter a valid index");
        }
    }
}

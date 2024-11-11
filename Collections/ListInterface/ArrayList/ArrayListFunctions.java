package Collections.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements using add(E e) and add(int index, E element)
        arr.add(10);  // Add at the end
        arr.add(20);  // Add at the end
        arr.add(30);  // Add at the end
        arr.add(1, 15); // Add 15 at index 1

        System.out.println("ArrayList after additions: " + arr); // [10, 15, 20, 30]

        // Getting an element using get(int index)
        System.out.println("Element at index 2: " + arr.get(2));  // 20

        // Setting an element using set(int index, E element)
        arr.set(2, 25);  // Change element at index 2 to 25
        System.out.println("ArrayList after update: " + arr); // [10, 15, 25, 30]

        // Removing an element using remove(int index) and remove(Object o)
        arr.remove(1);  // Remove element at index 1
        arr.remove(Integer.valueOf(30));  // Remove element 30
        System.out.println("ArrayList after removals: " + arr); // [10, 25]

        // Checking size using size()
        System.out.println("Size of the ArrayList: " + arr.size());  // 2

        // Checking if an element exists using contains(Object o)
        System.out.println("Does ArrayList contain 10? " + arr.contains(10));  // true

        // Finding index of elements using indexOf(Object o) and lastIndexOf(Object o)
        arr.add(25);  // Add duplicate value
        System.out.println("First index of 25: " + arr.indexOf(25));  // 1
        System.out.println("Last index of 25: " + arr.lastIndexOf(25));  // 2

        // Checking if ArrayList is empty using isEmpty()
        System.out.println("Is the ArrayList empty? " + arr.isEmpty());  // false

        // Cloning the ArrayList using clone()
        ArrayList<Integer> clonedArr = (ArrayList<Integer>) arr.clone();
        System.out.println("Cloned ArrayList: " + clonedArr);  // [10, 25, 25]

        // Sublist from ArrayList using subList(int fromIndex, int toIndex)
        List<Integer> sublist = arr.subList(0, 2);  // Sublist from index 0 to 1
        System.out.println("Sublist from index 0 to 1: " + sublist);  // [10, 25]

        // Sorting ArrayList using sort(Comparator<? super E> c)
        arr.sort(Comparator.naturalOrder());  // Sorting in ascending order
        System.out.println("Sorted ArrayList: " + arr);  // [10, 25, 25]

        // Using forEach(Consumer<? super E> action) to print elements
        System.out.print("ArrayList elements using forEach: ");
        arr.forEach(element -> System.out.print(element + " "));  // 10 25 25
        System.out.println();

        // Ensuring capacity using ensureCapacity(int minCapacity)
        arr.ensureCapacity(10);  // Ensure capacity of 10 elements

        // Trimming the ArrayList to size using trimToSize()
        arr.trimToSize();  // Trim the ArrayList capacity to its size

        // Clearing the ArrayList using clear()
        arr.clear();
        System.out.println("ArrayList after clearing: " + arr);  // []

        // Checking size after clear
        System.out.println("Size after clearing: " + arr.size());  // 0
    }
}

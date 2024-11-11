package Collections.ListInterface.LinkedList;

import java.util.LinkedList;

public class LinkedListOpration {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Apple");
        linkedlist.add("Banana");
        linkedlist.add("Grape");
        linkedlist.add("Pineapple");
        linkedlist.add("Orange");
        System.out.println("Element of the Linkedlist "+linkedlist);

        //Retriving the 1st and last element
        String firstElement = linkedlist.getFirst();
        String lastElement = linkedlist.getLast();
        System.out.println("1st Element of the Linkedlist "+firstElement+"\nLast element of Linkedlist "+lastElement);

      //Searching the element in linkedlist
        boolean contains = linkedlist.contains("Banana");
        System.out.println(" Element of the Linkedlist "+contains);

        //Removing the element of linkedlist
        linkedlist.removeFirst();
        System.out.println("After removing the Element of the Linkedlist "+linkedlist);

        //find the size of the linkedlist
        int size = linkedlist.size();
        System.out.println("Size of the Linkedlist "+size);


        //clearning the element of the linkedlist
        linkedlist.clear();
        System.out.println("After clearing the Linkedlist "+linkedlist);
    }

}

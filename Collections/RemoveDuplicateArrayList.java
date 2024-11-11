package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {
    public static void main(String[] args) {
        //to remove the duplicate element just convert the arraylist to set and print elemetn
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(5);
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}

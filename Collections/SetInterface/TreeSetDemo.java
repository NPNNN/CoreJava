package Collections.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    //Tree set maintain the sorted order of the element
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(15);
        set.add(25);
        System.out.println(set);

    }
}

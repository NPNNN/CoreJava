package Collections.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetDemo {
    //LinkedHasSet maintain the insertion order to print the element
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
    }
}

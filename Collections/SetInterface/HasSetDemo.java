package Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HasSetDemo {
    public static void main(String[] args) {
        //It does not maintain the any order to print the element
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
    }
}

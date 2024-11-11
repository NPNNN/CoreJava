package Collections.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListUsingInterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i*2);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

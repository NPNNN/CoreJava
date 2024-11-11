package Collections.ListInterface.ArrayList;

import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arraylist1 = new ArrayList();
        for(int i=0; i<=5; i++){
            arraylist1.add(i*5);
        }
        System.out.print("Here is 1st arraylist "+arraylist1);
        ArrayList<Integer> arraylist2 = new ArrayList();
        for(int i=5; i>=1; i--){
            arraylist2.add(i*5);
        }
        arraylist1.addAll(arraylist2);
        System.out.print("after merging the two list  is   "+arraylist1);
    }
}

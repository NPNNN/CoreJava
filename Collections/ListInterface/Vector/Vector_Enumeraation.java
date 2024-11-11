package Collections.ListInterface.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Enumeraation {
    //Enumeration are use only for the legacy classes like  vector and stack
    public static void main(String [] args){
        Vector<Integer> vector = new Vector();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        System.out.print(vector);
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement());
        }
    }
}

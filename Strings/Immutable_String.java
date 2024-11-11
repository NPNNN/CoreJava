package Strings;

public class Immutable_String {
    public static void main(String[] args){
        String s1 = "Narendar";
        s1.concat("Nishad");
        //in thos example nishad implecitly pass which is going to concat to
        //to the Narendar but we know when s1 is create it point to the Narendar only
        //that why we can say that stirng immutable
        System.out.println(s1);
    }
}

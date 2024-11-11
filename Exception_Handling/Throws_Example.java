package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ThrowTest{
     void m1() throws IOException{
      m2();
    }
    void m2() throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(":D/"));
    }
}
public class Throws_Example {
    public static void main(String[] args) throws IOException {
        ThrowTest t = new ThrowTest();
        t.m1();
    }

}

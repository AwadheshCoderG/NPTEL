package NPTEL;

import java.io.FileInputStream;

public class Demonstration_124 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/testout.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

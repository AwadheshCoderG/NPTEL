package NPTEL;

import java.io.FileOutputStream;

public class Demonstration122a {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:/Users/ankesh/Desktop/WebProject/test.txt");
            fout.write(65);
            fout.write(90);
            fout.close();
            System.out.println("File writing is over...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

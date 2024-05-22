/* Example of BufferedOutputStream class for writing into a file. */

package NPTEL;
import java.io.*;
public class Demonstration_129 {
    public static void main(String[] args) {
        try{


        FileOutputStream  fout = new FileOutputStream("C:/Users/ankesh/Desktop/WebProject/out2.dat");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to AICTE!";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}

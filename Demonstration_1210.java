/* Example java BufferedInputStream for reading from a file */

package NPTEL;
import java.io.*;
public class Demonstration_1210 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/out2.dat");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i = bin.read()) != -1){
                System.out.print((char) i);
            }
            bin.close();
            fin.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

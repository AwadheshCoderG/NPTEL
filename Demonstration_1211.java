/* Java SequenceInputStream Example : Reading sequence of files */

package NPTEL;
import java.io.*;
public class Demonstration_1211 {
    public static void main(String[] args) throws Exception {
        FileInputStream input1 = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/out1.dat");
        FileInputStream input2 = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/out2.dat");

        SequenceInputStream inst = new SequenceInputStream(input1, input2);

        int j;
        while((j = inst.read()) != -1){
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}

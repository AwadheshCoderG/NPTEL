/* Copying a file into another file using ByteStream Class */

package NPTEL;
import java.io.*;
public class Demonstration_128 {
    public static void main(String[] args) {
        // Declare inout and output file stream
        FileInputStream inFile = null;  // Input Stream
        FileOutputStream outFile = null;  // Output Stream

        byte byteRead; // Declare a variable to hold the file

        try{
            // Connect file to input.dat
            inFile = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/input1.dat");
            // Connect outFile to out.dat
            outFile = new FileOutputStream("C:/Users/ankesh/Desktop/WebProject/out1.dat");

            // Reading byte from input1.dat and writing to out1.dat
            byteRead = (byte)inFile.read();
            while(byteRead != -1){
                outFile.write(byteRead);
                byteRead = (byte)inFile.read();
            }
        }
        catch(FileNotFoundException ioe){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

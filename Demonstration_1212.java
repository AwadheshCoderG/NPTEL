package NPTEL;

import java.io.*;

public class Demonstration_1212 {
    public static void main(String[] args) throws Exception {
        // Declare File Stream
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        // Declare file3 to store combined files
        SequenceInputStream file3 = null;

        // Open the files to be concatenated
        file1 = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/out1.dat");
        file2 = new FileInputStream("C:/Users/ankesh/Desktop/WebProject/out2.dat");

        file3 = new SequenceInputStream(file1, file2); // Concatenate file1, file2

        // Create buffered input and output stream
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

        // Read and write till the end of buffers
        int ch;
        while((ch = inBuffer.read()) != -1){
            outBuffer.write((char) ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
    }
}

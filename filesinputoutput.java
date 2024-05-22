package NPTEL;

import java.io.*;

class filesinputoutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream obj = new FileInputStream("inputoutput.java");
        System.out.print(obj.available());
        obj.close();
    }
}

package NPTEL;

import java.io.*;


public class Demonstration_127 {
    public static void main(String args[]) {
        // Declare and create input and output files
        File inFile = new File("C:/Users/ankesh/Desktop/WebProject/input.dat");
        File outFile = new File("C:/Users/ankesh/Desktop/WebProject/output.dat");
        FileReader ins = null; // Create file stream ins
        FileWriter outs = null; // Create file stream outs
        try {
            ins = new FileReader(inFile);
            // Opens infile
            outs = new FileWriter(outFile);
            // opens outFiles
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            // close files
            try {
                ins.close();
                outs.close();

            } catch (IOException e) { }
        }
    }
}


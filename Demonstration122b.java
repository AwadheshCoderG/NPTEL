package NPTEL;

import java.io.FileOutputStream;

public class Demonstration122b {
    public static void main(String[] args) {
        byte cities[] = {'M','U','M','B','A','I',' ','D','E','L','H','I',' ','N','O','I','D','A','\n'};
        FileOutputStream outFile = null;
        try{
            outFile = new FileOutputStream("C:/Users/ankesh/Desktop/WebProject/Cities.txt");
            outFile.write(cities);
            outFile.close();
        }
        catch(Exception ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}

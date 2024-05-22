package NPTEL;
import java.io.FileOutputStream;
public class Demonstration_123 {
    public static void main(String[] args) {
        try{
           FileOutputStream outFile = new FileOutputStream("C:/Users/ankesh/Desktop/WebProject/testout.txt");
           String s = "Welcome to NPTEL! Hope you are enjoying the programming.";
           byte b[] = s.getBytes();  // Converting string into byte array
           outFile.write(b);
           outFile.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

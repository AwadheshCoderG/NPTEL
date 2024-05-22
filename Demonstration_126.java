package NPTEL;

import java.io.*;

public class Demonstration_126 {
    public static void getPath(File f) throws IOException {
        System.out.println("Name : " + f.getName() );
        System.out.println("Path : " + f.getPath() );
        System.out.println("Parent : " + f.getParent() );
    }

    public static void getInfo (File f) throws IOException {
        if (f.exists()){
            System.out.println("File exists ");
            System.out.println(f.canRead() ? "and is readable" : " ");
            System.out.println(f.canWrite() ? "and is writable" : " ");
            System.out.println("File is last modified: "+ f.lastModified());
            System.out.println("File is " + f.length() + "Bytes");
        }
        else{
            System.out.println("File does not exist.");
        }
    }

    public static void main(String args[]) throws IOException {
        File fileToCheck;
        if (args.length > 0){
            for(int i = 0 ; i < args.length; i++){
                fileToCheck = new File(args[i]);
                getPath(fileToCheck);
                getInfo(fileToCheck);
            }
        }
        else{
            System.out.println("Usage : java file test < filename (s) >");
        }
    }
}

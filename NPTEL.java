package NPTEL;
import java.net.*;
public class NPTEL {
    public static void main(String[] args) {
       try{
           InetAddress address = InetAddress.getByName("google.com");
           System.out.println("Host Name: "+ address.getHostName());
           System.out.println("IP Address: "+ address.getHostAddress());
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}

package NPTEL;
import java.sql.*;
public class Connect {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/Test";
            Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection established");
        }
        catch(Exception e){
            System.out.println("Cannot connect to database server"+ e);
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("Database connection terminated");
                }
                catch(Exception e){
                    /* ignore close errors */
                }
            }
        }
    }
}

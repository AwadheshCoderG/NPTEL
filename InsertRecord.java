package NPTEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/Java";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("insert into javaCourse values (04, 'Akash', 77, 'A')");
            stmt.execute("insert into javaCourse values (02, 'Rajiv', 85, 'EX')");
            stmt.execute("insert into javaCourse values (03, 'Sneha', 65, 'B')");
            stmt.execute("insert into javaCourse values (05, 'Anjali', 70, 'A')");

        }
        catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

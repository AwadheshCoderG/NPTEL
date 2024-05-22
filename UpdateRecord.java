package NPTEL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class UpdateRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString;
        try{
            String userName = "root";
            String password = "coder_g";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("update javaCourse set marks = 75, Grade = 'A' where Name = 'Rajiv'");

        }
        catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLStates: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

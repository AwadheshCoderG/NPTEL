package NPTEL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DeleteRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString;
        try{
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/Java";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("Delete from javaCourse where marks < 66");

        /*    stmt.execute("insert into javaCourse values(09, 'Sneha', 91, 'Ex')");
            stmt.execute("insert into javaCourse values(04, 'Priya', 55, 'C')");
            stmt.execute("insert into javaCourse values(06, 'Mukesh', 92, 'Ex')");
            stmt.execute("insert into javaCourse values(07, 'Anant', 95, 'Ex')");
            stmt.execute("insert into javaCourse values(10, 'Radhika', 71, 'A')");
            stmt.execute("insert into javaCourse values(11, 'Sanjana', 67, 'B')");
            stmt.execute("insert into javaCourse values(13, 'Sakshi', 98, 'Ex')");
            stmt.execute("insert into javaCourse values(12, 'Mangesh', 69, 'B')");
            stmt.execute("insert into javaCourse values(14, 'Kiran', 40, 'D')");
            stmt.execute("update javaCourse set Grade = 'Ex' where name = 'Akash'");  */
        }
        catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLStates: " + ex.getSQLState());
            System.out.println("SQLError: " + ex.getErrorCode());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

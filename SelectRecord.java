package NPTEL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SelectRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString;
        int TotalMarks = 0, Num_Student = 0;
        float Avg_Marks;

        try{
            String userName = "root";
            String password = "coder_g";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("SELECT * FROM javaCourse");
            rs = stmt.getResultSet();
            System.out.println("\n\n________________ Results ________________");

            while(rs.next()){
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                TotalMarks = TotalMarks + Integer.parseInt(MarksString);
                System.out.println("Name: " + NameString + "\t\t" + "Roll: " + RollString + "\t\t" + "Marks: " + MarksString +"\t\t" + "Grade: " + GradeString + "\n");
            } // end while
            rs.last();
            Num_Student = rs.getRow();
            Avg_Marks = TotalMarks / Num_Student;
            System.out.println("\n\n________________ Average Marks = " + Avg_Marks + " ________________");
        }
        catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
        catch(Exception e){
            System.out.println("Cannot connect to database server");
        }
        finally{
            if(rs != null){
                try{
                    rs.close();
                }
                catch(SQLException sqlEx){ }
                rs = null;
            }
        }
    }
}

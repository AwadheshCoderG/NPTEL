package NPTEL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InsertRecordB {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String RollString, NameString, MarksString, GradeString;
        try{
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/Java";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("Select * from javaCourseNew");
            rs = stmt.getResultSet();
            System.out.println("\n\n_____________________Result Before Insert___________________\n");
            while(rs.next()){
                RollString = rs.getString("Roll");
                NameString = rs.getString("Name");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: "+NameString+"\t\t"+"Roll: "+RollString+"\t\t"+"Marks: "+MarksString+"\t\t"+"Grade: "+GradeString+"\n");
            }  //end while

            stmt.execute("Insert into javaCourseNew values(1, 'Ankit', 90, 'EX')");
            stmt.execute("Insert into javaCourseNew values(2, 'Sarika', 95, 'EX')");
            stmt.execute("Insert into javaCourseNew values(3, 'Radhika', 56, 'B')");
            stmt.execute("Insert into javaCourseNew values(4, 'Suresh', 67, 'B')");
            stmt.execute("Insert into javaCourseNew values(5, 'Omkar', 74, 'A')");

            stmt.execute("Select * from javaCourseNew");
            rs = stmt.getResultSet();
            System.out.println("_________________________Result After Insert_____________________\n");
            while(rs.next()){
                RollString = rs.getString("Roll");
                NameString = rs.getString("Name");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: "+NameString+"\t\t"+"Roll: "+RollString+"\t\t"+"Marks: "+MarksString+"\t\t"+"Grade: "+GradeString+"\n");
            }  // end while
        }
        catch(SQLException ex){
            System.out.println("SQLException: "+ ex.getMessage());
            System.out.println("SQLState: "+ ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(Exception e){
            System.out.println("Can not connect to database server");
        }
    }
}

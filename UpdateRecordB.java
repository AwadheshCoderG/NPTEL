package NPTEL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class UpdateRecordB {
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
            stmt.execute("Select * from javaCourseNew");
            rs = stmt.getResultSet();
            System.out.println("\n\n___________________________Result Before Update___________________________");
            while(rs.next()){
                RollString = rs.getString("Roll");
                NameString = rs.getString("Name");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: "+NameString+"\t\t"+"Roll: "+RollString+"\t\t"+"Marks: "+MarksString+"\t\t"+"Grade: "+GradeString+"\n");
            }

            stmt.execute("update javaCourseNew set name = 'Tarika' where name = 'Sarika'");
            stmt.execute("Select * from javaCourseNew");
            rs = stmt.getResultSet();
            System.out.println("\n\n________________________Result After Update___________________________");
            while(rs.next()){
                RollString = rs.getString("Roll");
                NameString = rs.getString("Name");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: "+NameString+"\t\t"+"Roll: "+RollString+"\t\t"+"Marks: "+MarksString+"\t\t"+"Grade: "+GradeString+"\n");
            }
        }
        catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: "+ ex.getSQLState());
            System.out.println("VendorError: "+ex.getErrorCode());
        }
        catch(Exception e){
            System.out.println("Can not connect to database server");
        }
        finally{
            if(rs != null){
                try{
                    rs.close();
                }
                catch(SQLException sqlex){ }
                rs = null;
            }

            if(stmt != null){
                try{
                    stmt.close();
                }catch(SQLException sqlex){ }
                stmt = null;
            }

            if(conn != null){
                try{
                    conn.close();
                    System.out.println("Database connection terminated");
                }
                catch(Exception e){ }
            }
    }
}
}

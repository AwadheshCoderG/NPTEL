package NPTEL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


public class NewTable {
    public static void main(String[] args) {


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString, TableName;
        try {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/Java";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("show tables");
            rs = stmt.getResultSet();
            System.out.println("Result before creating the table");
            while (rs.next()) {
                TableName = rs.getString(1);
                // To create table having name javaCourse
                System.out.println("Table name: " + TableName + "\n");
            }
            stmt.execute("create table javaCourseNew( Roll Integer primary key, Name Varchar(30), Marks Integer, Grade Varchar(2))");
            stmt.execute("show tables");
            rs = stmt.getResultSet();
            System.out.println("Result after creating the table\n");
            while (rs.next()) {

                TableName = rs.getString(1);
                System.out.println("Table Name: " + TableName + "\n");
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("Can not connect to database server");
        } finally {
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

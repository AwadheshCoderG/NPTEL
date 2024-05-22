package NPTEL;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String tableName;
        try{
            String userName = "root";
            String password = "coder_g";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            // creating table
            stmt.execute("create table javaCourse (Roll Integer primary key, Name Varchar(30), Marks Integer, Grade Varchar(2))");
        }
        catch(SQLException ex){
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError : " + ex.getErrorCode());
        }
        catch(Exception e){

        }
    }

}

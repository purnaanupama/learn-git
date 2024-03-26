
package Model;

import java.sql.*;
import javax.swing.*;


public class DatabaseConnection {
    private static Connection conn;
    private static String url = "jdbc:mysql://localhost:3306/SalonManagementSystem";
    private static String username = "root";
    private static String password = "pass";
    public static Connection getConnection() throws SQLException{
       try
       {
         conn = DriverManager.getConnection(url,username,password);
       }
       catch(SQLException ex){
       JOptionPane.showMessageDialog(null,"SQL error : "+ex.getMessage());
       }
      return conn;  
    }
}
 


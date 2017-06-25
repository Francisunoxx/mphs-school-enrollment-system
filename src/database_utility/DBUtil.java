
package database_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/enrollmentdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
     
     public static Connection getConnection(DBType dbType) throws SQLException
     {
         return DriverManager.getConnection(URL, USERNAME, PASSWORD);
     }
     
     public static void processException(SQLException ex){
         System.err.println("Error message: "+ex.getMessage());
         System.err.println("Error code: "+ex.getErrorCode());
         System.err.println("SQL State: "+ex.getSQLState());
     }
}
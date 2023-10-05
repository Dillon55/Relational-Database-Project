
package GUIAssignment2;

import java.sql.*;
import static GUIAssignment2.DBQueries.url;

public class DbConnection {
    Connection conn = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection Found");
            return conn;
        }
        catch(Exception e){
            System.out.println("Connection Failed" + e);
            return null;
        }
    }
    
    
}

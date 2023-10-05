package GUIAssignment2;

import java.sql.*; 

public class DBQueries {
 
    public static String url = "jdbc:sqlite:c:/mydb/Dddillon4.db";
    
    static String count(){
        String x = null; // string value to be returned from method call
        //try and make a connection to the DB using the gloabal URL variable
       
        try (Connection conn = DriverManager.getConnection(url)){
          String count = "SELECT COUNT(*) FROM cars"; //string query called count
          //Statement – Used to execute string-based SQL queries
          Statement st1 = conn.createStatement();
          ResultSet rs1 = st1.executeQuery(count);
          while (rs1.next()) //rs is result set, use while to iterate through it
          {
            String mycount = rs1.getString(1); //get string from location 1 in RS
            x = mycount; // assign string from location 1 in RS to x
          } //end while
          st1.close(); 
        } //end try catch
        catch (Exception e)
        {
          System.err.println("Got an exception! "); 
          System.err.println(e.getMessage()); 
        }
        return x; // value to be returned from method call
    } //end count method
   
 



    static String average(){  
    String x = null; 
       
        try (Connection conn = DriverManager.getConnection(url)){
          String avg = "SELECT AVG(costout) FROM cars"; 
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(avg);
          while (rs2.next()) 
          {
            String itemavg = rs2.getString(1);
            x = itemavg;
          }
          st2.close(); 
        }
        catch (Exception e)
        {
          System.err.println("Got an exception! "); 
          System.err.println(e.getMessage());
        }
        return x; // value to be returned from method call
    }//end average method

    static String average2(){  
    String x = null;
        try (Connection conn = DriverManager.getConnection(url)){
          String avg2 = "SELECT AVG(costin) FROM cars"; 
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(avg2);
          while (rs2.next()) 
          {
            String itemavg2 = rs2.getString(1); 
            x = itemavg2; 
          }
          st2.close(); 
        }
        catch (Exception e)
        {
          System.err.println("Got an exception! "); 
          System.err.println(e.getMessage());
        }
        return x; 
    }//end average method
    
    static String average3(){  
    String x = null;
        try (Connection conn = DriverManager.getConnection(url)){
          String avg3 = "SELECT AVG(tax) FROM cars"; 
          Statement st2 = conn.createStatement();
          ResultSet rs2 = st2.executeQuery(avg3); 
          while (rs2.next()) 
          {
            String itemavg3 = rs2.getString(1); 
            x = itemavg3; 
          }
          st2.close(); 
        }
        catch (Exception e)
        {
          System.err.println("Got an exception! "); 
          System.err.println(e.getMessage());
        }
        return x; // 
    }//end average method
    
} //end DBQueries class

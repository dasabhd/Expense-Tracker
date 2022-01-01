package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The type Cp.
 */
public class CP {

    /**
     * The Con.
     */
    Connection con;

    /**
     * Create connection connection.
     *
     * @return the connection
     * @throws SQLException the sql exception
     */
    public Connection createConnection() throws SQLException {

         //load the driver
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
         }catch (Exception e){
             System.out.println("There is a connection problem while connecting with" +
                     "Database! Please check Database Connection");
         }

         //create connection
         String url = "jdbc:mysql://localhost:3306/expense_tracker";
         String user = "root";
         String password = "root";

         con = DriverManager.getConnection(url,user,password);

          return con;
     }

}

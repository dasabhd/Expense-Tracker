package Utilities;

import java.io.IOException;
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
    public Connection createConnection() throws SQLException, IOException {

         //load the driver
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
         }catch (Exception e){
             System.out.println("There is a connection problem while connecting with" +
                     "Database! Please check Database Connection");
         }

         //create connection
        ReadPropertiesFile rp = new ReadPropertiesFile();
         rp.readProperties();

         String url = rp.getUrl();
         String user = rp.getUser();
         String password = rp.getPassword();

         con = DriverManager.getConnection(url,user,password);

          return con;
     }

}

package Utilities;

import java.sql.Connection;

public class CP {

     Connection con;

     public Connection createConnection(){

         //load the driver
         try{
              Class.forName("com.mysql.jdbc.Driver");
         }catch (Exception e){
             System.out.println("There is a connection problem while connecting with" +
                     "Database! Please check Database Connection");
         }

         //create connection
         ReadPropertiesFile prop = new ReadPropertiesFile();
         String url = prop.getUrl();
         String user = prop.getUser();
         String password = prop.getPassword();

          return con;
     }

}

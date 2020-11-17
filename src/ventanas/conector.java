
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;


public class conector {
    
    Connection con = null;
    
     public static Connection ConnecrDb(){
        
        try{
           Class.forName("org.sqlite.JDBC");

           Connection con = DriverManager.getConnection("jdbc:sqlite:./db/acitssna.db");
           return con;
        
        }catch(Exception e){
           System.err.println("No se ha podido conectar a la base de datos");
           return null;
        }
    }
    
                       }

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jsm college
 */
public class ConnectString {
     public Connection con=null;
      public static Connection ConnectDb()
               {
          try
          {

//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            Connection con =DriverManager.getConnection("jdbc:odbc:Driver={SQL Server};server=(local);Database=Bakery");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bakery", "root", "root");
            return con;
          }
         catch(Exception e)
         {
            JOptionPane.showMessageDialog(null, e);
            return null;
         }
    }
    
}


package ConnectionProvider;

import java.sql.*;
import javax.swing.*;

public class connectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
        public static void main(String[] args)
        {
            
            connectionProvider obj=new connectionProvider();
            Connection c = obj.getCon();
        }
    
    
}

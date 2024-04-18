package fyproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Mansoor Afzal
 */
public class FYProject {
     static Connection con = null;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {


    }

public static Connection db()
    {
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String conn = "jdbc:sqlserver://localhost:1433; databaseName=elb; user=obaid; password=0333";
           con = DriverManager.getConnection(conn);
           //JOptionPane.showMessageDialog(null, "Connection Established");
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return con;
    }
}

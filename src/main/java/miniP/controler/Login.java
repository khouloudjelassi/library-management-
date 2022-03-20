package miniP.controler;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {
    public static boolean Log(String log,String ps) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where login=? and password=?");
            select.setString(1, log);
            select.setString(2, ps);
            ResultSet rs =select.executeQuery();
            
                boolean b=false;
                rs.next();
                if(rs.isFirst())
                    b= true;
                System.out.println(b);
                return b;
          
               
         
        
    }
     public static boolean Log2(String log) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where login=? ");
            select.setString(1, log);
        
            ResultSet rs =select.executeQuery();
            
                boolean b=false;
                rs.next();
                if(rs.isFirst())
                    b= true;
                System.out.println(b);
                return b;
          
               
         
        
    }
         
         
}


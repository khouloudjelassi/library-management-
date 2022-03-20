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

public class recuperer {
    public static boolean ID(String id) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from product where idP=?");
            select.setString(1, id);
          
            ResultSet rs =select.executeQuery();
            
                boolean b=false;
                rs.next();
                if(rs.isFirst())
                    b= true;
                System.out.println(b);
                return b;
          
               
         
        
    }}
    
   

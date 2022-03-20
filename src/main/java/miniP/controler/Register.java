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

public class Register {
    
    public static boolean RegisterLog(String log) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where login=?");
            select.setString(1, log);
            ResultSet rs =select.executeQuery();
            
                boolean b=true;
                rs.next();
                if(rs.isFirst())
                    b= false;
                System.out.println(b);
                return b;
    }
    
        public static boolean RegisterPass(String pass) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where password=?");
            select.setString(1, pass);
            ResultSet rs =select.executeQuery();
            
                boolean b=true;
                rs.next();
                if(rs.isFirst())
                    b= false;
                System.out.println(b);
                return b;
    }
  
    public static boolean RegisterEmail(String mail) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where email=?");
            select.setString(1, mail);
            ResultSet rs =select.executeQuery();
            
                boolean b=true;
                rs.next();
                if(rs.isFirst())
                    b= false;
                System.out.println(b);
                return b;
    }
    
    
        public static boolean RegisterNum(int phone) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
            select = con1.prepareStatement("select * from client where num=?");
            select.setInt(1, phone);
            ResultSet rs =select.executeQuery();
            
                boolean b=true;
                rs.next();
                if(rs.isFirst())
                    b= false;
                System.out.println(b);
                return b;
    }
        
        
        public static void register(String log,String pass,String mail,String add,int num) throws ClassNotFoundException, SQLException{
        Connection con1;
        PreparedStatement select;
         File lien=null;
         String lienFichier ="";
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String passw = "";
            con1 = DriverManager.getConnection(url, username, passw);
            
             PreparedStatement insert = con1.prepareStatement("insert into client(login,password,adresse,num,email)values(?,?,?,?,?)");
            insert.setString(1, log);
            insert.setString(2, pass);
            insert.setString(3, add);
            insert.setInt(4, num);
            insert.setString(5, mail);
            insert.executeUpdate();
            
                
                
    }
        
        
             
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mefta
 */
public class ProductBd {
        public static ResultSet allProducts() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from product order by name");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
public static ResultSet allCategory() throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from category order by nameC");
           ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }
public static ResultSet allProductsByCategory(String cat) throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from product where category=? order by name");
                select.setString(1, cat);
                ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }

public static ResultSet allProductsByName(String filterName) throws ClassNotFoundException, SQLException{
            int c;
            
            Class.forName("com.mysql.cj.jdbc.Driver");   

            String url = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
                Connection con1 = DriverManager.getConnection(url, username, password);
           
                PreparedStatement select = con1.prepareStatement("select * from product where name LIKE ? order by name");
                select.setString(1, "%"+filterName+"%");
                ResultSet rs =select.executeQuery();
          return rs;
            
            
         
        
        }



}

        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniP.view;

import java.awt.Color;
import java.io.File;
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
import miniP.model.Product;
import miniP.model.User;
import miniP.model.globalUserLogin;
import miniP.model.validMail;

/**
 *
 * @author mefta
 */
public class bibliotacaire extends javax.swing.JFrame {
Product p = new Product();


         
         String dataConn = "jdbc:mysql://localhost:3306/bibliotheque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            String username = "root";
            String password = "";
            
            Connection sqlConn=null;
            PreparedStatement pst =null;
            ResultSet rs =null;
            int q,i,id,deletItem;
    /**
     * Creates new form Browse_Product
     */
    public bibliotacaire() throws ClassNotFoundException, SQLException {
        initComponents();
        upDateDB();
    
         
    }
    
    public void upDateDB() throws ClassNotFoundException, SQLException{
      
       
         Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
           pst =sqlConn.prepareStatement("select * from product");
           
           
         rs=pst.executeQuery();
         ResultSetMetaData stData=rs.getMetaData();
         q=stData.getColumnCount();
       
            DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            while(rs.next()){
                Vector ColumnData = new Vector();
                for(i=1;i<=q;i++){
                    ColumnData.add(rs.getString("idP"));
                    ColumnData.add(rs.getString("name"));
                    ColumnData.add(rs.getString("category"));
                    ColumnData.add(rs.getString("price"));
                    ColumnData.add(rs.getString("description"));
                    ColumnData.add(rs.getString("amount"));
                    ColumnData.add(rs.getString("idV"));
                    
                }
                RecordTable.addRow(ColumnData);
            }
         
           
    }
public void showtableData(){


}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane = new javax.swing.JOptionPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        idP = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        description = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idV = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        codeAlerte = new javax.swing.JLabel();
        idAlerte = new javax.swing.JLabel();
        nomAlerte = new javax.swing.JLabel();
        categorieAlerte = new javax.swing.JLabel();
        prixAlerte = new javax.swing.JLabel();
        typeAlerte = new javax.swing.JLabel();
        nbrAlerte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Browse Products");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1051, 665));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(780, 640));
        jPanel3.setMinimumSize(new java.awt.Dimension(780, 640));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 30, 19));

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 215, 30, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 237, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 543, -1, -1));

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 1, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bibliothèque");
        jLabel17.setAlignmentX(114.0F);
        jLabel17.setAlignmentY(50.0F);
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        idP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idPFocusLost(evt);
            }
        });
        idP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPActionPerformed(evt);
            }
        });
        jPanel3.add(idP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 190, 30));

        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 190, 30));

        category.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                categoryFocusLost(evt);
            }
        });
        jPanel3.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, 30));

        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceFocusLost(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 190, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("nom");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 40, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("categorie ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("prix");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 1, 25)); // NOI18N
        jLabel18.setText("Gestion des objets à emprunter");
        jLabel18.setAlignmentX(114.0F);
        jLabel18.setAlignmentY(50.0F);
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 380, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 80, -1));

        description.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descriptionFocusLost(evt);
            }
        });
        jPanel3.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 190, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Code a barre ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 40, -1));

        idV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idVFocusLost(evt);
            }
        });
        jPanel3.add(idV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 190, 30));

        amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountFocusLost(evt);
            }
        });
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 190, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("nombre disponible");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 170, 20));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Liste des reservation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("Deconnecter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titre", "Categorie", "Prix", "Genre", "nbr dispo", "code"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 147, 530, 360));

        codeAlerte.setText(" ");
        jPanel3.add(codeAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 20, -1));

        idAlerte.setText(" ");
        jPanel3.add(idAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 20, -1));

        nomAlerte.setText(" ");
        jPanel3.add(nomAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 20, -1));

        categorieAlerte.setText(" ");
        jPanel3.add(categorieAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 20, -1));

        prixAlerte.setText(" ");
        jPanel3.add(prixAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 20, -1));

        typeAlerte.setText(" ");
        jPanel3.add(typeAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 20, -1));

        nbrAlerte.setText(" ");
        jPanel3.add(nbrAlerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
        


         

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

    }//GEN-LAST:event_jLabel22MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 DefaultTableModel RecordTable =(DefaultTableModel)jTable1.getModel();
            int selectedRows =jTable1.getSelectedRow();
        
        try {
        id=Integer.parseInt(RecordTable.getValueAt(selectedRows, 0).toString());
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst =sqlConn.prepareStatement("delete from product where idP=?");
        
        pst.setInt(1,id);
        pst.executeUpdate();
        upDateDB();
        idP.setText("");
        name.setText("");
        category.setText("");
        price.setText("");
        description.setText("");
        amount.setText("");
        idV.setText("");
        
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        
     
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst =sqlConn.prepareStatement("insert into product(idP,name,category,price,description,"
                + "amount,idV) values(?,?,?,?,?,?,?)");
        pst.setString(1, idP.getText());
        pst.setString(2, name.getText());
        pst.setString(3, category.getText());
        pst.setString(4, price.getText());
        pst.setString(5, description.getText());
        pst.setString(6, amount.getText());
        pst.setString(7, idV.getText());
        
        pst.executeUpdate();
        jOptionPane.showMessageDialog(this,"done");
        upDateDB();
        
        // TODO add your handling code here:
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {
        bibliotacaire si = new bibliotacaire();
        listeReservation bp = new listeReservation();
        
        si.setVisible(false);
        bp.setVisible(true);
        dispose();        // TODO add your handling code here:
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            globalUserLogin.userLogin="";

            listeReservation c = new listeReservation();
            Sign_In si = new Sign_In();

            c.setVisible(false);
            si.setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(listeReservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(listeReservation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
String nom = name.getText();
        if(nom.length()==0 || validMail.isNumeric(nom) || validMail.isValid(nom)){
                    //jOptionPane.showMessageDialog(this,"nom invalide");

    nomAlerte.setText("!");
           nomAlerte.setForeground(Color.red);
}   
else {nomAlerte.setText("✓");
                    nomAlerte.setForeground(Color.green);}
    }//GEN-LAST:event_nameFocusLost

    private void idPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPFocusLost
 String idp = idP.getText();    
   if(!validMail.isNumeric(idp)){
  idAlerte.setText("!");
   idAlerte.setForeground(Color.red);}
   else {idAlerte.setText("✓");
                    idAlerte.setForeground(Color.green);}
    }//GEN-LAST:event_idPFocusLost

    private void priceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusLost
String prix  = price.getText();
if(!validMail.isNumeric(prix)){
  prixAlerte.setText("!");
   prixAlerte.setForeground(Color.red);}    
else {prixAlerte.setText("✓");
                    prixAlerte.setForeground(Color.green);}// TODO add your handling code here:
    }//GEN-LAST:event_priceFocusLost

    private void descriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descriptionFocusLost
String desc  = description.getText();
        if(desc.length()==0 || validMail.isNumeric(desc) || validMail.isValid(desc)){
  typeAlerte.setText("!");
   typeAlerte.setForeground(Color.red);}   
        else {typeAlerte.setText("✓");
                    typeAlerte.setForeground(Color.green);}// TODO add your handling code here:
    }//GEN-LAST:event_descriptionFocusLost

    private void categoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_categoryFocusLost
      String cat  = category.getText();
        if(cat.length()==0 || validMail.isNumeric(cat) || validMail.isValid(cat)){
  categorieAlerte.setText("!");
   categorieAlerte.setForeground(Color.red);}  
        else {categorieAlerte.setText("✓");
                    categorieAlerte.setForeground(Color.green);}// TODO add your handling code here:
    }//GEN-LAST:event_categoryFocusLost

    private void amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFocusLost
        String nbr = amount.getText();

if(!validMail.isNumeric(nbr)){
  nbrAlerte.setText("!");
   nbrAlerte.setForeground(Color.red);}
else {nbrAlerte.setText("✓");
                    nbrAlerte.setForeground(Color.green);}// TODO add your handling code here:
    }//GEN-LAST:event_amountFocusLost

    private void idVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idVFocusLost
       String code = idV.getText();

if(!validMail.isNumeric(code)){
  codeAlerte.setText("!");
  codeAlerte.setForeground(Color.red);}
else {codeAlerte.setText("✓");
                    codeAlerte.setForeground(Color.green);}// TODO add your handling code here:
    }//GEN-LAST:event_idVFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bibliotacaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bibliotacaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bibliotacaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bibliotacaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new bibliotacaire().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(bibliotacaire.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel categorieAlerte;
    private javax.swing.JTextField category;
    private javax.swing.JLabel codeAlerte;
    private javax.swing.JTextField description;
    private javax.swing.JLabel idAlerte;
    private javax.swing.JTextField idP;
    private javax.swing.JTextField idV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nbrAlerte;
    private javax.swing.JLabel nomAlerte;
    private javax.swing.JTextField price;
    private javax.swing.JLabel prixAlerte;
    private javax.swing.JLabel typeAlerte;
    // End of variables declaration//GEN-END:variables
}

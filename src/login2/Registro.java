/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login2;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.awt.Image;
import java.sql.SQLException;
import java.io.File;
import java.io.InputStream;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FRANCO
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    String imagePath = null;
    
    String imageName = null;
    byte[] image = null;
    
    public Registro() {
        initComponents();
        
        ButtonGroup ButtonGroup = new ButtonGroup();
        ButtonGroup.add(jRBtnMale);
        ButtonGroup.add(jRBtnFemale);
    }

    public ImageIcon ResizeImage(String imagePAth, byte[] pic){
        ImageIcon myImage = null;
        if (imagePath != null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage = new ImageIcon(pic);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(jLabelViewImage.getWidth(), 
                jLabelViewImage.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon image = new ImageIcon(img2);
        
        return image;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jInputPhone = new javax.swing.JTextField();
        jInputPassword = new javax.swing.JPasswordField();
        jConfirmPassword = new javax.swing.JPasswordField();
        jLastName = new javax.swing.JTextField();
        jInputName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jInputFirstName = new javax.swing.JTextField();
        jRBtnMale = new javax.swing.JRadioButton();
        jRBtnFemale = new javax.swing.JRadioButton();
        jBtnViewImage = new javax.swing.JButton();
        jBtnTest = new javax.swing.JButton();
        jBtnAddUser = new javax.swing.JButton();
        jLabelViewImage = new javax.swing.JLabel();
        jLabelTest = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 70, 64, 16);

        jLabel2.setText("FirstName:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 80, 61, 16);

        jLabel3.setText("LastName:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 210, 61, 16);

        jLabel4.setText("Phone:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 210, 39, 16);

        jLabel5.setText("PassWord:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 350, 61, 16);

        jLabel6.setText("Confirm PassWord:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(430, 350, 108, 16);

        jInputPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputPhoneActionPerformed(evt);
            }
        });
        jInputPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jInputPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(jInputPhone);
        jInputPhone.setBounds(430, 240, 120, 28);
        jPanel1.add(jInputPassword);
        jInputPassword.setBounds(80, 370, 100, 28);
        jPanel1.add(jConfirmPassword);
        jConfirmPassword.setBounds(430, 370, 110, 28);
        jPanel1.add(jLastName);
        jLastName.setBounds(80, 230, 120, 28);
        jPanel1.add(jInputName);
        jInputName.setBounds(80, 100, 120, 28);

        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 430, 41, 16);
        jPanel1.add(jInputFirstName);
        jInputFirstName.setBounds(430, 110, 120, 28);

        jRBtnMale.setText("Male");
        jRBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtnMaleActionPerformed(evt);
            }
        });
        jPanel1.add(jRBtnMale);
        jRBtnMale.setBounds(200, 430, 48, 18);

        jRBtnFemale.setText("Female");
        jPanel1.add(jRBtnFemale);
        jRBtnFemale.setBounds(280, 430, 64, 18);

        jBtnViewImage.setText("View Image");
        jBtnViewImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnViewImageActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnViewImage);
        jBtnViewImage.setBounds(90, 510, 92, 28);

        jBtnTest.setText("Test");
        jBtnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTestActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnTest);
        jBtnTest.setBounds(90, 550, 52, 28);

        jBtnAddUser.setText("ADD USER");
        jBtnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddUserActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAddUser);
        jBtnAddUser.setBounds(290, 510, 90, 28);

        jLabelViewImage.setText("jLabel8");
        jPanel1.add(jLabelViewImage);
        jLabelViewImage.setBounds(200, 520, 41, 16);

        jLabelTest.setText("jLabel9");
        jPanel1.add(jLabelTest);
        jLabelTest.setBounds(200, 560, 41, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtnMaleActionPerformed

    private void jBtnViewImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnViewImageActionPerformed
        
        String image_Path;
        
        JFileChooser imageSelecter = new JFileChooser();
        imageSelecter.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter imageExtension = new FileNameExtensionFilter("*.Images", "jpg", "png", "jpeg");
        
        imageSelecter.addChoosableFileFilter(imageExtension);
        
        Integer fileState = imageSelecter.showSaveDialog(null);
        
        //checar si el usuario selecciono algo.
        
        if (fileState == JFileChooser.APPROVE_OPTION){
            File selectedImage = imageSelecter.getSelectedFile();
            image_Path = selectedImage.getAbsolutePath();
            
            jLabelViewImage.setIcon(ResizeImage(imagePath, null));
        }
    }//GEN-LAST:event_jBtnViewImageActionPerformed

    private void jInputPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputPhoneActionPerformed
        
    }//GEN-LAST:event_jInputPhoneActionPerformed

    private void jInputPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInputPhoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jInputPhoneKeyTyped

    private void jBtnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddUserActionPerformed
        String userName = jInputName.getText();
        String firstName = jInputFirstName.getText();
        String lastName = jLastName.getText();
        String password = String.valueOf(jInputPassword.getPassword());
        String confirmPassword = String.valueOf(jConfirmPassword.getPassword());
        String phone = jInputPhone.getText();  
        String gender = "male";
        boolean verifyFields = true;
        boolean checkUser  = true;
        
        if(jRBtnFemale.isSelected()){
            gender = "Female";        
        }
        if (verifyFields()){
            if(!checkUser(userName)){
                PreparedStatement PreparedStatement;
                ResultSet ResultSet;
                
                /*String userQuery = "INSERT INTO 'users'('username', 'firstName', "
                    + "'lastName', 'password', 'gender', 'phone', 'imagen')" + " VALUES(?,?,?,?,?,?,?)"; */               
                String userQuery = "INSERT INTO `users`(`username`, `firstName`,"
                +"`lastName`, `password`, `gender` ,`phone`, `image`)"+"VALUES(?,?,?,?,?,?,?)";

                try{
                    PreparedStatement = sql_connector.getSqlConnection().prepareStatement(userQuery);
                    
                    PreparedStatement.setString(1,userName);
                    PreparedStatement.setString(2,firstName);
                    PreparedStatement.setString(3,lastName);
                    PreparedStatement.setString(4,password);
                    PreparedStatement.setString(5,gender);
                    PreparedStatement.setString(6,phone);
                    PreparedStatement.setNull(7,java.sql.Types.NULL);
                    
                    try{
                        if(imagePath != null){
                            InputStream image = new FileInputStream(new File(imagePath));
                            PreparedStatement.setBlob(7,image);
                        }
                        if (PreparedStatement.executeUpdate() != 0){
                            JOptionPane.showMessageDialog(null,"User Added");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Error check Information");                        }
                    } catch (Exception ex){
                        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }catch(Exception ex){
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jBtnAddUserActionPerformed

    private void jBtnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTestActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        imageName = f.getAbsolutePath();              
            
      //ImageIcon ImageIcon = new ImageIcon(new ImageIcon(imageName).getImage().getScaledInstance(jLabelViewImage.getWidth(),jLabelViewImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon (new ImageIcon(imageName).
                getImage().getScaledInstance(jLabelViewImage.getWidth(), jLabelViewImage.getHeight(), Image.SCALE_SMOOTH));
        
        jLabelViewImage.setIcon(new ImageIcon(f.toString()));
        
        imageName =f.getAbsolutePath();
    }//GEN-LAST:event_jBtnTestActionPerformed
   
    public boolean verifyFields(){
        String userName = jInputName.getText();
        String firstName = jInputFirstName.getText();
        String lastName = jLastName.getText();
        String password = String.valueOf(jInputPassword.getPassword());
        String confirmPassword = String.valueOf(jConfirmPassword.getPassword());
        String phone = jInputPhone.getText();
        
        if(userName.trim().equals("")|| firstName.trim().equals("")|| lastName.trim().equals("")
                || password.trim().equals("")|| confirmPassword.trim().equals("")|| phone.trim().equals("")){
            JOptionPane.showMessageDialog(null, "1", "empty field",2);
            return false;        
        }else if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(null, "password doesn´t match", "enter a matching", 2);
            return false;   
        }else{
        return true;
        }
    }
    
    public boolean checkUser(String userName){
        PreparedStatement PreparedStatement;
        ResultSet ResulSet;
        
        boolean userExist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try{
            PreparedStatement = sql_connector.getSqlConnection().prepareStatement(query);
            PreparedStatement.setString(2, userName);
            ResulSet = PreparedStatement.executeQuery();
            
            if (ResulSet.next());{
                userExist = true;
                JOptionPane.showMessageDialog(null,"el nombre del usuario esta siendo usado, usa otro nombre", "UserNAme Failed",2);
            }            
        }catch (SQLException ex){
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null,ex);
            }
            return userExist;
    }
    
    
    
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddUser;
    private javax.swing.JButton jBtnTest;
    private javax.swing.JButton jBtnViewImage;
    private javax.swing.JPasswordField jConfirmPassword;
    private javax.swing.JTextField jInputFirstName;
    private javax.swing.JTextField jInputName;
    private javax.swing.JPasswordField jInputPassword;
    private javax.swing.JTextField jInputPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTest;
    private javax.swing.JLabel jLabelViewImage;
    private javax.swing.JTextField jLastName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBtnFemale;
    private javax.swing.JRadioButton jRBtnMale;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    // End of variables declaration//GEN-END:variables
}

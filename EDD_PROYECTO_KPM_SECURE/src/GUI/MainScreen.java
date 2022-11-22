/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static LocalFiles.Main.saveUsers;
import LocalFiles.User;
import ManualCollections.KPMDataList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginScreen extends javax.swing.JFrame {

   private KPMDataList<User> users;
    /**
     * Creates new form LoginScreen
     * @param users
     */
    public LoginScreen(KPMDataList<User> users) {
        initComponents();
        setIconImage(new ImageIcon("src/resources/KPMLogo_128.png").getImage());
        this.users=users;
    }

    // Used Methods
    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         SignUpScreen signUpScreen = new SignUpScreen(users);
         signUpScreen.setLocationRelativeTo(null);
         signUpScreen.setVisible(true);
         saveUsers(users);
         dispose();
    }
    
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        for(int i=0; i<users.size(); i++){
            try{
                User user = (User) users.getValueAt(i);
                if(EmailField.getText().equals(user.getEmail()) && PasswordField.getText().equals(user.getPassword())){
                    JOptionPane.showMessageDialog(null, "Sesion iniciada exitosamente","Sesion iniciada con exito",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                
            }
         
            
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KPMLogo = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        EmailField = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        SignUpLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KPM Secure - Inicio de sesión");
        setBackground(new java.awt.Color(62, 63, 66));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(62, 63, 66));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KPMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/KPMLogo_192.png"))); // NOI18N
        getContentPane().add(KPMLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 0, -1, 204));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 318, 234, -1));

        EmailField.setText("Ingresa tu email");
        EmailField.setToolTipText("");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        EmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailFieldKeyTyped(evt);
            }
        });
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 259, 234, -1));

        UserLabel.setText("Correo electronico");
        getContentPane().add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 237, -1, -1));

        PasswordLabel.setText("Contraseña");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 293, -1, -1));

        LoginButton.setText("Iniciar sesión");
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 362, -1, -1));

        SignUpButton.setText("Registrarse");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        SignUpLabel.setText("¿No tienes cuenta? Regístrate aquí ");
        getContentPane().add(SignUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 405, -1, -1));

        Background.setBackground(new java.awt.Color(62, 63, 66));
        Background.setForeground(new java.awt.Color(62, 63, 66));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFieldKeyTyped
            if(EmailField.getText().equals("Ingresa tu email")){
            EmailField.setText("");
        }else if(EmailField.getText().equals("")){
            EmailField.setText("Ingresa tu email");
        }
    }//GEN-LAST:event_EmailFieldKeyTyped

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SignUpScreen().setVisible(true);
//            }
//        });
//    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel KPMLogo;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel UserLabel;
    // End of variables declaration//GEN-END:variables
}

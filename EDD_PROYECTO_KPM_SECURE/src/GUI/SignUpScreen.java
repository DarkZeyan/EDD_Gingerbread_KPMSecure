package GUI;
import LocalFiles.User;
import javax.swing.JOptionPane;
public class SignUpScreen extends javax.swing.JFrame {

    public SignUpScreen() {
        initComponents();
    }

    //Used Methods

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
        if(!PasswordField.getText().equals("") && !UserField.getText().equals("") && !EmailField.equals("")){
            if(PasswordField.getText().equals(VerifyPasswordField.getText())){
                User user1 = new User(UserField.getText(), PasswordField.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else JOptionPane.showMessageDialog(null, "Uno de los campos está vacío","Error",JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
      
    }//GEN-LAST:event_UserFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
      
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void ReturnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnHomeActionPerformed
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setLocationRelativeTo(null);
        loginScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnHomeActionPerformed

    private void UserFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFieldKeyTyped
    //    int key = evt.getKeyChar();
    //     boolean range = key >= 48 && key <=57;
        
    //     if(range){
    //         evt.consume();
    //     }

        if(UserField.getText().equals("Ingresa tu usuario")){
            UserField.setText("");
        }else if(UserField.getText().equals("")){
            UserField.setText("Ingresa tu usuario");
        }


    }//GEN-LAST:event_UserFieldKeyTyped

    private void EmailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFieldKeyTyped
        if(EmailField.getText().equals("Ingresa tu email")){
            EmailField.setText("");
        }else if(EmailField.getText().equals("")){
            EmailField.setText("Ingresa tu email");
        }
    }//GEN-LAST:event_EmailFieldKeyTyped

    //Used Methods


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KPMLogo = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        UserField = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        CreateUserButton = new javax.swing.JButton();
        SignUpCaption = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        VerifyPasswordField = new javax.swing.JPasswordField();
        VerifyPasswordLabel = new javax.swing.JLabel();
        ReturnHome = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KPM Secure - Registro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KPMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/KPMLogo_192.png"))); // NOI18N
        getContentPane().add(KPMLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 0, -1, 204));
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 413, 234, -1));

        UserField.setText("Ingresa tu usuario");
        UserField.setToolTipText("");
        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });
        UserField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserFieldKeyTyped(evt);
            }
        });
        getContentPane().add(UserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 295, 234, -1));

        UserLabel.setText("Usuario");
        getContentPane().add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 273, -1, -1));

        PasswordLabel.setText("Contraseña");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 391, -1, -1));

        CreateUserButton.setText("Crear nuevo usuario");
        CreateUserButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 516, -1, -1));

        SignUpCaption.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SignUpCaption.setText("¡Bienvenido a KPM Secure! Por favor, introduce tus datos.");
        getContentPane().add(SignUpCaption, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 210, -1, -1));

        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 329, -1, -1));

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
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 351, 234, -1));
        getContentPane().add(VerifyPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 463, 234, -1));

        VerifyPasswordLabel.setText("Repite tu contraseña");
        getContentPane().add(VerifyPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 441, -1, -1));

        ReturnHome.setText("Volver al inicio");
        ReturnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReturnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 564, 136, -1));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel KPMLogo;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton ReturnHome;
    private javax.swing.JLabel SignUpCaption;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JPasswordField VerifyPasswordField;
    private javax.swing.JLabel VerifyPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
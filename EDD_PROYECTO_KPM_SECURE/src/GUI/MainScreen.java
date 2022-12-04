/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import LocalFiles.Account;
import static LocalFiles.Main.saveUsers;
import LocalFiles.User;
import ManualCollections.KPMDataList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MainScreen extends javax.swing.JFrame {

   private KPMDataList<User> users;
   private User user;
   
 private KPMDataList<Account> cuentas;
    /**
     * Creates new form LoginScreen
     * @param user
     * @param users
     */
    public MainScreen(User user, KPMDataList<User> users) {
            
            initComponents();
            setIconImage(new ImageIcon("src/resources/KPMLogo_128.png").getImage());           
            this.user=user;
            this.users=users;
            WelcomeLabel.setText("Bienvenido a KPM Secure "+user.getUsername());
            cuentas=user.getAccounts();
            fillTable(cuentas);
            WindowListener exitListener = new WindowAdapter() {

    @Override
        public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showOptionDialog(null, "¿Desea cerrar la aplicacion?", 
             "Confirmacion de salida", JOptionPane.YES_NO_OPTION, 
             JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/resources/KPMLogo_128.png"), null, null);
        if (confirm == 0) {
           saveUsers(users);
           System.exit(0);
        }
    }
};
            addWindowListener(exitListener);
    }

    private void fillTable(KPMDataList<Account> cuentas){
        if(cuentas!=null){
            for(int i=0; i<cuentas.size(); i++){
                try{
                    Account cuenta = (Account)cuentas.getValueAt(i);
                    Vector v = new Vector();
                    v.add(cuenta.getEmail());
                    v.add(cuenta.getAlias());
                    v.add(cuenta.getPassword());
                    DefaultTableModel dt = (DefaultTableModel) Tabla.getModel();
                    dt.addRow(v);
                }catch(Exception e){

                }
             
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KPMLogo = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        contraseñaTextField = new javax.swing.JTextField();
        añadirBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KPM Secure - Pantalla principal");
        setBackground(new java.awt.Color(62, 63, 66));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(62, 63, 66));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KPMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/KPMLogo_128.png"))); // NOI18N
        getContentPane().add(KPMLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, -20, -1, 204));

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
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 234, -1));

        UserLabel.setText("Correo electronico");
        getContentPane().add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        PasswordLabel.setText("Usuario");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, 20));

        WelcomeLabel.setText("Bienvenido a KPM Secure");
        getContentPane().add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 290, -1));

        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, -1));

        Contraseña.setText("Contraseña");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, 20));

        contraseñaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(contraseñaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 230, -1));

        añadirBtn.setText("Añadir");
        añadirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(añadirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        modificarBtn.setText("Guardar cambios");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 410, 310));

        Background.setBackground(new java.awt.Color(62, 63, 66));
        Background.setForeground(new java.awt.Color(62, 63, 66));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFieldKeyTyped
         
    }//GEN-LAST:event_EmailFieldKeyTyped

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        int fila = Tabla.getSelectedRow();
        if(fila>=0){
            try {
                Account cuenta = (Account)cuentas.getValueAt(fila);
                cuenta.setEmail(Tabla.getValueAt(fila, 0).toString());
                cuenta.setAlias(Tabla.getValueAt(fila, 1).toString());
                cuenta.setPassword(Tabla.getValueAt(fila, 2).toString());
                JOptionPane.showMessageDialog(null, "Datos modificados correctamente", "Tarea exitosa", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {}
        }else {JOptionPane.showMessageDialog(null, "Seleccione una casilla a modificar", "Campo vacio", JOptionPane.ERROR_MESSAGE);}
        
        
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void contraseñaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaTextFieldActionPerformed

    private void añadirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBtnActionPerformed
        Account cuenta = new Account(EmailField.getText(), usuarioTextField.getText(), contraseñaTextField.getText());
        Vector v = new Vector();
        v.add(EmailField.getText());
        v.add(usuarioTextField.getText());
        v.add(contraseñaTextField.getText());
        
        cuentas.add(cuenta);
        DefaultTableModel dt = (DefaultTableModel) Tabla.getModel();
        dt.addRow(v);
    }//GEN-LAST:event_añadirBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        int row = Tabla.getSelectedRow();
        if(row>=0){
            DefaultTableModel dt = (DefaultTableModel) Tabla.getModel();
            dt.removeRow(row);
            try {         
                cuentas.deleteAt(row+1);
            } catch (Exception e) {}
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la casilla a eliminar", "Campo inválido",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

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
    private javax.swing.JLabel Contraseña;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel KPMLogo;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JButton añadirBtn;
    private javax.swing.JTextField contraseñaTextField;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}

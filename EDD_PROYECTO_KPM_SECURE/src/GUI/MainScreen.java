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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import LocalFiles.Sorting.*;
import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            WindowListener exitListener = new WindowAdapter() {
        public void close(){
                String opciones[] = {"Sí","No"};
            
        int confirm = JOptionPane.showOptionDialog(null, "¿Desea cerrar la aplicacion?", 
             "Confirmacion de salida", JOptionPane.YES_NO_OPTION, 
             JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/resources/KPMLogo_128.png"), opciones, opciones[0]);
      
        if (confirm == 0) {
           saveUsers(users);
           System.exit(0);
        }
        }
    @Override
       
        public void windowClosing(WindowEvent e) {
            close();
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
                    v.add(cuenta.getPlatform());
                    v.add(cuenta.getAlias());
                    v.add(cuenta.getPassword());
                    DefaultTableModel dt = (DefaultTableModel) Tabla.getModel();
                    dt.addRow(v);
                  if(i==cuentas.size()-1)  sortTable(cuentas);
                }catch(Exception e){

                }
             
            }
            
        }
    }
    

    public static void sortTable(KPMDataList<Account> cuentas){
        
    }
    // new Comparator(){
    //     @Override
    //     public int compare(Object o1, Object o2) {
    //         return ((Account)o1).getPlatform().compareTo(((Account)o2).getPlatform());
    //     }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KPMLogo = new javax.swing.JLabel();
        platformField = new javax.swing.JTextField();
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
        autogenerarBtn = new javax.swing.JButton();
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

        platformField.setToolTipText("");
        getContentPane().add(platformField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 234, -1));

        UserLabel.setText("Plataforma");
        getContentPane().add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

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
                "Plataforma", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 410, 310));

        autogenerarBtn.setText("Autogenerar");
        autogenerarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autogenerarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(autogenerarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        Background.setBackground(new java.awt.Color(62, 63, 66));
        Background.setForeground(new java.awt.Color(62, 63, 66));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlatformFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlatformFieldKeyTyped
         
    }//GEN-LAST:event_PlatformFieldKeyTyped

    private void PlatformFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatformFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlatformFieldActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        int fila = Tabla.getSelectedRow();
        if(fila>=0){
            try {
                Account cuenta = (Account)cuentas.getValueAt(fila);
                cuenta.setPlatform(Tabla.getValueAt(fila, 0).toString());
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
        if(!contraseñaTextField.getText().equals("")){
            if(platformField.getText().equals("")){
                platformField.setText("Sin especificar");
            }
            if(usuarioTextField.getText().equals("")){
                usuarioTextField.setText("Sin especificar");
            }

            Account cuenta = new Account(platformField.getText(), usuarioTextField.getText(), contraseñaTextField.getText());
            Vector v = new Vector();
            v.add(platformField.getText());
            v.add(usuarioTextField.getText());
            v.add(contraseñaTextField.getText());
            
            cuentas.add(cuenta);
            DefaultTableModel dt = (DefaultTableModel) Tabla.getModel();
            dt.addRow(v);
            TableRowSorter<DefaultTableModel> sort = new TableRowSorter<>(dt);
            Tabla.setRowSorter(sort);

            usuarioTextField.setText("");
            platformField.setText("");
            contraseñaTextField.setText("");
        }else JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña", "datos inválidos",JOptionPane.ERROR_MESSAGE);
        
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

    private void autogenerarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autogenerarBtnActionPerformed
                char[] mayus = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
                char[] minus = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                char[] nums = { '1','2','3','4','5','6','7','8','9','0'};
                char[] operators = {'&','!','@','$','?'};

                StringBuilder chars = new StringBuilder();
                chars.append(mayus);
                chars.append(minus);
                chars.append(nums);
                chars.append(operators);

                StringBuilder password = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    int charLength = chars.length();
                    int randomNumber = (int) (Math.random()*charLength);

                    password.append((chars.toString()).charAt(randomNumber));
                }
                contraseñaTextField.setText(password.toString());
    }//GEN-LAST:event_autogenerarBtnActionPerformed

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
    private javax.swing.JLabel KPMLogo;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JButton autogenerarBtn;
    private javax.swing.JButton añadirBtn;
    private javax.swing.JTextField contraseñaTextField;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTextField platformField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}

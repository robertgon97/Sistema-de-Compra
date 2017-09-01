<<<<<<< HEAD
package VistaGrafica;
//Librerias
import BasedeDatos.SQL; //funciones de la conexion 
import VistaGrafica.MenuPrincipal;//MenuPrincipal
import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    
    void validar(){
        String usuario=txtUsuario.getText();
        String pass=String.valueOf(txtContraseña.getPassword());
        System.out.println(usuario +" "+ pass);
        String sql="select * from USUARIO where usuario='"+usuario+"' and contrasena='"+pass+"' ";
        cnn=SQL.enlace(cnn);
        sta=SQL.declaracion(sta);
         try {
             System.out.println("Entre a una promesa");
             rst=sta.executeQuery(sql);
             if(usuario.equalsIgnoreCase("")|| pass.equalsIgnoreCase("")){
                 JOptionPane.showMessageDialog(null,"Faltan Ingresar Datos"); 
             }else{
                 if(rst.next()){
                    MenuPrincipal General=new MenuPrincipal();
                    General.setVisible(true);
                    this.dispose();
                 }else{
                     JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                     txtUsuario.setText("");
                     txtContraseña.setText("");
                     txtUsuario.requestFocus();
                 }
             }
         }catch (SQLException ex) {
             System.out.println("Error Catch");
             JOptionPane.showMessageDialog(null,"Error de Aplicacion");
         }
    }
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoaplicacion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        BotonEnviar = new javax.swing.JButton();
        TextoContrasena = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JLabel();
        IconoVenture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);

        fondoaplicacion.setBackground(new java.awt.Color(255, 255, 255));
        fondoaplicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        fondoaplicacion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 40));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        fondoaplicacion.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 40));

        BotonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-User Group Man Man-48.png"))); // NOI18N
        BotonEnviar.setText("Iniciar Sesion");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        fondoaplicacion.add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        TextoContrasena.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoContrasena.setText("CONTRASEÑA:");
        fondoaplicacion.add(TextoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 40));

        TextoUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoUsuario.setText("USUARIO:");
        fondoaplicacion.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 40));

        IconoVenture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/venture.jpg"))); // NOI18N
        fondoaplicacion.add(IconoVenture, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoaplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoaplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        validar();
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        
    }//GEN-LAST:event_txtContraseñaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JLabel IconoVenture;
    private javax.swing.JLabel TextoContrasena;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JPanel fondoaplicacion;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
=======
package VistaGrafica;
//Librerias
import BasedeDatos.SQL; //funciones de la conexion 
import VistaGrafica.MenuPrincipal;//MenuPrincipal
import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {
    
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    
    void validar(){
        String usuario=txtUsuario.getText();
        String pass=String.valueOf(txtContraseña.getPassword());
        System.out.println(usuario +" "+ pass);
        String sql="select * from USUARIO where usuario='"+usuario+"' and contrasena='"+pass+"' ";
        cnn=SQL.enlace(cnn);
        sta=SQL.declaracion(sta);
         try {
             System.out.println("Entre a una promesa");
             rst=sta.executeQuery(sql);
             if(usuario.equalsIgnoreCase("")|| pass.equalsIgnoreCase("")){
                 JOptionPane.showMessageDialog(null,"Faltan Ingresar Datos"); 
             }else{
                 if(rst.next()){
                    MenuPrincipal General=new MenuPrincipal();
                    General.setVisible(true);
                    this.dispose();//Cierra esta ventana
                 }else{
                     JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                     txtUsuario.setText("");
                     txtContraseña.setText("");
                     txtUsuario.requestFocus();
                 }
             }
         }catch (SQLException ex) {
             System.out.println("Error Catch");
             JOptionPane.showMessageDialog(null,"Error de Aplicacion");
         }
    }
    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoaplicacion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        BotonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);

        fondoaplicacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        fondoaplicacion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 93, 171, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        fondoaplicacion.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 147, 170, -1));

        BotonEnviar.setText("Iniciar Sesion");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        fondoaplicacion.add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoaplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoaplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        validar();
    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        
    }//GEN-LAST:event_txtContraseñaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JPanel fondoaplicacion;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> 26971c4deccbcaadae442aa68d8edef0fec8f566

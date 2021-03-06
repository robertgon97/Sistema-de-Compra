package VistaGrafica;

import BasedeDatos.SQL; //funciones de la conexion 
import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroProveedores extends javax.swing.JFrame {
    
    //Configuramos las variables de sesion
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    
    public RegistroProveedores() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    void Activabotones(Boolean g,Boolean m,Boolean e){
	BotonGuardar.setEnabled(g);
        BotonModificar.setEnabled(m);        
        BotonEliminar.setEnabled(e);
    }
    void LimpiarBotones(){
	CampoBusqueda.setText("");
        CampoUsuario.setText("");
        CampoContrasena.setText("");
        CampoPreguntadeSeguridad.setText("");
        CampoRespuestaSeguridad.setText("");     
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAccesos = new javax.swing.JPanel();
        BotonUsuarios = new javax.swing.JButton();
        BotonCliente = new javax.swing.JButton();
        BotonProveedor = new javax.swing.JButton();
        BotonVenta = new javax.swing.JButton();
        BotonCompras = new javax.swing.JButton();
        BotonStock = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonConfig = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        IconoVenture = new javax.swing.JLabel();
        TituloCRUDusuarios = new javax.swing.JLabel();
        TextoPregseg = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JLabel();
        TextoRespSeg = new javax.swing.JLabel();
        TextoContrasena = new javax.swing.JLabel();
        CampoContrasena = new javax.swing.JPasswordField();
        BotonBuscar = new javax.swing.JButton();
        CampoBusqueda = new javax.swing.JTextField();
        CampoPreguntadeSeguridad = new javax.swing.JTextField();
        TextoBuscar = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        CampoID = new javax.swing.JTextField();
        CampoRespuestaSeguridad = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Proveedores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAccesos.setBackground(new java.awt.Color(255, 255, 255));
        PanelAccesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelAccesos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Staff-48.png"))); // NOI18N
        BotonUsuarios.setText("USUARIOS");
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        BotonCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-User Group Man Man-48.png"))); // NOI18N
        BotonCliente.setText("CLIENTE");
        BotonCliente.setMaximumSize(new java.awt.Dimension(133, 57));
        BotonCliente.setMinimumSize(new java.awt.Dimension(133, 57));
        BotonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClienteActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 70));

        BotonProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Camión-48.png"))); // NOI18N
        BotonProveedor.setText("PROVEEDOR");
        BotonProveedor.setToolTipText("");
        BotonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProveedorActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 70));

        BotonVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Checkout-48.png"))); // NOI18N
        BotonVenta.setText("VENTAS");
        BotonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentaActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 70));

        BotonCompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Comprar-48.png"))); // NOI18N
        BotonCompras.setText("COMPRAS");
        BotonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprasActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 150, 80));

        BotonStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Move by Trolley-48.png"))); // NOI18N
        BotonStock.setText("STOCK");
        BotonStock.setMaximumSize(new java.awt.Dimension(133, 57));
        BotonStock.setMinimumSize(new java.awt.Dimension(133, 57));
        BotonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonStockActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 80));

        BotonFactura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Bill-48.png"))); // NOI18N
        BotonFactura.setText("FACTURA");
        PanelAccesos.add(BotonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 150, 70));

        BotonConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Automation-48.png"))); // NOI18N
        BotonConfig.setText("CONFIG");
        BotonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfigActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 150, 70));

        getContentPane().add(PanelAccesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoVenture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/venture.jpg"))); // NOI18N
        PanelPrincipal.add(IconoVenture, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        TituloCRUDusuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TituloCRUDusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Camión-48.png"))); // NOI18N
        TituloCRUDusuarios.setText("Proveedores");
        PanelPrincipal.add(TituloCRUDusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        TextoPregseg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoPregseg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Question_48px.png"))); // NOI18N
        TextoPregseg.setText("Producto que Vende");
        PanelPrincipal.add(TextoPregseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        TextoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Name-48.png"))); // NOI18N
        TextoUsuario.setText("Nombre:");
        PanelPrincipal.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        TextoRespSeg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoRespSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Checked_Checkbox_48px_2.png"))); // NOI18N
        TextoRespSeg.setText("Contacto");
        PanelPrincipal.add(TextoRespSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        TextoContrasena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Password-48.png"))); // NOI18N
        TextoContrasena.setText("Telefono:");
        PanelPrincipal.add(TextoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        CampoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContrasenaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(CampoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, 30));

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Search-48.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 70, 50));

        CampoBusqueda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, 30));

        CampoPreguntadeSeguridad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoPreguntadeSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 170, 30));

        TextoBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ID Card-48.png"))); // NOI18N
        TextoBuscar.setText("Buscar por Nombre:");
        PanelPrincipal.add(TextoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        CampoUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, 30));

        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Save-48.png"))); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Close Window-48.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Edit_File_48px.png"))); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Broom-48.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar Texto");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        CampoID.setEnabled(false);
        PanelPrincipal.add(CampoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 80, -1));

        CampoRespuestaSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRespuestaSeguridadActionPerformed(evt);
            }
        });
        PanelPrincipal.add(CampoRespuestaSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 210, 30));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 640, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        CRUDusuarios usuarios = new CRUDusuarios();
        usuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClienteActionPerformed
        RegistroClientes clientes = new RegistroClientes();
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonClienteActionPerformed

    private void BotonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProveedorActionPerformed
        JOptionPane.showMessageDialog(null,"Ya estas en el modulo Proveedores");
    }//GEN-LAST:event_BotonProveedorActionPerformed

    private void BotonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConfigActionPerformed

    private void CampoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContrasenaActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        if(BotonBuscar.isEnabled()){
            try {
                String busca=CampoBusqueda.getText();
                cnn=SQL.enlace(cnn);
                sta=cnn.createStatement();
                rst=sta.executeQuery("SELECT * FROM proveedor");
                boolean bandera=false;
                while(rst.next()){
                    if(busca.equalsIgnoreCase(rst.getString(2))){
                        CampoID.setText(rst.getString(1));
                        CampoUsuario.setText(rst.getString(2));
                        CampoContrasena.setText(rst.getString(3));
                        CampoPreguntadeSeguridad.setText(rst.getString(4));
                        CampoRespuestaSeguridad.setText(rst.getString(5));
                        this.Activabotones(false,true,true);
                        bandera=true;
                        break;
                    }
                }
                if(bandera==false){
                    JOptionPane.showMessageDialog(null,"Proveedor no Registrado!");
                    this.LimpiarBotones();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE BUSQUEDA " + ex);
            }
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        int resp=JOptionPane.showConfirmDialog(null,"¿Desea Guardar Proveedor?","Pregunta",0);//el cero quiere decir que si la respuesta es correcta es cero
        if(resp==0){
            try {
                cnn=SQL.enlace(cnn);
                sta=SQL.declaracion(sta);
                String nombre=CampoUsuario.getText();
                String correo = String.valueOf(CampoContrasena.getPassword());
                String telefono=CampoPreguntadeSeguridad.getText();
                String producto = String.valueOf(CampoRespuestaSeguridad.getPassword());
                String comando="INSERT INTO proveedor VALUES(null,'"+nombre+"','"+correo+"','"+telefono+"','"+producto+"')";
                sta.execute(comando);
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de Guardar" + ex);
            }
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int resp=JOptionPane.showConfirmDialog(null,"¿Desea Eliminar Usuario?","Pregunta",0);//el cero quiere decir que si la respuesta es correcta es cero
        if(resp==0){
            try {
                cnn=SQL.enlace(cnn);
                sta=SQL.declaracion(sta);
                String id=CampoID.getText();
                String comando="DELETE FROM preveedor WHERE id_proveedor='"+id+"'";
                sta.execute(comando);
                JOptionPane.showConfirmDialog(null,"Proveedor Eliminado Exitosamente!");
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al eliminar" + ex);
            }
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        int resp=JOptionPane.showConfirmDialog(null,"¿Desea Modificar el Proveedor?","Pregunta",0);//el cero quiere decir que si la respuesta es correcta es cero
        boolean enviar = false;
        if(resp==0){
            try {
                cnn=SQL.enlace(cnn);
                sta=SQL.declaracion(sta);
                String id = CampoID.getText();
                String nombre=CampoUsuario.getText();
                String correo = String.valueOf(CampoContrasena.getPassword());
                String telefono=CampoPreguntadeSeguridad.getText();
                String producto = String.valueOf(CampoRespuestaSeguridad.getPassword());
                String comando="";
                //Verificar si los datos no estan vacios
                if (nombre != "" && correo !="" && telefono !=""  && producto !=""){
                    comando = "UPDATE proveedor SET "
                    + "nombre_proveedor='"+nombre+"', "
                    + "correo_proveedor='"+correo+"', "
                    + "telefono_proveedor='"+telefono+"', "
                    + "Productos='"+producto+"', "
                    + "WHERE id_proveedor='"+id+"' ";
                    enviar=true;
                    System.out.println(comando);
                }else{JOptionPane.showMessageDialog(null,"Debes Llenar todos los Campos!");}
                if (enviar==true){
                    sta.executeUpdate(comando);
                    cnn.close();
                    LimpiarBotones();
                }else {
                    JOptionPane.showMessageDialog(null,"Debes Llenar todos los Campos!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de modificacion");
            }
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        LimpiarBotones();
        this.Activabotones(true,true,true);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void CampoRespuestaSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRespuestaSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRespuestaSeguridadActionPerformed

    private void BotonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaActionPerformed
        MenuVentas vender = new MenuVentas();//Creamos la ventana
        vender.setVisible(true); //Hacemos que se muestre
        this.dispose();//Destruimos la ventana actual
    }//GEN-LAST:event_BotonVentaActionPerformed

    private void BotonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprasActionPerformed
        MenuCompras compras = new MenuCompras();
        compras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonComprasActionPerformed

    private void BotonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonStockActionPerformed
        Stock stock = new Stock();
        stock.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonStockActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonCompras;
    private javax.swing.JButton BotonConfig;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonProveedor;
    private javax.swing.JButton BotonStock;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVenta;
    private javax.swing.JTextField CampoBusqueda;
    private javax.swing.JPasswordField CampoContrasena;
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoPreguntadeSeguridad;
    private javax.swing.JPasswordField CampoRespuestaSeguridad;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel IconoVenture;
    private javax.swing.JPanel PanelAccesos;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel TextoBuscar;
    private javax.swing.JLabel TextoContrasena;
    private javax.swing.JLabel TextoPregseg;
    private javax.swing.JLabel TextoRespSeg;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JLabel TituloCRUDusuarios;
    // End of variables declaration//GEN-END:variables
}

package VistaGrafica;

import BasedeDatos.SQL; //funciones de la conexion 
import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuVentas extends javax.swing.JFrame {
    //Configuramos las variables de sesion
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;


    public MenuVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        TextoCedula = new javax.swing.JLabel();
        TextoProducto = new javax.swing.JLabel();
        TextoCantidad = new javax.swing.JLabel();
        CampoCantidad = new javax.swing.JTextField();
        TextoTotal = new javax.swing.JLabel();
        CampoSubTotal = new javax.swing.JTextField();
        TextoSubTotal = new javax.swing.JLabel();
        CampoTotal = new javax.swing.JTextField();
        CampoIva = new javax.swing.JTextField();
        TextoIva = new javax.swing.JLabel();
        BotonEnviar = new javax.swing.JButton();
        TextoTitulo = new javax.swing.JLabel();
        IconoVenture = new javax.swing.JLabel();
        Tabla = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CampoCedula = new javax.swing.JTextField();
        CampoProducto = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        ContenidoProducto = new javax.swing.JLabel();
        ContenidoUsuario = new javax.swing.JLabel();
        PanelAccesos = new javax.swing.JPanel();
        BotonUsuarios = new javax.swing.JButton();
        BotonCliente = new javax.swing.JButton();
        BotonProveedor = new javax.swing.JButton();
        BotonVenta = new javax.swing.JButton();
        BotonCompras = new javax.swing.JButton();
        BotonStock = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonConfig = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 50, 20));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 70, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 60, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 20));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 70, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, 20));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Sub Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 70, 20));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 70, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("IVA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 50, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 120, 50));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 40));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 40));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 40));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar una Venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoCedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-ID Card-48.png"))); // NOI18N
        TextoCedula.setText("CEDULA");
        PanelPrincipal.add(TextoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 40));

        TextoProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoProducto.setText("PRODUCTO");
        PanelPrincipal.add(TextoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 40));

        TextoCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Gold Bars-48.png"))); // NOI18N
        TextoCantidad.setText("CANTIDAD");
        PanelPrincipal.add(TextoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 40));

        CampoCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 100, 20));

        TextoTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Enter Pin-48.png"))); // NOI18N
        TextoTotal.setText("TOTAL");
        PanelPrincipal.add(TextoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 110, 60));

        CampoSubTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CampoSubTotal.setEnabled(false);
        PanelPrincipal.add(CampoSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 100, 30));

        TextoSubTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoSubTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Calculator-48.png"))); // NOI18N
        TextoSubTotal.setText("SUB-TOTAL");
        PanelPrincipal.add(TextoSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 50));

        CampoTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CampoTotal.setEnabled(false);
        PanelPrincipal.add(CampoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 130, -1));

        CampoIva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CampoIva.setEnabled(false);
        PanelPrincipal.add(CampoIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 80, 20));

        TextoIva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoIva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Money Bag-48.png"))); // NOI18N
        TextoIva.setText("IVA");
        PanelPrincipal.add(TextoIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 50));

        BotonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonEnviar.setText("VENTAS");
        BotonEnviar.setBorder(null);
        PanelPrincipal.add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 120, 50));

        TextoTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoTitulo.setText("VENTAS");
        PanelPrincipal.add(TextoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 60));
        PanelPrincipal.add(IconoVenture, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        PanelPrincipal.add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 590, 140));

        CampoCedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 20));

        CampoProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PanelPrincipal.add(CampoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, 20));

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Search-48.png"))); // NOI18N
        PanelPrincipal.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 50));

        BotonBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Broom-48.png"))); // NOI18N
        BotonBorrar.setText("BORRAR");
        PanelPrincipal.add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 140, 50));

        ContenidoProducto.setText("Contenido del Producto");
        PanelPrincipal.add(ContenidoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 230, 30));

        ContenidoUsuario.setText("Contenido del Usuario");
        PanelPrincipal.add(ContenidoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 230, 30));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 640, 580));

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

        getContentPane().add(PanelAccesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        CRUDusuarios usuarios = new CRUDusuarios();
        usuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProveedorActionPerformed
        RegistroProveedores proveedores = new RegistroProveedores();
        proveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonProveedorActionPerformed

    private void BotonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConfigActionPerformed

    private void BotonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClienteActionPerformed
        RegistroClientes clientes = new RegistroClientes();
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonClienteActionPerformed

    private void BotonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaActionPerformed
        JOptionPane.showMessageDialog(null,"Ya estas en el modulo Ventas");
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
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonCompras;
    private javax.swing.JButton BotonConfig;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonProveedor;
    private javax.swing.JButton BotonStock;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVenta;
    private javax.swing.JTextField CampoCantidad;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JTextField CampoIva;
    private javax.swing.JTextField CampoProducto;
    private javax.swing.JTextField CampoSubTotal;
    private javax.swing.JTextField CampoTotal;
    private javax.swing.JLabel ContenidoProducto;
    private javax.swing.JLabel ContenidoUsuario;
    private javax.swing.JLabel IconoVenture;
    private javax.swing.JPanel PanelAccesos;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JLabel TextoCantidad;
    private javax.swing.JLabel TextoCedula;
    private javax.swing.JLabel TextoIva;
    private javax.swing.JLabel TextoProducto;
    private javax.swing.JLabel TextoSubTotal;
    private javax.swing.JLabel TextoTitulo;
    private javax.swing.JLabel TextoTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

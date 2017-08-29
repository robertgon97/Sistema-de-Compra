package VistaGrafica;
import BasedeDatos.SQL; //funciones de la conexion 
import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class MenuCompras extends javax.swing.JFrame {
    //Configuramos las variables de sesion
    static Connection cnn=null;
    static Statement sta=null;
    static ResultSet rst=null;
    
    public MenuCompras() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        PanelAccesos = new javax.swing.JPanel();
        BotonUsuarios = new javax.swing.JButton();
        BotonCliente = new javax.swing.JButton();
        BotonProveedor = new javax.swing.JButton();
        BotonVenta = new javax.swing.JButton();
        BotonCompras = new javax.swing.JButton();
        BotonStock = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Compras a La tienda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PROVEEDOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PRODUCTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CANTIDAD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TOTAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 60));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("PRECIO UNIDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 50));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 80, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("IVA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 100, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("COMPRAR ");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 50));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 40));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 40));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 40));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 40));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("COMPRAS");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, 60));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARIA PUIG", "COCOSSETE", "TOM TOSTON" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 100, 20));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LA MURALLA C.A", "DIGA CENTER C.A", "HIPERLIDER C.A" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Broom-48.png"))); // NOI18N
        jButton5.setText("BORRAR");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 620, 580));

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

    private void BotonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClienteActionPerformed
        RegistroClientes clientes = new RegistroClientes();
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonClienteActionPerformed

    private void BotonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProveedorActionPerformed
        RegistroProveedores proveedores = new RegistroProveedores();
        proveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonProveedorActionPerformed

    private void BotonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentaActionPerformed
        MenuVentas vender = new MenuVentas();//Creamos la ventana
        vender.setVisible(true); //Hacemos que se muestre
        this.dispose();//Destruimos la ventana actual
    }//GEN-LAST:event_BotonVentaActionPerformed

    private void BotonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConfigActionPerformed

    private void BotonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprasActionPerformed
        JOptionPane.showMessageDialog(null,"Ya estas en el modulo Compras");
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
            java.util.logging.Logger.getLogger(MenuCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonCompras;
    private javax.swing.JButton BotonConfig;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonProveedor;
    private javax.swing.JButton BotonStock;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVenta;
    private javax.swing.JPanel PanelAccesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

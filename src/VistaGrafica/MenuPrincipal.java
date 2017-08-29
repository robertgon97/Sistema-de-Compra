package VistaGrafica;

import java.text.DateFormat;
import java.util.Calendar;

public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Calendar c=Calendar.getInstance();
        DateFormat df1= DateFormat.getDateInstance(DateFormat.FULL);
        TextoFecha.setText("Venezuela, "+df1.format(c.getTime()));
        Calendar hora = Calendar.getInstance();
        int hor =hora.get(Calendar.HOUR);
        int minutos = hora.get(Calendar.MINUTE);
        TextoHora.setText(hor+":"+minutos+"");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        TextoHora = new javax.swing.JLabel();
        TextoFecha = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        BotonAcercade = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA VENTURE");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
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

        getContentPane().add(PanelAccesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 580));

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelPrincipal.add(IconoVenture, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        TextoHora.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        TextoHora.setText("8:50 PM");
        PanelPrincipal.add(TextoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, 60));

        TextoFecha.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        TextoFecha.setText("Venezuela, Lunes 28 de Agosto de 2017");
        PanelPrincipal.add(TextoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 480, 60));

        Bienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bienvenida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Name-48.png"))); // NOI18N
        Bienvenida.setText("Bienvenido al Sistema Venture!");
        PanelPrincipal.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 310, 40));

        BotonAcercade.setBackground(new java.awt.Color(255, 255, 255));
        BotonAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Login As User-48.png"))); // NOI18N
        BotonAcercade.setText("Acerca de");
        BotonAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAcercadeActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonAcercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

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
        RegistroProveedores proveedores = new RegistroProveedores();
        proveedores.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonProveedorActionPerformed

    private void BotonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConfigActionPerformed

    private void BotonAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAcercadeActionPerformed
        Acerca modal = new Acerca();
        modal.setVisible(true);
    }//GEN-LAST:event_BotonAcercadeActionPerformed

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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton BotonAcercade;
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonCompras;
    private javax.swing.JButton BotonConfig;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonProveedor;
    private javax.swing.JButton BotonStock;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVenta;
    private javax.swing.JLabel IconoVenture;
    private javax.swing.JPanel PanelAccesos;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel TextoFecha;
    private javax.swing.JLabel TextoHora;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

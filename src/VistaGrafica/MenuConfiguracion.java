package VistaGrafica;

public class MenuConfiguracion extends javax.swing.JFrame {

    public MenuConfiguracion() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConfiguracion = new javax.swing.JPanel();
        TextoAsignarIva = new javax.swing.JLabel();
        LogoVenture = new javax.swing.JLabel();
        TextoConfig1 = new javax.swing.JLabel();
        Datoiva = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        PanelAccesos = new javax.swing.JPanel();
        BotonUsuarios = new javax.swing.JButton();
        BotonCliente = new javax.swing.JButton();
        BotonProvedor = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();
        BotonCompras = new javax.swing.JButton();
        BotonStock = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        PanelConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoAsignarIva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoAsignarIva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Automation-48.png"))); // NOI18N
        TextoAsignarIva.setText("Asignar IVA");
        PanelConfiguracion.add(TextoAsignarIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 60));

        LogoVenture.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Pablo\\Pictures\\venture.jpg")); // NOI18N
        PanelConfiguracion.add(LogoVenture, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        TextoConfig1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TextoConfig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Automation-48.png"))); // NOI18N
        TextoConfig1.setText("CONFIURACION");
        PanelConfiguracion.add(TextoConfig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 180, 60));
        PanelConfiguracion.add(Datoiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, -1));

        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Save-48.png"))); // NOI18N
        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelConfiguracion.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 140, 50));

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
        PanelAccesos.add(BotonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        BotonCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-User Group Man Man-48.png"))); // NOI18N
        BotonCliente.setText("CLIENTE");
        BotonCliente.setMaximumSize(new java.awt.Dimension(133, 57));
        BotonCliente.setMinimumSize(new java.awt.Dimension(133, 57));
        PanelAccesos.add(BotonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 50));

        BotonProvedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Camión-48.png"))); // NOI18N
        BotonProvedor.setText("PROVEEDOR");
        BotonProvedor.setToolTipText("");
        BotonProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProvedorActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 50));

        BotonVentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Checkout-48.png"))); // NOI18N
        BotonVentas.setText("VENTAS");
        PanelAccesos.add(BotonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, 50));

        BotonCompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Comprar-48.png"))); // NOI18N
        BotonCompras.setText("COMPRAS");
        PanelAccesos.add(BotonCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 50));

        BotonStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Move by Trolley-48.png"))); // NOI18N
        BotonStock.setText("STOCK");
        BotonStock.setMaximumSize(new java.awt.Dimension(133, 57));
        BotonStock.setMinimumSize(new java.awt.Dimension(133, 57));
        PanelAccesos.add(BotonStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 50));

        BotonFactura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Bill-48.png"))); // NOI18N
        BotonFactura.setText("FACTURA");
        PanelAccesos.add(BotonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 50));

        BotonConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-Automation-48.png"))); // NOI18N
        BotonConfig.setText("CONFIG");
        BotonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfigActionPerformed(evt);
            }
        });
        PanelAccesos.add(BotonConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelAccesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelAccesos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonProvedorActionPerformed

    private void BotonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonConfigActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonGuardarActionPerformed
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
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonCompras;
    private javax.swing.JButton BotonConfig;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonProvedor;
    private javax.swing.JButton BotonStock;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JTextField Datoiva;
    private javax.swing.JLabel LogoVenture;
    private javax.swing.JPanel PanelAccesos;
    private javax.swing.JPanel PanelConfiguracion;
    private javax.swing.JLabel TextoAsignarIva;
    private javax.swing.JLabel TextoConfig1;
    // End of variables declaration//GEN-END:variables
}

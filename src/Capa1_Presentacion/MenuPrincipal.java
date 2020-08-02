
package Capa1_Presentacion;

import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setTitle("SISTEMA BANCARIO INTROBANK SOFTWARE │ GESTION BANCARIA");
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/Capa6_Util/Images/icono.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpLateral = new javax.swing.JPanel();
        lblTituloPanel = new javax.swing.JLabel();
        btnGestionarCliente = new javax.swing.JButton();
        btnGestionarPrestamo = new javax.swing.JButton();
        btnGestionarCronograma = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpPrincipal.setBackground(new java.awt.Color(40, 40, 40));

        jpLateral.setBackground(new java.awt.Color(20, 20, 20));

        lblTituloPanel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloPanel.setForeground(new java.awt.Color(0, 204, 204));
        lblTituloPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/logoIcon.png"))); // NOI18N
        lblTituloPanel.setText("INTROBANK");

        btnGestionarCliente.setBackground(new java.awt.Color(15, 15, 15));
        btnGestionarCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGestionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/cliente.png"))); // NOI18N
        btnGestionarCliente.setText("CLIENTES");
        btnGestionarCliente.setBorder(null);
        btnGestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarClienteActionPerformed(evt);
            }
        });

        btnGestionarPrestamo.setBackground(new java.awt.Color(15, 15, 15));
        btnGestionarPrestamo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGestionarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/bank.png"))); // NOI18N
        btnGestionarPrestamo.setText("PRESTAMOS");
        btnGestionarPrestamo.setBorder(null);
        btnGestionarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPrestamoActionPerformed(evt);
            }
        });

        btnGestionarCronograma.setBackground(new java.awt.Color(15, 15, 15));
        btnGestionarCronograma.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGestionarCronograma.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionarCronograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/home.png"))); // NOI18N
        btnGestionarCronograma.setText("CRONOGRAMAS");
        btnGestionarCronograma.setBorder(null);
        btnGestionarCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCronogramaActionPerformed(evt);
            }
        });

        btnConfiguracion.setBackground(new java.awt.Color(15, 15, 15));
        btnConfiguracion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/settings.png"))); // NOI18N
        btnConfiguracion.setText("CONFIGURACIÓN");
        btnConfiguracion.setBorder(null);

        javax.swing.GroupLayout jpLateralLayout = new javax.swing.GroupLayout(jpLateral);
        jpLateral.setLayout(jpLateralLayout);
        jpLateralLayout.setHorizontalGroup(
            jpLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGestionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGestionarCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpLateralLayout.setVerticalGroup(
            jpLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLateralLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloPanel)
                .addGap(41, 41, 41)
                .addComponent(btnGestionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionarCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jpLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 926, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCronogramaActionPerformed
        FormCronogramaAdmin formCronogramaAdmin = new FormCronogramaAdmin(this, true);
        formCronogramaAdmin.setVisible(true);
    }//GEN-LAST:event_btnGestionarCronogramaActionPerformed

    private void btnGestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarClienteActionPerformed
        FormClienteAdmin formClienteAdmin = new FormClienteAdmin(this, true);
        formClienteAdmin.setVisible(true);
    }//GEN-LAST:event_btnGestionarClienteActionPerformed

    private void btnGestionarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamoActionPerformed
        FormGestionarCliente formGestionarCliente = new FormGestionarCliente(this, true);
        formGestionarCliente.setVisible(true);
    }//GEN-LAST:event_btnGestionarPrestamoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnGestionarCliente;
    private javax.swing.JButton btnGestionarCronograma;
    private javax.swing.JButton btnGestionarPrestamo;
    private javax.swing.JPanel jpLateral;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lblTituloPanel;
    // End of variables declaration//GEN-END:variables
}

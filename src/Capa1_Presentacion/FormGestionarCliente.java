
package Capa1_Presentacion;

import Capa2_Aplicacion.GestionarClienteServicio;
import Capa3_Dominio.Cliente;
import Capa6_Util.Mensajes;

public class FormGestionarCliente extends javax.swing.JDialog {
    
    public Cliente cliente;
    
    public FormGestionarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtBuscarDni.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalGC = new javax.swing.JPanel();
        jpTituloGC = new javax.swing.JPanel();
        lblTituloGC = new javax.swing.JLabel();
        btnCerrarGC = new javax.swing.JButton();
        jpContenidoGC = new javax.swing.JPanel();
        jpBuscarCliente = new javax.swing.JPanel();
        lblIngreseGC = new javax.swing.JLabel();
        txtBuscarDni = new javax.swing.JTextField();
        btnBuscarDni = new javax.swing.JButton();
        jpCliente = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnPrestamo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipalGC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloGC.setBackground(new java.awt.Color(40, 40, 40));

        lblTituloGC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloGC.setForeground(new java.awt.Color(0, 153, 153));
        lblTituloGC.setText("INTROBANK SOFT │ BUSCAR CLIENTES");

        btnCerrarGC.setBackground(new java.awt.Color(51, 0, 0));
        btnCerrarGC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrarGC.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarGC.setText("x");
        btnCerrarGC.setBorder(null);
        btnCerrarGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarGCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTituloGCLayout = new javax.swing.GroupLayout(jpTituloGC);
        jpTituloGC.setLayout(jpTituloGCLayout);
        jpTituloGCLayout.setHorizontalGroup(
            jpTituloGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloGCLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTituloGC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addComponent(btnCerrarGC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTituloGCLayout.setVerticalGroup(
            jpTituloGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTituloGC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCerrarGC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpPrincipalGC.add(jpTituloGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jpContenidoGC.setBackground(new java.awt.Color(204, 204, 204));

        jpBuscarCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpBuscarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "BUSCAR CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jpBuscarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngreseGC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngreseGC.setForeground(new java.awt.Color(0, 102, 102));
        lblIngreseGC.setText("INGRESE EL DNI DEL CLIENTE A BUSCAR");
        jpBuscarCliente.add(lblIngreseGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        txtBuscarDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscarDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtBuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDniKeyTyped(evt);
            }
        });
        jpBuscarCliente.add(txtBuscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 350, 20));

        btnBuscarDni.setBackground(new java.awt.Color(0, 51, 51));
        btnBuscarDni.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDni.setText("GESTIONAR");
        btnBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDniActionPerformed(evt);
            }
        });
        jpBuscarCliente.add(btnBuscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 140, 20));

        jpCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 102, 102));
        lblCodigo.setText("CODIGO:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 102, 102));
        lblNombre.setText("NOMBRE:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 102, 102));
        lblApellido.setText("APELLIDO:");

        lblDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 102, 102));
        lblDni.setText("DNI:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txtDni.setEditable(false);
        txtDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btnPrestamo.setBackground(new java.awt.Color(0, 51, 51));
        btnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setText("REALIZAR NUEVO PRESTAMO");
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDni)
                    .addComponent(lblApellido)
                    .addComponent(lblNombre)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_user_male_circle_100px.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContenidoGCLayout = new javax.swing.GroupLayout(jpContenidoGC);
        jpContenidoGC.setLayout(jpContenidoGCLayout);
        jpContenidoGCLayout.setHorizontalGroup(
            jpContenidoGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenidoGCLayout.createSequentialGroup()
                .addGroup(jpContenidoGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContenidoGCLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                    .addGroup(jpContenidoGCLayout.createSequentialGroup()
                        .addGroup(jpContenidoGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpContenidoGCLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34))
                            .addGroup(jpContenidoGCLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpContenidoGCLayout.setVerticalGroup(
            jpContenidoGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenidoGCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpContenidoGCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpContenidoGCLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpContenidoGCLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jpPrincipalGC.add(jpContenidoGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 270));

        getContentPane().add(jpPrincipalGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarGCActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarGCActionPerformed

    private void txtBuscarDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDniKeyTyped
        String patron_de_entrada = "0123456789";
        if (txtBuscarDni.getText().length() == 8
            || !patron_de_entrada.contains(String.valueOf(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBuscarDniKeyTyped

    private void btnBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDniActionPerformed
        // TODO add your handling code here:
        String dni = txtBuscarDni.getText().trim();
        try {

            GestionarClienteServicio gcs = new GestionarClienteServicio();
            cliente = gcs.buscarDniCliente(dni);
            if(cliente !=null){
                txtCodigo.setText(String.valueOf(cliente.getId_cliente()));
                txtNombre.setText(cliente.getNombre());
                txtApellido.setText(cliente.getApellido());
                txtDni.setText(cliente.getDni());
            }
            else{
                Mensajes.mostrarAdvertenciaCliente(this);
            }
        } catch (Exception e) {
            Mensajes.mostrarErrorClienteBuscado(this);
        }
    }//GEN-LAST:event_btnBuscarDniActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed

        try {

            GestionarClienteServicio gcs = new GestionarClienteServicio();
            Cliente verificarCliente = gcs.verificarPrestamo(Integer.parseInt(txtCodigo.getText()));
            if(verificarCliente == null){
                FormGestionarPrestamo fgp = new FormGestionarPrestamo(this, cliente);
                fgp.setVisible(true);
                dispose();
            }
            else{
                Mensajes.mostrarAdvertenciaClientePrestamo(this);
            }
        } catch (Exception e) {
            Mensajes.mostrarErrorClienteBuscado(this);
        }

    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormClienteAdmin formClienteAdmin = new FormClienteAdmin(null, true);
        formClienteAdmin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDni;
    private javax.swing.JButton btnCerrarGC;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpBuscarCliente;
    private javax.swing.JPanel jpCliente;
    public javax.swing.JPanel jpContenidoGC;
    private javax.swing.JPanel jpPrincipalGC;
    public javax.swing.JPanel jpTituloGC;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblIngreseGC;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTituloGC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarDni;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

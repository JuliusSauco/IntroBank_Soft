
package Capa1_Presentacion;

import Capa2_Aplicacion.GestionarClienteServicio;
import javax.swing.JDialog;
import Capa3_Dominio.Cliente;
import Capa6_Util.Mensajes;

public class FormDatosCliente extends javax.swing.JDialog {
    
    private final int ACCION_CREAR = 1;
    private final int ACCION_MODIFICAR = 2;
    private int tipo_accion;
    private Cliente cliente;

    public FormDatosCliente(JDialog owner) {
        super(owner, true);
        initComponents();
        setLocationRelativeTo(null);
        tipo_accion = ACCION_CREAR;
        this.cliente = new Cliente();
    }
    
    public FormDatosCliente(JDialog owner, Cliente cliente) {
        super(owner, true);
        initComponents();
        setLocationRelativeTo(null);
        tipo_accion = ACCION_MODIFICAR;
        this.cliente = cliente;
        //txtCodigoDC.setText(String.valueOf(cliente.getId_cliente()));
        txtNombreDC.setText(cliente.getNombre());
        txtApellidoDC.setText(cliente.getApellido());
        txtDniDC.setText(cliente.getDni());
    }
    
    private void erroresCliente(){
       lblErrorApellidoDC.setVisible(false);
       lblErrorNombreDC.setVisible(false);
       lblErrorTotalDC.setVisible(false);
       lblErrorDniDC.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalDC = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrarGCR = new javax.swing.JButton();
        lblTituloGCR = new javax.swing.JLabel();
        lblClienteGCR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreDC = new javax.swing.JTextField();
        txtApellidoDC = new javax.swing.JTextField();
        txtDniDC = new javax.swing.JTextField();
        lblErrorTotalDC = new javax.swing.JLabel();
        lblErrorNombreDC = new javax.swing.JLabel();
        lblErrorApellidoDC = new javax.swing.JLabel();
        lblErrorDniDC = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpPrincipalDC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        btnCerrarGCR.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrarGCR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrarGCR.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarGCR.setText("x");
        btnCerrarGCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarGCRActionPerformed(evt);
            }
        });

        lblTituloGCR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloGCR.setForeground(new java.awt.Color(0, 153, 153));
        lblTituloGCR.setText("INTROBANK │ DATOS DEL CLIENTE │");

        lblClienteGCR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteGCR.setForeground(new java.awt.Color(255, 255, 255));
        lblClienteGCR.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloGCR)
                .addGap(18, 18, 18)
                .addComponent(lblClienteGCR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(btnCerrarGCR))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarGCR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloGCR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteGCR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpPrincipalDC.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_user_male_circle_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("REGISTRO DE CLIENTES NUEVOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("NOMBRES:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("APELLIDOS:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("DNI:");

        txtDniDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniDCKeyTyped(evt);
            }
        });

        lblErrorTotalDC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorTotalDC.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorTotalDC.setText("(*) Los datos son incorrectos");

        lblErrorNombreDC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorNombreDC.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorNombreDC.setText("*");

        lblErrorApellidoDC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorApellidoDC.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorApellidoDC.setText("*");

        lblErrorDniDC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorDniDC.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorDniDC.setText("*");

        btnGuardarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCliente.setText("GUARDAR CLIENTE");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorTotalDC)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellidoDC, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtNombreDC)
                                    .addComponent(txtDniDC))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorNombreDC)
                                    .addComponent(lblErrorApellidoDC)
                                    .addComponent(lblErrorDniDC)))
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorNombreDC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellidoDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorApellidoDC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDniDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorDniDC))))
                .addGap(22, 22, 22)
                .addComponent(lblErrorTotalDC)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jpPrincipalDC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 550, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipalDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipalDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarGCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarGCRActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarGCRActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtNombreDC.requestFocusInWindow();
        erroresCliente();
    }//GEN-LAST:event_formWindowOpened

    private void txtDniDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniDCKeyTyped
        String patron_de_entrada = "0123456789";
        if (txtDniDC.getText().length() == 8
            || !patron_de_entrada.contains(String.valueOf(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniDCKeyTyped

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        if(txtNombreDC.getText().length() == 0){
            lblErrorNombreDC.setVisible(true);
            lblErrorTotalDC.setVisible(true);
        }
        else if (txtApellidoDC.getText().length() == 0){
            lblErrorApellidoDC.setVisible(true);
            lblErrorTotalDC.setVisible(true);
        }
        else if (txtDniDC.getText().length() == 0){
            lblErrorDniDC.setVisible(true);
            lblErrorTotalDC.setVisible(true);
        }
        else{
            erroresCliente();
            cliente.setNombre(txtNombreDC.getText());
            cliente.setDni(txtDniDC.getText());
            cliente.setApellido(txtApellidoDC.getText());
            GestionarClienteServicio gestionarClienteServicio = new GestionarClienteServicio();
            int registros_afectados;
            if (tipo_accion == ACCION_CREAR) {
                try {
                    registros_afectados = gestionarClienteServicio.insertarCliente(cliente);
                    if (registros_afectados == 1) {
                        Mensajes.mostrarAfirmacionDeCreacion(this);
                        this.dispose();
                    } else {
                        Mensajes.mostrarAdvertenciaDeCreacion(this);
                    }
                } catch (Exception e) {
                    Mensajes.mostrarErrorDeCreacion(this);
                }
            } else {
                try {
                    registros_afectados = gestionarClienteServicio.modificarCliente(cliente);
                    if (registros_afectados == 1) {
                        Mensajes.mostrarAfirmacionDeActualizacion(this);
                        this.dispose();
                    } else {
                        Mensajes.mostrarAdvertenciaDeActualizacion(this);
                    }
                } catch (Exception e) {
                    Mensajes.mostrarErrorDeActualizacion(this);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarGCR;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpPrincipalDC;
    public static javax.swing.JLabel lblClienteGCR;
    private javax.swing.JLabel lblErrorApellidoDC;
    private javax.swing.JLabel lblErrorDniDC;
    private javax.swing.JLabel lblErrorNombreDC;
    private javax.swing.JLabel lblErrorTotalDC;
    private javax.swing.JLabel lblTituloGCR;
    private javax.swing.JTextField txtApellidoDC;
    private javax.swing.JTextField txtDniDC;
    private javax.swing.JTextField txtNombreDC;
    // End of variables declaration//GEN-END:variables
}


package Capa1_Presentacion;

import Capa2_Aplicacion.GestionarPrestamoServicio;
import Capa3_Dominio.Prestamo;
import Capa3_Dominio.Cliente;
import javax.swing.JDialog;
import Capa6_Util.Mensajes;

public class FormGestionarPrestamo extends javax.swing.JDialog {
    
    private Cliente cliente;

    public FormGestionarPrestamo(JDialog owner) {
        super(owner, true);
        initComponents();
        setLocationRelativeTo(null);
        this.cliente = new Cliente();
    }
    
    public FormGestionarPrestamo(JDialog owner, Cliente cliente){
        initComponents();
        setLocationRelativeTo(null);
        this.cliente = cliente;
        txtCodigoClienteGP.setText(String.valueOf(cliente.getId_cliente()));
        cliente.getNombre();
        cliente.getApellido();
        lblClienteGP.setText(cliente.getNombre()+(" ")+cliente.getApellido());
        cliente.getDni();
    }
    
    private void Errores(){
        lblErrorMonto.setVisible(false);
        lblErrorPeriodos.setVisible(false);
        lblErrorTasa.setVisible(false);
        lblErrorTotal.setVisible(false);
    }
    
    private void GenerarCodigo(){
        int codigo = (int)Math.floor(Math.random()*10000000);
        lblCodigoGP.setText(String.valueOf("PTR"+codigo));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalGP = new javax.swing.JPanel();
        jpTituloGP = new javax.swing.JPanel();
        lblTituloGP = new javax.swing.JLabel();
        btnCerrarGP = new javax.swing.JButton();
        lblClienteGP = new javax.swing.JLabel();
        jpContenidoGP = new javax.swing.JPanel();
        jpDatosPrestamo = new javax.swing.JPanel();
        lblCodigoClienteGP = new javax.swing.JLabel();
        lblTeaGP = new javax.swing.JLabel();
        lblPeridoGP = new javax.swing.JLabel();
        lblMontoGP = new javax.swing.JLabel();
        txtCodigoClienteGP = new javax.swing.JTextField();
        txtTeaGP = new javax.swing.JTextField();
        txtPeriodosGP = new javax.swing.JTextField();
        txtMontoGP = new javax.swing.JTextField();
        lblIcono = new javax.swing.JLabel();
        lblErrorTasa = new javax.swing.JLabel();
        lblErrorMonto = new javax.swing.JLabel();
        lblErrorPeriodos = new javax.swing.JLabel();
        btnGenerarCronograma = new javax.swing.JButton();
        lblMontoGP1 = new javax.swing.JLabel();
        lblCodigoGP = new javax.swing.JLabel();
        lblErrorTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipalGP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloGP.setBackground(new java.awt.Color(40, 40, 40));
        jpTituloGP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloGP.setForeground(new java.awt.Color(0, 153, 153));
        lblTituloGP.setText("INTROBANK SOFT │ GESTION DE PRESTAMOS │");
        jpTituloGP.add(lblTituloGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 0, -1, 32));

        btnCerrarGP.setBackground(new java.awt.Color(51, 0, 0));
        btnCerrarGP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrarGP.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarGP.setText("x");
        btnCerrarGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarGPActionPerformed(evt);
            }
        });
        jpTituloGP.add(btnCerrarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 0, 43, 30));

        lblClienteGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteGP.setForeground(new java.awt.Color(255, 255, 255));
        lblClienteGP.setText("CLIENTE");
        jpTituloGP.add(lblClienteGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 2, -1, 30));

        jpPrincipalGP.add(jpTituloGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        jpContenidoGP.setBackground(new java.awt.Color(204, 204, 204));
        jpContenidoGP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDatosPrestamo.setBackground(new java.awt.Color(204, 204, 204));
        jpDatosPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true), "DATOS DEL PRESTAMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jpDatosPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoClienteGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigoClienteGP.setForeground(new java.awt.Color(0, 51, 51));
        lblCodigoClienteGP.setText("CODIGO DE CLIENTE:");
        jpDatosPrestamo.add(lblCodigoClienteGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 54, -1, -1));

        lblTeaGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTeaGP.setForeground(new java.awt.Color(0, 51, 51));
        lblTeaGP.setText("TASA EFECTIVA ANUAL:");
        jpDatosPrestamo.add(lblTeaGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 148, -1, -1));

        lblPeridoGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPeridoGP.setForeground(new java.awt.Color(0, 51, 51));
        lblPeridoGP.setText("TOTAL PERIODOS DE PAGO:");
        jpDatosPrestamo.add(lblPeridoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 175, -1, -1));

        lblMontoGP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMontoGP.setForeground(new java.awt.Color(0, 51, 51));
        lblMontoGP.setText("MONTO PRESTADO:");
        jpDatosPrestamo.add(lblMontoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 203, -1, -1));

        txtCodigoClienteGP.setEditable(false);
        txtCodigoClienteGP.setBackground(new java.awt.Color(204, 255, 255));
        txtCodigoClienteGP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigoClienteGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        jpDatosPrestamo.add(txtCodigoClienteGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 87, 104, -1));

        txtTeaGP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTeaGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        jpDatosPrestamo.add(txtTeaGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 146, 240, -1));

        txtPeriodosGP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPeriodosGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        jpDatosPrestamo.add(txtPeriodosGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 174, 240, -1));

        txtMontoGP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMontoGP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        jpDatosPrestamo.add(txtMontoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 202, 240, -1));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_user_male_circle_100px.png"))); // NOI18N
        jpDatosPrestamo.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 28, -1, -1));

        lblErrorTasa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorTasa.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorTasa.setText("*");
        jpDatosPrestamo.add(lblErrorTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 10, -1));

        lblErrorMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorMonto.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorMonto.setText("*");
        jpDatosPrestamo.add(lblErrorMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 10, 10));

        lblErrorPeriodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorPeriodos.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorPeriodos.setText("*");
        jpDatosPrestamo.add(lblErrorPeriodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 10, -1));

        jpContenidoGP.add(jpDatosPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 480, 250));

        btnGenerarCronograma.setBackground(new java.awt.Color(0, 102, 102));
        btnGenerarCronograma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarCronograma.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCronograma.setText("GENERAR CRONOGRAMA DE PAGOS");
        btnGenerarCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCronogramaActionPerformed(evt);
            }
        });
        jpContenidoGP.add(btnGenerarCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 800, 54));

        lblMontoGP1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMontoGP1.setForeground(new java.awt.Color(0, 102, 102));
        lblMontoGP1.setText("CÓDIGO:");
        jpContenidoGP.add(lblMontoGP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        lblCodigoGP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodigoGP.setText("PTR0000014");
        jpContenidoGP.add(lblCodigoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        lblErrorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblErrorTotal.setForeground(new java.awt.Color(102, 0, 0));
        lblErrorTotal.setText("(*) Los datos Ingresados son Incorrectos");
        jpContenidoGP.add(lblErrorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jpPrincipalGP.add(jpContenidoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 410));

        getContentPane().add(jpPrincipalGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarGPActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarGPActionPerformed

    private void btnGenerarCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCronogramaActionPerformed
        
        if(txtMontoGP.getText().length() == 0){
            lblErrorMonto.setVisible(true);
            lblErrorTotal.setText(" (*) Ingrese el monto");
            lblErrorTotal.setVisible(true);
        }
        else if (txtPeriodosGP.getText().length() ==0 ){
            lblErrorPeriodos.setVisible(true);
            lblErrorTotal.setText(" (*) Ingrese el periodo");
            lblErrorTotal.setVisible(true);
        }
        else if (txtTeaGP.getText().length() == 0){
            lblErrorTasa.setVisible(true);
            lblErrorTotal.setText(" (*) Ingrese la tasa efectiva anual");
            lblErrorTotal.setVisible(true);
        }
        
        else{

        Prestamo prestamo = new Prestamo(cliente);
        prestamo.setMontoprestado(Double.parseDouble(txtMontoGP.getText()));
        prestamo.setTea(Double.parseDouble(txtTeaGP.getText()));
        prestamo.setTotal_periodos(Integer.parseInt(txtPeriodosGP.getText()));
        prestamo.setId_prestamo(lblCodigoGP.getText());
        prestamo.setCliente(cliente);
        
        if (prestamo.validarMonto() == 0){
            lblErrorMonto.setVisible(true);
            lblErrorTotal.setText(" (*) Los datos Ingresados son Incorrectos");
            lblErrorTotal.setVisible(true);
            Mensajes.mostrarErrorMonto(this);
        }
        else if (prestamo.validarPeriodo() == 0){
            lblErrorPeriodos.setVisible(true);
            lblErrorTotal.setText(" (*) Los datos Ingresados son Incorrectos");
            lblErrorTotal.setVisible(true);
            Mensajes.mostrarErrorPeriodo(this);
        }
        else if (prestamo.validarTEA() == 0){
            lblErrorTasa.setVisible(true);
            lblErrorTotal.setText(" (*) Los datos Ingresados son Incorrectos");
            lblErrorTotal.setVisible(true);
            Mensajes.mostrarErrorTea(this);
        }
        else{
            Errores();
                    try{
                        GestionarPrestamoServicio gps = new GestionarPrestamoServicio();
                        gps.crearPrestamo(prestamo);
                        Mensajes.mostrarAfirmacionPrestamoGenerado(this);
                    }catch(Exception e){
                        Mensajes.mostrarErrorA_PrestamoGenerado(this);
                    }
                dispose();
                FormGestionarCronograma fgc = new FormGestionarCronograma(this, prestamo);
                FormGestionarCronograma.lblClienteGCR.setText(cliente.getNombre()+(" ")+cliente.getApellido());
                fgc.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnGenerarCronogramaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Errores();
        GenerarCodigo();
        txtTeaGP.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarGP;
    private javax.swing.JButton btnGenerarCronograma;
    private javax.swing.JPanel jpContenidoGP;
    private javax.swing.JPanel jpDatosPrestamo;
    private javax.swing.JPanel jpPrincipalGP;
    private javax.swing.JPanel jpTituloGP;
    public static javax.swing.JLabel lblClienteGP;
    private javax.swing.JLabel lblCodigoClienteGP;
    private javax.swing.JLabel lblCodigoGP;
    private javax.swing.JLabel lblErrorMonto;
    private javax.swing.JLabel lblErrorPeriodos;
    private javax.swing.JLabel lblErrorTasa;
    private javax.swing.JLabel lblErrorTotal;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMontoGP;
    private javax.swing.JLabel lblMontoGP1;
    private javax.swing.JLabel lblPeridoGP;
    private javax.swing.JLabel lblTeaGP;
    private javax.swing.JLabel lblTituloGP;
    public static javax.swing.JTextField txtCodigoClienteGP;
    private javax.swing.JTextField txtMontoGP;
    private javax.swing.JTextField txtPeriodosGP;
    private javax.swing.JTextField txtTeaGP;
    // End of variables declaration//GEN-END:variables
}

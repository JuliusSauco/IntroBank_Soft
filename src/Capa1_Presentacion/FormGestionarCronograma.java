
package Capa1_Presentacion;

import Capa2_Aplicacion.GestionarCronogramaServicio;
import Capa3_Dominio.Cronograma;
import Capa3_Dominio.Prestamo;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Capa6_Util.Mensajes;

public class FormGestionarCronograma extends javax.swing.JDialog {
    
    private Prestamo prestamo;
    DefaultTableModel modeloCronograma;
    
    public FormGestionarCronograma(JDialog owner) {
        super(owner, true);
        initComponents();
        setLocationRelativeTo(null);
        iniciarTabla();
        this.prestamo = new Prestamo();
    }
    
    public FormGestionarCronograma(JDialog Owner, Prestamo prestamo) {
        initComponents();
        setLocationRelativeTo(null);
        iniciarTabla();
        this.prestamo = prestamo;
        prestamo.getId_prestamo();
        lblTea.setText(String.valueOf(prestamo.getTea()));
        lblMonto.setText(String.valueOf(prestamo.getMontoprestado()));
        lblPeriodos.setText(String.valueOf(prestamo.getTotal_periodos()));
        prestamo.getCliente();
        calcularDatos(prestamo);
        lblTasaGCR.setText(String.valueOf(tasaEfectivaMensual()));
        lblCuotaGCR.setText(String.valueOf(CuotaFijaMensual()));
    }
    
    public double tasaEfectivaMensual(){
        double tem;
        double pot = 12;
        double tea1 = prestamo.getTea() + 1;
        tem = (Math.pow(tea1, 1/pot))-1;
        return tem;
    }
    
    public double CuotaFijaMensual(){
        double i = tasaEfectivaMensual();
        double P = prestamo.getMontoprestado();
        double n = prestamo.getTotal_periodos();
        double A;
        A = (P/(1-(Math.pow((1+i), -n))))*i;
        return A;
    }
    
    private void iniciarTabla(){
        modeloCronograma = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false; //Con esto conseguimos que la tabla no se pueda editar
            }
        };
        modeloCronograma.addColumn("Periodo");
        modeloCronograma.addColumn("Saldo");
        modeloCronograma.addColumn("Amortizacion");
        modeloCronograma.addColumn("Interes");
        modeloCronograma.addColumn("Cuota");
        tablaCronograma = new JTable();
        jspCronogramaGCR.setViewportView(tablaCronograma);
        tablaCronograma.setModel(modeloCronograma);
    }
    
    public void calcularDatos(Prestamo prestamo){
        int i = 0;
        double saldo = prestamo.getMontoprestado();
        while (i <= prestamo.getTotal_periodos()){
            modeloCronograma = (DefaultTableModel) tablaCronograma.getModel();
            
            if (i == 0){
                
                Object[] fila = new Object[5];
                    fila[0] = String.valueOf(i);
                    fila[1] = String.valueOf(saldo);
                    fila[2] = null;
                    fila[3] = null;
                    fila[4] = null;
                modeloCronograma.addRow(fila);
                tablaCronograma.updateUI();
            }
            else{
                
                double interes = saldo * tasaEfectivaMensual();
                double amortizacion = CuotaFijaMensual() - interes;
                saldo = saldo - amortizacion;
                
                Object[] fila = new Object[5];
                    fila[0] = String.valueOf(i);
                    fila[1] = Math.round(saldo);
                    fila[2] = Math.round(amortizacion);
                    fila[3] = Math.round(interes);
                    fila[4] = Math.round(CuotaFijaMensual());
                modeloCronograma.addRow(fila);
                tablaCronograma.updateUI();
            }
            i = i + 1;
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipalGCR = new javax.swing.JPanel();
        jpTituloGCR = new javax.swing.JPanel();
        lblTituloGCR = new javax.swing.JLabel();
        lblClienteGCR = new javax.swing.JLabel();
        btnCerrarGCR = new javax.swing.JButton();
        jpContenidoGCR = new javax.swing.JPanel();
        jpCronogramaGCR = new javax.swing.JPanel();
        jspCronogramaGCR = new javax.swing.JScrollPane();
        tablaCronograma = new javax.swing.JTable();
        jpDatosGCR = new javax.swing.JPanel();
        lblTem = new javax.swing.JLabel();
        lblCfm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTasaGCR = new javax.swing.JLabel();
        lblCuotaGCR = new javax.swing.JLabel();
        btnGuardarPrestamo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTittleTea = new javax.swing.JLabel();
        lblTittlePeriodos = new javax.swing.JLabel();
        lblTittleMonto = new javax.swing.JLabel();
        lblTea = new javax.swing.JLabel();
        lblPeriodos = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipalGCR.setBackground(new java.awt.Color(40, 40, 40));
        jpPrincipalGCR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloGCR.setBackground(new java.awt.Color(40, 40, 40));

        lblTituloGCR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloGCR.setForeground(new java.awt.Color(0, 153, 153));
        lblTituloGCR.setText("INTROBANK │ GENERAR CRONOGRAMA │");

        lblClienteGCR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteGCR.setForeground(new java.awt.Color(255, 255, 255));
        lblClienteGCR.setText("CLIENTE");

        btnCerrarGCR.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrarGCR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrarGCR.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarGCR.setText("x");
        btnCerrarGCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarGCRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTituloGCRLayout = new javax.swing.GroupLayout(jpTituloGCR);
        jpTituloGCR.setLayout(jpTituloGCRLayout);
        jpTituloGCRLayout.setHorizontalGroup(
            jpTituloGCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloGCRLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloGCR)
                .addGap(18, 18, 18)
                .addComponent(lblClienteGCR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                .addComponent(btnCerrarGCR))
        );
        jpTituloGCRLayout.setVerticalGroup(
            jpTituloGCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloGCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTituloGCR, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(lblClienteGCR)
                .addComponent(btnCerrarGCR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpPrincipalGCR.add(jpTituloGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jpContenidoGCR.setBackground(new java.awt.Color(204, 204, 204));
        jpContenidoGCR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCronogramaGCR.setBackground(new java.awt.Color(204, 204, 204));
        jpCronogramaGCR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "CRONOGRAMA DE PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N

        tablaCronograma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jspCronogramaGCR.setViewportView(tablaCronograma);

        javax.swing.GroupLayout jpCronogramaGCRLayout = new javax.swing.GroupLayout(jpCronogramaGCR);
        jpCronogramaGCR.setLayout(jpCronogramaGCRLayout);
        jpCronogramaGCRLayout.setHorizontalGroup(
            jpCronogramaGCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCronogramaGCRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspCronogramaGCR, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpCronogramaGCRLayout.setVerticalGroup(
            jpCronogramaGCRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCronogramaGCRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspCronogramaGCR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );

        jpContenidoGCR.add(jpCronogramaGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, -1, 269));

        jpDatosGCR.setBackground(new java.awt.Color(204, 204, 204));
        jpDatosGCR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "DATOS PRINCIPALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jpDatosGCR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTem.setForeground(new java.awt.Color(0, 102, 102));
        lblTem.setText("TASA EFECTIVA MENSUAL:");
        jpDatosGCR.add(lblTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 28, -1, -1));

        lblCfm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCfm.setForeground(new java.awt.Color(0, 102, 102));
        lblCfm.setText("CUOTA FIJA MENSUAL:");
        jpDatosGCR.add(lblCfm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("S/.");
        jpDatosGCR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("S/.");
        jpDatosGCR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        lblTasaGCR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTasaGCR.setText("000000000000000000");
        jpDatosGCR.add(lblTasaGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        lblCuotaGCR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCuotaGCR.setText("000000000000000000");
        jpDatosGCR.add(lblCuotaGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jpContenidoGCR.add(jpDatosGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 370, 140));

        btnGuardarPrestamo.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardarPrestamo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPrestamo.setText("GUARDAR PRÉSTAMO");
        btnGuardarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrestamoActionPerformed(evt);
            }
        });
        jpContenidoGCR.add(btnGuardarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 447, 780, 52));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "DATOS DEL PRESTAMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTittleTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTittleTea.setForeground(new java.awt.Color(0, 102, 102));
        lblTittleTea.setText("TEA");
        jPanel1.add(lblTittleTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 28, -1, -1));

        lblTittlePeriodos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTittlePeriodos.setForeground(new java.awt.Color(0, 102, 102));
        lblTittlePeriodos.setText("PERIODOS");
        jPanel1.add(lblTittlePeriodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 56, -1, -1));

        lblTittleMonto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTittleMonto.setForeground(new java.awt.Color(0, 102, 102));
        lblTittleMonto.setText("MONTO");
        jPanel1.add(lblTittleMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 84, -1, -1));

        lblTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTea.setText("0000000");
        jPanel1.add(lblTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 28, -1, -1));

        lblPeriodos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPeriodos.setText("0000000");
        jPanel1.add(lblPeriodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 56, -1, -1));

        lblMonto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMonto.setText("0000000");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 84, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/money.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jpContenidoGCR.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 370, 140));

        jpPrincipalGCR.add(jpContenidoGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 510));

        getContentPane().add(jpPrincipalGCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarGCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarGCRActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarGCRActionPerformed

    private void btnGuardarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrestamoActionPerformed

        for (int i = 1; i < tablaCronograma.getRowCount(); i++){
            Cronograma cronograma = new Cronograma(prestamo);
            cronograma.setPeriodo(Integer.parseInt(tablaCronograma.getValueAt(i, 0).toString()));
            cronograma.setSaldo(Double.parseDouble(tablaCronograma.getValueAt(i, 1).toString()));
            cronograma.setAmortizacion(Double.parseDouble(tablaCronograma.getValueAt(i, 2).toString()));
            cronograma.setInteres(Double.parseDouble(tablaCronograma.getValueAt(i, 3).toString()));
            cronograma.setCuota(Double.parseDouble(tablaCronograma.getValueAt(i, 4).toString()));
            cronograma.setTem(tasaEfectivaMensual());
            cronograma.setPrestamo(prestamo);
            
            try{
                GestionarCronogramaServicio gestionarCronogramaServicio = new GestionarCronogramaServicio();
                gestionarCronogramaServicio.crearPrestamo(cronograma);
            }catch(Exception e){
                Mensajes.mostrarErrorCronograma(this);
            }
        }
        Mensajes.mostrarAfirmacionCronograma(this);
        dispose();
        FormGestionarCliente formGestionarCliente = new FormGestionarCliente(null, true);
        formGestionarCliente.setVisible(true);
    }//GEN-LAST:event_btnGuardarPrestamoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarGCR;
    private javax.swing.JButton btnGuardarPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoGCR;
    private javax.swing.JPanel jpCronogramaGCR;
    private javax.swing.JPanel jpDatosGCR;
    private javax.swing.JPanel jpPrincipalGCR;
    private javax.swing.JPanel jpTituloGCR;
    private javax.swing.JScrollPane jspCronogramaGCR;
    private javax.swing.JLabel lblCfm;
    public static javax.swing.JLabel lblClienteGCR;
    private javax.swing.JLabel lblCuotaGCR;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblPeriodos;
    private javax.swing.JLabel lblTasaGCR;
    private javax.swing.JLabel lblTea;
    private javax.swing.JLabel lblTem;
    private javax.swing.JLabel lblTittleMonto;
    private javax.swing.JLabel lblTittlePeriodos;
    private javax.swing.JLabel lblTittleTea;
    private javax.swing.JLabel lblTituloGCR;
    private javax.swing.JTable tablaCronograma;
    // End of variables declaration//GEN-END:variables
}

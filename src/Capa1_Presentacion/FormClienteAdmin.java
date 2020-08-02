
package Capa1_Presentacion;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Capa2_Aplicacion.GestionarClienteServicio;
import Capa3_Dominio.Cliente;
import Capa6_Util.Mensajes;

public class FormClienteAdmin extends javax.swing.JDialog {
    
    DefaultTableModel modeloCliente;

    public FormClienteAdmin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        iniciarTabla();
        buscarClientes();
        txtNombreCliente.requestFocusInWindow();
    }
    
    private void iniciarTabla(){
        modeloCliente = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false; //Con esto conseguimos que la tabla no se pueda editar
            }
        };
        modeloCliente.addColumn("Código");
        modeloCliente.addColumn("Nombres");
        modeloCliente.addColumn("Apellidos");
        modeloCliente.addColumn("DNI");
        tablaClientes = new JTable();
        jsClientes.setViewportView(tablaClientes);
        tablaClientes.setModel(modeloCliente);
    }
    
    private void buscarClientes(){        
        String nombre = txtNombreCliente.getText().trim();
        try {

            GestionarClienteServicio gestionarClienteServicio = new GestionarClienteServicio();
            List<Cliente> clientes = gestionarClienteServicio.buscarClientes(nombre);
            modeloCliente = (DefaultTableModel) tablaClientes.getModel();// verificar
            modeloCliente.setRowCount(0);
            for (Cliente cliente : clientes) {
                Object[] fila = new Object[4];
                fila[0] = cliente.getId_cliente();
                fila[1] = cliente.getNombre();
                fila[2] = cliente.getApellido();
                fila[3] = cliente.getDni();
                modeloCliente.addRow(fila);
            }
            tablaClientes.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de conectar la base:" + e);
        }
    }
    
    private int obtenerId() {
        int numFila = tablaClientes.getSelectedRow();
        if(numFila == -1){
            Mensajes.mostrarFilaNoSeleccionada(this);
            return 0;
        }
        modeloCliente = (DefaultTableModel) tablaClientes.getModel();
        //Fila fila = modeloCliente.obtenerFila(numFila);
        return Integer.parseInt(tablaClientes.getValueAt(numFila, 0).toString()); // se retorna el id de la fila seleccionada
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpTituloCA = new javax.swing.JPanel();
        btnCerrarGC = new javax.swing.JButton();
        lblTituloGC = new javax.swing.JLabel();
        jpContenidoCA = new javax.swing.JPanel();
        jpBusquedadCA = new javax.swing.JPanel();
        lblIngreseNombreCA = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        cbDni = new java.awt.Checkbox();
        txtDniCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbCodigoCliente = new java.awt.Checkbox();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cbNombreCliente = new java.awt.Checkbox();
        jsClientes = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnNuevoClienteCA = new javax.swing.JButton();
        btnEditarClienteCA = new javax.swing.JButton();
        btnEliminarClienteCA = new javax.swing.JButton();
        btnNuevoPrestamoCA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTituloCA.setBackground(new java.awt.Color(40, 40, 40));

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

        lblTituloGC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloGC.setForeground(new java.awt.Color(0, 153, 153));
        lblTituloGC.setText("INTROBANK SOFT │ GESTION DE CLIENTES");

        javax.swing.GroupLayout jpTituloCALayout = new javax.swing.GroupLayout(jpTituloCA);
        jpTituloCA.setLayout(jpTituloCALayout);
        jpTituloCALayout.setHorizontalGroup(
            jpTituloCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloCALayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTituloGC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                .addComponent(btnCerrarGC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTituloCALayout.setVerticalGroup(
            jpTituloCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloCALayout.createSequentialGroup()
                .addGroup(jpTituloCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarGC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloGC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpPrincipal.add(jpTituloCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jpContenidoCA.setBackground(new java.awt.Color(204, 204, 204));
        jpContenidoCA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBusquedadCA.setBackground(new java.awt.Color(204, 204, 204));
        jpBusquedadCA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "BUSCAR CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        lblIngreseNombreCA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIngreseNombreCA.setForeground(new java.awt.Color(0, 153, 153));
        lblIngreseNombreCA.setText("INGRESE NOMBRE DEL CLIENTE");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
        });

        cbDni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbDni.setForeground(new java.awt.Color(0, 153, 153));
        cbDni.setLabel("Buscar Por DNI");

        txtDniCliente.setEnabled(false);

        jButton1.setText("...");
        jButton1.setEnabled(false);

        cbCodigoCliente.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbCodigoCliente.setForeground(new java.awt.Color(0, 153, 153));
        cbCodigoCliente.setLabel("Buscar por Código");

        jTextField1.setEnabled(false);

        jButton2.setText("...");
        jButton2.setEnabled(false);

        cbNombreCliente.setState(true);

        javax.swing.GroupLayout jpBusquedadCALayout = new javax.swing.GroupLayout(jpBusquedadCA);
        jpBusquedadCA.setLayout(jpBusquedadCALayout);
        jpBusquedadCALayout.setHorizontalGroup(
            jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBusquedadCALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpBusquedadCALayout.createSequentialGroup()
                        .addComponent(cbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jpBusquedadCALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblIngreseNombreCA)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpBusquedadCALayout.setVerticalGroup(
            jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBusquedadCALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIngreseNombreCA)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(cbCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBusquedadCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpContenidoCA.add(jpBusquedadCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jsClientes.setViewportView(tablaClientes);

        jpContenidoCA.add(jsClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 780, 278));

        btnNuevoClienteCA.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevoClienteCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoClienteCA.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoClienteCA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_add_user_male_64px.png"))); // NOI18N
        btnNuevoClienteCA.setText("NUEVO");
        btnNuevoClienteCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteCAActionPerformed(evt);
            }
        });
        jpContenidoCA.add(btnNuevoClienteCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 170, 70));

        btnEditarClienteCA.setBackground(new java.awt.Color(0, 102, 102));
        btnEditarClienteCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditarClienteCA.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarClienteCA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_edit_property_64px.png"))); // NOI18N
        btnEditarClienteCA.setText("EDITAR");
        btnEditarClienteCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteCAActionPerformed(evt);
            }
        });
        jpContenidoCA.add(btnEditarClienteCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 420, 170, 70));

        btnEliminarClienteCA.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminarClienteCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminarClienteCA.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarClienteCA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_Delete_64px.png"))); // NOI18N
        btnEliminarClienteCA.setText("ELIMINAR");
        btnEliminarClienteCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteCAActionPerformed(evt);
            }
        });
        jpContenidoCA.add(btnEliminarClienteCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 420, 170, 70));

        btnNuevoPrestamoCA.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevoPrestamoCA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoPrestamoCA.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPrestamoCA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/bank.png"))); // NOI18N
        btnNuevoPrestamoCA.setText("GESTIONAR PRÉSTAMO");
        jpContenidoCA.add(btnNuevoPrestamoCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 420, 216, 70));

        jpPrincipal.add(jpContenidoCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 500));

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

    private void btnCerrarGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarGCActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarGCActionPerformed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        // TODO add your handling code here:
        buscarClientes();
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void btnNuevoClienteCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteCAActionPerformed
        FormDatosCliente formDatosCliente = new FormDatosCliente(this);
        formDatosCliente.setVisible(true);
        buscarClientes();
    }//GEN-LAST:event_btnNuevoClienteCAActionPerformed

    private void btnEditarClienteCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteCAActionPerformed
        int id_cliente = obtenerId();
        if(id_cliente == 0)
            return;
        GestionarClienteServicio gestionarClienteServicio = new GestionarClienteServicio();    
        try {
            Cliente cliente = gestionarClienteServicio.buscarCodigo(id_cliente);    
            if(cliente != null){
                FormDatosCliente formDatosCliente = new FormDatosCliente(this, cliente);
                formDatosCliente.setVisible(true);
            }
            else
                Mensajes.mostrarFilaNoSeleccionada(this);
                buscarClientes();
        } catch(Exception e){
            Mensajes.mostrarFilaNoExiste(this);
        } 
    }//GEN-LAST:event_btnEditarClienteCAActionPerformed

    private void btnEliminarClienteCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteCAActionPerformed
        int id_cliente = obtenerId();
        if(id_cliente == 0)
            return;
        if( !Mensajes.mostrarPreguntaDeEliminacion(this) )
            return;
        GestionarClienteServicio gestionarClienteServicio = new GestionarClienteServicio();            
        Cliente cliente = new Cliente();
        cliente.setId_cliente(id_cliente);
        try {
            int registros_afectados = gestionarClienteServicio.eliminarCliente(cliente); 
            if(registros_afectados == 1)
                Mensajes.mostrarAfirmacionDeEliminacion(this);
            else
                Mensajes.mostrarAdvertenciaDeEliminacion(this);
            buscarClientes();    
        } catch(Exception e){
            Mensajes.mostrarErrorDeEliminacion(this);
        }   
    }//GEN-LAST:event_btnEliminarClienteCAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarGC;
    private javax.swing.JButton btnEditarClienteCA;
    private javax.swing.JButton btnEliminarClienteCA;
    private javax.swing.JButton btnNuevoClienteCA;
    private javax.swing.JButton btnNuevoPrestamoCA;
    private java.awt.Checkbox cbCodigoCliente;
    private java.awt.Checkbox cbDni;
    private java.awt.Checkbox cbNombreCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpBusquedadCA;
    private javax.swing.JPanel jpContenidoCA;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTituloCA;
    private javax.swing.JScrollPane jsClientes;
    private javax.swing.JLabel lblIngreseNombreCA;
    private javax.swing.JLabel lblTituloGC;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}

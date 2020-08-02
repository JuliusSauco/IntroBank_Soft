
package Capa1_Presentacion;

import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Capa6_Util/Images/icono.png")).getImage());
        setLocationRelativeTo(null);
        lblError.setVisible(false);
        txtUser.requestFocusInWindow();
    }
    
    private final String User = "ADMIN";
    private final String Pass = "@123456";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelCredenciales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnOlvido = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setOpacity(0.9F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/LoginFondo.jpg"))); // NOI18N
        PanelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, -1, -1));

        getContentPane().add(PanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        PanelCredenciales.setBackground(new java.awt.Color(40, 40, 40));
        PanelCredenciales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");
        jLabel1.setIconTextGap(1);
        PanelCredenciales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 11, -1, -1));

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUser.setOpaque(false);
        PanelCredenciales.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO:");
        jLabel3.setIconTextGap(3);
        PanelCredenciales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 187, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA:");
        PanelCredenciales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_user_male_circle_100px.png"))); // NOI18N
        jLabel5.setIconTextGap(2);
        PanelCredenciales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 69, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(40, 40, 40));
        btnEntrar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 102, 102));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setIconTextGap(7);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        PanelCredenciales.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 271, 48));

        btnOlvido.setBackground(new java.awt.Color(40, 40, 40));
        btnOlvido.setForeground(new java.awt.Color(0, 102, 153));
        btnOlvido.setText("¿Ha olvidado la contraseña?");
        btnOlvido.setBorder(null);
        btnOlvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOlvido.setIconTextGap(6);
        PanelCredenciales.add(btnOlvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 271, 20));

        btnCerrar.setBackground(new java.awt.Color(40, 40, 40));
        btnCerrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setIconTextGap(8);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        PanelCredenciales.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 0, 31, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tolos los derechos reservados Copyrigth 2019 - Zycryx Creative ®");
        jLabel7.setIconTextGap(9);
        PanelCredenciales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 459, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_private2_26px.png"))); // NOI18N
        PanelCredenciales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 30, 32));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capa6_Util/Images/icons8_user_male_circle_25px_1.png"))); // NOI18N
        PanelCredenciales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 30, 32));

        lblError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("*Usuario y/o contraseña incorrectos");
        PanelCredenciales.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        txtPass.setBackground(new java.awt.Color(40, 40, 40));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PanelCredenciales.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 240, 30));

        getContentPane().add(PanelCredenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 390, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        if (txtUser.getText().equals(User) && txtPass.getText().equals(Pass)){
            dispose();
            MenuPrincipal mp = new MenuPrincipal();
            mp.setVisible(true);
        }
        else
        {
            lblError.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCredenciales;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnOlvido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}

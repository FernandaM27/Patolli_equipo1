/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import controles.ControlBase;
import controles.ControlComoJugar;
import java.util.Observable;
import modelos.ModeloComoJugar;

/**
 *
 * @author fermi
 */
public class FrmComoJugar extends javax.swing.JFrame implements FrameBase<ControlComoJugar, ModeloComoJugar> {

    private static FrmComoJugar frm;
    private ModeloComoJugar modeloComoJugar;

    /**
     * Singletoon pendiente de hacer
     *
     * @return
     */
    private FrmComoJugar() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.modeloComoJugar = new ModeloComoJugar();
        this.asignarEventos(ControlComoJugar.getInstance(this));
        this.inicializarComandos();
        this.asignarEtiquetas();
    }

    public static FrmComoJugar getInstance() {
        if (frm == null) {
            frm = new FrmComoJugar();
        }
        return frm;
    }

    private void inicializarComandos() {
        this.btnSalir.setActionCommand("Salir");
    }

    @Override
    public void update(Observable o, Object arg) {
        this.asignarEtiquetas();
    }

    @Override
    public void asignarEtiquetas() {
        this.lblTitulo.setText(this.modeloComoJugar.getEtiquetas().get(0));
        this.lbl1.setText(this.modeloComoJugar.getEtiquetas().get(1));
        this.lbl2.setText(this.modeloComoJugar.getEtiquetas().get(2));
        this.lbl3.setText(this.modeloComoJugar.getEtiquetas().get(3));
        this.lbl4.setText(this.modeloComoJugar.getEtiquetas().get(4));
        this.lbl5.setText(this.modeloComoJugar.getEtiquetas().get(5));
        this.btnSalir.setText(this.modeloComoJugar.getEtiquetas().get(6));
    }

    @Override
    public void asignarComando() {
        this.btnSalir.setActionCommand("Salir");
    }

    @Override
    public void asignarEventos(ControlBase control) {
        this.btnSalir.addActionListener(control);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 240, 173));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 173), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Algerian", 0, 34)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(58, 162, 113));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lbl3.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        lbl3.setForeground(new java.awt.Color(9, 17, 6));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mm4.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 400));

        btnSalir.setBackground(new java.awt.Color(58, 162, 113));
        btnSalir.setFont(new java.awt.Font("Algerian", 0, 26)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(247, 180, 93));
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 140, 40));

        lbl4.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        lbl4.setForeground(new java.awt.Color(9, 17, 6));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 280, -1));

        lbl5.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        lbl5.setForeground(new java.awt.Color(9, 17, 6));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 330, -1));

        lbl1.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        lbl1.setForeground(new java.awt.Color(9, 17, 6));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 280, -1));

        lbl2.setFont(new java.awt.Font("Algerian", 0, 19)); // NOI18N
        lbl2.setForeground(new java.awt.Color(9, 17, 6));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 330, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmPrincipal frmPrincipal = FrmPrincipal.getInstance();
        frmPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}

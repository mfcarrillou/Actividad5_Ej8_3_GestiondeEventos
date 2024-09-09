package ej8_3_gestiondeeventos;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiguras = new javax.swing.JPanel();
        botonCilindro = new javax.swing.JButton();
        botonEsfera = new javax.swing.JButton();
        botonPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");
        setPreferredSize(new java.awt.Dimension(350, 160));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 160));

        panelFiguras.setSize(new java.awt.Dimension(350, 160));

        botonCilindro.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonCilindro.setForeground(new java.awt.Color(76, 40, 130));
        botonCilindro.setText("Cilindro");
        botonCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCilindroActionPerformed(evt);
            }
        });

        botonEsfera.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonEsfera.setForeground(new java.awt.Color(0, 73, 88));
        botonEsfera.setText("Esfera");
        botonEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEsferaActionPerformed(evt);
            }
        });

        botonPiramide.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonPiramide.setForeground(new java.awt.Color(230, 95, 0));
        botonPiramide.setText("Pirámide");
        botonPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiramideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFigurasLayout = new javax.swing.GroupLayout(panelFiguras);
        panelFiguras.setLayout(panelFigurasLayout);
        panelFigurasLayout.setHorizontalGroup(
            panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFigurasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        panelFigurasLayout.setVerticalGroup(
            panelFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFigurasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(botonCilindro)
                .addGap(12, 12, 12)
                .addComponent(botonEsfera)
                .addGap(12, 12, 12)
                .addComponent(botonPiramide)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCilindroActionPerformed
        VentanaCilindro ventanaCilindro = new VentanaCilindro();
        ventanaCilindro.setVisible(true);
    }//GEN-LAST:event_botonCilindroActionPerformed

    private void botonEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEsferaActionPerformed
        VentanaEsfera ventanaEsfera = new VentanaEsfera();
        ventanaEsfera.setVisible(true);
    }//GEN-LAST:event_botonEsferaActionPerformed

    private void botonPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiramideActionPerformed
        VentanaPiramide ventanaPiramide = new VentanaPiramide();
        ventanaPiramide.setVisible(true);
    }//GEN-LAST:event_botonPiramideActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCilindro;
    private javax.swing.JButton botonEsfera;
    private javax.swing.JButton botonPiramide;
    private javax.swing.JPanel panelFiguras;
    // End of variables declaration//GEN-END:variables
}
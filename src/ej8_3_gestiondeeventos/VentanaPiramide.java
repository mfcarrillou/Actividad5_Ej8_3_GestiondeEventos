package ej8_3_gestiondeeventos;

import javax.swing.*;

public class VentanaPiramide extends javax.swing.JFrame {

    public VentanaPiramide() {
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPiramide = new javax.swing.JPanel();
        etqBase = new javax.swing.JLabel();
        etqAltura = new javax.swing.JLabel();
        etqApotema = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        campoBase = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoApotema = new javax.swing.JTextField();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pirámide");
        setResizable(false);
        setSize(new java.awt.Dimension(280, 250));

        panelPiramide.setPreferredSize(new java.awt.Dimension(280, 250));
        panelPiramide.setSize(new java.awt.Dimension(280, 250));

        etqBase.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqBase.setText("Base (cm)");

        etqAltura.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqAltura.setText("Altura (cm)");

        etqApotema.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqApotema.setText("Apotema (cm)");

        botonCalcular.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(230, 95, 0));
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        campoBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoApotema.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        volumen.setForeground(new java.awt.Color(230, 95, 0));
        volumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumen.setText("Volumen (cm³) =");

        superficie.setForeground(new java.awt.Color(230, 95, 0));
        superficie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        superficie.setText("Superficie (cm²) =");

        javax.swing.GroupLayout panelPiramideLayout = new javax.swing.GroupLayout(panelPiramide);
        panelPiramide.setLayout(panelPiramideLayout);
        panelPiramideLayout.setHorizontalGroup(
            panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPiramideLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(panelPiramideLayout.createSequentialGroup()
                        .addComponent(etqBase, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPiramideLayout.createSequentialGroup()
                        .addComponent(etqAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPiramideLayout.createSequentialGroup()
                        .addComponent(etqApotema)
                        .addGap(12, 12, 12)
                        .addComponent(campoApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCalcular)
                    .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelPiramideLayout.setVerticalGroup(
            panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPiramideLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqBase)
                    .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAltura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelPiramideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApotema)
                    .addComponent(campoApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(botonCalcular)
                .addGap(10, 10, 10)
                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        boolean error = false;
        try {
            double b = Double.parseDouble(campoBase.getText());
            double a = Double.parseDouble(campoAltura.getText());
            double apot = Double.parseDouble(campoApotema.getText());
            Piramide piramide = new Piramide(b,a,apot);
            String vol = "Volumen (cm³) = " + String.format("%.2f",piramide.volumen);
            volumen.setText(vol);
            String sup = "Superficie (cm²) = " + String.format("%.2f",piramide.superficie);
            superficie.setText(sup);
        } catch (Exception e){
            error = true;
        } finally {
            if (error == true){
                JOptionPane.showMessageDialog(null,"Valor ingresado nulo o no válido","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPiramide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoApotema;
    private javax.swing.JTextField campoBase;
    private javax.swing.JLabel etqAltura;
    private javax.swing.JLabel etqApotema;
    private javax.swing.JLabel etqBase;
    private javax.swing.JPanel panelPiramide;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
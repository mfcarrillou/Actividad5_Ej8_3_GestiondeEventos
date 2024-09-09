package ej8_3_gestiondeeventos;

import javax.swing.*;

public class VentanaCilindro extends javax.swing.JFrame {

    public VentanaCilindro() {
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCilindro = new javax.swing.JPanel();
        etqRadio = new javax.swing.JLabel();
        etqAltura = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cilindro");
        setResizable(false);
        setSize(new java.awt.Dimension(280, 210));

        panelCilindro.setPreferredSize(new java.awt.Dimension(280, 210));
        panelCilindro.setSize(new java.awt.Dimension(280, 210));

        etqRadio.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqRadio.setText("Radio (cm)");

        etqAltura.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqAltura.setText("Altura (cm)");

        campoRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonCalcular.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(76, 40, 130));
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        volumen.setForeground(new java.awt.Color(76, 40, 130));
        volumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumen.setText("Volumen (cm³) =");

        superficie.setForeground(new java.awt.Color(76, 40, 130));
        superficie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        superficie.setText("Superficie (cm²) =");

        javax.swing.GroupLayout panelCilindroLayout = new javax.swing.GroupLayout(panelCilindro);
        panelCilindro.setLayout(panelCilindroLayout);
        panelCilindroLayout.setHorizontalGroup(
            panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCilindroLayout.createSequentialGroup()
                .addGroup(panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCilindroLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCilindroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCilindroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCilindroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqAltura)
                            .addComponent(etqRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCilindroLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(botonCalcular)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelCilindroLayout.setVerticalGroup(
            panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCilindroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqRadio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelCilindroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAltura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(botonCalcular)
                .addGap(10, 10, 10)
                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        boolean error = false;
        try {
            double r = Double.parseDouble(campoRadio.getText());
            double alt = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(r,alt);
            String vol = "Volumen (cm³) = " + String.format("%.2f",cilindro.volumen);
            volumen.setText(vol);
            String sup = "Superficie (cm²) = " + String.format("%.2f",cilindro.superficie);
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
                new VentanaCilindro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel etqAltura;
    private javax.swing.JLabel etqRadio;
    private javax.swing.JPanel panelCilindro;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
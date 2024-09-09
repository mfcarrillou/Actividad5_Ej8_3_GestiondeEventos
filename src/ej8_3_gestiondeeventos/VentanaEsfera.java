package ej8_3_gestiondeeventos;

import javax.swing.*;

public class VentanaEsfera extends javax.swing.JFrame {

    public VentanaEsfera() {
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEsfera = new javax.swing.JPanel();
        etqRadio = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esfera");
        setResizable(false);
        setSize(new java.awt.Dimension(280, 180));

        panelEsfera.setMinimumSize(new java.awt.Dimension(280, 200));
        panelEsfera.setPreferredSize(new java.awt.Dimension(280, 180));
        panelEsfera.setSize(new java.awt.Dimension(280, 180));

        etqRadio.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etqRadio.setText("Radio (cm)");

        campoRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonCalcular.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        botonCalcular.setForeground(new java.awt.Color(0, 73, 88));
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        volumen.setForeground(new java.awt.Color(0, 73, 88));
        volumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumen.setText("Volumen (cm³) =");

        superficie.setForeground(new java.awt.Color(0, 73, 88));
        superficie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        superficie.setText("Superficie (cm²) =");

        javax.swing.GroupLayout panelEsferaLayout = new javax.swing.GroupLayout(panelEsfera);
        panelEsfera.setLayout(panelEsferaLayout);
        panelEsferaLayout.setHorizontalGroup(
            panelEsferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsferaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelEsferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEsferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(botonCalcular)
                        .addGroup(panelEsferaLayout.createSequentialGroup()
                            .addComponent(etqRadio)
                            .addGap(12, 12, 12)
                            .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        panelEsferaLayout.setVerticalGroup(
            panelEsferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEsferaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelEsferaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqRadio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        boolean error = false;
        try {
            double r = Double.parseDouble(campoRadio.getText());
            Esfera esfera = new Esfera(r);
            String vol = "Volumen (cm³) = " + String.format("%.2f",esfera.volumen);
            volumen.setText(vol);
            String sup = "Superficie (cm²) = " + String.format("%.2f",esfera.superficie);
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
                new VentanaEsfera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel etqRadio;
    private javax.swing.JPanel panelEsfera;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
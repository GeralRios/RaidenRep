/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista;

/**
 *
 * @author sistemas
 */
public class FrmBusquedaResidente extends javax.swing.JFrame {

    /**
     * Creates new form FrmBUSQUEDA_RESIDENTE
     */
    public FrmBusquedaResidente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jSeparator1 = new javax.swing.JSeparator();
        labelRect1 = new org.edisoncor.gui.label.LabelRect();
        TxtNumeroId = new org.edisoncor.gui.textField.TextField();
        labelRect2 = new org.edisoncor.gui.label.LabelRect();
        TxtNombre = new org.edisoncor.gui.textField.TextField();
        BtnConsultar = new org.edisoncor.gui.button.ButtonIcon();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        labelRect3 = new org.edisoncor.gui.label.LabelRect();
        buttonAero1 = new org.edisoncor.gui.button.ButtonAero();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnGrabar = new org.edisoncor.gui.button.ButtonAero();
        comboBoxRect1 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        labelRect4 = new org.edisoncor.gui.label.LabelRect();
        labelRect5 = new org.edisoncor.gui.label.LabelRect();
        labelRect6 = new org.edisoncor.gui.label.LabelRect();
        TxtNombre1 = new org.edisoncor.gui.textField.TextField();
        TxtNombre2 = new org.edisoncor.gui.textField.TextField();
        TxtNombre3 = new org.edisoncor.gui.textField.TextField();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sistemas\\Pictures\\descarga.jpg")); // NOI18N

        labelTask1.setForeground(new java.awt.Color(0, 0, 0));
        labelTask1.setText("EDIFICIO MULTIFAMILIAR VILLARKADIA II");
        labelTask1.setCategoryFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        labelTask1.setCategorySmallFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        labelTask1.setDescription("    NIT: 809.011.052-5      CALLE 47 A N° 3 - 48 SUR");

        panelImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sistemas\\Pictures\\ICONNN.jpg")); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelRect1.setBackground(new java.awt.Color(255, 255, 255));
        labelRect1.setForeground(new java.awt.Color(0, 0, 0));
        labelRect1.setText("APARTAMENTO:");

        TxtNumeroId.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumeroId.setForeground(new java.awt.Color(0, 0, 0));
        TxtNumeroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroIdActionPerformed(evt);
            }
        });

        labelRect2.setBackground(new java.awt.Color(255, 255, 255));
        labelRect2.setForeground(new java.awt.Color(0, 0, 0));
        labelRect2.setText("PRIMER NOMBRE:");

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        BtnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        BtnConsultar.setIcon(new javax.swing.ImageIcon("C:\\Users\\sistemas\\Pictures\\lupa.png")); // NOI18N
        BtnConsultar.setText("buttonIcon1");

        panelShadow1.setBackground(new java.awt.Color(0, 0, 0));
        panelShadow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelRect3.setBackground(new java.awt.Color(255, 255, 255));
        labelRect3.setForeground(new java.awt.Color(0, 0, 0));
        labelRect3.setText("NUMERO ID RESIDENTE:");

        buttonAero1.setBackground(new java.awt.Color(204, 204, 204));
        buttonAero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAero1.setForeground(new java.awt.Color(0, 0, 0));
        buttonAero1.setText("ADICIONAR");
        buttonAero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAero1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NUMERO ID RESIDENTE ", "FECHA DE INGRESO", "FECHA DE RETIRO"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");

        BtnGrabar.setBackground(new java.awt.Color(204, 204, 204));
        BtnGrabar.setForeground(new java.awt.Color(0, 0, 0));
        BtnGrabar.setText("GRABAR");

        comboBoxRect1.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxRect1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(labelRect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAero1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(BtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRect3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAero1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        labelRect4.setBackground(new java.awt.Color(255, 255, 255));
        labelRect4.setForeground(new java.awt.Color(0, 0, 0));
        labelRect4.setText("SEGUNDO NOMBRE:");

        labelRect5.setBackground(new java.awt.Color(255, 255, 255));
        labelRect5.setForeground(new java.awt.Color(0, 0, 0));
        labelRect5.setText("PRIMER APELLIDO:");

        labelRect6.setBackground(new java.awt.Color(255, 255, 255));
        labelRect6.setForeground(new java.awt.Color(0, 0, 0));
        labelRect6.setText("SEGUNDO APELLIDO:");

        TxtNombre1.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre1ActionPerformed(evt);
            }
        });

        TxtNombre2.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre2.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre2ActionPerformed(evt);
            }
        });

        TxtNombre3.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre3.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombre3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelRect5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(labelRect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRect2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        labelTask1.getAccessibleContext().setAccessibleName("EDIFICO MULTIFAMILIAR VILLARKADIA II");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumeroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroIdActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void buttonAero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAero1ActionPerformed

    private void TxtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre1ActionPerformed

    private void TxtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre2ActionPerformed

    private void TxtNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombre3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaResidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusquedaResidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon BtnConsultar;
    private org.edisoncor.gui.button.ButtonAero BtnGrabar;
    private org.edisoncor.gui.textField.TextField TxtNombre;
    private org.edisoncor.gui.textField.TextField TxtNombre1;
    private org.edisoncor.gui.textField.TextField TxtNombre2;
    private org.edisoncor.gui.textField.TextField TxtNombre3;
    private org.edisoncor.gui.textField.TextField TxtNumeroId;
    private org.edisoncor.gui.button.ButtonAero buttonAero1;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.label.LabelRect labelRect1;
    private org.edisoncor.gui.label.LabelRect labelRect2;
    private org.edisoncor.gui.label.LabelRect labelRect3;
    private org.edisoncor.gui.label.LabelRect labelRect4;
    private org.edisoncor.gui.label.LabelRect labelRect5;
    private org.edisoncor.gui.label.LabelRect labelRect6;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables

    public org.edisoncor.gui.button.ButtonIcon getBtnConsultar() {
        return BtnConsultar;
    }

    public void setBtnConsultar(org.edisoncor.gui.button.ButtonIcon BtnConsultar) {
        this.BtnConsultar = BtnConsultar;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnGrabar() {
        return BtnGrabar;
    }

    public void setBtnGrabar(org.edisoncor.gui.button.ButtonAero BtnGrabar) {
        this.BtnGrabar = BtnGrabar;
    }

    public org.edisoncor.gui.textField.TextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(org.edisoncor.gui.textField.TextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public org.edisoncor.gui.textField.TextField getTxtNombre1() {
        return TxtNombre1;
    }

    public void setTxtNombre1(org.edisoncor.gui.textField.TextField TxtNombre1) {
        this.TxtNombre1 = TxtNombre1;
    }

    public org.edisoncor.gui.textField.TextField getTxtNombre2() {
        return TxtNombre2;
    }

    public void setTxtNombre2(org.edisoncor.gui.textField.TextField TxtNombre2) {
        this.TxtNombre2 = TxtNombre2;
    }

    public org.edisoncor.gui.textField.TextField getTxtNombre3() {
        return TxtNombre3;
    }

    public void setTxtNombre3(org.edisoncor.gui.textField.TextField TxtNombre3) {
        this.TxtNombre3 = TxtNombre3;
    }

    public org.edisoncor.gui.textField.TextField getTxtNumeroId() {
        return TxtNumeroId;
    }

    public void setTxtNumeroId(org.edisoncor.gui.textField.TextField TxtNumeroId) {
        this.TxtNumeroId = TxtNumeroId;
    }

    public org.edisoncor.gui.button.ButtonAero getButtonAero1() {
        return buttonAero1;
    }

    public void setButtonAero1(org.edisoncor.gui.button.ButtonAero buttonAero1) {
        this.buttonAero1 = buttonAero1;
    }

    public org.edisoncor.gui.comboBox.ComboBoxRect getComboBoxRect1() {
        return comboBoxRect1;
    }

    public void setComboBoxRect1(org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect1) {
        this.comboBoxRect1 = comboBoxRect1;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public javax.swing.JSpinner getjSpinner1() {
        return jSpinner1;
    }

    public void setjSpinner1(javax.swing.JSpinner jSpinner1) {
        this.jSpinner1 = jSpinner1;
    }

    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(javax.swing.JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect1() {
        return labelRect1;
    }

    public void setLabelRect1(org.edisoncor.gui.label.LabelRect labelRect1) {
        this.labelRect1 = labelRect1;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect2() {
        return labelRect2;
    }

    public void setLabelRect2(org.edisoncor.gui.label.LabelRect labelRect2) {
        this.labelRect2 = labelRect2;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect3() {
        return labelRect3;
    }

    public void setLabelRect3(org.edisoncor.gui.label.LabelRect labelRect3) {
        this.labelRect3 = labelRect3;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect4() {
        return labelRect4;
    }

    public void setLabelRect4(org.edisoncor.gui.label.LabelRect labelRect4) {
        this.labelRect4 = labelRect4;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect5() {
        return labelRect5;
    }

    public void setLabelRect5(org.edisoncor.gui.label.LabelRect labelRect5) {
        this.labelRect5 = labelRect5;
    }

    public org.edisoncor.gui.label.LabelRect getLabelRect6() {
        return labelRect6;
    }

    public void setLabelRect6(org.edisoncor.gui.label.LabelRect labelRect6) {
        this.labelRect6 = labelRect6;
    }

    public org.edisoncor.gui.label.LabelTask getLabelTask1() {
        return labelTask1;
    }

    public void setLabelTask1(org.edisoncor.gui.label.LabelTask labelTask1) {
        this.labelTask1 = labelTask1;
    }

    public org.edisoncor.gui.panel.PanelImage getPanelImage1() {
        return panelImage1;
    }

    public void setPanelImage1(org.edisoncor.gui.panel.PanelImage panelImage1) {
        this.panelImage1 = panelImage1;
    }

    public org.edisoncor.gui.panel.PanelImage getPanelImage2() {
        return panelImage2;
    }

    public void setPanelImage2(org.edisoncor.gui.panel.PanelImage panelImage2) {
        this.panelImage2 = panelImage2;
    }

    public org.edisoncor.gui.panel.PanelShadow getPanelShadow1() {
        return panelShadow1;
    }

    public void setPanelShadow1(org.edisoncor.gui.panel.PanelShadow panelShadow1) {
        this.panelShadow1 = panelShadow1;
    }

   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista;

/**
 *
 * @author sistemas
 */
public class FrmInserts extends javax.swing.JFrame {

    /**
     * Creates new form FrmInserts
     */
    public FrmInserts() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPrimerNombre = new org.edisoncor.gui.textField.TextField();
        BtnGrabar = new org.edisoncor.gui.button.ButtonAero();
        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        NUMEROAPARTAMENTO = new org.edisoncor.gui.label.LabelRect();
        NUMEROBLOQUE = new org.edisoncor.gui.label.LabelRect();
        NUMEROPISO = new org.edisoncor.gui.label.LabelRect();
        TxtNumeroBloque = new org.edisoncor.gui.textField.TextField();
        TxtNumeroPiso = new org.edisoncor.gui.textField.TextField();
        TxtNumeroApartamento = new org.edisoncor.gui.textField.TextField();
        jSeparator2 = new javax.swing.JSeparator();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        BtnGrabar1 = new org.edisoncor.gui.button.ButtonAero();
        BtnLimpiar = new org.edisoncor.gui.button.ButtonAero();
        BtnActualizar = new org.edisoncor.gui.button.ButtonAero();

        TxtPrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtPrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrimerNombreActionPerformed(evt);
            }
        });

        BtnGrabar.setBackground(new java.awt.Color(204, 204, 204));
        BtnGrabar.setForeground(new java.awt.Color(0, 0, 0));
        BtnGrabar.setText("GRABAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sistemas\\Pictures\\descarga.jpg")); // NOI18N

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagenes/ICONNN.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        labelTask1.setForeground(new java.awt.Color(0, 0, 0));
        labelTask1.setText("EDIFICIO MULTIFAMILIAR VILLARKADIA II");
        labelTask1.setCategoryFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        labelTask1.setCategorySmallFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelTask1.setDescription("         NIT 809.011.052-5      calle 47 A N°3 -48 sur"); // NOI18N

        NUMEROAPARTAMENTO.setBackground(new java.awt.Color(255, 255, 255));
        NUMEROAPARTAMENTO.setForeground(new java.awt.Color(0, 0, 0));
        NUMEROAPARTAMENTO.setText("NUMERO APARTAMENTOS POR PISO");

        NUMEROBLOQUE.setBackground(new java.awt.Color(255, 255, 255));
        NUMEROBLOQUE.setForeground(new java.awt.Color(0, 0, 0));
        NUMEROBLOQUE.setText("NUMERO DE BLOQUES");

        NUMEROPISO.setBackground(new java.awt.Color(255, 255, 255));
        NUMEROPISO.setForeground(new java.awt.Color(0, 0, 0));
        NUMEROPISO.setText("NUMERO DE PISOS");

        TxtNumeroBloque.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumeroBloque.setForeground(new java.awt.Color(0, 0, 0));
        TxtNumeroBloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroBloqueActionPerformed(evt);
            }
        });

        TxtNumeroPiso.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumeroPiso.setForeground(new java.awt.Color(0, 0, 0));
        TxtNumeroPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroPisoActionPerformed(evt);
            }
        });

        TxtNumeroApartamento.setBackground(new java.awt.Color(255, 255, 255));
        TxtNumeroApartamento.setForeground(new java.awt.Color(0, 0, 0));
        TxtNumeroApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroApartamentoActionPerformed(evt);
            }
        });

        panelShadow1.setBackground(new java.awt.Color(0, 0, 0));
        panelShadow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnGrabar1.setBackground(new java.awt.Color(204, 204, 204));
        BtnGrabar1.setForeground(new java.awt.Color(0, 0, 0));
        BtnGrabar1.setText("GRABAR");
        BtnGrabar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabar1ActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BtnLimpiar.setText("LIMPIAR");

        BtnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        BtnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(BtnGrabar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrabar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NUMEROAPARTAMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NUMEROPISO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NUMEROBLOQUE, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNumeroBloque, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumeroApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMEROBLOQUE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumeroBloque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMEROPISO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumeroPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMEROAPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNumeroApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrimerNombreActionPerformed

    private void TxtNumeroBloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroBloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroBloqueActionPerformed

    private void TxtNumeroPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroPisoActionPerformed

    private void TxtNumeroApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroApartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroApartamentoActionPerformed

    private void BtnGrabar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGrabar1ActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero BtnActualizar;
    private org.edisoncor.gui.button.ButtonAero BtnGrabar;
    private org.edisoncor.gui.button.ButtonAero BtnGrabar1;
    private org.edisoncor.gui.button.ButtonAero BtnLimpiar;
    private org.edisoncor.gui.label.LabelRect NUMEROAPARTAMENTO;
    private org.edisoncor.gui.label.LabelRect NUMEROBLOQUE;
    private org.edisoncor.gui.label.LabelRect NUMEROPISO;
    private org.edisoncor.gui.textField.TextField TxtNumeroApartamento;
    private org.edisoncor.gui.textField.TextField TxtNumeroBloque;
    private org.edisoncor.gui.textField.TextField TxtNumeroPiso;
    private org.edisoncor.gui.textField.TextField TxtPrimerNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables

    public org.edisoncor.gui.button.ButtonAero getBtnActualizar() {
        return BtnActualizar;
    }

    public void setBtnActualizar(org.edisoncor.gui.button.ButtonAero BtnActualizar) {
        this.BtnActualizar = BtnActualizar;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnGrabar() {
        return BtnGrabar;
    }

    public void setBtnGrabar(org.edisoncor.gui.button.ButtonAero BtnGrabar) {
        this.BtnGrabar = BtnGrabar;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnGrabar1() {
        return BtnGrabar1;
    }

    public void setBtnGrabar1(org.edisoncor.gui.button.ButtonAero BtnGrabar1) {
        this.BtnGrabar1 = BtnGrabar1;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnLimpiar() {
        return BtnLimpiar;
    }

    public void setBtnLimpiar(org.edisoncor.gui.button.ButtonAero BtnLimpiar) {
        this.BtnLimpiar = BtnLimpiar;
    }

    public org.edisoncor.gui.label.LabelRect getNUMEROAPARTAMENTO() {
        return NUMEROAPARTAMENTO;
    }

    public void setNUMEROAPARTAMENTO(org.edisoncor.gui.label.LabelRect NUMEROAPARTAMENTO) {
        this.NUMEROAPARTAMENTO = NUMEROAPARTAMENTO;
    }

    public org.edisoncor.gui.label.LabelRect getNUMEROBLOQUE() {
        return NUMEROBLOQUE;
    }

    public void setNUMEROBLOQUE(org.edisoncor.gui.label.LabelRect NUMEROBLOQUE) {
        this.NUMEROBLOQUE = NUMEROBLOQUE;
    }

    public org.edisoncor.gui.label.LabelRect getNUMEROPISO() {
        return NUMEROPISO;
    }

    public void setNUMEROPISO(org.edisoncor.gui.label.LabelRect NUMEROPISO) {
        this.NUMEROPISO = NUMEROPISO;
    }

    public org.edisoncor.gui.textField.TextField getTxtNumeroApartamento() {
        return TxtNumeroApartamento;
    }

    public void setTxtNumeroApartamento(org.edisoncor.gui.textField.TextField TxtNumeroApartamento) {
        this.TxtNumeroApartamento = TxtNumeroApartamento;
    }

    public org.edisoncor.gui.textField.TextField getTxtNumeroBloque() {
        return TxtNumeroBloque;
    }

    public void setTxtNumeroBloque(org.edisoncor.gui.textField.TextField TxtNumeroBloque) {
        this.TxtNumeroBloque = TxtNumeroBloque;
    }

    public org.edisoncor.gui.textField.TextField getTxtNumeroPiso() {
        return TxtNumeroPiso;
    }

    public void setTxtNumeroPiso(org.edisoncor.gui.textField.TextField TxtNumeroPiso) {
        this.TxtNumeroPiso = TxtNumeroPiso;
    }

    public org.edisoncor.gui.textField.TextField getTxtPrimerNombre() {
        return TxtPrimerNombre;
    }

    public void setTxtPrimerNombre(org.edisoncor.gui.textField.TextField TxtPrimerNombre) {
        this.TxtPrimerNombre = TxtPrimerNombre;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(javax.swing.JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
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

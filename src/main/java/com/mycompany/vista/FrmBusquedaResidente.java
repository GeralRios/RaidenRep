/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vista;

import javax.accessibility.AccessibleContext;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.edisoncor.gui.button.ButtonAero;
import org.edisoncor.gui.button.ButtonIcon;
import org.edisoncor.gui.comboBox.ComboBoxRect;
import org.edisoncor.gui.label.LabelRect;
import org.edisoncor.gui.label.LabelTask;
import org.edisoncor.gui.panel.PanelImage;
import org.edisoncor.gui.panel.PanelShadow;
import org.edisoncor.gui.textField.TextField;

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
        setLocationRelativeTo(null);
        configurarTablaRegistro();
    }
    private void  configurarTablaRegistro(){
        String cabecera[] = {"numero id residente"};
        DefaultTableModel tblModel= new DefaultTableModel (cabecera,0);
        TblRegistroG.setModel((TableModel) dtmRegistro);
    }   

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify dtmRegistro this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jSeparator1 = new javax.swing.JSeparator();
        Apartamento = new org.edisoncor.gui.label.LabelRect();
        PrimerNombre = new org.edisoncor.gui.label.LabelRect();
        TxtSegundoNombre = new org.edisoncor.gui.textField.TextField();
        BtnConsultarApartamento = new org.edisoncor.gui.button.ButtonIcon();
        dtmRegistro = new org.edisoncor.gui.panel.PanelShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRegistroG = new javax.swing.JTable();
        BtnGrabarTabla = new org.edisoncor.gui.button.ButtonAero();
        BtnLimpiar = new org.edisoncor.gui.button.ButtonAero();
        labelRect4 = new org.edisoncor.gui.label.LabelRect();
        PrimerApellido = new org.edisoncor.gui.label.LabelRect();
        labelRect6 = new org.edisoncor.gui.label.LabelRect();
        TxtSegundoApellido = new org.edisoncor.gui.textField.TextField();
        TxtApartamento = new org.edisoncor.gui.textField.TextField();
        TxtPrimerNombre = new org.edisoncor.gui.textField.TextField();
        TxtPrimerApellido = new org.edisoncor.gui.textField.TextField();
        labelRect3 = new org.edisoncor.gui.label.LabelRect();
        TxtTipo = new org.edisoncor.gui.comboBox.ComboBoxRect();
        jSeparator2 = new javax.swing.JSeparator();

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

        Apartamento.setBackground(new java.awt.Color(255, 255, 255));
        Apartamento.setForeground(new java.awt.Color(0, 0, 0));
        Apartamento.setText("APARTAMENTO:");

        PrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        PrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        PrimerNombre.setText("PRIMER NOMBRE:");

        TxtSegundoNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtSegundoNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSegundoNombreActionPerformed(evt);
            }
        });

        BtnConsultarApartamento.setBackground(new java.awt.Color(255, 255, 255));
        BtnConsultarApartamento.setIcon(new javax.swing.ImageIcon("C:\\Users\\sistemas\\Pictures\\lupa.png")); // NOI18N
        BtnConsultarApartamento.setText("buttonIcon1");

        dtmRegistro.setBackground(new java.awt.Color(0, 0, 0));
        dtmRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TblRegistroG.setBackground(new java.awt.Color(255, 255, 255));
        TblRegistroG.setBorder(new javax.swing.border.MatteBorder(null));
        TblRegistroG.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TblRegistroG.setForeground(new java.awt.Color(0, 0, 0));
        TblRegistroG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID UNICO", "FECHA INGRESO / COMPRA", "FECHA SALIDA / RETIRO"
            }
        ));
        TblRegistroG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblRegistroG.setGridColor(new java.awt.Color(51, 51, 51));
        TblRegistroG.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TblRegistroG);
        TblRegistroG.getAccessibleContext().setAccessibleName("");

        BtnGrabarTabla.setBackground(new java.awt.Color(204, 204, 204));
        BtnGrabarTabla.setForeground(new java.awt.Color(0, 0, 0));
        BtnGrabarTabla.setText("GRABAR");

        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BtnLimpiar.setText("LIMPIAR");

        javax.swing.GroupLayout dtmRegistroLayout = new javax.swing.GroupLayout(dtmRegistro);
        dtmRegistro.setLayout(dtmRegistroLayout);
        dtmRegistroLayout.setHorizontalGroup(
            dtmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dtmRegistroLayout.createSequentialGroup()
                .addGroup(dtmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dtmRegistroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dtmRegistroLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(BtnGrabarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        dtmRegistroLayout.setVerticalGroup(
            dtmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dtmRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dtmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrabarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelRect4.setBackground(new java.awt.Color(255, 255, 255));
        labelRect4.setForeground(new java.awt.Color(0, 0, 0));
        labelRect4.setText("SEGUNDO NOMBRE:");

        PrimerApellido.setBackground(new java.awt.Color(255, 255, 255));
        PrimerApellido.setForeground(new java.awt.Color(0, 0, 0));
        PrimerApellido.setText("PRIMER APELLIDO:");

        labelRect6.setBackground(new java.awt.Color(255, 255, 255));
        labelRect6.setForeground(new java.awt.Color(0, 0, 0));
        labelRect6.setText("SEGUNDO APELLIDO:");

        TxtSegundoApellido.setBackground(new java.awt.Color(255, 255, 255));
        TxtSegundoApellido.setForeground(new java.awt.Color(0, 0, 0));
        TxtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSegundoApellidoActionPerformed(evt);
            }
        });

        TxtApartamento.setBackground(new java.awt.Color(255, 255, 255));
        TxtApartamento.setForeground(new java.awt.Color(0, 0, 0));

        TxtPrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtPrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrimerNombreActionPerformed(evt);
            }
        });

        TxtPrimerApellido.setBackground(new java.awt.Color(255, 255, 255));
        TxtPrimerApellido.setForeground(new java.awt.Color(0, 0, 0));
        TxtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrimerApellidoActionPerformed(evt);
            }
        });

        labelRect3.setBackground(new java.awt.Color(255, 255, 255));
        labelRect3.setForeground(new java.awt.Color(0, 0, 0));
        labelRect3.setText("TIPO:");

        TxtTipo.setBackground(new java.awt.Color(255, 255, 255));
        TxtTipo.setForeground(new java.awt.Color(0, 0, 0));
        TxtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Apartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(labelRect3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(TxtApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(BtnConsultarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(dtmRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelImage1Layout.createSequentialGroup()
                                        .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelImage1Layout.createSequentialGroup()
                                        .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(33, 33, 33)))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultarApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRect6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dtmRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTipoActionPerformed

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

    private void TxtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSegundoApellidoActionPerformed

    private void TxtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSegundoNombreActionPerformed

    private void TxtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrimerApellidoActionPerformed

    private void TxtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrimerNombreActionPerformed

    /**
     * @param args the command line arguments
     */
        //</editor-fold>
        //</editor-fold> .m

        /* Create and display the form */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.label.LabelRect Apartamento;
    private org.edisoncor.gui.button.ButtonIcon BtnConsultarApartamento;
    private org.edisoncor.gui.button.ButtonAero BtnGrabarTabla;
    private org.edisoncor.gui.button.ButtonAero BtnLimpiar;
    private org.edisoncor.gui.label.LabelRect PrimerApellido;
    private org.edisoncor.gui.label.LabelRect PrimerNombre;
    private javax.swing.JTable TblRegistroG;
    private org.edisoncor.gui.textField.TextField TxtApartamento;
    private org.edisoncor.gui.textField.TextField TxtPrimerApellido;
    private org.edisoncor.gui.textField.TextField TxtPrimerNombre;
    private org.edisoncor.gui.textField.TextField TxtSegundoApellido;
    private org.edisoncor.gui.textField.TextField TxtSegundoNombre;
    private org.edisoncor.gui.comboBox.ComboBoxRect TxtTipo;
    private org.edisoncor.gui.panel.PanelShadow dtmRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.label.LabelRect labelRect3;
    private org.edisoncor.gui.label.LabelRect labelRect4;
    private org.edisoncor.gui.label.LabelRect labelRect6;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables

    public org.edisoncor.gui.label.LabelRect getApartamento() {
        return Apartamento;
    }

    public void setApartamento(org.edisoncor.gui.label.LabelRect Apartamento) {
        this.Apartamento = Apartamento;
    }

    public org.edisoncor.gui.button.ButtonIcon getBtnConsultarApartamento() {
        return BtnConsultarApartamento;
    }

    public void setBtnConsultarApartamento(org.edisoncor.gui.button.ButtonIcon BtnConsultarApartamento) {
        this.BtnConsultarApartamento = BtnConsultarApartamento;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnGrabarTabla() {
        return BtnGrabarTabla;
    }

    public void setBtnGrabarTabla(org.edisoncor.gui.button.ButtonAero BtnGrabarTabla) {
        this.BtnGrabarTabla = BtnGrabarTabla;
    }

    public org.edisoncor.gui.button.ButtonAero getBtnLimpiar() {
        return BtnLimpiar;
    }

    public void setBtnLimpiar(org.edisoncor.gui.button.ButtonAero BtnLimpiar) {
        this.BtnLimpiar = BtnLimpiar;
    }

    public org.edisoncor.gui.label.LabelRect getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(org.edisoncor.gui.label.LabelRect PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public org.edisoncor.gui.label.LabelRect getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(org.edisoncor.gui.label.LabelRect PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public javax.swing.JTable getTblRegistroG() {
        return TblRegistroG;
    }

    public void setTblRegistroG(javax.swing.JTable TblRegistroG) {
        this.TblRegistroG = TblRegistroG;
    }

    public org.edisoncor.gui.textField.TextField getTxtApartamento() {
        return TxtApartamento;
    }

    public void setTxtApartamento(org.edisoncor.gui.textField.TextField TxtApartamento) {
        this.TxtApartamento = TxtApartamento;
    }

    public org.edisoncor.gui.textField.TextField getTxtPrimerApellido() {
        return TxtPrimerApellido;
    }

    public void setTxtPrimerApellido(org.edisoncor.gui.textField.TextField TxtPrimerApellido) {
        this.TxtPrimerApellido = TxtPrimerApellido;
    }

    public org.edisoncor.gui.textField.TextField getTxtPrimerNombre() {
        return TxtPrimerNombre;
    }

    public void setTxtPrimerNombre(org.edisoncor.gui.textField.TextField TxtPrimerNombre) {
        this.TxtPrimerNombre = TxtPrimerNombre;
    }

    public org.edisoncor.gui.textField.TextField getTxtSegundoApellido() {
        return TxtSegundoApellido;
    }

    public void setTxtSegundoApellido(org.edisoncor.gui.textField.TextField TxtSegundoApellido) {
        this.TxtSegundoApellido = TxtSegundoApellido;
    }

    public org.edisoncor.gui.textField.TextField getTxtSegundoNombre() {
        return TxtSegundoNombre;
    }

    public void setTxtSegundoNombre(org.edisoncor.gui.textField.TextField TxtSegundoNombre) {
        this.TxtSegundoNombre = TxtSegundoNombre;
    }

    public org.edisoncor.gui.comboBox.ComboBoxRect getTxtTipo() {
        return TxtTipo;
    }

    public void setTxtTipo(org.edisoncor.gui.comboBox.ComboBoxRect TxtTipo) {
        this.TxtTipo = TxtTipo;
    }

    public org.edisoncor.gui.panel.PanelShadow getDtmRegistro() {
        return dtmRegistro;
    }

    public void setDtmRegistro(org.edisoncor.gui.panel.PanelShadow dtmRegistro) {
        this.dtmRegistro = dtmRegistro;
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

    public javax.swing.JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(javax.swing.JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
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

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vista;

import com.mycompany.Controlador.CntMenu;

/**
 *
 * @author sistemas
 */
public class Principal {

    public static void main(String[] args) {
        FrmMenu frmMenu = new FrmMenu();
        CntMenu cntMenu = new CntMenu(frmMenu); 
        frmMenu.setVisible(true);
    }
}

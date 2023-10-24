/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vista;

import com.mycompany.Controlador.*;

/**
 *
 * @author sistemas
 */
public class Principal {

    public static void main(String[] args) {
        FrmAutenticar frmAutenticar = new FrmAutenticar();
        CntAutenticar cntAutenticar = new CntAutenticar(frmAutenticar);
        frmAutenticar.setVisible(true);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controlador;

import com.mycompany.vista.FrmAutenticar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sistemas
 */
public class CntAutenticar  implements ActionListener{
    private FrmAutenticar frmAutenticar;
    
    public CntAutenticar(FrmAutenticar frmAutenticar) {
        this.frmAutenticar = frmAutenticar;
        registrarControladores();
    }
    
    private void registrarControladores() {
        frmAutenticar.getBtnAutenticar().addActionListener(this);
        frmAutenticar.getChkContraseña().addActionListener(this);
    }
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}

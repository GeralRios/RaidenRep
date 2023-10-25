/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controlador;

import com.mycompany.Modelo.*;
import com.mycompany.vista.FrmBusquedaResidente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *jkkkk
 * @author sistemas
 */
public class CntBusquedaResidente implements ActionListener {

    private FrmBusquedaResidente frmBusquedaResidente;
    private BusquedaResidenteDAO busquedaResidenteDAO;
    private BusquedaResidente busquedaResidente;
    private Set<Registro> registroG;
    private RegistroDAO registroDAO;
    private Registro registro;
    
    
    public CntBusquedaResidente(FrmBusquedaResidente frmBusquedaResidente,BusquedaResidenteDAO busquedaResidenteDAO){
        this.frmBusquedaResidente = frmBusquedaResidente;
        this.busquedaResidenteDAO = busquedaResidenteDAO;
        registrarControladores();
    }
    public void registrarControladores(){
        frmBusquedaResidente.getBtnGrabarTabla().addActionListener(this);
        frmBusquedaResidente.getBtnConsultarApartamento().addActionListener(this);
        frmBusquedaResidente.getBtnLimpiar().addActionListener(this);
    }
  public void crearListadoRegistro() {
    DefaultTableModel dtmRegistro = frmBusquedaResidente.getApartamento();
    registroG = new HashSet<>();
    int filas = dtmRegistro.getRowCount();
    for (int i = 0; i < filas; i++) {
        String registro = (String) dtmRegistro.getValueAt(i, 0); // Supongo que la columna es la 0.
        registroG.add(new Registro(registro, busquedaResidente));
    }
}
public BusquedaResidente obtenerResidente() {
    int Apartamento = 0;
    try {
        Apartamento = Integer.parseInt(frmBusquedaResidente.getTxtApartamento().getText());
    } catch (NumberFormatException e) {
        // Manejar la excepción, por ejemplo, mostrar un mensaje de error.
    }
    
    String Tipo = frmBusquedaResidente.getTxtTipo().getText();
    String PrimerNombre = frmBusquedaResidente.getTxtPrimerNombre().getText();
    String SegundoNombre = frmBusquedaResidente.getTxtSegundoNombre().getText();
    String PrimerApellido = frmBusquedaResidente.getTxtPrimerApellido().getText();
    String SegundoApellido = frmBusquedaResidente.getTxtSegundoApellido().getText();
    
    return new BusquedaResidente(Apartamento, Tipo, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, registroG);
}
    public void grabar(){
        obtenerResidente();
        crearListadoRegistro();
        busquedaResidente.setCorreosElectronicos(Registro);
        if (busquedaResidenteDAO.grabar(obtenerEmpleado())) {
            JOptionPane.showMessageDialog(frmBusquedaResidente,"empleado registrado");   
        }else{
            JOptionPane.showMessageDialog(frmBusquedaResidente, "EMPLEADO NO REGISTRADO");  
        }
    }
   private void consultar() {
        Integer id = Integer.valueOf(frmBusquedaResidente.getTxtApartamento().getText());
        busquedaResidente = busquedaResidenteDAO.consultar(Apartamento);
        if (busquedaResidente != null) {
            frmBusquedaResidente.getTxtPrimerNombre().setText(busquedaResidente.getPrimerNombre());
            frmBusquedaResidente.getChkFechaNacimiento().setDate(empleado.getFechaNacimiento());
            crearListadoCorreosElectronicos();
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Empleado No Encontrado");
        }
    }

    public void limpiarTabla() {
        int a = frmBusquedaResidente.getDtmRegistro().getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            frmBusquedaResidente.getDtmRegistro().removeRow(i);
        }
    }

    public void limpiar() {
        frmBusquedaResidente.getTxtApartamento().setText("");
        frmBusquedaResidente.getTxtTipo().setText("");
        frmBusquedaResidente.getTxtPrimerNombre().setText("");
        frmBusquedaResidente.getTxtSegundoNombre().setText("");
        frmBusquedaResidente.getTxtPrimerApellido().setText("");
        frmBusquedaResidente.getTxtSegundoApellido().setText("");
    }
    
    private void obtenerCorreo(){
        String correo = frmBusquedaResidente.getTxtTipo().getText();
        Object datos[] = {correo};
        frmBusquedaResidente.getDtmRegistro().addRow(datos);
        frmBusquedaResidente.getTxtTipo().setText("");
    }
    
    public void eliminarCorreo(){
        int numeroFila = frmBusquedaResidente.getTblRegistroG().getSelectedRow();
        int respuesta = JOptionPane.showConfirmDialog(frmBusquedaResidente, "Quiere eliminar  el correo seleccionado ? " +
                frmBusquedaResidente.getDtmRegistro().getValueAt(numeroFila, 0));
        String correo = frmBusquedaResidente.getDtmRegistro().getValueAt(numeroFila, 0).toString();
        if(respuesta == JOptionPane.YES_OPTION){
            registroDAO = new RegistroDAO();
            BusquedaResidente busquedaResidente = new Empleado(Integer.parseInt(frmBusquedaResidente.getTxtApartamento().getText()));
            Registro correoElectronico = new Registro(correo, busquedaResidente);
            registroDAO.eliminar(correoElectronico);
            frmBusquedaResidente.getDtmCorreosElectronicos().removeRow(numeroFila);   
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== frmBusquedaResidente.getBtnGrabarTabla()){
            obtenerCorreo();
        }else if (e.getSource()== frmBusquedaResidente.getBtnConsultarApartamento()){
            consultar();
        }else if (e.getSource() == frmBusquedaResidente.getBtnLimpiar()){
            eliminar();
            consultar();
        }else {
            limpiar();
        }
    }

}

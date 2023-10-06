/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controlador;

import com.mycompany.Modelo.BusquedaResidente;
import com.mycompany.Modelo.BusquedaResidenteDAO;
import com.mycompany.vista.FrmBusquedaResidente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sistemas
 */
public class CntBusquedaResidente implements ActionListener{
     private FrmBusquedaResidente frmBusquedaResidente;
    private BusquedaResidenteDAO  busquedaResidenteDAO;
    private BusquedaResidente busquedaResidente;

    public CntBusquedaResidente(FrmBusquedaResidente frmBusquedaResidente, BusquedaResidenteDAO  busquedaResidenteDAO) {
        this.frmBusquedaResidente = frmBusquedaResidente;
        this.busquedaResidenteDAO = busquedaResidenteDAO;
        registrarControladores();
    }
    public void registrarControladores() {
        frmBusquedaResidente.getBtnGrabar().addActionListener(this);
        frmBusquedaResidente.getBtn().addActionListener(this);
        frmBusquedaResidente.getBtnActualizar().addActionListener(this);
        frmBusquedaResidente.getBtnEliminar().addActionListener(this);
        frmBusquedaResidente.getBtnLimpiar().addActionListener(this);

    }

    public BusquedaResidente obtenerVehiculo() {
        String placa = frmBusquedaResidente.getTxtPlaca().getText();
        String marca = frmBusquedaResidente.getTxtMarca().getText();
        String color = frmBusquedaResidente.getTxtColor().getText();
        int modelo = Integer.parseInt(frmBusquedaResidente.getTxtModelo().getText());
        long timeInMiliSeconds = frmBusquedaResidente.getTxtFechaMatricula().getDate().getTime();
        Date fechaMatricula = new Date(timeInMiliSeconds);
        double capacidadTanque = Double.parseDouble(frmBusquedaResidente.getTxtCapacidadTanque().getText());
        double recorridoTanque = Double.parseDouble(frmBusquedaResidente.getTxtRecorridoTanque().getText());
        return new BusquedaResidente(placa, marca, color, modelo, capacidadTanque, recorridoTanque, fechaMatricula);
    }
    public void grabar() {
        if (busquedaResidenteDAO.grabar(obtenerVehiculo())) {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Vehiculo Registrado");
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Vehiculo No Registrado");
        }
    }
    
    public void consultar(){
        String placa = String.valueOf(frmBusquedaResidente.getTxtPlaca().getText());
        BusquedaResidente = busquedaResidenteDAO.consultar(placa);
        if(vehiculo != null) {
            frmBusquedaResidente.getTxtMarca().setText(vehiculo.getMarca());
            frmBusquedaResidente.getTxtColor().setText(vehiculo.getColor());
            frmBusquedaResidente.getTxtModelo().setText(vehiculo.getModelo().toString()); 
            frmBusquedaResidente.getTxtCapacidadTanque().setText(vehiculo.getCapacidadTanque().toString());
            frmBusquedaResidente.getTxtRecorridoTanque().setText(vehiculo.getRecorridoTanque().toString());
            frmBusquedaResidente.getTxtFechaMatricula().setDate(vehiculo.getFechaMatricula()); 
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente,"vehiculo no encontrado");
        }
    }
    
    public void modificar() {
        if(vehiculoDAO.actualizar(obtenerVehiculo())) {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Datos actualizados");
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Los datos no fueron actualizados");
        }
    }
    
    public void eliminar() {
        String placa = frmBusquedaResidente.getTxtPlaca().getText();
        if (vehiculoDAO.eliminar(vehiculo)) {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Vehiculo borrado");
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Vehiculo no borrado");
        }
    }

    public void limpiar() {
        frmBusquedaResidente.getTxtPlaca().setText("");
        frmBusquedaResidente.getTxtMarca().setText("");
        frmBusquedaResidente.getTxtColor().setText("");
        frmBusquedaResidente.getTxtModelo().setText("");
        frmBusquedaResidente.getTxtFechaMatricula().setDate(null);
        frmBusquedaResidente.getTxtCapacidadTanque().setText("");
        frmBusquedaResidente.getTxtRecorridoTanque().setText("");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

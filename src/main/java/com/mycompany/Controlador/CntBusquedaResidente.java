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
 *
 * @author sistemas
 */
public class CntBusquedaResidente implements ActionListener {

    private FrmBusquedaResidente frmBusquedaResidente;
    private BusquedaResidenteDAO buscaResidenteDAO;
    private BusquedaResidente busquedaResidente;
    private Set<Registro> registro;
    private RegistroDAO registroDAO;

    public CntBusquedaResidente(FrmBusquedaResidente frmBusquedaResidente, BusquedaResidenteDAO buscaResidenteDAO, BusquedaResidente busquedaResidente, Set<Registro> registro, RegistroDAO registroDAO) {
        this.frmBusquedaResidente = frmBusquedaResidente;
        this.buscaResidenteDAO = buscaResidenteDAO;
        this.busquedaResidente = busquedaResidente;
        this.registro = registro;
        this.registroDAO = registroDAO;
        registrarControladores();

    }

    public void registrarControladores() {
        frmBusquedaResidente.getBtnConsultarApartamento().addActionListener(this);
        frmBusquedaResidente.getBtnGrabarTabla().addActionListener(this);
        frmBusquedaResidente.getBtnLimpiar().addActionListener(this);
    }

    public void crearListado() {
        DefaultTableModel dtmRegistro = frmBusquedaResidente.getDtmRegistro();
        registro = new HashSet();
        int filas = dtmRegistro.getRowCount();
        int columnas = dtmRegistro.getColumnCount();
        String registro = null;
        String registro = null;
        String registro = null;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                registro = (String) dtmRegistro.getValueAt(i, j);
            }
            registro.add(new Registro(numeroIdResidente, BusquedaResidente));
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                correo = (String) dtmRegistro.getValueAt(i, j);
            }
            registro.add(new Registro(numeroIdResidente, BusquedaResidente));
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                correo = (String) dtmRegistro.getValueAt(i, j);
            }
            registro.add(new Registro(numeroIdResidente, BusquedaResidente));
        }
    }

    public Registro obtenerBusquedaResidente() {
        int numeroIdApartamento = Integer.parseInt(frmBusquedaResidente.getTxtApartamento().getText());
        String primerNombre = frmBusquedaResidente.getTxtPrimerNombre().getText();
        String SegundoNombre = frmBusquedaResidente.getTxtSegundoNombre().getText();
        String primerApellido = frmBusquedaResidente.getTxtPrimerApellido().getText();
        String segundoApelliudo = frmBusquedaResidente.getTxtSegundoApellido().getText();
        return new BusquedaResidente(Apartamento, PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido);
    }

    public void grabar() {
        obtenerBusquedaResidente();
        crearListadoRegistro();
        busquedaResidente.setCorreosElectronicos(Registro);
        if (buscaResidenteDAO.grabar(obtenerBusquedaResidente())) {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "empleado registrado");
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "EMPLEADO NO REGISTRADO");
        }
    }

    private void consultar() {
        Integer numeroIdApartamento = Integer.valueOf(frmBusquedaResidente.getTxtApartamento().getText());
        busquedaResidente = buscaResidenteDAO.consultar(numeroIdApartamento);
        if (busquedaResidente != null) {
            frmBusquedaResidente.getTxtPrimerNombre().setText(busquedaResidente.getPrimerNombre());
            crearListadoCorreosElectronicos();
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Empleado No Encontrado");
        }
    }

    public void eliminar() {
        Integer id = Integer.parseInt(frmBusquedaResidente.getTxt().getText());
        busquedaResidente = busquedaResidenteDAO.consultar(id);
        if (buscaResidenteDAO.eliminar(busquedaResidente)) {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Empleado borrado");
        } else {
            JOptionPane.showMessageDialog(frmBusquedaResidente, "Empleado no borrado");
        }

    }

    public void limpiarTabla() {
        int a = frmBusquedaResidente.getdtmRegistro().getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            frmBusquedaResidente.getdtmRegistro().removeRow(i);
        }
    }

    public void limpiar() {
        frmBusquedaResidente.getTxtId().setText("");
        frmBusquedaResidente.getTxtNombre().setText("");
        frmBusquedaResidente.getChkFechaNacimiento().setDate(null);

    }

    private void obtenerCorreo() {
        String correo = frmBusquedaResidente.getTxtCorreosElectronicos().getText();
        Object datos[] = {correo};
        frmBusquedaResidente.getDtmCorreosElectronicos().addRow(datos);
        frmBusquedaResidente.getTxtCorreosElectronicos().setText("");
    }

    public void eliminarCorreo() {
        int numeroFila = frmBusquedaResidente.TblRegistro().getSelectedRow();
        int respuesta = JOptionPane.showConfirmDialog(frmBusquedaResidente, "Quiere eliminar  el correo seleccionado ? "
                + frmBusquedaResidente.getDtmCorreosElectronicos().getValueAt(numeroFila, 0));
        String correo = frmBusquedaResidente.getDtmCorreosElectronicos().getValueAt(numeroFila, 0).toString();
        if (respuesta == JOptionPane.YES_OPTION) {
            correoElectronicoDAO = new CorreoElectronicoDAO();
            Empleado empleado = new Empleado(Integer.parseInt(frmBusquedaResidente.getTxtId().getText()));
            CorreoElectronico correoElectronico = new CorreoElectronico(correo, empleado);
            correoElectronicoDAO.eliminar(correoElectronico);
            frmBusquedaResidente.getDtmCorreosElectronicos().removeRow(numeroFila);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmBusquedaResidente.getBtnConsultarApartamento()) {
            obtenerCorreo();
        } else if (e.getSource() == frmBusquedaResidente.getBtnAdicionarEnTabla()) {
            grabar();
            limpiar();
            limpiarTabla();
        } else if (e.getSource() == frmBusquedaResidente.getBtnGrabarTabla()) {

        } else {
            limpiar();
            limpiarTabla();
        }
    }

}

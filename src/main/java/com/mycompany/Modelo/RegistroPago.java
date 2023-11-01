/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.io.Serializable;

/**
 *
 * @author camac
 */
@Entity
@Table (name="recibo_pago")
public class ReciboPago implements Serializable {
    @Id
    @Column(name = "ID_RECIBO_COBRO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReciboCobro;
    
    @Column(name = "ID_UNICO_RESIDENTE")
    private Integer idUnicoResidente;
    
    @Column(name = "ID_RESIDENTE")
    private Integer idResidente;
    
    @Column(name = "ID_APARTAMENTO_RESIDENTE")
    private Integer idApartamentoResidente;
    
    @Column(name = "ID_UNICO_PROPIETARIO")
    private Integer idUnicoPropietario;
    
    @Column(name = "ID_PROPIETARIO")
    private Integer idPropietario;
    
    @Column(name = "ID_APARTAMENTO_PROPIETARIO")
    private Integer idApartamentoPropietario;
    
    @Column(name = "ID_CUENTA_COBRO")
    private Integer idCuentaCobro;
    
    @Column(name = "VALOR_COBRO")
    private Float valorCobro;
    
    @Column(name = "FECHA_PAGO")
    private Date fechaPago;
    
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;

    public ReciboPago() {
    }

    public ReciboPago(Integer idReciboCobro, Integer idUnicoResidente, Integer idResidente, Integer idApartamentoResidente, Integer idUnicoPropietario, Integer idPropietario, Integer idApartamentoPropietario, Integer idCuentaCobro, Float valorCobro, Date fechaPago, Date fechaVencimiento) {
        this.idReciboCobro = idReciboCobro;
        this.idUnicoResidente = idUnicoResidente;
        this.idResidente = idResidente;
        this.idApartamentoResidente = idApartamentoResidente;
        this.idUnicoPropietario = idUnicoPropietario;
        this.idPropietario = idPropietario;
        this.idApartamentoPropietario = idApartamentoPropietario;
        this.idCuentaCobro = idCuentaCobro;
        this.valorCobro = valorCobro;
        this.fechaPago = fechaPago;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getIdReciboCobro() {
        return idReciboCobro;
    }

    public void setIdReciboCobro(Integer idReciboCobro) {
        this.idReciboCobro = idReciboCobro;
    }

    public Integer getIdUnicoResidente() {
        return idUnicoResidente;
    }

    public void setIdUnicoResidente(Integer idUnicoResidente) {
        this.idUnicoResidente = idUnicoResidente;
    }

    public Integer getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Integer idResidente) {
        this.idResidente = idResidente;
    }

    public Integer getIdApartamentoResidente() {
        return idApartamentoResidente;
    }

    public void setIdApartamentoResidente(Integer idApartamentoResidente) {
        this.idApartamentoResidente = idApartamentoResidente;
    }

    public Integer getIdUnicoPropietario() {
        return idUnicoPropietario;
    }

    public void setIdUnicoPropietario(Integer idUnicoPropietario) {
        this.idUnicoPropietario = idUnicoPropietario;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Integer getIdApartamentoPropietario() {
        return idApartamentoPropietario;
    }

    public void setIdApartamentoPropietario(Integer idApartamentoPropietario) {
        this.idApartamentoPropietario = idApartamentoPropietario;
    }

    public Integer getIdCuentaCobro() {
        return idCuentaCobro;
    }

    public void setIdCuentaCobro(Integer idCuentaCobro) {
        this.idCuentaCobro = idCuentaCobro;
    }

    public Float getValorCobro() {
        return valorCobro;
    }

    public void setValorCobro(Float valorCobro) {
        this.valorCobro = valorCobro;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
}

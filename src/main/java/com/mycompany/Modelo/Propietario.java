/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import javax.persistence.*;

/**
 *
 * @author sistemas
 */ 
    
@Entity
@Table(name="propietaro_apartamento")

public class Propietario {
    @Id
    @Column(name="ID_PROPIETARIO ")
    private Integer idPropietario;

    @Column(name="ID_APARTAMENTO_PROPIETARIO ")
    private Integer idApartamentoPropietario;
    
    @Column(name="FECHA_COMPRA")
    private Integer fechaCompra;
    
    @Column(name="FECHA_RETIRO")
    private Integer fechaRetiro;

    public Propietario() {
    }

    public Propietario(Integer idPropietario, Integer idApartamentoPropietario, Integer fechaCompra, Integer fechaRetiro) {
        this.idPropietario = idPropietario;
        this.idApartamentoPropietario = idApartamentoPropietario;
        this.fechaCompra = fechaCompra;
        this.fechaRetiro = fechaRetiro;
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

    public Integer getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Integer fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Integer fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    
}

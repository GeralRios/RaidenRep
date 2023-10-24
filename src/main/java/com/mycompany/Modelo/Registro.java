/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author sistemas
 */
@Entity
@Table (name="registro")
public class Registro {
     @Id
    @Column(name="NumeroIdResidnete")
    private String numeroIdResidente;
    
    @ManyToOne
    @JoinColumn(name="buquedaResidente")
    private BusquedaResidente busquedaResidente;

    public Registro() {
    }

    public Registro(String NumeroIdResidnete,BusquedaResidente busquedaResidente) {
        this.numeroIdResidente = numeroIdResidente;
        this.busquedaResidente= busquedaResidente;
    }

    public String getNumeroIOdResidente() {
        return numeroIdResidente;
    }

    public void setNumeroIdResidente(String numeroIdResidente) {
        this.numeroIdResidente = numeroIdResidente;
    }

    public BusquedaResidente getBusquedaResidente() {
        return busquedaResidente;
    }

    public void setBusquedaResidente(BusquedaResidente busquedaResidente) {
        this.busquedaResidente = busquedaResidente;
    }
    
    
}

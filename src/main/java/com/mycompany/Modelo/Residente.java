/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.io.Serializable;

/**
 *
 * @author sistemas
 */
@Entity
@Table (name="residente_apartamento")
public class Residente implements Serializable {
    @Id
    @GeneratedValue(strategy = Generatedvalue.ENTITY)
    @Column(name = "ID_UNICO_RESIDENTE")
    private Integer idUnicoResidente;
    
    @ManyToOne
    @JoinColumn(name = "ID_RESIDENTE")
    private Integer idResidente;

    @ManyToOne
    @JoinColumn(name = "ID_APARTAMENTO_RESIDENTE")
    private Integer idResidente;
    
    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;
    
    @Column(name = "FECHA_RETIRO")
    private Date fechaRetiro;
    
    @OneToMany(mappedBy = "ID_RESIDENTE", cascade = CascadeType.ALL)
    private Set<ResidenteApartamento> listadoResidenteApartamento;

    public Residente() {
    }

    public Residente(Integer idUnicoResidente, Integer idResidente, Integer idResidente, Date fechaIngreso, Date fechaRetiro, <any> listadoResidenteApartamento) {
        this.idUnicoResidente = idUnicoResidente;
        this.idResidente = idResidente;
        this.idResidente = idResidente;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.listadoResidenteApartamento = listadoResidenteApartamento;
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

    public Integer getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Integer idResidente) {
        this.idResidente = idResidente;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public <any> getListadoResidenteApartamento() {
        return listadoResidenteApartamento;
    }

    public void setListadoResidenteApartamento(<any> listadoResidenteApartamento) {
        this.listadoResidenteApartamento = listadoResidenteApartamento;
    }
    
}
 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author sistemas
 */
//DONE
@Entity
@Table(name = "propietaro_apartamento")


        //DONE
public class Propietario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UNICO_PROPIETARIO")
    private Integer idUnicoPropietario;
    
    @ManyToOne
    @JoinColumn(name = "ID_PROPIETARIO")
    private Persona idPropietario;

    @ManyToOne
    @JoinColumn(name = "ID_APARTAMENTO_PROPIETARIO")
    private Apartamento idApartamentoPropietario;

    @Column(name = "FECHA_COMPRA")
    private Date fechaCompra;

    @Column(name = "FECHA_RETIRO")
    private Date fechaRetiro;

    @OneToMany(mappedBy = "ID_PROPIETARIO", cascade = CascadeType.ALL)
    private Set<PropietarioApartamento> listadoPropietarioApartamento;
    
    public Propietario() {
    }

    public Propietario(Integer idUnicoPropietario, Persona idPropietario, Apartamento idApartamentoPropietario, Date fechaCompra, Date fechaRetiro, <any> listadoPropietarioApartamento) {
        this.idUnicoPropietario = idUnicoPropietario;
        this.idPropietario = idPropietario;
        this.idApartamentoPropietario = idApartamentoPropietario;
        this.fechaCompra = fechaCompra;
        this.fechaRetiro = fechaRetiro;
        this.listadoPropietarioApartamento = listadoPropietarioApartamento;
    }

    public Integer getIdUnicoPropietario() {
        return idUnicoPropietario;
    }

    public void setIdUnicoPropietario(Integer idUnicoPropietario) {
        this.idUnicoPropietario = idUnicoPropietario;
    }

    public Persona getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Persona idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Apartamento getIdApartamentoPropietario() {
        return idApartamentoPropietario;
    }

    public void setIdApartamentoPropietario(Apartamento idApartamentoPropietario) {
        this.idApartamentoPropietario = idApartamentoPropietario;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public <any> getListadoPropietarioApartamento() {
        return listadoPropietarioApartamento;
    }

    public void setListadoPropietarioApartamento(<any> listadoPropietarioApartamento) {
        this.listadoPropietarioApartamento = listadoPropietarioApartamento;
    }

    
}

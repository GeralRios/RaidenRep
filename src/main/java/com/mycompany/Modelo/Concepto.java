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
public class Concepto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUMERO_CONCEPTO")
    private Integer numeroConcepto;
    
    @Column(name = "VALOR_CONCEPTO")
    private Persona valorConcepto;
    
    @Column(name = "INTERESES_MORA")
    private Persona valorConcepto;
    
    @OneToMany(mappedBy = "NUMERO_CONCEPTO", cascade = CascadeType.ALL)
    private Set<Concepto> listadoConcepto;

    public Concepto() {
    }

    public Concepto(Integer numeroConcepto, Persona valorConcepto, Persona valorConcepto, <any> listadoConcepto) {
        this.numeroConcepto = numeroConcepto;
        this.valorConcepto = valorConcepto;
        this.valorConcepto = valorConcepto;
        this.listadoConcepto = listadoConcepto;
    }

    public Integer getNumeroConcepto() {
        return numeroConcepto;
    }

    public void setNumeroConcepto(Integer numeroConcepto) {
        this.numeroConcepto = numeroConcepto;
    }

    public Persona getValorConcepto() {
        return valorConcepto;
    }

    public void setValorConcepto(Persona valorConcepto) {
        this.valorConcepto = valorConcepto;
    }

    public Persona getValorConcepto() {
        return valorConcepto;
    }

    public void setValorConcepto(Persona valorConcepto) {
        this.valorConcepto = valorConcepto;
    }

    public <any> getListadoConcepto() {
        return listadoConcepto;
    }

    public void setListadoConcepto(<any> listadoConcepto) {
        this.listadoConcepto = listadoConcepto;
    }
    
}

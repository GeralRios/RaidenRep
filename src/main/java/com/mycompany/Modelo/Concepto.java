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
    private Float valorConcepto;
    
    @Column(name = "INTERESES_MORA")
    private Float valorConcepto;
    
    @OneToMany(mappedBy = "NUMERO_CONCEPTO", cascade = CascadeType.ALL)
    private Set<Concepto> listadoConcepto;

    public Concepto() {
    }

    public Concepto(Integer numeroConcepto, Float valorConcepto, Float valorConcepto, <any> listadoConcepto) {
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

    public Float getValorConcepto() {
        return valorConcepto;
    }

    public void setValorConcepto(Float valorConcepto) {
        this.valorConcepto = valorConcepto;
    }

    public Float getValorConcepto() {
        return valorConcepto;
    }

    public void setValorConcepto(Float valorConcepto) {
        this.valorConcepto = valorConcepto;
    }

    public <any> getListadoConcepto() {
        return listadoConcepto;
    }

    public void setListadoConcepto(<any> listadoConcepto) {
        this.listadoConcepto = listadoConcepto;
    }
    
}

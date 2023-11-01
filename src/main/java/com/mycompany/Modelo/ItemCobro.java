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
public class ItemCobro implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "NUMERO_CONCEPTO")
    private Integer numeroConcepto;
    
    @ManyToOne
    @JoinColumn(name = "VALOR_CONCEPTO")
    private Float valorConcepto;
    
    @Column(name = "COSTO_ADMINISTRACION")
    private Float costoAdministracion;

    public ItemCobro() {
    }

    public ItemCobro(Integer numeroConcepto, Float valorConcepto, Float costoAdministracion) {
        this.numeroConcepto = numeroConcepto;
        this.valorConcepto = valorConcepto;
        this.costoAdministracion = costoAdministracion;
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

    public Float getCostoAdministracion() {
        return costoAdministracion;
    }

    public void setCostoAdministracion(Float costoAdministracion) {
        this.costoAdministracion = costoAdministracion;
    }
    
    
}

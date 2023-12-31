package com.mycompany.Modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author sistemas
 */
@Entity
@Table(name = "apartamento")

//DONE
public class Apartamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.ENTITY)
    @Column(name = "ID_APARTAMENTO")
    private Integer idApartamento;

    @Column(name = "NUMERO_APARTAMENTO")
    private Integer numeroApartamento;

    @Column(name = "NUMERO_BLOQUE")
    private Integer numeroBloque;

    @Column(name = "NUMERO_PISO")
    private Integer numeroPiso;

    @Column(name = "MATRICULA_APARTAMENTO")
    private String matriculaApartamento;

    @Column(name = "ID_PARQUEADERO")
    private String idParqueadero;

    @Column(name = "ASIGNADO")
    private String asignado;
    
    @OneToMany(mappedBy = "ID_APARTAMENTO", cascade = CascadeType.ALL)
    private Set<Apartamentos> listadoApartamentos;
    
    public Apartamento() {
    }

    public Apartamento(Integer idApartamento, Integer numeroApartamento, Integer numeroBloque, Integer numeroPiso, String matriculaApartamento, String idParqueadero, String asignado, <any> listadoApartamentos) {
        this.idApartamento = idApartamento;
        this.numeroApartamento = numeroApartamento;
        this.numeroBloque = numeroBloque;
        this.numeroPiso = numeroPiso;
        this.matriculaApartamento = matriculaApartamento;
        this.idParqueadero = idParqueadero;
        this.asignado = asignado;
        this.listadoApartamentos = listadoApartamentos;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Integer getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(Integer numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public Integer getNumeroBloque() {
        return numeroBloque;
    }

    public void setNumeroBloque(Integer numeroBloque) {
        this.numeroBloque = numeroBloque;
    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getMatriculaApartamento() {
        return matriculaApartamento;
    }

    public void setMatriculaApartamento(String matriculaApartamento) {
        this.matriculaApartamento = matriculaApartamento;
    }

    public String getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(String idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public <any> getListadoApartamentos() {
        return listadoApartamentos;
    }

    public void setListadoApartamentos(<any> listadoApartamentos) {
        this.listadoApartamentos = listadoApartamentos;
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sistemas
 */
public class RegistroDAO {
     private Session sesion;
    private Transaction trns;

    private void iniciaOperacion() {
        sesion = HibernateUtil.getSessionFactory().openSession();
        trns = sesion.beginTransaction();
    }

    private void manejaException(HibernateException e) {
        trns.rollback();
        throw new HibernateException("Error en la capa de datos." + e);
    }

    public List<Registro> listar(BusquedaResidente busquedaResidente) {
        List<Registro> listaNumeroIdResidente = null;
        iniciaOperacion();
        listaNumeroIdResidente = sesion.createQuery("from Registro where empleado" + BusquedaResidente.getIdResidente()).list();
        return listaNumeroIdResidente;
    }
    
    public boolean eliminar(Registro registro){
    boolean ok = false;
    
    try{
        iniciaOperacion();
        sesion.delete(registro);
        trns.commit();
        ok = true;
    }
    catch(HibernateException e) {
        manejaException(e);
        ok = false;
    }
    return ok;
    
            }
}

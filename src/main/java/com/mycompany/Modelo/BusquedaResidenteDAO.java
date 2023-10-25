/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author sistemas
 */


public class BusquedaResidenteDAO {
    private Session sesion;
    private Transaction trns;
    
    
    private void iniciaOperacion(){
        sesion = HibernateUtil.getSessionFactory().openSession();
        trns = sesion.beginTransaction();
    }
    
    
    private void manejaException(HibernateException e){
       trns.rollback();
       throw new HibernateException("Error en la capa de datos." + e);
    }
    
    
    public boolean grabar(BusquedaResidente busquedaResidente){
        boolean ok = false;
        
        try{
            iniciaOperacion();
            sesion.save(busquedaResidente);
            trns.commit();
            ok = true;          
        }
        catch(HibernateException e){
            manejaException(e);
            ok =  false;
        }
    return ok;
    }
    
    public BusquedaResidente consultar(String placa){
        BusquedaResidente busquedaResidente = null;
        try{
            iniciaOperacion();
            busquedaResidente = (BusquedaResidente) sesion.get(BusquedaResidente.class, placa);
        }
        catch(HibernateException e){
            manejaException(e); 
        }
        finally{
            sesion.close();
        }
        return busquedaResidente;
    }
    
    public boolean eliminar( BusquedaResidente  busquedaResidente){
        boolean ok = false;
        
        try{
            iniciaOperacion();
            sesion.delete(busquedaResidente);
            trns.commit();
            ok = true;          
        }
        catch(HibernateException e){
            manejaException(e);
            ok = false;
        }
    return ok;
    }  


    public boolean actualizar( BusquedaResidente  busquedaResidente){
        boolean ok;
        
        try{
            iniciaOperacion();
            sesion.update(busquedaResidente);
            trns.commit();
            ok = true;          
        }
        catch(HibernateException e){
            manejaException(e);
            ok =  false;
        }
    return ok;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.lang.module.*;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author sistemas
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Configuration configuration;

     private static void crearSesion(String login, String password) {
        try {
            configuration = new Configuration().configure();
            configuration.setProperty("hibernate.connection.username", login);
            configuration.setProperty("hibernate.connection.password", password);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException ex) {
            System.err.println("No se creo la sesion Factory" + ex);
        }
    }

    public static SessionFactory getSessionFactory(String login, String password) {
        if (sessionFactory == null) {
            crearSesion(login, password);
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void cerrarSesion() {
        sessionFactory.close();
    }
}

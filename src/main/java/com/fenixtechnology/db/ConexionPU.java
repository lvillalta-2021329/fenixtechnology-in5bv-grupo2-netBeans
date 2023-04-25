package com.fenixtechnology.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Edy Leonel Letona Argueta
 * 
 */

public class ConexionPU {

    private static final String PERSISTENCE_UNIT_NAME = "fenix_technology_pu";
    private EntityManager entityManager;
    private static ConexionPU instance;
    
    private ConexionPU(){
        try {
            entityManager = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
            System.out.println("Conexión Establecida con éxito a tráves de una unidad de persistencia");
        } catch (Exception e) {
           e.printStackTrace(System.out);
        }
    }
    
    public static ConexionPU getInstance() {
        if (instance == null) {
            instance = new ConexionPU();
        }
        return instance;
    }
    
    public EntityManager getEntityManager(){
        return entityManager;
    }
}

package com.fenixtechnology.models.dao;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 3/09/2022
 * @time 01:52:00 Codigo: IN5BV
 */
import java.util.List;
import com.fenixtechnology.db.ConexionPU;
import com.fenixtechnology.models.idao.IPersonaDao;
import com.fenixtechnology.models.domain.Persona;

public class PersonaDaoJPA implements IPersonaDao{
    private ConexionPU con = ConexionPU.getInstance();

    @Override
    public List<Persona> getAll() {
        return con.getEntityManager().createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public int add(Persona persona) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().persist(persona);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            System.err.println("Se a producido un error al intentar insertar el siguiente registro: " + persona.toString());
            e.printStackTrace();
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

    @Override
    public int update(Persona persona) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().merge(persona);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        } catch (Exception e) {
            System.out.println("Se produjo un error al intentar listar el siguiente registro: " + persona.toString());
            e.printStackTrace();
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

    @Override
    public int delete(Persona persona) {
        int rows = 0;
        try {
            con.getEntityManager().getTransaction().begin();
            con.getEntityManager().remove(persona);
            con.getEntityManager().getTransaction().commit();
            rows = 1;
        }catch(Exception e) {
            e.printStackTrace(System.out);
            con.getEntityManager().getTransaction().rollback();
        }
        return rows;
    }

    @Override
    public Persona get(Persona persona) {
        return (Persona) con.getEntityManager().createNamedQuery("Persona.find").setParameter("id_persona", persona.getIdPersona()).getSingleResult();
    }
    

}


package com.fenixtechnology.system;

/**
 *
 * @author Lionar Gerardy Villalta Barrientos.
 * @date 28/08/2022
 * @time 15:45:50
 * Codigo: IN5BV
 */
import com.fenixtechnology.models.dao.PersonaDaoImpl;

public class Principal {
     public static void main(String[] args) {
      PersonaDaoImpl personaDao = new PersonaDaoImpl();
        System.out.println(personaDao.getAll());
    }

}

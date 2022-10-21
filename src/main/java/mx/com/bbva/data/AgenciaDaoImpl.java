/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.bbva.data;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import mx.com.bbva.domain.Agencia;
import javax.persistence.*;

/**
 *
 * @author MI05332
 */
@Stateless //conviertiendo a un EJB
public class AgenciaDaoImpl implements AgenciaDao{
    
    @PersistenceContext(unitName = "my_persistence_unit")
    EntityManager em;

    @Override
    public List<Agencia> encontrarTodasAgencias() 
    {
        return em.createNamedQuery("Agencia.encontrarTodasAgencias").getResultList();
    }
    
}

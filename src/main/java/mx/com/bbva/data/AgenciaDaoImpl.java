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
    
    @PersistenceContext(unitName = "CatalogosPU")
    EntityManager em;

    @Override
    public List<Agencia> encontrarTodasAgencias() 
    {
        return em.createNamedQuery("Agencia.encontrarTodasAgencias").getResultList();
    }

    @Override
    public void insertarAgencia(Agencia agencia) {
        em.persist(agencia);
        em.flush();
    }

    @Override
    public Agencia encontrarAgencia(Agencia agencia) {
        return em.find(Agencia.class, agencia.getAgencia());
    }

    @Override
    public void actualizarAgencia(Agencia agencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

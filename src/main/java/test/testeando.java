/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import javax.persistence.*;
import mx.com.bbva.domain.Agencia;


/**
 *
 * @author MI05332
 */
public class testeando 
{
    public static void main(String[] args) 
    {
        String hql = "SELECT a FROM Agencia a";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager em = fabrica.createEntityManager();
        
        Query query = em.createQuery(hql);
        
        List<Agencia> agencias = query.getResultList();
        
        agencias.forEach(agencia -> {
            System.out.println("Agencia: " + agencia.getDescripcionAgencia());
        });
        
    }
    
}

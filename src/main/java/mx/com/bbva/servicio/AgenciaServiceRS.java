package mx.com.bbva.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import mx.com.bbva.data.AgenciaDao;
import mx.com.bbva.domain.Agencia;


@Stateless
@Path("/agencias")
public class AgenciaServiceRS 
{
    @Inject
    private  AgenciaDao ad;
    
    @GET 
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Agencia> listarAgencias()
    {
        List<Agencia> agencias = ad.encontrarTodasAgencias();
        System.out.println("agencias encontradas: " + agencias);
        
        return agencias;
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Agencia agregarPersona(Agencia agencia)
    {
        ad.insertarAgencia(agencia);
        System.out.println("agencia agregada: " + agencia);
        
        return agencia;
    }
    
}

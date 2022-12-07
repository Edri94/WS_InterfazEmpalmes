/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.bbva.data;

import java.util.List;
import mx.com.bbva.domain.Agencia;


/**
 *
 * @author MI05332
 */
public interface AgenciaDao {

    public List<Agencia> encontrarTodasAgencias();
    public void insertarAgencia(Agencia agencia); 
    public Agencia encontrarAgencia(Agencia agencia);
    public void actualizarAgencia(Agencia agencia);
}

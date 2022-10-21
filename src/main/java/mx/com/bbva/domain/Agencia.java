package mx.com.bbva.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "AGENCIA")
@NamedQuery(name = "Agencia.encontrarTodasAgencias", query = "SELECT a FROM Agencia a ORDER BY a.agencia")
public class Agencia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "agencia")
    @Id
    private int agencia;

    @Column(name = "descripcion_agencia")
    private String descripcioAgencia;

    @Column(name = "prefijo_agencia")
    private String prefijoAgencia;

    public Agencia() 
    {
        
    }

    public Agencia(int agencia) {
        this.agencia = agencia;
    }

    public Agencia(int agencia, String descripcioAgencia, String prefijoAgencia) {
        this.agencia = agencia;
        this.descripcioAgencia = descripcioAgencia;
        this.prefijoAgencia = prefijoAgencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getDescripcioAgencia() {
        return descripcioAgencia;
    }

    public void setDescripcioAgencia(String descripcioAgencia) {
        this.descripcioAgencia = descripcioAgencia;
    }

    public String getPrefijoAgencia() {
        return prefijoAgencia;
    }

    public void setPrefijoAgencia(String prefijoAgencia) {
        this.prefijoAgencia = prefijoAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "agencia=" + agencia + ", descripcioAgencia=" + descripcioAgencia + ", prefijoAgencia=" + prefijoAgencia + '}';
    }

}

package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version V0.0.1
 */

@Entity
public class Sorteos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idSorteo;
    private String Estado;
    private String Descripcion;
    private String Fecha;

    /**
     * 
     * @param Estado
     * @param Descripcion
     * @param Fecha
     */

    public Sorteos(String Estado, String Descripcion, String Fecha) {
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
    }
    public Sorteos() {

        
    }

    /**
     * 
     * @return Devuelve los datos de la variable Estado 
     */

    public String getEstado() {
        return this.Estado;
    }

    /**
     * 
     * @return Devuelve los datos de la variable Descripcion
     */

    public String getDescripcion() {
        return this.Descripcion;
    }

    /**
     * 
     * @return Devuelve los datos de la variable Fecha 
     */

    public String getFecha() {
        return this.Fecha;
    }

    /**
     * 
     * @return Devuelve los datos de la variable idSorteo
     */

    public String getidSorteo() {
        return this.idSorteo;
    }

    /**
     * 
     * @param Estado Guarda datos dentro de la variable Estado
     */

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * 
     * @param Descripcion Guarda datos dentro de la variable Estado
     */

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    /**
     * 
     * @param Fecha Guarda datos dentro de la variable Fecha
     */

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}

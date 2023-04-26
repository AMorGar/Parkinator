package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version v0.0.1
 */

public class SorteosDao {

    @NotBlank(message= "El estado del sorteo no puede estar vacío")
    private String Estado;
    private String Descripcion;
    @NotBlank(message= "Es obligatorio poner fecha para el sorteo")
    private String Fecha;
    
    public SorteosDao(){

        this("","","");
    }

    /**
     * 
     * @param Estado
     * @param Descripcion
     * @param Fecha
     */
    
    public SorteosDao(String Estado, String Descripcion, String Fecha) {
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
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
     * @param Estado Guarda datos dentro de la variable Estado
     */


    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @param Descripcion Guarda datos dentro de la variable Descripcion
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



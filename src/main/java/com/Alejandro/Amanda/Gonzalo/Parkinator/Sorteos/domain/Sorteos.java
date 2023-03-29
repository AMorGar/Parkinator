package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sorteos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idSorteo;
    private String Estado;
    private String Descripcion;
    private String Fecha;

    public Sorteos(String Estado, String Descripcion, String Fecha) {
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
    }
    public Sorteos() {

        
    }

    public String getEstado() {
        return this.Estado;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public String getFecha() {
        return this.Fecha;
    }

    public String getidSorteo() {
        return this.idSorteo;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}

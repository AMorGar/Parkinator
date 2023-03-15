package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

public class SorteosDao {

    private String Estado;
    private String Descripcion;
    private String Fecha;
    
    public SorteosDao(){

        this("","","");
    }
    
    public SorteosDao(String Estado, String Descripcion, String Fecha) {
        this.Estado = Estado;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
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



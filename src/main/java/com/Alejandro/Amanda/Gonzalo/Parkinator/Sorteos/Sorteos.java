package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos;
public class Sorteos {

    private String Estado;
    private String Descripcion;
    private String Fecha;

    public Sorteos(String Estado, String Descripcion, String Fecha) {
        this.Estado = Estado;
        this.Descripcion = Estado;
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
}
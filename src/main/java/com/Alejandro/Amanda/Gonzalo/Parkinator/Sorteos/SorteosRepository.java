package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos;
import java.util.ArrayList;

public class SorteosRepository {
    
    private ArrayList<Sorteos> Sorteos;
    public SorteosRepository() {
        Sorteos = new ArrayList<>();
    }
    public ArrayList<Sorteos> getAll() {
        this.Sorteos.clear();
        this.Sorteos.add(new Sorteos("Activo", "Primer Sorteo", "01/02/2023"));
        return this.Sorteos;
    }
    public Object findAll() {
        return null;
    }
}

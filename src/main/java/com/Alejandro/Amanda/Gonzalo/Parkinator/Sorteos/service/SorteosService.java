package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.*;
/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version V0.0.1
 */
public interface SorteosService {
    
    public Iterable<Sorteos> getAll();
    public void register(SorteosDao sorteosDao);
}

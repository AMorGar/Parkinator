package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.Sorteos;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.SorteosDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.SorteosRepository;

/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version V0.0.1
 */

@Service
public class SorteosServiceImpl implements SorteosService {

    private SorteosRepository sorteosRepository;

    /**
     * 
     * @param sorteosRepository Devuelve el repositorio de sorteos
     */

    @Autowired
    public SorteosServiceImpl(SorteosRepository sorteosRepository){
        this.sorteosRepository = sorteosRepository;
    }

    @Override
    public Iterable<Sorteos> getAll() {
        return this.sorteosRepository.findAll();
    }

    @Override
    public void register(SorteosDao sorteosDao) {
        Sorteos sorteo = new Sorteos();
        BeanUtils.copyProperties(sorteosDao, sorteo);
        this.sorteosRepository.save(sorteo);
    }
    
}

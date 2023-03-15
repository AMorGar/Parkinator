package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.Sorteos;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.SorteosRepository;

@Service
public class SorteosServiceImpl implements SorteosService {

    private SorteosRepository sorteosRepository;

    @Autowired
    public SorteosServiceImpl(SorteosRepository sorteosRepository){
        this.sorteosRepository = sorteosRepository;
    }

    @Override
    public Iterable<Sorteos> getAll() {
        return this.sorteosRepository.findAll();
    }
    
}

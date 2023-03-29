package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SorteosRepository extends CrudRepository<Sorteos,Integer> {

}
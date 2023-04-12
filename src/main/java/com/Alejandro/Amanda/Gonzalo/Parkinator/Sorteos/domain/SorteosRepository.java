package com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Gonzalo Ruiz Azuar
 * @author Alejandro Moreno Garrido
 * @author Amanda Navas
 * @version V0.0.1
 */
@Repository
public interface SorteosRepository extends CrudRepository<Sorteos,Integer> {

}
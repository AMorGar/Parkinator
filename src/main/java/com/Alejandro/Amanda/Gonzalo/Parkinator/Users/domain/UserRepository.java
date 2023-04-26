package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Enlace de la base de datos y la pagina web
 * @author Alejandro Moreno Garrido
 * @author Gonzalo Ruiz AzuarAmanada Navas Rodriguez, 
 * @version V0.0.1   JDK 19
 * 
 */
@Repository

public interface UserRepository extends CrudRepository<User,Integer> {

    /**
     * 
     * @param email
     * @return Depende del correo que le demos, el método se encargará de buscar el nombre que le corresponde a ese correo
     */
    public User findByEmail(String email);

}


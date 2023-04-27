package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.*;
import com.Alejandro.Amanda.Gonzalo.Parkinator.core.Exceptions.UserExistsException;
/**
 * Enlace de la base de datos y la pagina web
 * @author Alejandro Moreno Garrido
 * @author Gonzalo Ruiz AzuarAmanada Navas Rodriguez, 
 * @version V0.0.1   JDK 19
 * 
 */

public interface UserService {
/**
 * Devuelve datos de la base de datos
 * @return Devuelve los datos almacenados de los usuarios en la base de datos
 */    
    public Iterable<User> getAll();
    public void register(UserDao userDao) throws UserExistsException;
    public boolean UserExists(String email);
}

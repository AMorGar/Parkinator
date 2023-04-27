package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserRepository;
import com.Alejandro.Amanda.Gonzalo.Parkinator.core.Exceptions.UserExistsException;
/**
 * Enlace de la base de datos y la pagina web
 * @author Alejandro Moreno Garrido
 * @author Gonzalo Ruiz AzuarAmanada Navas Rodriguez, 
 * @version V0.0.1   JDK 19
 * 
 */
@Service 
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository; 
    }

    @Override

    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void register(UserDao userDao) throws UserExistsException {

        if (UserExists(userDao.getEmail())) {
            throw new UserExistsException();
        }
        
        User user = new User(); 
        BeanUtils.copyProperties(userDao, user);
        this.userRepository.save(user);
    }

    @Override
    public boolean UserExists(String email) {
        return this.userRepository.findByEmail(email) != null ? true : false;   

    }

}

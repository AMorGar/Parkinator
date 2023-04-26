package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import org.junit.jupiter.api.Test;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.Role;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserDao;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserRepository;
import com.Alejandro.Amanda.Gonzalo.Parkinator.core.Exceptions.UserExistsException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
public class UserServiceTest {
    @Test
    void testGetAll() {

        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User("prueba@prueba.com","Amanda","Navas","Rodríguez",Role.STUDENT));
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findAll()).thenReturn(expectedUsers);

        UserServiceImpl service = new UserServiceImpl(mockRepository);

        Iterable<User> actualUsers = service.getAll();

        assertAll(
            () -> {assertEquals(expectedUsers,actualUsers);},
            () -> {verify(mockRepository).findAll();}
        );
    }

    @Test 
    void testUserDoesNotExists() {
        //Arrange
        UserRepository mockRepository = mock(UserRepository.class);
        UserDao userDao = new UserDao("prueba@prueba.com","Amanda","Navas","Rodríguez",Role.PROFESSOR);
        when(mockRepository.findByEmail("prueba@prueba.com")).thenReturn(null);

        UserService service = new UserServiceImpl(mockRepository);

        //Act
        try {
            service.register(userDao);
        } 
        catch (UserExistsException exception) {
            fail();
        }

        verify(mockRepository).save(any(User.class));
    }

    @Test
    void testUserAlreadyExists(){
          //Arrange
          UserRepository mockRepository = mock(UserRepository.class);
          UserDao userDao = new UserDao("prueba@prueba.com","Amanda","Navas","Rodríguez",Role.PROFESSOR);
          when(mockRepository.findByEmail("prueba@prueba.com")).thenReturn(new User("prueba@prueba.com","Amanda","Navas","Rodríguez",Role.PROFESSOR));
  
          UserService service = new UserServiceImpl(mockRepository);    
               //Act y assert
        assertThrows(UserExistsException.class, () ->{
            service.register(userDao);
        });
    }
}

package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.service;

import org.junit.jupiter.api.Test;
import org.mockito.verification.VerificationStrategy;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
public class UserServiceTest {
    @Test
    void testGetAll() {

        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User("Amanda","Navas","Rodríguez","Alumna"));
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findAll()).thenReturn(expectedUsers);

        UserServiceImpl service = new UserServiceImpl(mockRepository);

        Iterable<User> actualUsers = service.getAll();

        assertAll(
            () -> {assertEquals(expectedUsers,actualUsers);},
            () -> {verify(mockRepository).findAll();}
        );
        


    }
}

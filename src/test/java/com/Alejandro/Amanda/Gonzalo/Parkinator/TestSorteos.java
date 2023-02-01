package com.Alejandro.Amanda.Gonzalo.Parkinator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.Sorteos;

public class TestSorteos {
    
    @Test
    public void check_user_Estado() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "Activo";

        // Act
        String actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_user_Fecha() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "01/02/2023";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_user_name() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "Activo";

        // Act
        String actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }
    
}


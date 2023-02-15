package com.Alejandro.Amanda.Gonzalo.Parkinator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.Sorteos;

public class TestSorteos {

    @Test
    public void check_Sorteos_Estado() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "Activo";

        // Act
        String actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_Sorteos_Fecha() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "01/02/2023";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_Sorteos_Descripcion() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        String expected = "Primer Sorteo";

        // Act
        String actual = Primero.getDescripcion();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_change_Sorteos_Estado() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        Primero.setEstado("Terminado");
        String expected = "Terminado";

        // Act
        String actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void check_change_Sorteos_Fecha() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        Primero.setFecha("08/01/2023");
        String expected = "08/01/2023";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void check_change_Sorteos_Descripcion() {
        // Arrange
        Sorteos Primero = new Sorteos("Activo", "Primer Sorteo", "01/02/2023");
        Primero.setFecha("Sorteo Torneo Fútbol");
        String expected = "Sorteo Torneo Fútbol";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }
}


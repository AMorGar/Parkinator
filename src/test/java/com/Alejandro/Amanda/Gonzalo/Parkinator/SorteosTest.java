package com.Alejandro.Amanda.Gonzalo.Parkinator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.Sorteos;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Sorteos.domain.Status;

public class SorteosTest {
	
    
    private Sorteos Primero;
	@BeforeEach
	public void prepare(){
		Primero = new Sorteos(Status.PENDIENTE, "Primer Sorteo", "01/02/2023");

	}



    @Test
    public void check_Sorteos_Estado() {
        // Arrange

        Status expected =Status.PENDIENTE;

        // Act
        Status actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_Sorteos_Fecha() {
        // Arrange
        String expected = "01/02/2023";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_Sorteos_Descripcion() {
        // Arrange
        String expected = "Primer Sorteo";

        // Act
        String actual = Primero.getDescripcion();


        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void check_change_Sorteos_Estado() {
        // Arrange
  
        Status expected = Status.PENDIENTE;

        // Act
        Status actual = Primero.getEstado();


        // Assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void check_change_Sorteos_Fecha() {
        // Arrange
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
        Primero.setFecha("Sorteo Torneo Fútbol");
        String expected = "Sorteo Torneo Fútbol";

        // Act
        String actual = Primero.getFecha();


        // Assert
        assertEquals(expected, actual);
    }
}


package com.Alejandro.Amanda.Gonzalo.Parkinator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.Role;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain.User;
public class UserTests {

	private User ale;
	@BeforeEach
	public void prepare(){
		User ale = new User("David", "Perez", "Rios", Role.PROFESSOR);
	}

	@Test
	public void check_user_name() {
		String expected= "David";

		String actual= ale.getNombre();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_apellido1() {
		String expected= "Perez";

		String actual= ale.getApellido1();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_apellido2() {
		String expected= "Rios";

		String actual= ale.getApellido2();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_rol() {
		Role expected= Role.PROFESSOR;

		Role actual= ale.getRol();

		assertEquals(expected,actual);
	}

	@Test
	public void check_change_user_name() {
		ale.setNombre("Alejandro");
		String expected= "Alejandro";

		String actual= ale.getNombre();

		assertEquals(expected,actual);
	}

	@Test
	public void check_change_apellido1() {
		ale.setApellido1("Moreno");
		String expected= "Moreno";

		String actual= ale.getApellido1();

		assertEquals(expected,actual);
	}

	@Test
	public void check_change_apellido2() {
		ale.setApellido2("Garrido");
		String expected= "Garrido";

		String actual= ale.getApellido2();

		assertEquals(expected,actual);
	}

	@Test
	public void check_change_rol() {
		ale.setRol(Role.STUDENT);
		Role expected= Role.STUDENT;

		Role actual= ale.getRol();

		assertEquals(expected,actual);
	}

}

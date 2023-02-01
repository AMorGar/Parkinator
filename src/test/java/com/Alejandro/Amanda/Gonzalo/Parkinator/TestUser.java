package com.Alejandro.Amanda.Gonzalo.Parkinator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.Alejandro.Amanda.Gonzalo.Parkinator.Users.User;
public class TestUser {

	@Test
	public void check_user_name() {

		User ale= new User("David", "Perez", "Rios", "profesor");
		String expected= "David";

		String actual= ale.getNombre();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_apellido1() {

		User ale= new User("David", "Perez", "Rios", "profesor");
		String expected= "Perez";

		String actual= ale.getApellido1();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_apellido2() {

		User ale= new User("David", "Perez", "Rios", "profesor");
		String expected= "Rios";

		String actual= ale.getApellido2();

		assertEquals(expected,actual);
	}

	@Test
	public void check_user_rol() {

		User ale= new User("David", "Perez", "Rios", "profesor");
		String expected= "profesor";

		String actual= ale.getRol();

		assertEquals(expected,actual);
	}

}

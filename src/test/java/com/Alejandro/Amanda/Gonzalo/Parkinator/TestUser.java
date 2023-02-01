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

}

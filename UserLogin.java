package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class UserLogin {

	public boolean login(String username, String password) {
		if (username.isEmpty() || password.isEmpty()) {
			throw new IllegalArgumentException("Username and password must not be null or empty");
<<<<<<< HEAD
		} else if (username.equals("yyyyyyy") && password.equals("password1234")) {
=======
		} else if (username.equals("secondadmin") && password.equals("changedp1234566")) {
>>>>>>> master
			System.out.println("Successfully LoggedIn");
			return true;
		}
		return false;
	}

	public boolean logout(String username) {
		ArrayList<String> existingUsers = new ArrayList<>(Arrays.asList("Admin", "Customer", "Supplier"));
		if (existingUsers.contains(username)) {
			System.out.println("Successfully LoggedOut");
			return true;
		} else {
			return false;
		}
	}
}

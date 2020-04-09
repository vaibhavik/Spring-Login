package com.webapp.login;

import org.springframework.stereotype.Service;

// Use spring framework to create an instance of the service and keep it ready for any other class to use i by using @Service
@Service
public class LoginService {

	public boolean isUservalid(String user, String password) {
		if (user.equals("vaibhavi") && password.equals("secret")) {
			return true;
		}
		return false;
	}
}

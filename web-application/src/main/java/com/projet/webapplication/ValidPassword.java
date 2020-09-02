package com.projet.webapplication;

import org.springframework.stereotype.Service;

@Service
public class ValidPassword {
	
	public boolean isValid(String login, String password ) {
   
		if(login.equals("Mouhamed") && password.equals("000") || login.equals("Ami") && password.equals("100")) {
			return true;
		}else {
			return false;
		}
	}

}

package com.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.projet.webapplication.ValidPassword;

@Controller
@SessionAttributes("login")
public class MainController {
	
	@Autowired
    ValidPassword validPassword;

	@RequestMapping("/")
	public String pageAccueil() {
		return "Login";
	}
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String postMethod(@RequestParam String txtlogin, String txtpassword, Model model) {
		
		if(validPassword.isValid(txtlogin, txtpassword)) {
		model.addAttribute("login", txtlogin);
		model.addAttribute("password", txtpassword);
		}
		else {
			model.addAttribute("error", "votre login ou votre mot de passe est incorrecte");
			return "Login";
		}
		return "Bienvenue";
		
	}
	
}

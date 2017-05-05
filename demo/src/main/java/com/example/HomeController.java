package com.example;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Inject
    MessageByLocaleService messageByLocaleService;

	@RequestMapping("/")
	String homePage(){
		String invalidLogin = messageByLocaleService.getMessage("user.login.invalid");
		System.out.println("homePage : "+invalidLogin);
		return "home";
	}
	
	@GetMapping("/create-account")
	String signup(){
		System.out.println("create-account : ");
		return "create-account";
	}
	
	@PostMapping("/create-account")
	String createAccount(){
		System.out.println("create-account Action: ");
		return "create-account";
	}
}

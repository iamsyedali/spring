package com.example;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.model.User;

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
	String signup(Model model){
		System.out.println("create-account : ");
        model.addAttribute("user", new User());
		return "create-account";
	}
	
	@GetMapping("/sign-in")
	String signIn(Model model){
		System.out.println("create-account : ");
        model.addAttribute("user", new User());
		return "sign-in";
	}
	
	@PostMapping("/create-account")
	String createAccount(@ModelAttribute("user")User user){
		System.out.println("create-account Action: User : "+user.toString());
		return "create-account";
	}
}

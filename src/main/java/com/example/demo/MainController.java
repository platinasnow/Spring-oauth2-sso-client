package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@GetMapping(value = "/info")
	public void info() {
		
	}
	
	@GetMapping(value = "/home")
	public void home() {
		
	}
	
	@RequestMapping(value = "/oauth/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:http://localhost:8080/exit?redirectUrl=http://localhost:9090/home";
	}
}


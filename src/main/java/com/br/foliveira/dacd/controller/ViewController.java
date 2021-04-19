package com.br.foliveira.dacd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/deputado")
	public String deputado() {
		return "deputado";
	}
}

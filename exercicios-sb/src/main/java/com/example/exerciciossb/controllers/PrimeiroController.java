package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping
	public String olaInicial() {
		return "Olá, req inicial";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		return "Olá, Spring Boot!";
	}

	@GetMapping(path = { "/saudacao" })
	public String ola2() {
		return "Olá, Saudações!";
	}
}

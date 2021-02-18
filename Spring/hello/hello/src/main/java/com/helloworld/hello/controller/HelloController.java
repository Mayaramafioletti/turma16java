package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController //mostra que a classe é controller
@RequestMapping("/hello") //qual o caminho vai usar no postman para acessar o controller

public class HelloController {
	@GetMapping  //sempre que chamar o metodo get vai cair aqui
	
	public String hello() {
		return "Hello Generation!!";
	}
	
}

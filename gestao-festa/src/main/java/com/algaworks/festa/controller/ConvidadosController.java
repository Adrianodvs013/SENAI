package com.algaworks.festa.controller;

import org.springframework.stereotype.Controller;

//@notando classe controler, criar metodos que retornará o nome da view.

@Controller
public class ConvidadosController {
	@GetMapping("/convidados") // *URL http://localhost:8080/convidados @GetMapping. mapear para que
								// arequisição caia neste metodo.
	public String listar() { // Vamos chamar este método de listar().
		return "ListaConvidados";
	}

}
//Thymeleaf, define que a view deve ficar em src/main/resources/templates, e o sufixo do arquivo ser .html.

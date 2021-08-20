package br.com.robiertoo.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.robiertoo.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123456789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987654321-44");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(
		@RequestParam(name = "id", defaultValue = "1") int id
	) {
		return new Cliente(id, "João Augusto", "111222333-44");
	}
}

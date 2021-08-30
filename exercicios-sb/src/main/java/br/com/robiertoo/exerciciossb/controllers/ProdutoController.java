package br.com.robiertoo.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robiertoo.exerciciossb.model.entities.Produto;
import br.com.robiertoo.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public Produto novoProduto(@Valid Produto produto) {	
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping(path = "/{id}")
	public Produto getProduto(@PathVariable int id) {
		Produto produto = produtoRepository.findById(id).get();
		return produto;
	}
}

package br.com.robiertoo.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.robiertoo.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}

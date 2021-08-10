package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		Produto produto = new Produto("Noteook", 2987.65);

		dao.incluirAtomico(produto);
		System.out.println(produto.getId());
	}
}

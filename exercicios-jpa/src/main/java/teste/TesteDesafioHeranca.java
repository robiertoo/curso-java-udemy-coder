package teste;

import infra.DAO;
import modelo.desafioheranca.Cachorro;
import modelo.desafioheranca.Gato;

public class TesteDesafioHeranca {
	public static void main(String[] args) {
		Gato gato1 = new Gato("Joaquim", "Miado Fino");
		Gato gato2 = new Gato("Lúcio", "Miado Médio");
		Cachorro cachorro1 = new Cachorro("Mel", "Latido Médio");
		Cachorro cachorro2 = new Cachorro("Pantera", "Latido Grosso");
		
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(gato1)
			.incluir(gato2)
			.incluir(cachorro1)
			.incluir(cachorro2)
			.fecharTransacao();
		
		dao.fecharDAO();
	}
}

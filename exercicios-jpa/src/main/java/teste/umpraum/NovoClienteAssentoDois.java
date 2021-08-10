package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssentoDois {
	public static void main(String[] args) {
		Assento assento = new Assento("5Q");
		Cliente cliente  = new Cliente("Malonr", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.incluirAtomico(cliente);
	}
}

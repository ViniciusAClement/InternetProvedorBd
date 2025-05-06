package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class ClienteRepository {
	//lista ja instaciada
	private List<Cliente> clienteLista = new ArrayList<>();
	
	//add no final da lista
	public void addCliente ( Cliente cliente) {
		clienteLista.add(cliente);
	}
	
	//insere um id e remove se achar na lista
	public void removeCLienteById ( long id ) {
		clienteLista.removeIf(Cliente -> Cliente.getID() == id);
	}

	//retorna a lista
	public List<Cliente> getClienteLista() {
		return clienteLista;
	}
	
}

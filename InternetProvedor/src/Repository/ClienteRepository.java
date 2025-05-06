package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

public class ClienteRepository {
	
	private List<Cliente> clienteLista = new ArrayList<>();
	
	public void addCliente ( Cliente cliente) {
		clienteLista.add(cliente);
	}
	
	public void removeCLienteById ( long id ) {
		clienteLista.removeIf(Cliente -> Cliente.getID() == id);
	}
}

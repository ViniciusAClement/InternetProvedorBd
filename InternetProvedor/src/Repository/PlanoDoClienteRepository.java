package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.PlanoDoCliente;

public class PlanoDoClienteRepository {
	
	private List<PlanoDoCliente> planoDoClienteLista = new ArrayList<>(); 
	
	public void addPlanoDoCliente ( PlanoDoCliente planoDoCliente ) {
		planoDoClienteLista.add(planoDoCliente);
	}
	
	public void removePlanoDoClienteById ( long id ) {
		planoDoClienteLista.removeIf(PlanoDoCliente -> PlanoDoCliente.getId() == id);
	}
}

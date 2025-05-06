package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.PlanoDoCliente;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class PlanoDoClienteRepository {
	//lista ja instaciada
	private List<PlanoDoCliente> planoDoClienteLista = new ArrayList<>(); 
	
	//add no final da lista
	public void addPlanoDoCliente ( PlanoDoCliente planoDoCliente ) {
		planoDoClienteLista.add(planoDoCliente);
	}
	
	//insere um id e remove se achar na lista
	public void removePlanoDoClienteById ( long id ) {
		planoDoClienteLista.removeIf(PlanoDoCliente -> PlanoDoCliente.getId() == id);
	}

	
	public List<PlanoDoCliente> getPlanoDoClienteLista() {
		return planoDoClienteLista;
	}
	
}

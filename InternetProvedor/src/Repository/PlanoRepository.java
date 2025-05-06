package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Plano;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class PlanoRepository {
	
	//lista ja instaciada
	private List<Plano> planoLista = new ArrayList<>(); 
	
	//add no final da lista
	public void addPlano ( Plano plano ) {
		planoLista.add(plano);
	}
	
	//insere um id e remove se achar na lista
	public void removePlanoById ( long id ) {
		planoLista.removeIf(Plano -> Plano.getId() == id);
	}

	//retorna a lista
	public List<Plano> getPlanoLista() {
		return planoLista;
	}
	
}

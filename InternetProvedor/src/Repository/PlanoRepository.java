package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Plano;

public class PlanoRepository {
	
	private List<Plano> planoLista = new ArrayList<>(); 
	
	public void addPlano ( Plano plano ) {
		planoLista.add(plano);
	}
	
	public void removePlanoById ( long id ) {
		planoLista.removeIf(Plano -> Plano.getId() == id);
	}
}

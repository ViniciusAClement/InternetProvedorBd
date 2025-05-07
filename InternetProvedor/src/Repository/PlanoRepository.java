package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.Plano;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class PlanoRepository {
	
	//lista ja instaciada
	private static List<Plano> planoLista = new ArrayList<>(); 
	
	//add no final da lista
	public static void addPlano ( Plano plano ) {
		planoLista.add(plano);
	}
	
	//insere um id e remove se achar na lista
	public static void removePlanoById ( long id ) {
		planoLista.removeIf(Plano -> Plano.getId() == id);
	}

	//retorna a lista
	public static List<Plano> getPlanoLista() {
		return planoLista;
	}
	
	public static Plano readPlano ( long id ) {
		Plano planp = planoLista.stream()
				.filter(c -> c.getId() == id)
			    .findFirst()
			    .orElse(null);
		return planp;
	}
}

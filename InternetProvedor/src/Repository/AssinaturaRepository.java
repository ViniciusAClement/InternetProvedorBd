package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Assinatura;
import Model.Cliente;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class AssinaturaRepository {
	//lista ja instaciada
	private static List<Assinatura> assinaturaLista = new ArrayList<>(); 
	
	//add no final da lista
	public static void addAssinatura ( Assinatura assinatura ) {
		assinaturaLista.add(assinatura);
	}
	
	//insere um id e remove se achar na lista
	public static void removeAssinatura ( long id ) {
		assinaturaLista.removeIf(PlanoDoCliente -> PlanoDoCliente.getId() == id);
	}

	
	public static List<Assinatura> getAssinaturaLista() {
		return assinaturaLista;
	}
	
	public static Assinatura readAssinatura( long id ) {
		Assinatura assinatura = assinaturaLista.stream()
				.filter(c -> c.getId() == id)
			    .findFirst()
			    .orElse(null);
		return assinatura;
	}
}

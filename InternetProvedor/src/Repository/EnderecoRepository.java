package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.Endereco;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class EnderecoRepository {
	//lista ja instaciada
	private static List<Endereco> enderecoLista = new ArrayList<>(); 
	
	//add no final da lista
	public static void addEndereco ( Endereco endereco ) {
		enderecoLista.add(endereco);
	}
	
	//insere um id e remove se achar na lista
	public static void removeEnderecoById ( long id ) {
		enderecoLista.removeIf(Endereco -> Endereco.getId() == id);
	}

	//retorna a lista
	public static List<Endereco> getEnderecoLista() {
		return enderecoLista;
	}
	
	public static Endereco readEndereco ( long id ) {
		Endereco endereco = enderecoLista.stream()
				.filter(c -> c.getId() == id)
			    .findFirst()
			    .orElse(null);
		return endereco;
	}
}

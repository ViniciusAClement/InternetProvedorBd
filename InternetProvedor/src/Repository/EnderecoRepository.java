package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Endereco;

/**
 * Atenção!!! 
 * não adicionar mais nada de metodo nessa classe
 * essa classe so deve fazer isso msm
 */

public class EnderecoRepository {
	//lista ja instaciada
	private List<Endereco> enderecoLista = new ArrayList<>(); 
	
	//add no final da lista
	public void addEndereco ( Endereco endereco ) {
		enderecoLista.add(endereco);
	}
	
	//insere um id e remove se achar na lista
	public void removeEnderecoById ( long id ) {
		enderecoLista.removeIf(Endereco -> Endereco.getId() == id);
	}

	//retorna a lista
	public List<Endereco> getEnderecoLista() {
		return enderecoLista;
	}
	
}

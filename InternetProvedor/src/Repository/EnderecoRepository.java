package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Endereco;

public class EnderecoRepository {
	private List<Endereco> enderecoLista = new ArrayList<>(); 
	
	public void addEndereco ( Endereco endereco ) {
		enderecoLista.add(endereco);
	}
	
	public void removeEnderecoById ( long id ) {
		enderecoLista.removeIf(Endereco -> Endereco.getId() == id);
	}

	public List<Endereco> getEnderecoLista() {
		return enderecoLista;
	}
	
}

package CRUD.creators;

import Model.Endereco;
import Repository.EnderecoRepository;
import main.Ids;

public class CreateEndereco {
	public static void createEndereco ( String rua, int numero, long cliente_id) {
		Endereco endereco = new Endereco.Builder()
				.id(Ids.getidEndereco())
				.rua(rua)
				.numero(numero)
				.cliente_id(cliente_id)
				.build();
		EnderecoRepository.addEndereco(endereco);
	}
}

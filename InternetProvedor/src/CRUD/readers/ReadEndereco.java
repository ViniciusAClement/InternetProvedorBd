package CRUD.readers;

import Model.Endereco;
import Repository.EnderecoRepository;

public class ReadEndereco {
	public static Endereco readEndereco( long id ) {
		return EnderecoRepository.readEndereco(id);
	}
}

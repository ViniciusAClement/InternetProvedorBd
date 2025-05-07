package CRUD.deleter;

import Model.Endereco;
import Repository.EnderecoRepository;

public class DeleteEndereco {
	public static void deleteEndereco ( Endereco endereco ) {
		long id = endereco.getId();
		EnderecoRepository.removeEnderecoById(id);
	}
}

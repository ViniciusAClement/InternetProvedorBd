package CRUD.readers;

import Model.Cliente;
import Repository.ClienteRepository;

public class ReadCliente {
	public static Cliente readCliente ( long id ) {
		return ClienteRepository.readCliente(id);
	}
}

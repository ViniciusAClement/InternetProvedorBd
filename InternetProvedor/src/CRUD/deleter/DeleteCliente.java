package CRUD.deleter;

import CRUD.readers.ReadCliente;
import Model.Cliente;
import Repository.ClienteRepository;

public class DeleteCliente {
	public static void deleteCliente( Cliente cliente ) {
		long id = cliente.getID();
		DeleteAssinatura.deleteAssinatura(ReadCliente.readCliente(id).getAssinatura());
		DeleteEndereco.deleteEndereco(ReadCliente.readCliente(id).getEndereco());
		ClienteRepository.removeCLienteById(id);
	}
}

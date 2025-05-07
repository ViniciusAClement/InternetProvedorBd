package CRUD.Updaters;

import Model.Cliente;

public class EditCliente {
	public static void editCliente ( Cliente cliente, String nome, String cpf ) {
		cliente.setCPF(cpf);
		cliente.setNome(nome);
	}
}

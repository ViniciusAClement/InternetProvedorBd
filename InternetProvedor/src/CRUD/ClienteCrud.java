package CRUD;

import CRUD.Updaters.EditCliente;
import CRUD.creators.CreateCliente;
import CRUD.deleter.DeleteCliente;
import CRUD.readers.ReadCliente;
import Model.Assinatura;
import Model.Cliente;
import Model.Endereco;

public class ClienteCrud {
	public static void createCliente(String nome, String cpf, Endereco endereco, Assinatura assinatura) {
		CreateCliente.createCliente(nome, cpf, endereco, assinatura);
	}
	public static void readCliente( long id ) {
		ReadCliente.readCliente(id);
	}
	public static void editCliente( Cliente cliente, String nome, String cpf ) {
		EditCliente.editCliente(cliente, nome, cpf);
	}
	public static void removeCliente( Cliente cliente ) {
		DeleteCliente.deleteCliente(cliente);
	}
}	


package CRUD.creators;

import Model.Assinatura;
import Model.Cliente;
import Model.Endereco;
import Repository.ClienteRepository;
import main.Ids;

public class CreateCliente {
	public static void createCliente ( String nome, String cpf, Endereco endereco, Assinatura assinatura) {
		Cliente cliente = new Cliente.Builder()
				.Id(Ids.getcliente())
				.nome(nome)
				.CPF(cpf)
				.endereco(endereco)
				.planoDeInternet(assinatura)
				.build();
		ClienteRepository.addCliente(cliente);
	}
}

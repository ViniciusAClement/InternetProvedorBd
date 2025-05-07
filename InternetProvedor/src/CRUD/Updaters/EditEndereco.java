package CRUD.Updaters;

import Model.Endereco;

public class EditEndereco {
	public static void editEndereco ( Endereco endereco, String rua, int numero ) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}
}

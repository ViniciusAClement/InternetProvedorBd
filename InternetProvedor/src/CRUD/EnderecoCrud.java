package CRUD;

import CRUD.Updaters.EditEndereco;
import CRUD.creators.CreateEndereco;
import CRUD.deleter.DeleteEndereco;
import CRUD.readers.ReadEndereco;
import Model.Endereco;

public class EnderecoCrud {
	public static void createEndereco(String rua, int numero, long cliente_id) {
		CreateEndereco.createEndereco(rua, numero, cliente_id);
	}
	public static void readEndereco(long id) {
		ReadEndereco.readEndereco(id);
	}
	public static void editEndereco( Endereco endereco, String rua, int numero ) {
		EditEndereco.editEndereco(endereco, rua, numero);
	}
	public static void deleteEndereco (Endereco endereco) {
		DeleteEndereco.deleteEndereco(endereco);
	}
}

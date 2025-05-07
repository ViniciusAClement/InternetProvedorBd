package CRUD.creators;

import Model.Plano;
import Repository.PlanoRepository;
import main.Ids;

public class CreatePlano {
	public static void createPlano ( int megas, double preco) {
		Plano plano = new Plano.Builder()
				.id(Ids.getidPlano())
				.megas(megas)
				.preco(preco)
				.builder();
		PlanoRepository.addPlano(plano);
	}
}

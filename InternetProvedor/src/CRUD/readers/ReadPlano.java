package CRUD.readers;

import Model.Plano;
import Repository.PlanoRepository;

public class ReadPlano {
	public static Plano readPlano( long id ) {
		return PlanoRepository.readPlano(id);
	}
}

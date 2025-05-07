package CRUD.deleter;

import Model.Plano;
import Repository.AssinaturaRepository;
import Repository.PlanoRepository;

public class DeletePlano {
	public static void deletePlano ( Plano plano ) {
		long id = plano.getId();
		PlanoRepository.removePlanoById(id);
	}
}

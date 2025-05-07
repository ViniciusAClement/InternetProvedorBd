package CRUD.readers;

import Model.Assinatura;
import Repository.AssinaturaRepository;

public class ReadAssinatura {
	public static Assinatura readAssinatura( long id ) {
		return AssinaturaRepository.readAssinatura(id);
	}
}

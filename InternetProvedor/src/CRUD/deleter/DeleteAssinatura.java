package CRUD.deleter;

import CRUD.readers.ReadCliente;
import Model.Assinatura;
import Repository.AssinaturaRepository;

public class DeleteAssinatura {
	public static void deleteAssinatura( Assinatura assinatura ) {
		long id = assinatura.getId();
		AssinaturaRepository.removeAssinatura(id);
	}
}

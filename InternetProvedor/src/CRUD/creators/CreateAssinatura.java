package CRUD.creators;

import Model.Assinatura;
import Model.Plano;
import Repository.AssinaturaRepository;
import main.Ids;

public class CreateAssinatura {
	public static void createAssinatura( Plano plano, boolean status, long cliente_id, long plano_id) {
		Assinatura assinatura = new Assinatura.Builder()
				.id(Ids.getidAssinatura())
				.plano(plano)
				.status(status)
				.cliente_id(cliente_id)
				.plano_id(plano_id)
				.builder();
		AssinaturaRepository.addAssinatura(assinatura);
	}
}

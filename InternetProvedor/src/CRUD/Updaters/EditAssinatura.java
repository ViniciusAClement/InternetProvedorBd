package CRUD.Updaters;

import Model.Assinatura;
import Model.Plano;

public class EditAssinatura {
	public static void editAssinatura ( Assinatura assinatura, Plano plano, boolean status, long cliente_id, long plano_id) {
		assinatura.setPlano(plano);
		assinatura.setStatus(status);
		assinatura.setCliente_id(cliente_id);
		assinatura.setPlano_id(plano_id);
	}
}

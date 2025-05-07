package CRUD;

import CRUD.Updaters.EditAssinatura;
import CRUD.creators.CreateAssinatura;
import CRUD.deleter.DeleteAssinatura;
import CRUD.readers.ReadAssinatura;
import Model.Assinatura;
import Model.Plano;

public class AssinaturaCrud {
	public static void createAssinatura(Plano plano, boolean status, long cliente_id, long plano_id) {
		CreateAssinatura.createAssinatura(plano, status, cliente_id, plano_id);
	}
	public static void readAssinatura( long id ) {
		ReadAssinatura.readAssinatura(id);
	}
	public static void editAssinatura(Assinatura assinatura, Plano plano, boolean status, long cliente_id, long plano_id) {
		EditAssinatura.editAssinatura(assinatura, plano, status, cliente_id, plano_id);
	}
	public static void deleteAssinatura(Assinatura assinatura) {
		DeleteAssinatura.deleteAssinatura(assinatura);
	}
}

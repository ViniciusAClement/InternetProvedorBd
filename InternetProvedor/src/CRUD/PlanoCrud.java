package CRUD;

import CRUD.Updaters.EditPlano;
import CRUD.creators.CreatePlano;
import CRUD.deleter.DeletePlano;
import CRUD.readers.ReadPlano;
import Model.Plano;

public class PlanoCrud {
	public static void createPlano(int megas, double preco) {
		CreatePlano.createPlano(megas, preco);
	}
	public static void readPlano(long id) {
		ReadPlano.readPlano(id);
	}
	public static void editPlano( Plano plano, int megas, double preco ) {
		EditPlano.editPlano(plano, megas, preco);
	}
	public static void deletePlano( Plano plano ) {
		DeletePlano.deletePlano(plano);
	}
}

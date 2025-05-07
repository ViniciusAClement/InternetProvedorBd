package CRUD.Updaters;

import Model.Plano;

public class EditPlano {
	public static void editPlano ( Plano plano, int megas, double preco ) {
		plano.setMegas(megas);
		plano.setPreco(preco);
	}
}

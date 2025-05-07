package main;

public class Ids {
	private static int idcliente = 0;
	private static int idAssinatura = 0;
	private static int idPlano = 0;
	private static int idEndereco = 0;
	
	public static int getidcliente() {
		idcliente ++;
		return idcliente;
	}
	public static int getcliente() {
		return idcliente;
	}
	
	public static int getidAssinatura() {
		idAssinatura ++;
		return idAssinatura;
	}
	
	public static int getidPlano() {
		idPlano ++;
		return idPlano;
	}
	
	public static int getidEndereco() {
		idEndereco ++;
		return idEndereco;
	}
}

package Model;

public class Endereco {
	//Atributos da classe Endereco
	private long id;
	private String rua;
	private int numero;
	private long cliente_id;
	
	//Builder da classe Endereco
	public static class Builder{
		
		private long id;
		private String rua;
		private int numero;
		private long cliente_id;
		
		public Builder id ( long id ) {
			this.id = id;
			return this;
		}
		public Builder rua ( String rua ) {
			this.rua = rua;
			return this;
		}
		
		public Builder numero ( int numero ) {
			this.numero = numero;
			return this;
		}
		
		public Builder cliente_id( long cliente_id ) {
			this.cliente_id = cliente_id;
			return this;
		}
		
		public Endereco build () {
			Endereco endereco = new Endereco();
			
			endereco.id = this.id;
			endereco.rua = this.rua;
			endereco.numero = this.numero;
			endereco.cliente_id = this.cliente_id;
			
			return endereco;
		}
	}
	//Getters e Setters da Classe Endereco
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(long cliente_id) {
		this.cliente_id = cliente_id;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", cliente_id=" + cliente_id + "]";
	}
	
	
}

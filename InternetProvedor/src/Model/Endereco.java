package Model;

public class Endereco {
	
	private long id;
	private String rua;
	private int numero;
	
	private static class Builder{
		
		private long id;
		private String rua;
		private int numero;
		
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
		
		public Endereco build () {
			Endereco endereco = new Endereco();
			
			endereco.rua = this.rua;
			endereco.numero = this.numero;
			
			return endereco;
		}
	}
	
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
	
}

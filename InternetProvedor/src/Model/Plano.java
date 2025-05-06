package Model;

public class Plano {
	
	private long id;
	private int megas;
	private double preco;
	
	private static class Builder{
		
		private long id;
		private int megas;
		private double preco;
		
		public Builder id ( long id ) {
			this.id = id;
			return this;
		}
		
		public Builder megas ( int megas ) {
			this.megas = megas;
			return this;
		}
		
		public Builder preco ( double preco ) {
			this.preco = preco;
			return this;
		}
		
		public Plano builder() {
			Plano plano = new Plano();
			
			plano.megas = this.megas;
			plano.preco = this.preco;
			
			return plano;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMegas() {
		return megas;
	}

	public void setMegas(int megas) {
		this.megas = megas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}

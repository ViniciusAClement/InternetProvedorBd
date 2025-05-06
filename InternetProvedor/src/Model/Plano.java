package Model;

public class Plano {
	private int megas;
	private double preco;
	
	private static class Builder{
		private int megas;
		private double preco;
		
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

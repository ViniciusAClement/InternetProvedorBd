package Model;

public class PlanoDoCliente {
	
	private long id;
	private Plano plano;
	private boolean status;
	
	private static class Builder {
		
		private long id;
		private Plano plano;
		private boolean status;
		
		public Builder id ( long id ) {
			this.id = id;
			return this;
		}
		
		public Builder plano ( Plano plano ) {
			this.plano = plano;
			return this;
		}
		
		public Builder status ( boolean status ) {
			this.status = status;
			return this;
		}
		
		public PlanoDoCliente builder() {
			PlanoDoCliente planoDoCliente = new PlanoDoCliente();
			planoDoCliente.plano = this.plano;
			planoDoCliente.status = this.status;
			
			return planoDoCliente;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

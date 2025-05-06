package Model;

public class PlanoDoCliente {
	private Plano plano;
	private boolean status;
	
	private static class Builder {
		private Plano plano;
		private boolean status;
		
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
}

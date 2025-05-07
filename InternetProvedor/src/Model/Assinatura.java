package Model;

public class Assinatura {
	//atributos
	private long id;
	private Plano plano;
	private boolean status;
	private long cliente_id;
	private long plano_id;
	
	//BUilder
	public static class Builder {
		
		private long id;
		private Plano plano;
		private boolean status;
		private long cliente_id;
		private long plano_id;
		
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
		
		public Builder cliente_id ( long cliente_id ) {
			this.cliente_id = cliente_id;
			return this;
		}
		
		public Builder plano_id ( long plano_id ) {
			this.plano_id = plano_id;
			return this;
		}
		
		public Assinatura builder() {
			Assinatura assinatura = new Assinatura();
			
			assinatura.id = this.id;
			assinatura.plano = this.plano;
			assinatura.status = this.status;
			assinatura.cliente_id = this.cliente_id;
			assinatura.plano_id = this.plano_id;
			
			return assinatura;
		}
	}
	
	//get e set
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

	public long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public long getPlano_id() {
		return plano_id;
	}

	public void setPlano_id(long plano_id) {
		this.plano_id = plano_id;
	}

	@Override
	public String toString() {
		return "Assinatura [id=" + id + ", plano=" + plano + ", status=" + status + ", cliente_id=" + cliente_id
				+ ", plano_id=" + plano_id + "]";
	}
	
	
}

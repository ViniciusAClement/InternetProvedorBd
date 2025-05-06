package Model;

public class Cliente {
	//atributos da classe cliente
	private long ID;
	private String nome;
	private String CPF;
	private Endereco endereco;
	private PlanoDoCliente planoDeInternet;
	
	//builder da classe cliente
	private static class Builder{
		private long ID;
		private String nome;
		private String CPF;
		private Endereco endereco;
		private PlanoDoCliente planoDeInternet;
		
		public Builder Id (long ID) {
			this.ID=ID;
			return this;
		}
		public Builder nome (String nome) {
			this.nome=nome;
			return this;
		}
		public Builder CPF (String CPF) {
			this.CPF = CPF;
			return this;
		}
		public Builder endereco (Endereco endereco) {
			this.endereco = endereco;
			return this;
		}
		public Builder planoDeInternet (PlanoDoCliente planoDeInternet) {
			this.planoDeInternet = planoDeInternet;
			return this;
		}
		
		public Cliente build() {
			Cliente cliente = new Cliente();
			cliente.ID = this.ID;
			cliente.nome = this.nome;
			cliente.CPF = this.CPF;
			cliente.endereco = this.endereco;
			cliente.planoDeInternet = this.planoDeInternet;
			
			return cliente;
		}
	}
	
	//Getters e Setters da classe CLiente
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PlanoDoCliente getPlanoDeInternet() {
		return planoDeInternet;
	}

	public void setPlanoDeInternet(PlanoDoCliente planoDeInternet) {
		this.planoDeInternet = planoDeInternet;
	}
	
}

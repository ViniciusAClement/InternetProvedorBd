package Model;

public class Cliente {
	//atributos da classe cliente
	private long ID;
	private String nome;
	private String CPF;
	private Endereco endereco;
	private Assinatura assinatura;
	
	//builder da classe cliente
	public static class Builder{
		private long ID;
		private String nome;
		private String CPF;
		private Endereco endereco;
		private Assinatura assinatura;
		
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
		public Builder planoDeInternet (Assinatura assinatura) {
			this.assinatura = assinatura;
			return this;
		}
		
		public Cliente build() {
			Cliente cliente = new Cliente();
			cliente.ID = this.ID;
			cliente.nome = this.nome;
			cliente.CPF = this.CPF;
			cliente.endereco = this.endereco;
			cliente.assinatura = this.assinatura;
			
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

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nome=" + nome + ", CPF=" + CPF + ", endereco=" + endereco + ", assinatura="
				+ assinatura + "]";
	}
	
}

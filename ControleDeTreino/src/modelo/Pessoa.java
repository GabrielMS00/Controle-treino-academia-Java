package modelo;

public abstract class Pessoa {
	
	protected String nome;
	protected int cep;
	protected String cpf;
	
	
	public String getNome() {	
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCep() {	
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cep=" + cep + ", cpf=" + cpf + "]";
	}

	public String getCpf() {	
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	

}
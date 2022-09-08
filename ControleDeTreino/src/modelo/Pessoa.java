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
	
	public String getCpf() {	
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	

}
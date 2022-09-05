package modelo;

public abstract class Pessoa {
	
	protected String nome;
	protected int cep;
	protected int cpf;
	
	
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
	
	public int getCpf() {	
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	

}

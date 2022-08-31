package modelo;

public abstract class Pessoa {
	
	protected String nome;
	protected String cep;
	protected String cpf;
	protected boolean sexo;
	
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCep() {
		
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCpf() {
		
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean getSexo() {
		
		return sexo;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;;
		
	}
	
	
	
	
	
	

}
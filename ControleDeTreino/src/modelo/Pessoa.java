package Trabalho;

public abstract class Pessoa {
	
	private String nome;
	private long cep;
	private long cpf;
	private boolean sexo;
	
	/*public Pessoa(String nome, long cep, long cpf) {
		
		super();
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		
	}*/
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCep() {
		
		return cep;
	}
	
	public void setCep(long cep) {
		this.cep = cep;
	}
	
	public long getCpf() {
		
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public boolean getSexo() {
		
		return sexo;
	}
	
	public void setSexo(boolean sexo) {
		this.sexo = sexo;;
	}
	
	
	
	
	
	

}

package modelo;

/**
 * A classe pessoa é uma classe abstrata que compartilha seus atributos e métodos com as classes Personal e Usuario.
 * @author Gabriel Marques de Souza
 * @since Setembro 2022
 * @version 1.0 
 */

public abstract class Pessoa {
	
	protected String nome;
	protected int cep;
	protected String cpf;
	
	//getters e setters
	
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
package modelo;

public class Personal extends Pessoa {


	protected String disponibilidade;
	
	
	// Construtor + getters e setters
	public Personal(String nome, int cep, String cpf, String disponibilidade) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		this.disponibilidade = disponibilidade;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Personal [disponibilidade=" + disponibilidade + "]";
	}
	
	// Função que mostra o status de cada personal
	public void status() {
		System.out.println("Nome do personal: " + this.getNome());
		System.out.println("CEP: " + this.getCep());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Disponibilidade: " + this.getDisponibilidade());
	}
	
	
		
}
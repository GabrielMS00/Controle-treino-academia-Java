package modelo;

public class Personal extends Pessoa {

	protected String disponibilidade;

	public Personal(String nome, String cep, String cpf, boolean sexo, String disponibilidade) {
		
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		this.sexo = sexo;
		this.disponibilidade = disponibilidade;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public void status() {
		System.out.println("Nome do personal: " + this.getNome());
		System.out.println("CEP: " + this.getCep());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Sexo:" + this.getSexo());
		System.out.println("Disponibilidade: " + this.getDisponibilidade());
	}
	
	
		
}
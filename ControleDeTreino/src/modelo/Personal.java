package modelo;

public class Personal extends Pessoa {

	protected String disponibilidade;

	public Personal(String nome, long cep, long cpf, boolean sexo, String disponibilidade) {
		super();
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
		this.Sexo();
		System.out.println("Disponibilidade: " + this.getDisponibilidade());
	}
	
	
		
}

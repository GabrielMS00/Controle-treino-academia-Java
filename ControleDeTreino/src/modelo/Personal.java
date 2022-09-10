package modelo;

/**
 * A classe Personal define os tipos de dados necessários para a instanciação de um personal no sistema.
 * @author GabrielMarques de Souza
 * @since Setembro 2022
 * @version 1.0
 */

public class Personal extends Pessoa {

	protected String disponibilidade;
	
	/**
	 * Construtor da classe Personal.
	 * @param nome (Nome do personal)
	 * @param cep (CEP do personal)
	 * @param cdf (CPF do personal)
	 * @param disponibilidade (Nome dos dias da semana e horários que o personal está disponível)
	 */
	
	public Personal(String nome, int cep, String cpf, String disponibilidade) {
		super();
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
		this.disponibilidade = disponibilidade;
	}
	
	//getters e setters

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
		
}